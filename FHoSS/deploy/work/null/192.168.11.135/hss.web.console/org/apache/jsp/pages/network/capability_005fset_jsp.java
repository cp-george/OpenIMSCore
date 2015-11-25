package org.apache.jsp.pages.network;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import de.fhg.fokus.hss.db.model.*;
import de.fhg.fokus.hss.db.op.*;
import de.fhg.fokus.hss.web.util.*;
import de.fhg.fokus.hss.db.hibernate.*;
import org.hibernate.Session;
import de.fhg.fokus.hss.web.util.WebConstants;

public final class capability_005fset_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_style_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_styleClass_style_size_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_styleClass_style_size_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_button_value_property_onclick_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_button_value_property_onclick_disabled_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_value_styleClass_style_size_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_value_styleClass_style_size_property;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_style_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_styleClass_style_size_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_styleClass_style_size_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_button_value_property_onclick_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_button_value_property_onclick_disabled_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_value_styleClass_style_size_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_value_styleClass_style_size_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody.release();
    _jspx_tagPool_html_text_styleClass_style_property_nobody.release();
    _jspx_tagPool_html_select_styleClass_style_size_property_name.release();
    _jspx_tagPool_html_option_value.release();
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.release();
    _jspx_tagPool_html_select_styleClass_style_size_property.release();
    _jspx_tagPool_html_button_value_property_onclick_nobody.release();
    _jspx_tagPool_html_button_value_property_onclick_disabled_nobody.release();
    _jspx_tagPool_html_select_value_styleClass_style_size_property_name.release();
    _jspx_tagPool_html_select_value_styleClass_style_size_property.release();
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
      out.write("\n");
      java.util.List attached_cap = null;
      synchronized (request) {
        attached_cap = (java.util.List) _jspx_page_context.getAttribute("attached_cap", PageContext.REQUEST_SCOPE);
        if (attached_cap == null){
          throw new java.lang.InstantiationException("bean attached_cap not found within scope");
        }
      }
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title> Capability Sets </title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/hss.web.console/style/fokus_ngni.css\">\n");

	int id_set = Integer.parseInt(request.getParameter("id_set"));
	Session hibSession = HibernateUtil.getCurrentSession();
	HibernateUtil.beginTransaction();

      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\">\n");
      out.write("function add_action_for_form(action, associated_ID) {\n");
      out.write("\tswitch(action){\n");
      out.write("\t\tcase 1:\n");
      out.write("\t\t\tdocument.CapS_Form.nextAction.value=\"save\";\n");
      out.write("\t\t\tdocument.CapS_Form.submit();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 2:\n");
      out.write("\t\t\tdocument.CapS_Form.nextAction.value=\"reset\";\n");
      out.write("\t\t\tdocument.CapS_Form.reset();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\t\n");
      out.write("\t\tcase 3:\n");
      out.write("\t\t\tdocument.CapS_Form.nextAction.value=\"refresh\";\n");
      out.write("\t\t\tdocument.CapS_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\n");
      out.write("\t\tcase 4:\n");
      out.write("\t\t\tdocument.CapS_Form.nextAction.value=\"delete\";\n");
      out.write("\t\t\tdocument.CapS_Form.submit();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\t\n");
      out.write("\t\tcase 5:\n");
      out.write("\t\t\tdocument.CapS_Form.nextAction.value=\"detach_cap\";\n");
      out.write("\t\t\tdocument.CapS_Form.associated_ID.value = associated_ID;\n");
      out.write("\t\t\tdocument.CapS_Form.submit();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\t\t\t\n");
      out.write("\t\tcase 12:\n");
      out.write("\t\t\tdocument.CapS_Form.nextAction.value=\"attach_cap\";\n");
      out.write("\t\t\tdocument.CapS_Form.submit();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\t\t\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<table id=\"title-table\" align=\"center\" weight=\"100%\" >\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td align=\"center\">\n");
      out.write("\t\t\t<h1> Capability Sets </h1> \t\t\t\n");
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
      out.write("\t");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("/CapS_Submit");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          out.write('	');
          out.write('	');
          if (_jspx_meth_html_hidden_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write('\n');
          out.write('	');
          out.write('	');
          if (_jspx_meth_html_hidden_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\t\n");
          out.write("\n");
          out.write("\t\t<table id=\"main-table\" align=\"center\" valign=\"middle\">\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t \t\t<table id=\"cap-set-table\" border=\"0\" align=\"center\" >\t\t\t\t\t\t\n");
          out.write("\t\t\t \t\t<tr>\n");
          out.write("\t\t \t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t \t\t<table id=\"fields-table\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<td> ID-Set </td>\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_text_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<td> Name* </td>\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_text_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\n");
          out.write("\n");
          out.write("\t\t\t");
					if (id_set == -1){
			
          out.write("\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<td> Capability* </td>\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\tType*\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t");

								}
			
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t</table> <!-- fields-table -->\t\t\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t<td>\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<table id=\"buttons-table\" align=\"center\">\n");
          out.write("\t\t\t\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\"> \n");
          out.write("\t\t\t\t\t\t\t\t\t\t<b> Mandatory fields were marked with \"*\" </b>\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\t\n");
          out.write("\t\t\t\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t<td align=center> \n");
          out.write("\t\t\t\t\t\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");

											 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
										
          out.write("\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");

											}
										
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
 
											if (request.isUserInRole(WebConstants.Security_Permission_ADMIN) && id_set == -1){ 
										
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t\t\t\t");

											}
										
          out.write("\n");
          out.write("\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
 
											if (request.isUserInRole(WebConstants.Security_Permission_ADMIN) && id_set != -1){ 
										
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
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
          out.write("\t\t\t\t\t\t\t\t\t\t");

											}
										
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t</table>\t<!-- buttons-table -->\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t</table> <!-- cap-set-table -->\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t");

					if (id_set != -1){		
			
          out.write("\t\n");
          out.write("\n");
          out.write("\t\t\t");

				 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
			
          out.write("\t\t\n");
          out.write("\t\t\t<tr>\t\t\n");
          out.write("\t\t\t\t<td>\t\n");
          out.write("\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t<h2>Attach Capability </h2>\n");
          out.write("\t\t\t\t\t<table id=\"attach-cap-table\" width=\"400\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" style=\"border:2px solid #FF6600;\">\n");
          out.write("\t\t\t\t\t<tr class=\"even\">\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t<td>\t\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_3(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\t\n");
          out.write("\t\t\t\t\t</table> <!-- attach-cap-table -->\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t");

				}//endif ADMIN
			
          out.write("\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<br />\t\t\n");
          out.write("\t\t\t\t\t<h2> List of attached capabilities </h2>\n");
          out.write("\t\t\t\t\t<table id=\"list-attached-cap-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\n");
          out.write("\t\t\t\t\t<tr class=\"header\">\n");
          out.write("\t\t\t\t\t\t<td class=\"header\"> ID </td>\t\t\t\n");
          out.write("\t\t\t\t\t\t<td class=\"header\"> Name </td>\n");
          out.write("\t\t\t\t\t\t<td class=\"header\"> Mandatory </td>\n");
          out.write("\t\t\t\t\t\t");

							 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
						
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<td class=\"header\"> Detach </td>\n");
          out.write("\t\t\t\t\t\t");

							}
						
          out.write("\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t");

						if (attached_cap != null){
							Iterator it = attached_cap.iterator();
							CapabilitiesSet cap_set = null;
							int idx = 0;
							Capability cap = null;
							while (it.hasNext()){
								cap_set = (CapabilitiesSet) it.next();
								cap = Capability_DAO.get_by_ID(hibSession, cap_set.getId_capability());												
					
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<tr class=\"");
          out.print( idx % 2 == 0 ? "even" : "odd" );
          out.write("\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<td>  ");
          out.print( cap.getId() );
          out.write("</td>\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<td>  \n");
          out.write("\t\t\t\t\t\t\t\t\t<a href=\"/hss.web.console/Cap_Load.do?id=");
          out.print( cap.getId() );
          out.write("\" > \n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          out.print( cap.getName() );
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t</a>\t\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<td>  \n");
          out.write("\t\t\t\t\t\t\t\t\t");

										Tuple tuple = (Tuple) WebConstants.select_cap_type.get(cap_set.getIs_mandatory()); 
										out.println(tuple.getName()); 
									
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");

										 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
									
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t");

											if (((String)request.getAttribute("detachDeactivation")).equals("true")){
									
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" name=\"detach_cap\" \"value=\"Detach\" onclick=\"add_action_for_form(5, ");
          out.print( cap.getId() );
          out.write(");\" disabled/>\t\n");
          out.write("\t\t\t\t\t\t\t\t\t");

											}
											else{
									
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" name=\"detach_cap\" \"value=\"Detach\" onclick=\"add_action_for_form(5, ");
          out.print( cap.getId() );
          out.write(");\" />\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t");

											}
									
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</td>\t\n");
          out.write("\t\t\t\t\t\t\t\t\t");
											
										}
									
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t");
			
								idx++;												
								}
							}
					
          out.write("\n");
          out.write("\t\t\t\t\t</table> <!-- list-attached-cap-table -->\t\t\t\t\t\n");
          out.write("\t\t\t\t</td>\t\n");
          out.write("\t\t\t");

				}
			
          out.write("\t\n");
          out.write("\t\t</tr>\n");
          out.write("\t\t</table> <!-- main-table -->\t\t\t\n");
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
    _jspx_th_html_text_0.setProperty("id_set");
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

  private boolean _jspx_meth_html_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_0.setPageContext(_jspx_page_context);
    _jspx_th_html_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_0.setProperty("id_cap");
    _jspx_th_html_select_0.setName("CapS_Form");
    _jspx_th_html_select_0.setStyleClass("inputtext");
    _jspx_th_html_select_0.setSize("1");
    _jspx_th_html_select_0.setStyle("width:200px;");
    int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
    if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_option_0(_jspx_th_html_select_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_optionsCollection_0(_jspx_th_html_select_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_select_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_select_styleClass_style_size_property_name.reuse(_jspx_th_html_select_0);
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
        out.write("Select Capability...");
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
    _jspx_th_html_optionsCollection_0.setName("CapS_Form");
    _jspx_th_html_optionsCollection_0.setProperty("select_cap");
    _jspx_th_html_optionsCollection_0.setLabel("name");
    _jspx_th_html_optionsCollection_0.setValue("id");
    int _jspx_eval_html_optionsCollection_0 = _jspx_th_html_optionsCollection_0.doStartTag();
    if (_jspx_th_html_optionsCollection_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_0);
    return false;
  }

  private boolean _jspx_meth_html_select_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_1 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_style_size_property.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_1.setPageContext(_jspx_page_context);
    _jspx_th_html_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_1.setProperty("cap_type");
    _jspx_th_html_select_1.setStyleClass("inputtext");
    _jspx_th_html_select_1.setSize("1");
    _jspx_th_html_select_1.setStyle("width:200px;");
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
    _jspx_tagPool_html_select_styleClass_style_size_property.reuse(_jspx_th_html_select_1);
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
    _jspx_th_html_optionsCollection_1.setName("CapS_Form");
    _jspx_th_html_optionsCollection_1.setProperty("select_cap_type");
    _jspx_th_html_optionsCollection_1.setLabel("name");
    _jspx_th_html_optionsCollection_1.setValue("code");
    int _jspx_eval_html_optionsCollection_1 = _jspx_th_html_optionsCollection_1.doStartTag();
    if (_jspx_th_html_optionsCollection_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_1);
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
    _jspx_th_html_button_1.setOnclick("add_action_for_form(3, -1);");
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
    _jspx_th_html_button_2.setOnclick("add_action_for_form(2, -1);");
    int _jspx_eval_html_button_2 = _jspx_th_html_button_2.doStartTag();
    if (_jspx_th_html_button_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick_nobody.reuse(_jspx_th_html_button_2);
    return false;
  }

  private boolean _jspx_meth_html_select_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_2 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_value_styleClass_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_2.setPageContext(_jspx_page_context);
    _jspx_th_html_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_2.setProperty("id_cap");
    _jspx_th_html_select_2.setValue("-1");
    _jspx_th_html_select_2.setName("CapS_Form");
    _jspx_th_html_select_2.setStyleClass("inputtext");
    _jspx_th_html_select_2.setSize("1");
    _jspx_th_html_select_2.setStyle("width:150px;");
    int _jspx_eval_html_select_2 = _jspx_th_html_select_2.doStartTag();
    if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_option_1(_jspx_th_html_select_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_optionsCollection_2(_jspx_th_html_select_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_select_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_select_value_styleClass_style_size_property_name.reuse(_jspx_th_html_select_2);
    return false;
  }

  private boolean _jspx_meth_html_option_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_1 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_1.setPageContext(_jspx_page_context);
    _jspx_th_html_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_2);
    _jspx_th_html_option_1.setValue("-1");
    int _jspx_eval_html_option_1 = _jspx_th_html_option_1.doStartTag();
    if (_jspx_eval_html_option_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_option_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_option_1.doInitBody();
      }
      do {
        out.write("Select Capability...");
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

  private boolean _jspx_meth_html_optionsCollection_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:optionsCollection
    org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_optionsCollection_2 = (org.apache.struts.taglib.html.OptionsCollectionTag) _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
    _jspx_th_html_optionsCollection_2.setPageContext(_jspx_page_context);
    _jspx_th_html_optionsCollection_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_2);
    _jspx_th_html_optionsCollection_2.setName("CapS_Form");
    _jspx_th_html_optionsCollection_2.setProperty("select_cap");
    _jspx_th_html_optionsCollection_2.setLabel("name");
    _jspx_th_html_optionsCollection_2.setValue("id");
    int _jspx_eval_html_optionsCollection_2 = _jspx_th_html_optionsCollection_2.doStartTag();
    if (_jspx_th_html_optionsCollection_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_2);
    return false;
  }

  private boolean _jspx_meth_html_select_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_3 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_value_styleClass_style_size_property.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_3.setPageContext(_jspx_page_context);
    _jspx_th_html_select_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_3.setProperty("cap_type");
    _jspx_th_html_select_3.setValue("-1");
    _jspx_th_html_select_3.setStyleClass("inputtext");
    _jspx_th_html_select_3.setSize("1");
    _jspx_th_html_select_3.setStyle("width:100px;");
    int _jspx_eval_html_select_3 = _jspx_th_html_select_3.doStartTag();
    if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_optionsCollection_3(_jspx_th_html_select_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_select_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_select_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_select_value_styleClass_style_size_property.reuse(_jspx_th_html_select_3);
    return false;
  }

  private boolean _jspx_meth_html_optionsCollection_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:optionsCollection
    org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_optionsCollection_3 = (org.apache.struts.taglib.html.OptionsCollectionTag) _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
    _jspx_th_html_optionsCollection_3.setPageContext(_jspx_page_context);
    _jspx_th_html_optionsCollection_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_3);
    _jspx_th_html_optionsCollection_3.setName("CapS_Form");
    _jspx_th_html_optionsCollection_3.setProperty("select_cap_type");
    _jspx_th_html_optionsCollection_3.setLabel("name");
    _jspx_th_html_optionsCollection_3.setValue("code");
    int _jspx_eval_html_optionsCollection_3 = _jspx_th_html_optionsCollection_3.doStartTag();
    if (_jspx_th_html_optionsCollection_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_3);
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
    _jspx_th_html_button_4.setProperty("cap_attach_button");
    _jspx_th_html_button_4.setValue("Attach");
    _jspx_th_html_button_4.setOnclick("add_action_for_form(12, -1);");
    int _jspx_eval_html_button_4 = _jspx_th_html_button_4.doStartTag();
    if (_jspx_th_html_button_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick_nobody.reuse(_jspx_th_html_button_4);
    return false;
  }
}
