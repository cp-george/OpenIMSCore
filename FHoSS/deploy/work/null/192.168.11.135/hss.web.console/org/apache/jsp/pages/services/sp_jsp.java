package org.apache.jsp.pages.services;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import de.fhg.fokus.hss.db.model.*;
import de.fhg.fokus.hss.db.op.*;
import de.fhg.fokus.hss.db.hibernate.*;
import org.hibernate.Session;
import de.fhg.fokus.hss.web.util.WebConstants;

public final class sp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_style_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_button_value_property_onclick_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_button_value_property_onclick_disabled_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_value_styleClass_style_size_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_value_styleClass_style_property_nobody;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_style_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_button_value_property_onclick_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_button_value_property_onclick_disabled_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_value_styleClass_style_size_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_value_styleClass_style_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody.release();
    _jspx_tagPool_html_text_styleClass_style_property_nobody.release();
    _jspx_tagPool_html_button_value_property_onclick_nobody.release();
    _jspx_tagPool_html_button_value_property_onclick_disabled_nobody.release();
    _jspx_tagPool_html_select_value_styleClass_style_size_property_name.release();
    _jspx_tagPool_html_option_value.release();
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.release();
    _jspx_tagPool_html_text_value_styleClass_style_property_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title> SP </title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/hss.web.console/style/fokus_ngni.css\">\n");
      java.util.List attached_ifc_list = null;
      synchronized (request) {
        attached_ifc_list = (java.util.List) _jspx_page_context.getAttribute("attached_ifc_list", PageContext.REQUEST_SCOPE);
        if (attached_ifc_list == null){
          throw new java.lang.InstantiationException("bean attached_ifc_list not found within scope");
        }
      }
      out.write('\n');
      java.util.List attached_shared_ifc_list = null;
      synchronized (request) {
        attached_shared_ifc_list = (java.util.List) _jspx_page_context.getAttribute("attached_shared_ifc_list", PageContext.REQUEST_SCOPE);
        if (attached_shared_ifc_list == null){
          throw new java.lang.InstantiationException("bean attached_shared_ifc_list not found within scope");
        }
      }
      out.write('\n');
      out.write('\n');

	int id = Integer.parseInt(request.getParameter("id"));
	Session hibSession = HibernateUtil.getCurrentSession();
	HibernateUtil.beginTransaction();
	

      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\">\n");
      out.write("\n");
      out.write("function add_action_for_form(action, associated_ID) {\n");
      out.write("\n");
      out.write("\tswitch(action){\n");
      out.write("\t\tcase 1:\n");
      out.write("\t\t\tdocument.SP_Form.nextAction.value=\"save\";\n");
      out.write("\t\t\tdocument.SP_Form.submit();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 2:\n");
      out.write("\t\t\tdocument.SP_Form.nextAction.value=\"refresh\";\n");
      out.write("\t\t\tdocument.SP_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 3:\n");
      out.write("\t\t\tdocument.SP_Form.nextAction.value=\"reset\";\n");
      out.write("\t\t\tdocument.SP_Form.reset();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 4:\n");
      out.write("\t\t\tdocument.SP_Form.nextAction.value=\"delete\";\n");
      out.write("\t\t\tdocument.SP_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 5:\n");
      out.write("\t\t\tdocument.SP_Form.nextAction.value=\"detach_ifc\";\n");
      out.write("\t\t\tdocument.SP_Form.associated_ID.value = associated_ID;\t\t\t\n");
      out.write("\t\t\tdocument.SP_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 6:\n");
      out.write("\t\t\tdocument.SP_Form.nextAction.value=\"detach_shared_ifc\";\n");
      out.write("\t\t\tdocument.SP_Form.associated_ID.value = associated_ID;\t\t\t\t\t\t\n");
      out.write("\t\t\tdocument.SP_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\n");
      out.write("\t\tcase 12:\n");
      out.write("\t\t\tdocument.SP_Form.nextAction.value=\"attach_ifc\";\n");
      out.write("\t\t\tdocument.SP_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\n");
      out.write("\t\tcase 13:\n");
      out.write("\t\t\tdocument.SP_Form.nextAction.value=\"attach_shared_ifc\";\n");
      out.write("\t\t\tdocument.SP_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\t\t\t\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<table id=\"title-table\" align=\"center\" weight=\"100%\" >\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td align=\"center\">\n");
      out.write("\t\t\t<h1> Service Profile -SP- </h1> \t\t\t\n");
      out.write("\t\t\t<br/><br/>\t\t\t\n");
      out.write("\t\t</td>\n");
      out.write("\t<tr>\t\n");
      out.write("\t\t<td align=\"left\">\n");
      out.write("\t\t\t<!-- Print errors, if any -->\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/pages/tiles/error.jsp", out, false);
      out.write("\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\t</table> <!-- title-table -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("/SP_Submit");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          out.write('	');
          if (_jspx_meth_html_hidden_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write('\n');
          out.write('	');
          if (_jspx_meth_html_hidden_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\n");
          out.write("\t<table id=\"main-table\" align=\"center\" valign=\"middle\">\n");
          out.write("\t<tr>\n");
          out.write("\t\t<td>\n");
          out.write("\t \t\t<table id=\"top-side-table\" border=\"0\" align=\"center\" width=\"400\" >\t\t\t\t\t\t\n");
          out.write(" \t\t\t<tr>\n");
          out.write(" \t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<table id=\"fields-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"100%\" style=\"border:2px solid #FF6600;\">\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td> ID </td>\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_text_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" </td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td>Name* </td>\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_text_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" </td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td>Core Network Service Auth </td>\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_text_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" </td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t</table> <!-- fields-table -->\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t</tr>\n");
          out.write(" \t\t\t<tr>\n");
          out.write(" \t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<table id=\"buttons-table\" align=\"center\">\t\t\t\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t<td align=\"center\"> \n");
          out.write("\t\t\t\t\t\t<b> Mandatory fields were marked with \"*\" </b>\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\t\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t<td align=center> <br/>\n");
          out.write("\t\t\t\t\t\t\t");

								 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
							
          out.write("\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t");

								}
							
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t");
 
								if (request.isUserInRole(WebConstants.Security_Permission_ADMIN) && id == -1){ 
							
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t");

								}
							
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
 
								if (request.isUserInRole(WebConstants.Security_Permission_ADMIN) && id != -1){ 
							
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
          //  html:button
          org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_3 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_value_property_onclick_disabled_nobody.get(org.apache.struts.taglib.html.ButtonTag.class);
          _jspx_th_html_button_3.setPageContext(_jspx_page_context);
          _jspx_th_html_button_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_button_3.setProperty("delete_button");
          _jspx_th_html_button_3.setValue("Delete");
          _jspx_th_html_button_3.setOnclick("add_action_for_form(4, -1);");
          _jspx_th_html_button_3.setDisabled(Boolean.parseBoolean((String)request.getAttribute("deleteDeactivation")) );
          int _jspx_eval_html_button_3 = _jspx_th_html_button_3.doStartTag();
          if (_jspx_th_html_button_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_button_value_property_onclick_disabled_nobody.reuse(_jspx_th_html_button_3);
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t");

								}
							
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t</table> <!-- buttons-table -->\t\t\t\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t</table> <!-- top-side-table -->\t\t\n");
          out.write("\t\t</td>\n");
          out.write("\t</tr>\n");
          out.write("\t");

		if (id != -1){
	
          out.write("\n");
          out.write("\t<tr>\n");
          out.write("\t\t<td>\n");
          out.write("\t\t\t<table id=\"bottom-side-table\">\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<table id=\"bottom-left-table\">\n");
          out.write("\t\t\t\t\t");
 
						if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){ 
					
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t<h2>Attach IFC </h2>\n");
          out.write("\t\t\t\t\t\t\t<table id=\"attach-ifc-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\n");
          out.write("\t\t\t\t\t\t\t<tr class=\"even\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<td>\t\n");
          out.write("\t\t\t\t\t\t\t\t\t<b> Priority </b>\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<td>\t\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_text_3(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\t\n");
          out.write("\t\t\t\t\t\t\t</table> <!--attach-ifc-table -->\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t");

						} //endif ADMIN
					
          out.write("\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t<br />\t\t\n");
          out.write("\t\t\t\t\t\t\t<h2> List of attached IFCs</h2>\n");
          out.write("\t\t\t\t\t\t\t<table id=\"list-attached-ifc-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\n");
          out.write("\t\t\t\t\t\t\t<tr class=\"header\">\n");
          out.write("\t\t\t\t\t\t\t\t<td class=\"header\"> ID </td>\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<td class=\"header\"> IFC Name </td>\n");
          out.write("\t\t\t\t\t\t\t\t<td class=\"header\"> Priority </td>\n");
          out.write("\t\t\t\t\t\t\t\t");
 
									if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){ 
								
          out.write("\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<td class=\"header\"> Detach </td>\n");
          out.write("\t\t\t\t\t\t\t\t");

									}
								
          out.write("\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t");

								if (attached_ifc_list != null){
									Iterator it = attached_ifc_list.iterator();
									IFC ifc = null;
									int idx = 0;
									while (it.hasNext()){
										ifc = (IFC) it.next();
												
							
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t<tr class=\"");
          out.print( idx % 2 == 0 ? "even" : "odd" );
          out.write("\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td>  ");
          out.print( ifc.getId() );
          out.write("</td>\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td>  \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"/hss.web.console/IFC_Load.do?id=");
          out.print( ifc.getId() );
          out.write("\" > \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          out.print( ifc.getName() );
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td>  \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");

												SP_IFC sp_ifc = SP_IFC_DAO.get_by_SP_and_IFC_ID(hibSession, id, ifc.getId());
												if (sp_ifc != null){
													out.println(sp_ifc.getPriority());
												}
												else{
													out.println("Error, SP_IFC is NULL!");
												}
											
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
 
											if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){ 
										
          out.write("\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td> \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" name=\"detach_ifc\" \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\"value=\"Detach\" onclick=\"add_action_for_form(5, ");
          out.print( ifc.getId() );
          out.write(");\"/>\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");

											}
										
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t");
			
										idx++;												
										}
									}
							
          out.write("\n");
          out.write("\t\t\t\t\t\t\t</table> <!-- list-attached-ifc-table -->\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\t\t\t\t\t\n");
          out.write("\t\t\t\t\t</table> <!-- bottom-left-table-->\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<table id=\"bottom-right-table\">\n");
          out.write("\t\t\t\t\t\t");
 
							if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){ 
						
          out.write("\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t\t<td>\t\n");
          out.write("\t\t\t\t\t\t\t\t<h2>Attach Shared-IFC-Set </h2>\n");
          out.write("\t\t\t\t\t\t\t\t<table id=\"shared-ifc-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\n");
          out.write("\t\t\t\t\t\t\t\t<tr class=\"even\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\t\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_5(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\t\n");
          out.write("\t\t\t\t\t\t\t\t</table> <!-- shared-ifc-table -->\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t");

							}
						
          out.write("\n");
          out.write("\t\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t\t<td>\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t\t\t\t<h2> List of attached Shared-IFC-Sets </h2>\n");
          out.write("\t\t\t\t\t\t\t\t<table id=\"list-shared-ifc-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\n");
          out.write("\t\t\t\t\t\t\t\t<tr class=\"header\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<td class=\"header\"> ID-Set </td>\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t<td class=\"header\"> Name </td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
 
										if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){ 
									
          out.write("\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t<td class=\"header\"> Detach </td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");

										}
									
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\t");

									if (attached_shared_ifc_list != null){
										Iterator it = attached_shared_ifc_list.iterator();
										Shared_IFC_Set shared_ifc_set = null;
										int idx = 0;
										while (it.hasNext()){
											shared_ifc_set = (Shared_IFC_Set) it.next();
												
								
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"");
          out.print( idx % 2 == 0 ? "even" : "odd" );
          out.write("\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>  ");
          out.print( shared_ifc_set.getId_set() );
          out.write("</td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>  \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"/hss.web.console/S_IFC_Load.do?id_set=");
          out.print( shared_ifc_set.getId_set() );
          out.write("\" > \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
          out.print( shared_ifc_set.getName() );
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
 
												if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){ 
											
          out.write("\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td> \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" name=\"detach_shared_ifc\" \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"value=\"Detach\" onclick=\"add_action_for_form(6, ");
          out.print( shared_ifc_set.getId_set() );
          out.write(");\"/>\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");

												}
											
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t");
			
											idx++;												
											}
										}
								
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</table> <!-- list-shared-ifc-table -->\n");
          out.write("\t\t\t\t\t\t\t</td>\t\t\t\t\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t</table> <!--bottom-right-table>\t\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t</table> <!-- bottom-side-table -->\n");
          out.write("\t\t\t</td>\n");
          out.write("\t\t</tr>\n");
          out.write("\t\t");

			}
		
          out.write("\n");
          out.write("\t\t</table> <!-- main-table-->\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_html_hidden_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_0 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_0.setProperty("nextAction");
    _jspx_th_html_hidden_0.setValue("");
    int _jspx_eval_html_hidden_0 = _jspx_th_html_hidden_0.doStartTag();
    if (_jspx_th_html_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_0);
    return false;
  }

  private boolean _jspx_meth_html_hidden_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_1 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_1.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_1.setProperty("associated_ID");
    _jspx_th_html_hidden_1.setValue("");
    int _jspx_eval_html_hidden_1 = _jspx_th_html_hidden_1.doStartTag();
    if (_jspx_th_html_hidden_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_value_property_nobody.reuse(_jspx_th_html_hidden_1);
    return false;
  }

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setProperty("id");
    _jspx_th_html_text_0.setReadonly(true);
    _jspx_th_html_text_0.setStyleClass("inputtext_readonly");
    _jspx_th_html_text_0.setStyle("width:100px;");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_style_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(_jspx_page_context);
    _jspx_th_html_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_1.setProperty("name");
    _jspx_th_html_text_1.setStyleClass("inputtext");
    _jspx_th_html_text_1.setStyle("width:200px;");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_style_property_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_html_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_style_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_2.setPageContext(_jspx_page_context);
    _jspx_th_html_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_2.setProperty("cn_service_auth");
    _jspx_th_html_text_2.setStyleClass("inputtext");
    _jspx_th_html_text_2.setStyle("width:200px;");
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_style_property_nobody.reuse(_jspx_th_html_text_2);
    return false;
  }

  private boolean _jspx_meth_html_button_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_0 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_value_property_onclick_nobody.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_0.setPageContext(_jspx_page_context);
    _jspx_th_html_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_button_0.setProperty("save_button");
    _jspx_th_html_button_0.setValue("Save");
    _jspx_th_html_button_0.setOnclick("add_action_for_form(1, -1);");
    int _jspx_eval_html_button_0 = _jspx_th_html_button_0.doStartTag();
    if (_jspx_th_html_button_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick_nobody.reuse(_jspx_th_html_button_0);
    return false;
  }

  private boolean _jspx_meth_html_button_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_1 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_value_property_onclick_nobody.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_1.setPageContext(_jspx_page_context);
    _jspx_th_html_button_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_button_1.setProperty("refresh_button");
    _jspx_th_html_button_1.setValue("Refresh");
    _jspx_th_html_button_1.setOnclick("add_action_for_form(2, -1);");
    int _jspx_eval_html_button_1 = _jspx_th_html_button_1.doStartTag();
    if (_jspx_th_html_button_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick_nobody.reuse(_jspx_th_html_button_1);
    return false;
  }

  private boolean _jspx_meth_html_button_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_2 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_value_property_onclick_nobody.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_2.setPageContext(_jspx_page_context);
    _jspx_th_html_button_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_button_2.setProperty("reset_button");
    _jspx_th_html_button_2.setValue("Reset");
    _jspx_th_html_button_2.setOnclick("add_action_for_form(3, -1);");
    int _jspx_eval_html_button_2 = _jspx_th_html_button_2.doStartTag();
    if (_jspx_th_html_button_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick_nobody.reuse(_jspx_th_html_button_2);
    return false;
  }

  private boolean _jspx_meth_html_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_value_styleClass_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_0.setPageContext(_jspx_page_context);
    _jspx_th_html_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_0.setProperty("ifc_id");
    _jspx_th_html_select_0.setValue("-1");
    _jspx_th_html_select_0.setName("SP_Form");
    _jspx_th_html_select_0.setStyleClass("inputtext");
    _jspx_th_html_select_0.setSize("1");
    _jspx_th_html_select_0.setStyle("width:150px;");
    int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
    if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_option_0(_jspx_th_html_select_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_optionsCollection_0(_jspx_th_html_select_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_select_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_select_value_styleClass_style_size_property_name.reuse(_jspx_th_html_select_0);
    return false;
  }

  private boolean _jspx_meth_html_option_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_0 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_0.setPageContext(_jspx_page_context);
    _jspx_th_html_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
    _jspx_th_html_option_0.setValue("-1");
    int _jspx_eval_html_option_0 = _jspx_th_html_option_0.doStartTag();
    if (_jspx_eval_html_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_option_0.doInitBody();
      }
      do {
        out.write("Select IFC...");
        int evalDoAfterBody = _jspx_th_html_option_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_0);
    return false;
  }

  private boolean _jspx_meth_html_optionsCollection_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:optionsCollection
    org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_optionsCollection_0 = (org.apache.struts.taglib.html.OptionsCollectionTag) _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
    _jspx_th_html_optionsCollection_0.setPageContext(_jspx_page_context);
    _jspx_th_html_optionsCollection_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
    _jspx_th_html_optionsCollection_0.setName("SP_Form");
    _jspx_th_html_optionsCollection_0.setProperty("select_ifc");
    _jspx_th_html_optionsCollection_0.setLabel("name");
    _jspx_th_html_optionsCollection_0.setValue("id");
    int _jspx_eval_html_optionsCollection_0 = _jspx_th_html_optionsCollection_0.doStartTag();
    if (_jspx_th_html_optionsCollection_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_0);
    return false;
  }

  private boolean _jspx_meth_html_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_3 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_value_styleClass_style_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_3.setPageContext(_jspx_page_context);
    _jspx_th_html_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_3.setProperty("sp_ifc_priority");
    _jspx_th_html_text_3.setValue("0");
    _jspx_th_html_text_3.setStyleClass("inputtext");
    _jspx_th_html_text_3.setStyle("width:50px;");
    int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
    if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_value_styleClass_style_property_nobody.reuse(_jspx_th_html_text_3);
    return false;
  }

  private boolean _jspx_meth_html_button_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_4 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_value_property_onclick_nobody.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_4.setPageContext(_jspx_page_context);
    _jspx_th_html_button_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_button_4.setProperty("ifc_attach_button");
    _jspx_th_html_button_4.setValue("Attach");
    _jspx_th_html_button_4.setOnclick("add_action_for_form(12, -1);");
    int _jspx_eval_html_button_4 = _jspx_th_html_button_4.doStartTag();
    if (_jspx_th_html_button_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick_nobody.reuse(_jspx_th_html_button_4);
    return false;
  }

  private boolean _jspx_meth_html_select_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_1 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_value_styleClass_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_1.setPageContext(_jspx_page_context);
    _jspx_th_html_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_1.setProperty("shared_ifc_id");
    _jspx_th_html_select_1.setValue("-1");
    _jspx_th_html_select_1.setName("SP_Form");
    _jspx_th_html_select_1.setStyleClass("inputtext");
    _jspx_th_html_select_1.setSize("1");
    _jspx_th_html_select_1.setStyle("width:150px;");
    int _jspx_eval_html_select_1 = _jspx_th_html_select_1.doStartTag();
    if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_option_1(_jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_optionsCollection_1(_jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_select_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_select_value_styleClass_style_size_property_name.reuse(_jspx_th_html_select_1);
    return false;
  }

  private boolean _jspx_meth_html_option_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_1 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_1.setPageContext(_jspx_page_context);
    _jspx_th_html_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
    _jspx_th_html_option_1.setValue("-1");
    int _jspx_eval_html_option_1 = _jspx_th_html_option_1.doStartTag();
    if (_jspx_eval_html_option_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_option_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_option_1.doInitBody();
      }
      do {
        out.write("Select Shared-iFC...");
        int evalDoAfterBody = _jspx_th_html_option_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_1);
    return false;
  }

  private boolean _jspx_meth_html_optionsCollection_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:optionsCollection
    org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_optionsCollection_1 = (org.apache.struts.taglib.html.OptionsCollectionTag) _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
    _jspx_th_html_optionsCollection_1.setPageContext(_jspx_page_context);
    _jspx_th_html_optionsCollection_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
    _jspx_th_html_optionsCollection_1.setName("SP_Form");
    _jspx_th_html_optionsCollection_1.setProperty("select_shared_ifc");
    _jspx_th_html_optionsCollection_1.setLabel("name");
    _jspx_th_html_optionsCollection_1.setValue("id_set");
    int _jspx_eval_html_optionsCollection_1 = _jspx_th_html_optionsCollection_1.doStartTag();
    if (_jspx_th_html_optionsCollection_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_1);
    return false;
  }

  private boolean _jspx_meth_html_button_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_5 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_value_property_onclick_nobody.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_5.setPageContext(_jspx_page_context);
    _jspx_th_html_button_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_button_5.setProperty("ifc_attach_button");
    _jspx_th_html_button_5.setValue("Attach");
    _jspx_th_html_button_5.setOnclick("add_action_for_form(13, -1);");
    int _jspx_eval_html_button_5 = _jspx_th_html_button_5.doStartTag();
    if (_jspx_th_html_button_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick_nobody.reuse(_jspx_th_html_button_5);
    return false;
  }
}
