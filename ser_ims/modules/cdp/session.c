/**
 * $Id: session.c 935 2010-04-28 10:32:33Z vingarzan $
 *  
 * Copyright (C) 2004-2006 FhG Fokus
 *
 * This file is part of Open IMS Core - an open source IMS CSCFs & HSS
 * implementation
 *
 * Open IMS Core is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * For a license to use the Open IMS Core software under conditions
 * other than those described here, or to purchase support for this
 * software, please contact Fraunhofer FOKUS by e-mail at the following
 * addresses:
 *     info@open-ims.org
 *
 * Open IMS Core is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * It has to be noted that this Open Source IMS Core System is not 
 * intended to become or act as a product in a commercial context! Its 
 * sole purpose is to provide an IMS core reference implementation for 
 * IMS technology testing and IMS application prototyping for research 
 * purposes, typically performed in IMS test-beds.
 * 
 * Users of the Open Source IMS Core System have to be aware that IMS
 * technology may be subject of patents and licence terms, as being 
 * specified within the various IMS-related IETF, ITU-T, ETSI, and 3GPP
 * standards. Thus all Open IMS Core users have to take notice of this 
 * fact and have to agree to check out carefully before installing, 
 * using and extending the Open Source IMS Core System, if related 
 * patents and licences may become applicable to the intended usage 
 * context.  
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * 
 */
 
/**
 * \file
 * 
 * CDiameterPeer Session Handling 
 * 
 *  \author Dragos Vingarzan vingarzan -at- fokus dot fraunhofer dot de
 * 
 */

#include <time.h>
#include <stdio.h>
#include <stdlib.h>

#include "session.h"
#include "diameter.h"
#include "config.h"
#include "authstatemachine.h"
#include "timer.h"

extern dp_config *config;		/**< Configuration for this diameter peer 	*/

gen_lock_t *session_lock;		/**< lock for session operation */

int sessions_hash_size = 1024;	/**< the size of the session hash table		*/
cdp_session_list_t *sessions;	/**< the session hash table					*/

unsigned int *session_id1;		/**< counter for first part of the session id */
unsigned int *session_id2;		/**< counter for second part of the session id */


/**
 * Lock a hash table row
 */
inline void AAASessionsLock(unsigned int hash)
{
	if ( hash >=0 && hash < sessions_hash_size ){
		lock_get(sessions[hash].lock);
	}
	else {
		LOG(L_ERR,"ERROR:AAASessionsLock: hash :%d out of range of sessions_hash_size: %d !\n", hash, sessions_hash_size);
	}
}

/**
 * Unlock a hash table row
 */
inline void AAASessionsUnlock(unsigned int hash)
{
	
	if ( hash >=0 && hash < sessions_hash_size ){
		lock_release(sessions[hash].lock);
	}
	else {
		LOG(L_ERR,"ERROR:AAASessionsLock: hash :%d out of range of sessions_hash_size: %d !\n", hash, sessions_hash_size);
	}
}



/**
 * Free a session structure
 */
void free_session(cdp_session_t *x)
{
	if (x){
		if (x->id.s) shm_free(x->id.s);
		switch(x->type){
			case UNKNOWN_SESSION:
				if (x->u.generic_data){
					LOG(L_ERR,"ERROR:free_session(): The session->u.generic_data should be freed and reset before dropping the session!"
						"Possible memory leak!\n");
				}
				break;
			case AUTH_CLIENT_STATEFULL:
				break;
			case AUTH_SERVER_STATEFULL:
				break;
			default:
				LOG(L_ERR,"ERR:free_session(): Unknown session type %d!\n",x->type);
		}
		
		if(x->dest_host.s) shm_free(x->dest_host.s);
		if(x->dest_realm.s) shm_free(x->dest_realm.s);

		shm_free(x);
	}
}


/**
 * Initializes the session related structures.
 */
