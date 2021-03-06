/*
 * $Id: nonce.h 2 2006-11-14 22:37:20Z vingarzan $
 *
 * Nonce related functions
 *
 * Copyright (C) 2001-2003 FhG Fokus
 *
 * This file is part of ser, a free SIP server.
 *
 * ser is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version
 *
 * For a license to use the ser software under conditions
 * other than those described here, or to purchase support for this
 * software, please contact iptel.org by e-mail at the following addresses:
 *    info@iptel.org
 *
 * ser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License 
 * along with this program; if not, write to the Free Software 
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */


#ifndef NONCE_H
#define NONCE_H

#include "../../parser/msg_parser.h"
#include "../../str.h"
#include <time.h>


/*
 * Length of nonce string in bytes
 */
#define NONCE_LEN (8+32)


/*
 * Calculate nonce value
 */
void calc_nonce(char* nonce, int expires, str* secret, struct sip_msg* msg);


/*
 * Check nonce value received from UA
 */
int check_nonce(str* nonce, str* secret, struct sip_msg* msg);


/*
 * Get expiry time from nonce string
 */
time_t get_nonce_expires(str* nonce);


/*
 * Check if the nonce is stale
 */
int is_nonce_stale(str* nonce);


#endif /* NONCE_H */