int cdp_sessions_init(int hash_size)
{
	int i;
	session_lock = lock_alloc();
	if (!session_lock){
		LOG_NO_MEM("lock",sizeof(gen_lock_t));
		goto error;
	}
	session_lock = lock_init(session_lock);
	sessions_hash_size=hash_size;
	
	sessions = shm_malloc(sizeof(cdp_session_list_t)*hash_size);
	if (!sessions){
		LOG_NO_MEM("shm",sizeof(cdp_session_list_t)*hash_size);
		goto error;
	}
	memset(sessions,0,sizeof(cdp_session_list_t)*hash_size);
	
	for(i=0;i<hash_size;i++){
		sessions[i].lock = lock_alloc();
		if (!sessions[i].lock){
			LOG_NO_MEM("lock",sizeof(gen_lock_t));
			goto error;
		}
		sessions[i].lock = lock_init(sessions[i].lock);
	}
	
	session_id1 = shm_malloc(sizeof(unsigned int));
	if (!session_id1){
		LOG_NO_MEM("shm",sizeof(unsigned int));
		goto error;
	}
	session_id2 = shm_malloc(sizeof(unsigned int));
	if (!session_id2){
		LOG_NO_MEM("shm",sizeof(unsigned int));
		goto error;
	}
	srand((unsigned int)time(0));	
	*session_id1 = rand();
	*session_id1 <<= 16;
	*session_id1 += time(0)&0xFFFF;
	*session_id2 = 0;
	
	add_timer(1,0,cdp_sessions_timer,0);
	return 1;
error:
	return 0;
}

/**
 * Destroys the session related structures.
 */
int cdp_sessions_destroy()
{
	int i;
	cdp_session_t *n,*x;
	
	if (session_lock){
		lock_get(session_lock);
		lock_destroy(session_lock);
		lock_dealloc((void*)session_lock);		
		session_lock=0;
	}	
	for(i=0;i<sessions_hash_size;i++){
		AAASessionsLock(i);
		for(x = sessions[i].head; x; x = n){
			n = x->next;
			free_session(x);	
		}
		lock_destroy(sessions[i].lock);
		lock_dealloc((void*)sessions[i].lock);
	}
	shm_free(sessions);
			
	shm_free(session_id1);
	shm_free(session_id2);
	return 1;
}




/**
 * Computes the hash for a string.
 * @param aor - the aor to compute the hash on
 * @param hash_size - value to % with
 * @returns the hash % hash_size
 */
inline unsigned int get_str_hash(str x,int hash_size)
{
#define h_inc h+=v^(v>>3)
   char* p;
   register unsigned v;
   register unsigned h;

   h=0;
   for (p=x.s; p<=(x.s+x.len-4); p+=4){
       v=(*p<<24)+(p[1]<<16)+(p[2]<<8)+p[3];
       h_inc;
   }
   v=0;
   for (;p<(x.s+x.len); p++) {
       v<<=8;
       v+=*p;
   }
   h_inc;

   h=((h)+(h>>11))+((h>>13)+(h>>23));
   return (h)%hash_size;
#undef h_inc 
}

/**
 * Create a new session structure
 * @param id - the session id string, already allocated in shm
 * @param type - the session type
 * @returns the new cdp_session_t on success or 0 on failure
 */
cdp_session_t* cdp_new_session(str id,cdp_session_type_t type)
{
	cdp_session_t *x=0;

	x = shm_malloc(sizeof(cdp_session_t));
	if (!x){
		LOG_NO_MEM("shm",sizeof(cdp_session_t));
		goto error;
	}
	memset(x,0,sizeof(cdp_session_t));
	x->id = id;
	x->type = type;
	x->hash = get_str_hash(x->id,sessions_hash_size);
	return x;
error:
	return 0;
}

/**
 * Adds the session to the session list.
 * \note This returns with a lock, so unlock when done
 * @param x - the session to add
 */
void cdp_add_session(cdp_session_t *x)
{
//	unsigned int hash;
	if (!x) return;
//	hash = get_str_hash(x->id,sessions_hash_size);
//	x->hash = hash;
	LOG(L_DBG,"adding a session with id %.*s\n",x->id.len,x->id.s);
	AAASessionsLock(x->hash);
	x->next = 0;
	x->prev = sessions[x->hash].tail;
	if (sessions[x->hash].tail) sessions[x->hash].tail->next = x;
	sessions[x->hash].tail = x;
	if (!sessions[x->hash].head) sessions[x->hash].head = x;	
}

/**
 * Finds a session in the session hash table.
 * \note Returns with a lock on the sessions[x->hash].lock!!!
 * @param id - the id of the session
 * @returns the session if found or 0 if not
 */
cdp_session_t* cdp_get_session(str id)
{
	unsigned int hash;
	cdp_session_t *x;
	if (!id.len) return 0;
	hash = get_str_hash(id,sessions_hash_size);
	LOG(L_DBG,"called get session with id %.*s and hash %u\n",id.len,id.s,hash);
	AAASessionsLock(hash);
		for(x = sessions[hash].head;x;x=x->next){
			LOG(L_DBG,"looking for |%.*s| in |%.*s|\n",id.len,id.s,x->id.len,x->id.s);
			if (x->id.len == id.len &&
				strncasecmp(x->id.s,id.s,id.len)==0)
					return x;
		}			
	AAASessionsUnlock(hash);	
	LOG(L_DBG,"no session found\n");
	return 0;
}


/**
 * Removes and frees a session.
 * \note must be called with a lock on the x->hash and it will unlock on exit. Do not use x after calling this
 * 
 * @param x - the session to remove
 */
void del_session(cdp_session_t *x)
{
	unsigned int hash;

	if (!x) return;

	hash = x->hash;
	if (hash < 0 || hash >= sessions_hash_size) {
		LOG(L_ERR,"ERROR:del_session: x->hash :%d out of range of sessions_hash_size: %d !\n",hash, sessions_hash_size);
		return;
	}

	if (sessions[x->hash].head == x) sessions[x->hash].head = x->next;
	else if (x->prev) x->prev->next = x->next;
	if (sessions[x->hash].tail == x) sessions[x->hash].tail = x->prev;
	else if (x->next) x->next->prev = x->prev;
	
	AAASessionsUnlock(hash);
	
	free_session(x);
}


/**
 * Generates a new session_ID (conforming with draft-ietf-aaa-diameter-17).
 * This function is thread safe.
 * @returns an 1 if success or -1 if error.
 */
static int generate_session_id(str *id, unsigned int end_pad_len)
{
	unsigned int s2;

	/* some checks */
	if (!id)
		goto error;

	/* compute id's len */
	id->len = config->identity.len +
		1/*;*/ + 10/*high 32 bits*/ +
		1/*;*/ + 10/*low 32 bits*/ +
//		1/*;*/ + 8/*optional value*/ +
		1 /* terminating \0 */ +
		end_pad_len;

	/* get some memory for it */
	id->s = (char*)shm_malloc( id->len );
	if (id->s==0) {
		LOG(L_ERR,"ERROR:generate_session_id: no more free memory!\n");
		goto error;
	}

	lock_get(session_lock);
	s2 = *session_id2 +1;
	*session_id2 = s2;
	lock_release(session_lock);
	
	/* build the sessionID */
	sprintf(id->s,"%.*s;%u;%u",config->identity.len,config->identity.s,*session_id1,s2);
	id->len = strlen(id->s);
	return 1;
error:
	return -1;
}

void cdp_sessions_log(int level)
{
	int hash;
	cdp_session_t *x;
#ifdef SER_MOD_INTERFACE
	if (!is_printable(level))
#else		
	if (debug<level)
#endif
		return;
	LOG(level,"------- CDP Sessions ----------------\n");
	for(hash=0;hash<sessions_hash_size;hash++){		
		AAASessionsLock(hash);
		for(x = sessions[hash].head;x;x=x->next) {						
			LOG(level," %3u. [%.*s] AppId [%d] Type [%d]\n",
					hash,
					x->id.len,x->id.s,
					x->application_id,
					x->type);
			switch (x->type){
				case AUTH_CLIENT_STATEFULL:
				case AUTH_SERVER_STATEFULL:
					LOG(level,"\tAuth State [%d] Timeout [%d] Lifetime [%d] Grace [%d] Generic [%p]\n",
							x->u.auth.state,
							(int)(x->u.auth.timeout-time(0)),
							x->u.auth.lifetime?(int)(x->u.auth.lifetime-time(0)):-1,
							(int)(x->u.auth.grace_period),
							x->u.auth.generic_data);
					break;
				default:
					break;
			}
		}
		AAASessionsUnlock(hash);
	}
	LOG(level,"-------------------------------------\n");
}

int cdp_sessions_timer(time_t now, void* ptr)
{
	int hash;
	cdp_session_t *x,*n;
	for(hash=0;hash<sessions_hash_size;hash++){		
		AAASessionsLock(hash);
		for(x = sessions[hash].head;x;x=n) {
			n = x->next;
			switch (x->type){
				case AUTH_CLIENT_STATEFULL:
					if (x->u.auth.timeout>=0 && x->u.auth.timeout<=now){
						//Session timeout
						LOG(L_CRIT,"session TIMEOUT\n");
						auth_client_statefull_sm_process(x,AUTH_EV_SESSION_TIMEOUT,0);
					} else if (x->u.auth.lifetime>0 && x->u.auth.lifetime+x->u.auth.grace_period<=now){
						//lifetime + grace timeout
						LOG(L_CRIT,"lifetime+grace TIMEOUT\n");
						auth_client_statefull_sm_process(x,AUTH_EV_SESSION_GRACE_TIMEOUT,0);
					}else if (x->u.auth.lifetime>0 && x->u.auth.lifetime<=now){
						//lifetime timeout
						LOG(L_CRIT,"lifetime+grace TIMEOUT\n");
						auth_client_statefull_sm_process(x,AUTH_EV_SESSION_LIFETIME_TIMEOUT,0);
					}
					break;
				case AUTH_SERVER_STATEFULL:
					if (x->u.auth.timeout>=0 && x->u.auth.timeout<=now){
						//Session timeout
						LOG(L_CRIT,"session TIMEOUT\n");
						auth_server_statefull_sm_process(x,AUTH_EV_SESSION_TIMEOUT,0);
					}else if (x->u.auth.lifetime>0 && x->u.auth.lifetime+x->u.auth.grace_period<=now){
						//lifetime + grace timeout
						LOG(L_CRIT,"lifetime+grace TIMEOUT\n");
						auth_server_statefull_sm_process(x,AUTH_EV_SESSION_GRACE_TIMEOUT,0);
					}else if (x->u.auth.lifetime>0 && x->u.auth.lifetime<=now){
						//lifetime timeout
						LOG(L_CRIT,"lifetime+grace TIMEOUT\n");
						auth_server_statefull_sm_process(x,AUTH_EV_SESSION_LIFETIME_TIMEOUT,0);
					}
					break;
				default:
					break;
					
			}
		}
		AAASessionsUnlock(hash);
	}
	if (now%5==0)cdp_sessions_log(L_DBG);
	return 1;
}



/****************************** API FUNCTIONS ********************************/

/**
 * Creates a Generic Session.
 */
AAASession* AAACreateSession(void *generic_data)
{
	AAASession *s;
	str id;
	
	generate_session_id(&id,0);
	s = cdp_new_session(id,UNKNOWN_SESSION);
	if (s) {
		s->u.generic_data = generic_data;
		cdp_add_session(s);
	}
	return s;
}

/**
 * Make a session based on already known parameters.
 * \Note This should be used to recover saved sessions after a restart.
 * @param app_id
 * @param type
 * @param session_id - will be duplicated to shm
 * @return
 */
AAASession* AAAMakeSession(int app_id,int type,str session_id)
{
	AAASession *s;
	str id;
	
	id.s = shm_malloc(session_id.len);
	if (!id.s){
		LOG(L_ERR,"Error allocating %d bytes!\n",session_id.len);
		return 0;
	}
	memcpy(id.s,session_id.s,session_id.len);
	id.len = session_id.len;
	s = cdp_new_session(id,type);
	s->application_id = app_id;
	if (s) {		
		cdp_add_session(s);
	}
	return s;
}
/**
 * Deallocates the memory taken by a Generic Session
 */
void AAADropSession(AAASession *s)
{
	// first give a chance to the cb to free the generic param
	if (s&&s->cb) 
		(s->cb)(AUTH_EV_SESSION_DROP,s);
	del_session(s);
}


AAASession* cdp_new_auth_session(str id,int is_client,int is_statefull)
{
	AAASession *s;
	cdp_session_type_t type;
	
	if (is_client){
		if (is_statefull) type = AUTH_CLIENT_STATEFULL;
		else type = AUTH_CLIENT_STATELESS;
	}else{
		if (is_statefull) type = AUTH_SERVER_STATEFULL;
		else type = AUTH_SERVER_STATELESS;		
	}
	s = cdp_new_session(id,type);
	if (s) {
		s->u.auth.timeout=time(0)+config->default_auth_session_timeout; 
		s->u.auth.lifetime=0;
		s->u.auth.grace_period=0;
		cdp_add_session(s);
	}
	return s;
}

/**
 * Creates a Authorization Session for the Client.
 * It generates a new id and adds the session to the cdp list of sessions
 * \note Returns with a lock on AAASession->hash. Unlock when done working with the result
 * @returns the new AAASession or null on error
 */
AAASession* AAACreateClientAuthSession(int is_statefull,AAASessionCallback_f *cb,void *generic_data)
{
	AAASession *s;
	str id;
	
	generate_session_id(&id,0);

	s = cdp_new_auth_session(id,1,is_statefull);
	if (s) {
		s->u.auth.generic_data = generic_data;
		s->cb = cb;
		if (s->cb)
			(s->cb)(AUTH_EV_SESSION_CREATED,s);
	}
	return s;
}
/**
 * Creates a Authorization Session for the Server, from the application specific Session starting request
 * It generates a new id and adds the session to the cdp list of sessions
 * \note Returns with a lock on AAASession->hash. Unlock when done working with the result
 * @returns the new AAASession or null on error
 */
AAASession* AAACreateServerAuthSession(AAAMessage *msg,int is_statefull,AAASessionCallback_f *cb,void *generic_data)
{
	AAASession *s;
	str id;
	
	if (!msg||!msg->sessionId||!msg->sessionId->data.len){
		LOG(L_ERR,"Error retrieving the Session-Id from the message.\n");
		return 0;
	}
	id.s = shm_malloc(msg->sessionId->data.len);
	if (!id.s){
		LOG(L_ERR,"Error allocating %d bytes of shm!\n",msg->sessionId->data.len);
		return 0;
	}else{
		id.len = msg->sessionId->data.len;
		memcpy(id.s,msg->sessionId->data.s,id.len);
		s=cdp_new_auth_session(id,0,is_statefull);
		if (s) {
			s->u.auth.generic_data = generic_data;
			s->cb = cb;
			if (s->cb)
				(s->cb)(AUTH_EV_SESSION_CREATED,s);
			update_auth_session_timers(&(s->u.auth),msg);
			auth_server_statefull_sm_process(s,AUTH_EV_RECV_REQ,msg);	
			// this is a special exception where the session lock is not released 
			//s=0;
		}
	}
	return s;
}

/**
 * Looks for a session with a given id and returns it if found
 * \note Returns with a lock on AAASession->hash. Unlock when done working with the result
 * @returns the new AAASession or null on error
 */
AAASession* AAAGetSession(str id)
{
	return cdp_get_session(id);
}

/**
 * Looks for an Auth session with a given id and returns it if found
 * \note Returns with a lock on AAASession->hash. Unlock when done working with the result
 * @returns the new AAASession or null on error
 */
AAASession* AAAGetAuthSession(str id)
{
	AAASession *x=cdp_get_session(id);
	if (x){
		switch (x->type){
			case AUTH_CLIENT_STATEFULL:
			case AUTH_CLIENT_STATELESS:
			case AUTH_SERVER_STATEFULL:
			case AUTH_SERVER_STATELESS:
				return x;
			default:
				AAASessionsUnlock(x->hash);
				return 0;
		}
	}
	return 0;
}

/**
 * Sends a Service terminated event to the session
 */
void AAATerminateAuthSession(AAASession *s)
{
	if (s->type==AUTH_CLIENT_STATEFULL) {
		auth_client_statefull_sm_process(s,AUTH_EV_SERVICE_TERMINATED,0);
	}
}

/**
 * Deallocates the memory taken by a Authorization Session
 * \note Must be called with a lock on the s->hash - will unlock it, so don't use the session after this
 */
void AAADropAuthSession(AAASession *s)
{
	AAADropSession(s);
}

/**
 * Creates an Accounting Session.
 */
AAASession* AAACreateAccSession(void *generic_data)
{
	return 0;
}

/**
 * Deallocates the memory taken by a Accounting Session
 */
void AAADropAccSession(AAASession *s)
{
	free_session(s);
}
