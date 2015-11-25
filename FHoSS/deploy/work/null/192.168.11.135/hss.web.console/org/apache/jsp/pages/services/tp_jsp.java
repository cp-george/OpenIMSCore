package org.apache.jsp.pages.services;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import de.fhg.fokus.hss.db.model.*;
import de.fhg.fokus.hss.cx.CxConstants;
import de.fhg.fokus.hss.web.form.*;
import de.fhg.fokus.hss.web.util.WebConstants;

public final class tp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_style_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_styleClass_style_size_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_button_value_property_onclick_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_button_value_property_onclick_disabled_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_value_styleClass_style_size_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_nested_iterate_type_property_name_indexId_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_equal_value_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_nested_checkbox_styleClass_property_onclick_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_nested_hidden_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_nested_hidden_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_nested_text_styleClass_style_property_onchange_maxlength_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_nested_select_property_onchange;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_nested_optionsCollection_value_property_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_nested_select_styleClass_property_onchange;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_nested_text_styleClass_style_size_property_onchange_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_nested_equal_value_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_nested_checkbox_styleClass_property_onchange_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEmpty_property_name;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_style_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_styleClass_style_size_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_button_value_property_onclick_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_button_value_property_onclick_disabled_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_value_styleClass_style_size_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_nested_iterate_type_property_name_indexId_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_equal_value_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_nested_checkbox_styleClass_property_onclick_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_nested_hidden_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_nested_hidden_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_nested_text_styleClass_style_property_onchange_maxlength_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_nested_select_property_onchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_nested_optionsCollection_value_property_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_nested_select_styleClass_property_onchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_nested_text_styleClass_style_size_property_onchange_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_nested_equal_value_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_nested_checkbox_styleClass_property_onchange_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEmpty_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_html_hidden_property_nobody.release();
    _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody.release();
    _jspx_tagPool_html_text_styleClass_style_property_nobody.release();
    _jspx_tagPool_html_select_styleClass_style_size_property_name.release();
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.release();
    _jspx_tagPool_html_button_value_property_onclick_nobody.release();
    _jspx_tagPool_html_button_value_property_onclick_disabled_nobody.release();
    _jspx_tagPool_html_select_value_styleClass_style_size_property_name.release();
    _jspx_tagPool_html_option_value.release();
    _jspx_tagPool_nested_iterate_type_property_name_indexId_id.release();
    _jspx_tagPool_logic_equal_value_property_name.release();
    _jspx_tagPool_bean_message_key_nobody.release();
    _jspx_tagPool_nested_checkbox_styleClass_property_onclick_nobody.release();
    _jspx_tagPool_nested_hidden_property.release();
    _jspx_tagPool_nested_hidden_property_nobody.release();
    _jspx_tagPool_nested_text_styleClass_style_property_onchange_maxlength_nobody.release();
    _jspx_tagPool_nested_select_property_onchange.release();
    _jspx_tagPool_nested_optionsCollection_value_property_label_nobody.release();
    _jspx_tagPool_nested_select_styleClass_property_onchange.release();
    _jspx_tagPool_nested_text_styleClass_style_size_property_onchange_nobody.release();
    _jspx_tagPool_nested_equal_value_property.release();
    _jspx_tagPool_nested_checkbox_styleClass_property_onchange_nobody.release();
    _jspx_tagPool_logic_notEmpty_property_name.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title> TP </title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/hss.web.console/style/fokus_ngni.css\">\n");
      java.util.List attached_ifc_list = null;
      synchronized (request) {
        attached_ifc_list = (java.util.List) _jspx_page_context.getAttribute("attached_ifc_list", PageContext.REQUEST_SCOPE);
        if (attached_ifc_list == null){
          throw new java.lang.InstantiationException("bean attached_ifc_list not found within scope");
        }
      }
      out.write('\n');
      out.write('\n');

	int id = Integer.parseInt(request.getParameter("id"));

      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\">\n");
      out.write("function add_action_for_form(action, associated_ID) {\n");
      out.write("\tswitch(action){\n");
      out.write("\t\tcase 1:\n");
      out.write("\t\t\tdocument.TP_Form.nextAction.value=\"save\";\n");
      out.write("\t\t\tdocument.TP_Form.submit();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 2:\n");
      out.write("\t\t\tdocument.TP_Form.nextAction.value=\"refresh\";\n");
      out.write("\t\t\tdocument.TP_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 3:\n");
      out.write("\t\t\tdocument.TP_Form.nextAction.value=\"reset\";\n");
      out.write("\t\t\tdocument.TP_Form.reset();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 4:\n");
      out.write("\t\t\tdocument.TP_Form.nextAction.value=\"delete\";\n");
      out.write("\t\t\tdocument.TP_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 5:\n");
      out.write("\t\t\tdocument.TP_Form.nextAction.value=\"detach_ifc\";\n");
      out.write("\t\t\tdocument.TP_Form.associated_ID.value = associated_ID;\t\t\t\n");
      out.write("\t\t\tdocument.TP_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 6:\n");
      out.write("\t\t\tdocument.TP_Form.nextAction.value=\"delete_spt\";\n");
      out.write("\t\t\tdocument.TP_Form.associated_ID.value = associated_ID;\t\t\t\n");
      out.write("\t\t\tdocument.TP_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\n");
      out.write("\t\tcase 12:\n");
      out.write("\t\t\tdocument.TP_Form.nextAction.value=\"attach_ifc\";\n");
      out.write("\t\t\tdocument.TP_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\n");
      out.write("\t\tcase 13:\n");
      out.write("\t\t\tdocument.TP_Form.nextAction.value=\"save_spt\";\n");
      out.write("\t\t\tdocument.TP_Form.submit();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function addSpt(groupId, is_spt_list_empty){\n");
      out.write("\tdocument.TP_Form.nextAction.value = \"attach_spt\";\n");
      out.write("\tif (is_spt_list_empty == 1){\n");
      out.write("\t\tdocument.TP_Form.type.value = document.TP_Form.typeSelect.value;\n");
      out.write("\t}\n");
      out.write("\telse{\n");
      out.write("\t\tdocument.TP_Form.type.value = document.TP_Form.typeSelect[groupId].value;\n");
      out.write("\t}\n");
      out.write("\tdocument.TP_Form.group.value = groupId;\n");
      out.write("\tdocument.TP_Form.submit();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<table id=\"title-table\" align=\"center\" weight=\"100%\" >\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td align=\"center\">\n");
      out.write("\t\t\t<h1> Trigger Point -TP- </h1> \t\t\t\n");
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
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("/TP_Submit");
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
          out.write("\t\n");
          out.write("\t");
          if (_jspx_meth_html_hidden_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write('\n');
          out.write('	');
          if (_jspx_meth_html_hidden_3(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\n");
          out.write("\t<table id=\"main-table\" align=\"center\" valign=\"middle\">\n");
          out.write("\t<tr>\n");
          out.write("\t\t<td>\n");
          out.write("\t \t\t<table id=\"top-side-table\" border=\"0\" align=\"center\">\t\t\t\t\t\t\n");
          out.write(" \t\t\t<tr>\n");
          out.write(" \t\t\t\t<td>\n");
          out.write(" \t\t\t\t\t<table id=\"left-side-table\">\n");
          out.write(" \t\t\t\t\t<tr>\n");
          out.write(" \t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t<table id=\"fields-table\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td> ID </td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_text_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" </td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td> Name* </td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_text_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" </td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>Condition Type CNF* </td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t</table> <!-- fields-table -->\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t \t\t\t<tr>\n");
          out.write(" \t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t<table id=\"buttons-table\" align=\"center\">\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t\t\t<td align=\"center\"> \n");
          out.write("\t\t\t\t\t\t\t\t\t<b> Mandatory fields were marked with \"*\" </b>\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\t\n");
          out.write("\t\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<td align=center> \n");
          out.write("\t\t\t\t\t\t\t\t\t<br/>\n");
          out.write("\t\t\t\t\t\t\t\t\t");

										 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
									
          out.write("\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t");

										}
									
          out.write("\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t\t\t");
 
										if (request.isUserInRole(WebConstants.Security_Permission_ADMIN) && id == -1){ 
									
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t\t\t");

										}
									
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t");
 
										if (request.isUserInRole(WebConstants.Security_Permission_ADMIN) && id != -1){ 
									
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
          out.write("\t\t\t\t\t\t\t\t\t");

										}
									
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t</table> <!-- buttons-table -->\t\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t</table>\n");
          out.write("\t\t\t\t</td>\t\t\t\t\n");
          out.write("\t");

				if (id != -1){
	
          out.write("\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<table id=\"right-side-table\">\n");
          out.write("\t\t\t\t\t");

						 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
					
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t<h2>Attach IFC </h2>\n");
          out.write("\t\t\t\t\t\t\t<table id=\"ifc-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\n");
          out.write("\t\t\t\t\t\t\t<tr class=\"even\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\t\n");
          out.write("\t\t\t\t\t\t\t</table> <!-- ifc-table -->\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t");

						}//endif ADMIN
					
          out.write("\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t<td>\t\t\n");
          out.write("\t\t\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t\t\t<h2> List of attached IFCs </h2>\n");
          out.write("\t\t\t\t\t\t\t<table id=\"list-ifc-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\n");
          out.write("\t\t\t\t\t\t\t<tr class=\"header\">\n");
          out.write("\t\t\t\t\t\t\t\t<td class=\"header\"> ID </td>\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<td class=\"header\"> IFC Name </td>\n");
          out.write("\t\t\t\t\t\t\t\t");

									 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
								
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td class=\"header\"> Detach </td>\n");
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
          out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td>  \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"/hss.web.console/IFC_Load.do?id=");
          out.print( ifc.getId() );
          out.write("\" > \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          out.print( ifc.getName() );
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");

											 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
										
          out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
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
          out.write("\t\t\t\t\t\t\t</table> <!-- list-ifc-table -->\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t</table> <!-- right-side-table-->\t\t\n");
          out.write("\t\t\t\t</td>\t\t\n");
          out.write("\t\t\t</tr>\t\n");
          out.write("\t\t\t</table> <!-- top-side-table-->\t\t\n");
          out.write("\t\t</td>\n");
          out.write("\t</tr>\n");
          out.write("\t<tr>\t\t\n");
          out.write("\t\t<td>\n");
          out.write("\t\t\t<br />\n");
          out.write("\t\t\t<h2> Add SPTs to Trigger Point </h2>\n");
          out.write("\t\t\t<table id=\"spt-table\">\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td>\t\t\t\t\n");
          out.write("\t\t\t\t\t<table class=\"as\" cellspacing=\"0\" cellpadding=\"0\">\n");
          out.write("\t\t\t\t\t<tr class=\"header\">\n");
          out.write("\t\t\t\t\t\t<td><br>\n");
          out.write("\t\t\t");
 
							int lastGroupId = 0;
							int groupCnt = 0;							
			
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<table class=\"as\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"800\">\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
          //  nested:iterate
          org.apache.struts.taglib.nested.logic.NestedIterateTag _jspx_th_nested_iterate_0 = (org.apache.struts.taglib.nested.logic.NestedIterateTag) _jspx_tagPool_nested_iterate_type_property_name_indexId_id.get(org.apache.struts.taglib.nested.logic.NestedIterateTag.class);
          _jspx_th_nested_iterate_0.setPageContext(_jspx_page_context);
          _jspx_th_nested_iterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_nested_iterate_0.setProperty("spts");
          _jspx_th_nested_iterate_0.setName("TP_Form");
          _jspx_th_nested_iterate_0.setId("spt");
          _jspx_th_nested_iterate_0.setType("SPT_Form");
          _jspx_th_nested_iterate_0.setIndexId("ix");
          int _jspx_eval_nested_iterate_0 = _jspx_th_nested_iterate_0.doStartTag();
          if (_jspx_eval_nested_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            SPT_Form spt = null;
            java.lang.Integer ix = null;
            if (_jspx_eval_nested_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_nested_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_nested_iterate_0.doInitBody();
            }
            spt = (SPT_Form) _jspx_page_context.findAttribute("spt");
            ix = (java.lang.Integer) _jspx_page_context.findAttribute("ix");
            do {
              out.write("\n");
              out.write("\t\t\t\t\t");


								if (lastGroupId != spt.getGroup() && groupCnt > 0){
					
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t<tr class=\"");
              out.print( lastGroupId%2 == 0 ? "even" : "odd" );
              out.write("\">\n");
              out.write("\t\t\t\t\t\t\t\t\t<td style=\"text-align:center;\" colspan=\"12\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<select name=\"typeSelect\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
              out.print( CxConstants.SPT_Type_RequestURI );
              out.write("\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              out.print( CxConstants.SPT_Type_RequestURI_Name );
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t</option>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
              out.print( CxConstants.SPT_Type_Method );
              out.write("\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              out.print( CxConstants.SPT_Type_Method_Name );
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t</option>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
              out.print( CxConstants.SPT_Type_SIPHeader );
              out.write("\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              out.print( CxConstants.SPT_Type_SIPHeader_Name );
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t</option>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
              out.print( CxConstants.SPT_Type_SessionCase );
              out.write("\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              out.print( CxConstants.SPT_Type_SessionCase_Name );
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t</option>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
              out.print( CxConstants.SPT_Type_SessionDescription );
              out.write("\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              out.print( CxConstants.SPT_Type_SessionDescription_Name );
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t</option>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</select> \n");
              out.write("\t\t\t\t\t\n");
              out.write("\t\t\t\t\t\t\t\t\t");

										 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
									
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:addSpt(");
              out.print((lastGroupId));
              out.write(", 0);\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"/hss.web.console/images/add_obj.gif\" width=\"16\"\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\theight=\"16\" alt=\"Add\" />\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
              out.write("\t\t\t\t\t\t\t\t\t");

										} //endif ADMIN
									
              out.write("\t\n");
              out.write("\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t\t</tr>\t\t\n");
              out.write("\t\t\t\t\t\t\t\t\n");
              out.write("\t\t\t\t\t\t\t\t<tr class=\"header\">\n");
              out.write("\t\t\t\t\t\t\t\t\t<td style=\"text-align:center;\" colspan=\"12\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_logic_equal_0(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_logic_equal_1(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t\t</tr>\n");
              out.write("\n");
              out.write("\t\t\t\t\t");
							
									lastGroupId = spt.getGroup();		
									groupCnt = 0;	
								}
					
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\n");
              out.write("\t\t\t\t\t\t\t\t<tr class=\"");
              out.print( lastGroupId%2 == 0 ? "even" : "odd" );
              out.write("\">\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t<!-- Add Condition Negated -->\n");
              out.write("\t\t\t\t\t\t\t\t\t<td nowrap=\"nowrap\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_bean_message_0(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t<td class=\"tgpFormular\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_nested_checkbox_0(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t\t\n");
              out.write("\t\t\t\t\t\t\t\t\t<td nowrap=\"nowrap\" width=\"120\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_nested_hidden_0(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write(" \n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_nested_hidden_1(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write(" \n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_nested_hidden_2(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write(" \n");
              out.write("\t\t\t\t\t\t\t\t\t\n");
              out.write("\t\t\t\t\t\t\t\t\t<!-- Add Request URI -->\t\t\t\t\t\t\t\t\t\t\n");
              out.write("\t\t\t\t\t\t\t\t\t\n");
              out.write("\t\t\t");
							if (spt.getType() == CxConstants.SPT_Type_RequestURI) {
			
			
              out.write(" \t\t\t\t\t\t\t\t");
              if (_jspx_meth_bean_message_1(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\n");
              out.write("\t\t\t\t\t\t\t\t\t<td class=\"tgpFormular\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_nested_text_0(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t\n");
              out.write("\t\t\t\t\t\t\t\t\t<!-- Add Method -->\t\t\t\t\t\t\t\t\t\t\t\n");
              out.write("\t\t\t");
					
										} else if (spt.getType() == CxConstants.SPT_Type_Method) {
			
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_bean_message_2(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t<td class=\"tgpFormular\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_nested_select_0(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t<!-- Add Session Case -->\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
              out.write("\t\t\t");

										} else if (spt.getType() == CxConstants.SPT_Type_SessionCase) {
			
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_bean_message_3(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t<td class=\"tgpFormular\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_nested_select_1(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t<!-- Add Session Description -->\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
              out.write("\t\t\t");
 
									} else if (spt.getType() == CxConstants.SPT_Type_SessionDescription) {
			
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_bean_message_4(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t<td>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<table>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<td class=\"tgpFormular\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_bean_message_5(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<td class=\"tgpFormular\" nowrap=\"nowrap\" colspan=\"3\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_nested_text_1(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<td class=\"tgpFormular\" nowrap=\"nowrap\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_bean_message_6(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<td class=\"tgpFormular\" colspan=\"2\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_nested_text_2(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</table>\n");
              out.write("\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t\n");
              out.write("\t\t\t\t\t\t\t\t\t<!-- Add SIP Header -->\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
              out.write("\t\t\t");
				
									} else if (spt.getType() == CxConstants.SPT_Type_SIPHeader) {

			
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_bean_message_7(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t\n");
              out.write("\t\t\t\t\t\t\t\t\t<td>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<table>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<td class=\"tgpFormular\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_bean_message_8(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<td class=\"tgpFormular\" colspan=\"3\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_nested_text_3(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<td class=\"tgpFormular\" nowrap=\"nowrap\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_bean_message_9(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<td class=\"tgpFormular\" colspan=\"2\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_nested_text_4(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</table>\n");
              out.write("\t\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t");
					
									}

			
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t<!-- Add Registration Type-->\n");
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t<td nowrap=\"nowrap\">\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_nested_equal_0(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t\t\n");
              out.write("\t\t\t\t\t\t\t\t");

									 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
								
              out.write("\t\t\t\t\t\t\t\t\t\n");
              out.write("\t\t\t\t\t\t\t\t\n");
              out.write("\t\t\t\t\t\t\t\t<!-- Add Delete button -->\n");
              out.write("\t\t\t\t\t\t\t\t<td>\n");
              out.write("\t\t\t\t\t\t\t\t\t<input type=\"button\" name=\"delete_button\" value=\"Delete\" \n");
              out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"add_action_for_form(6, ");
              out.print( spt.getSptId() );
              out.write(");\" />\t\t\n");
              out.write("\t\t\t\t\t\t\t\t</td>\t\n");
              out.write("\t\t\t\t\t\t\t\t");

									}
								
              out.write("\t\n");
              out.write("\t\t\t\t\t\t\t</tr>\n");
              out.write("\t\t\t\t\t\t\t\n");
              out.write("\t\t\t\t\t\t\t<!-- Add separators between SPTs -->\n");
              out.write("\t\t\t\t\t\t\t\n");
              out.write("\t\t\t\t\t\t\t<tr class=\"");
              out.print( lastGroupId%2 == 1 ? "even" : "odd" );
              out.write("\">\n");
              out.write("\t\t\t\t\t\t\t\t<td style=\"text-align:center;\" colspan=\"12\">\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_logic_equal_2(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_logic_equal_3(_jspx_th_nested_iterate_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t</tr>\n");
              out.write("\t\t\t\t\t\n");
              out.write("\t\t\t\t\t\t");

							lastGroupId = spt.getGroup();
							groupCnt++;
						
              out.write("\n");
              out.write("\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_nested_iterate_0.doAfterBody();
              spt = (SPT_Form) _jspx_page_context.findAttribute("spt");
              ix = (java.lang.Integer) _jspx_page_context.findAttribute("ix");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_nested_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_nested_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_nested_iterate_type_property_name_indexId_id.reuse(_jspx_th_nested_iterate_0);
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t<!-- End of the last Group -->\n");
          out.write("\t\t\t\t\t\t");
          //  logic:notEmpty
          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_notEmpty_0 = (org.apache.struts.taglib.logic.NotEmptyTag) _jspx_tagPool_logic_notEmpty_property_name.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
          _jspx_th_logic_notEmpty_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_notEmpty_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_logic_notEmpty_0.setProperty("spts");
          _jspx_th_logic_notEmpty_0.setName("TP_Form");
          int _jspx_eval_logic_notEmpty_0 = _jspx_th_logic_notEmpty_0.doStartTag();
          if (_jspx_eval_logic_notEmpty_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t<tr class=\"");
              out.print( lastGroupId%2 == 0 ? "even" : "odd" );
              out.write("\">\n");
              out.write("\t\t\t\t\t\t\t\t<td style=\"text-align:center;\" colspan=\"12\">\n");
              out.write("\t\t\t\t\t\t\t\t\t<select name=\"typeSelect\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
              out.print( CxConstants.SPT_Type_RequestURI );
              out.write("\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t");
              out.print( CxConstants.SPT_Type_RequestURI_Name );
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</option>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
              out.print( CxConstants.SPT_Type_Method );
              out.write("\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t");
              out.print( CxConstants.SPT_Type_Method_Name );
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</option>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
              out.print( CxConstants.SPT_Type_SIPHeader );
              out.write("\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t");
              out.print( CxConstants.SPT_Type_SIPHeader_Name );
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</option>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
              out.print( CxConstants.SPT_Type_SessionCase );
              out.write("\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t");
              out.print( CxConstants.SPT_Type_SessionCase_Name );
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</option>\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
              out.print( CxConstants.SPT_Type_SessionDescription );
              out.write("\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t");
              out.print( CxConstants.SPT_Type_SessionDescription_Name );
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</option>\n");
              out.write("\t\t\t\t\t\t\t\t\t</select> \n");
              out.write("\t\t\t\n");
              out.write("\t\t\t\t\t\t\t\t\t");

										 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
									
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
              out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:addSpt(");
              out.print(lastGroupId);
              out.write(", 0);\">\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"/hss.web.console/images/add_obj.gif\" width=\"16\"\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\theight=\"16\" alt=\"Add\" />\n");
              out.write("\t\t\t\t\t\t\t\t\t</a>\t\n");
              out.write("\t\t\t\t\t\t\t\t\t");

										} //endif ADMIN
									
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t</tr>\n");
              out.write("\t\t\t\t\t\t\t<tr class=\"header\">\n");
              out.write("\t\t\t\t\t\t\t\t<td style=\"text-align:center;\" colspan=\"12\">\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_logic_equal_4(_jspx_th_logic_notEmpty_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_logic_equal_5(_jspx_th_logic_notEmpty_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t</td>\n");
              out.write("\t\t\t\t\t\t\t</tr>\n");
              out.write("\t\t\t\t\t\t\t\n");
              out.write("\t\t\t\t\t\t");

							lastGroupId++;
						
              out.write("\n");
              out.write("\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_notEmpty_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_notEmpty_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_logic_notEmpty_property_name.reuse(_jspx_th_logic_notEmpty_0);
          out.write("\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<!-- Root Group -->\n");
          out.write("\t\t\t\t\t\t<tr class=\"");
          out.print( lastGroupId%2 == 0 ? "even" : "odd" );
          out.write("\">\n");
          out.write("\t\t\t\t\t\t\t<td style=\"text-align:center;\" colspan=\"12\">\n");
          out.write("\t\t\t\t\t\t\t\t<select name=\"typeSelect\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<option value=\"");
          out.print( CxConstants.SPT_Type_RequestURI );
          out.write("\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          out.print( CxConstants.SPT_Type_RequestURI_Name );
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t</option>\n");
          out.write("\t\t\t\t\t\t\t\t\t<option value=\"");
          out.print( CxConstants.SPT_Type_Method );
          out.write("\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          out.print( CxConstants.SPT_Type_Method_Name );
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t</option>\n");
          out.write("\t\t\t\t\t\t\t\t\t<option value=\"");
          out.print( CxConstants.SPT_Type_SIPHeader );
          out.write("\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          out.print( CxConstants.SPT_Type_SIPHeader_Name );
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t</option>\n");
          out.write("\t\t\t\t\t\t\t\t\t<option value=\"");
          out.print( CxConstants.SPT_Type_SessionCase );
          out.write("\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          out.print( CxConstants.SPT_Type_SessionCase_Name );
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t</option>\n");
          out.write("\t\t\t\t\t\t\t\t\t<option value=\"");
          out.print( CxConstants.SPT_Type_SessionDescription );
          out.write("\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          out.print( CxConstants.SPT_Type_SessionDescription_Name );
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t</option>\n");
          out.write("\t\t\t\t\t\t\t\t</select> \n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t");

				 	if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
							if (lastGroupId == 0){					
			
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:addSpt(");
          out.print(lastGroupId);
          out.write(", 1);\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<img src=\"/hss.web.console/images/add_obj.gif\" width=\"16\"\n");
          out.write("\t\t\t\t\t\t\t\t\t\theight=\"16\" alt=\"Add\" />\n");
          out.write("\t\t\t\t\t\t\t\t</a>\n");
          out.write("\t\t\t");

							}
							else{
			
          out.write("\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:addSpt(");
          out.print(lastGroupId);
          out.write(", 0);\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<img src=\"/hss.web.console/images/add_obj.gif\" width=\"16\"\n");
          out.write("\t\t\t\t\t\t\t\t\t\theight=\"16\" alt=\"Add\" />\n");
          out.write("\t\t\t\t\t\t\t\t</a>\n");
          out.write("\t\t\t");
				
							}
					}
			
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t</table>\n");
          out.write("\t\t\t\t\t<br></td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t</table>\n");
          out.write("\t\t\t</td>\n");
          out.write("\t\t</tr>\n");
          out.write("\t\t</table>\n");
          out.write("\t\n");
          out.write("\t\t</td>\n");
          out.write("\t</tr>\n");
          out.write("\t</table>\n");
          out.write("\t");

			}
			else{
	
          out.write("\n");
          out.write("\t\t\t</table>\n");
          out.write("\t\t</td>\n");
          out.write("\t</tr>\n");
          out.write("\t</table>\t\t\t\t\n");
          out.write("\t");

			}
	
          out.write('\n');
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
      out.write("\n");
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

  private boolean _jspx_meth_html_hidden_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_2 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_2.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_2.setProperty("group");
    int _jspx_eval_html_hidden_2 = _jspx_th_html_hidden_2.doStartTag();
    if (_jspx_th_html_hidden_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_2);
    return false;
  }

  private boolean _jspx_meth_html_hidden_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_3 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_3.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_3.setProperty("type");
    int _jspx_eval_html_hidden_3 = _jspx_th_html_hidden_3.doStartTag();
    if (_jspx_th_html_hidden_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_3);
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

  private boolean _jspx_meth_html_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_0.setPageContext(_jspx_page_context);
    _jspx_th_html_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_0.setProperty("condition_type_cnf");
    _jspx_th_html_select_0.setName("TP_Form");
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
    _jspx_tagPool_html_select_styleClass_style_size_property_name.reuse(_jspx_th_html_select_0);
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
    _jspx_th_html_optionsCollection_0.setName("TP_Form");
    _jspx_th_html_optionsCollection_0.setProperty("select_condition_type");
    _jspx_th_html_optionsCollection_0.setLabel("name");
    _jspx_th_html_optionsCollection_0.setValue("code");
    int _jspx_eval_html_optionsCollection_0 = _jspx_th_html_optionsCollection_0.doStartTag();
    if (_jspx_th_html_optionsCollection_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_0);
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

  private boolean _jspx_meth_html_select_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_1 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_value_styleClass_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_1.setPageContext(_jspx_page_context);
    _jspx_th_html_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_1.setProperty("ifc_id");
    _jspx_th_html_select_1.setValue("-1");
    _jspx_th_html_select_1.setName("TP_Form");
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
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_option_0(_jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_optionsCollection_1(_jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_html_option_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_0 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_0.setPageContext(_jspx_page_context);
    _jspx_th_html_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
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

  private boolean _jspx_meth_html_optionsCollection_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:optionsCollection
    org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_optionsCollection_1 = (org.apache.struts.taglib.html.OptionsCollectionTag) _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
    _jspx_th_html_optionsCollection_1.setPageContext(_jspx_page_context);
    _jspx_th_html_optionsCollection_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
    _jspx_th_html_optionsCollection_1.setName("TP_Form");
    _jspx_th_html_optionsCollection_1.setProperty("select_ifc");
    _jspx_th_html_optionsCollection_1.setLabel("name");
    _jspx_th_html_optionsCollection_1.setValue("id");
    int _jspx_eval_html_optionsCollection_1 = _jspx_th_html_optionsCollection_1.doStartTag();
    if (_jspx_th_html_optionsCollection_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_1);
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

  private boolean _jspx_meth_logic_equal_0(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_0 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_equal_0.setPageContext(_jspx_page_context);
    _jspx_th_logic_equal_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_logic_equal_0.setName("TP_Form");
    _jspx_th_logic_equal_0.setProperty("condition_type_cnf");
    _jspx_th_logic_equal_0.setValue("1");
    int _jspx_eval_logic_equal_0 = _jspx_th_logic_equal_0.doStartTag();
    if (_jspx_eval_logic_equal_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('A');
        out.write('N');
        out.write('D');
        int evalDoAfterBody = _jspx_th_logic_equal_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_equal_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_0);
    return false;
  }

  private boolean _jspx_meth_logic_equal_1(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_1 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_equal_1.setPageContext(_jspx_page_context);
    _jspx_th_logic_equal_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_logic_equal_1.setName("TP_Form");
    _jspx_th_logic_equal_1.setProperty("condition_type_cnf");
    _jspx_th_logic_equal_1.setValue("0");
    int _jspx_eval_logic_equal_1 = _jspx_th_logic_equal_1.doStartTag();
    if (_jspx_eval_logic_equal_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('O');
        out.write('R');
        int evalDoAfterBody = _jspx_th_logic_equal_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_equal_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_bean_message_0.setKey("spt.head.neg");
    int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
    if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_0);
    return false;
  }

  private boolean _jspx_meth_nested_checkbox_0(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:checkbox
    org.apache.struts.taglib.nested.html.NestedCheckboxTag _jspx_th_nested_checkbox_0 = (org.apache.struts.taglib.nested.html.NestedCheckboxTag) _jspx_tagPool_nested_checkbox_styleClass_property_onclick_nobody.get(org.apache.struts.taglib.nested.html.NestedCheckboxTag.class);
    _jspx_th_nested_checkbox_0.setPageContext(_jspx_page_context);
    _jspx_th_nested_checkbox_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_nested_checkbox_0.setProperty("neg");
    _jspx_th_nested_checkbox_0.setStyleClass("inputtext");
    _jspx_th_nested_checkbox_0.setOnclick("add_action_for_form(13, -1);");
    int _jspx_eval_nested_checkbox_0 = _jspx_th_nested_checkbox_0.doStartTag();
    if (_jspx_th_nested_checkbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_nested_checkbox_styleClass_property_onclick_nobody.reuse(_jspx_th_nested_checkbox_0);
    return false;
  }

  private boolean _jspx_meth_nested_hidden_0(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:hidden
    org.apache.struts.taglib.nested.html.NestedHiddenTag _jspx_th_nested_hidden_0 = (org.apache.struts.taglib.nested.html.NestedHiddenTag) _jspx_tagPool_nested_hidden_property.get(org.apache.struts.taglib.nested.html.NestedHiddenTag.class);
    _jspx_th_nested_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_nested_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_nested_hidden_0.setProperty("sptId");
    int _jspx_eval_nested_hidden_0 = _jspx_th_nested_hidden_0.doStartTag();
    if (_jspx_eval_nested_hidden_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_nested_hidden_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_nested_hidden_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_nested_hidden_0.doInitBody();
      }
      do {
        out.write(' ');
        int evalDoAfterBody = _jspx_th_nested_hidden_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_nested_hidden_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_nested_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_nested_hidden_property.reuse(_jspx_th_nested_hidden_0);
    return false;
  }

  private boolean _jspx_meth_nested_hidden_1(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:hidden
    org.apache.struts.taglib.nested.html.NestedHiddenTag _jspx_th_nested_hidden_1 = (org.apache.struts.taglib.nested.html.NestedHiddenTag) _jspx_tagPool_nested_hidden_property_nobody.get(org.apache.struts.taglib.nested.html.NestedHiddenTag.class);
    _jspx_th_nested_hidden_1.setPageContext(_jspx_page_context);
    _jspx_th_nested_hidden_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_nested_hidden_1.setProperty("group");
    int _jspx_eval_nested_hidden_1 = _jspx_th_nested_hidden_1.doStartTag();
    if (_jspx_th_nested_hidden_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_nested_hidden_property_nobody.reuse(_jspx_th_nested_hidden_1);
    return false;
  }

  private boolean _jspx_meth_nested_hidden_2(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:hidden
    org.apache.struts.taglib.nested.html.NestedHiddenTag _jspx_th_nested_hidden_2 = (org.apache.struts.taglib.nested.html.NestedHiddenTag) _jspx_tagPool_nested_hidden_property_nobody.get(org.apache.struts.taglib.nested.html.NestedHiddenTag.class);
    _jspx_th_nested_hidden_2.setPageContext(_jspx_page_context);
    _jspx_th_nested_hidden_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_nested_hidden_2.setProperty("type");
    int _jspx_eval_nested_hidden_2 = _jspx_th_nested_hidden_2.doStartTag();
    if (_jspx_th_nested_hidden_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_nested_hidden_property_nobody.reuse(_jspx_th_nested_hidden_2);
    return false;
  }

  private boolean _jspx_meth_bean_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_1 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_bean_message_1.setKey("spt.head.requestUri");
    int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
    if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_1);
    return false;
  }

  private boolean _jspx_meth_nested_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:text
    org.apache.struts.taglib.nested.html.NestedTextTag _jspx_th_nested_text_0 = (org.apache.struts.taglib.nested.html.NestedTextTag) _jspx_tagPool_nested_text_styleClass_style_property_onchange_maxlength_nobody.get(org.apache.struts.taglib.nested.html.NestedTextTag.class);
    _jspx_th_nested_text_0.setPageContext(_jspx_page_context);
    _jspx_th_nested_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_nested_text_0.setProperty("requestUri");
    _jspx_th_nested_text_0.setStyleClass("inputtext");
    _jspx_th_nested_text_0.setStyle("width:280px;");
    _jspx_th_nested_text_0.setMaxlength("255");
    _jspx_th_nested_text_0.setOnchange("add_action_for_form(13, -1);");
    int _jspx_eval_nested_text_0 = _jspx_th_nested_text_0.doStartTag();
    if (_jspx_th_nested_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_nested_text_styleClass_style_property_onchange_maxlength_nobody.reuse(_jspx_th_nested_text_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_2 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_2.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_bean_message_2.setKey("spt.head.sipMethod");
    int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
    if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_2);
    return false;
  }

  private boolean _jspx_meth_nested_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:select
    org.apache.struts.taglib.nested.html.NestedSelectTag _jspx_th_nested_select_0 = (org.apache.struts.taglib.nested.html.NestedSelectTag) _jspx_tagPool_nested_select_property_onchange.get(org.apache.struts.taglib.nested.html.NestedSelectTag.class);
    _jspx_th_nested_select_0.setPageContext(_jspx_page_context);
    _jspx_th_nested_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_nested_select_0.setProperty("sipMethod");
    _jspx_th_nested_select_0.setOnchange("add_action_for_form(13, -1);");
    int _jspx_eval_nested_select_0 = _jspx_th_nested_select_0.doStartTag();
    if (_jspx_eval_nested_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_nested_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_nested_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_nested_select_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_nested_optionsCollection_0(_jspx_th_nested_select_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_nested_select_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_nested_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_nested_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_nested_select_property_onchange.reuse(_jspx_th_nested_select_0);
    return false;
  }

  private boolean _jspx_meth_nested_optionsCollection_0(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:optionsCollection
    org.apache.struts.taglib.nested.html.NestedOptionsCollectionTag _jspx_th_nested_optionsCollection_0 = (org.apache.struts.taglib.nested.html.NestedOptionsCollectionTag) _jspx_tagPool_nested_optionsCollection_value_property_label_nobody.get(org.apache.struts.taglib.nested.html.NestedOptionsCollectionTag.class);
    _jspx_th_nested_optionsCollection_0.setPageContext(_jspx_page_context);
    _jspx_th_nested_optionsCollection_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_select_0);
    _jspx_th_nested_optionsCollection_0.setProperty("sipMethodList");
    _jspx_th_nested_optionsCollection_0.setLabel("label");
    _jspx_th_nested_optionsCollection_0.setValue("value");
    int _jspx_eval_nested_optionsCollection_0 = _jspx_th_nested_optionsCollection_0.doStartTag();
    if (_jspx_th_nested_optionsCollection_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_nested_optionsCollection_value_property_label_nobody.reuse(_jspx_th_nested_optionsCollection_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_3 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_3.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_bean_message_3.setKey("spt.head.sessionCase");
    int _jspx_eval_bean_message_3 = _jspx_th_bean_message_3.doStartTag();
    if (_jspx_th_bean_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_3);
    return false;
  }

  private boolean _jspx_meth_nested_select_1(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:select
    org.apache.struts.taglib.nested.html.NestedSelectTag _jspx_th_nested_select_1 = (org.apache.struts.taglib.nested.html.NestedSelectTag) _jspx_tagPool_nested_select_styleClass_property_onchange.get(org.apache.struts.taglib.nested.html.NestedSelectTag.class);
    _jspx_th_nested_select_1.setPageContext(_jspx_page_context);
    _jspx_th_nested_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_nested_select_1.setProperty("sessionCase");
    _jspx_th_nested_select_1.setStyleClass("inputtext");
    _jspx_th_nested_select_1.setOnchange("add_action_for_form(13, -1);");
    int _jspx_eval_nested_select_1 = _jspx_th_nested_select_1.doStartTag();
    if (_jspx_eval_nested_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_nested_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_nested_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_nested_select_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_nested_optionsCollection_1(_jspx_th_nested_select_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_nested_select_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_nested_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_nested_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_nested_select_styleClass_property_onchange.reuse(_jspx_th_nested_select_1);
    return false;
  }

  private boolean _jspx_meth_nested_optionsCollection_1(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:optionsCollection
    org.apache.struts.taglib.nested.html.NestedOptionsCollectionTag _jspx_th_nested_optionsCollection_1 = (org.apache.struts.taglib.nested.html.NestedOptionsCollectionTag) _jspx_tagPool_nested_optionsCollection_value_property_label_nobody.get(org.apache.struts.taglib.nested.html.NestedOptionsCollectionTag.class);
    _jspx_th_nested_optionsCollection_1.setPageContext(_jspx_page_context);
    _jspx_th_nested_optionsCollection_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_select_1);
    _jspx_th_nested_optionsCollection_1.setProperty("directionOfRequestList");
    _jspx_th_nested_optionsCollection_1.setLabel("name");
    _jspx_th_nested_optionsCollection_1.setValue("code");
    int _jspx_eval_nested_optionsCollection_1 = _jspx_th_nested_optionsCollection_1.doStartTag();
    if (_jspx_th_nested_optionsCollection_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_nested_optionsCollection_value_property_label_nobody.reuse(_jspx_th_nested_optionsCollection_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_4 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_4.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_bean_message_4.setKey("spt.head.sessionDesc");
    int _jspx_eval_bean_message_4 = _jspx_th_bean_message_4.doStartTag();
    if (_jspx_th_bean_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_4);
    return false;
  }

  private boolean _jspx_meth_bean_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_5 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_5.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_bean_message_5.setKey("spt.head.sessionDescLine");
    int _jspx_eval_bean_message_5 = _jspx_th_bean_message_5.doStartTag();
    if (_jspx_th_bean_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_5);
    return false;
  }

  private boolean _jspx_meth_nested_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:text
    org.apache.struts.taglib.nested.html.NestedTextTag _jspx_th_nested_text_1 = (org.apache.struts.taglib.nested.html.NestedTextTag) _jspx_tagPool_nested_text_styleClass_style_size_property_onchange_nobody.get(org.apache.struts.taglib.nested.html.NestedTextTag.class);
    _jspx_th_nested_text_1.setPageContext(_jspx_page_context);
    _jspx_th_nested_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_nested_text_1.setProperty("sessionDescLine");
    _jspx_th_nested_text_1.setSize("10");
    _jspx_th_nested_text_1.setStyleClass("inputtext");
    _jspx_th_nested_text_1.setStyle("width:200px;");
    _jspx_th_nested_text_1.setOnchange("add_action_for_form(13, -1);");
    int _jspx_eval_nested_text_1 = _jspx_th_nested_text_1.doStartTag();
    if (_jspx_th_nested_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_nested_text_styleClass_style_size_property_onchange_nobody.reuse(_jspx_th_nested_text_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_6(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_6 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_6.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_bean_message_6.setKey("spt.head.sessionDescContent");
    int _jspx_eval_bean_message_6 = _jspx_th_bean_message_6.doStartTag();
    if (_jspx_th_bean_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_6);
    return false;
  }

  private boolean _jspx_meth_nested_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:text
    org.apache.struts.taglib.nested.html.NestedTextTag _jspx_th_nested_text_2 = (org.apache.struts.taglib.nested.html.NestedTextTag) _jspx_tagPool_nested_text_styleClass_style_size_property_onchange_nobody.get(org.apache.struts.taglib.nested.html.NestedTextTag.class);
    _jspx_th_nested_text_2.setPageContext(_jspx_page_context);
    _jspx_th_nested_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_nested_text_2.setProperty("sessionDescContent");
    _jspx_th_nested_text_2.setSize("10");
    _jspx_th_nested_text_2.setStyleClass("inputtext");
    _jspx_th_nested_text_2.setStyle("width:200px;");
    _jspx_th_nested_text_2.setOnchange("add_action_for_form(13, -1);");
    int _jspx_eval_nested_text_2 = _jspx_th_nested_text_2.doStartTag();
    if (_jspx_th_nested_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_nested_text_styleClass_style_size_property_onchange_nobody.reuse(_jspx_th_nested_text_2);
    return false;
  }

  private boolean _jspx_meth_bean_message_7(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_7 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_7.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_bean_message_7.setKey("spt.head.sipHeader");
    int _jspx_eval_bean_message_7 = _jspx_th_bean_message_7.doStartTag();
    if (_jspx_th_bean_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_7);
    return false;
  }

  private boolean _jspx_meth_bean_message_8(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_8 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_8.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_bean_message_8.setKey("spt.head.sipHeader");
    int _jspx_eval_bean_message_8 = _jspx_th_bean_message_8.doStartTag();
    if (_jspx_th_bean_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_8);
    return false;
  }

  private boolean _jspx_meth_nested_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:text
    org.apache.struts.taglib.nested.html.NestedTextTag _jspx_th_nested_text_3 = (org.apache.struts.taglib.nested.html.NestedTextTag) _jspx_tagPool_nested_text_styleClass_style_size_property_onchange_nobody.get(org.apache.struts.taglib.nested.html.NestedTextTag.class);
    _jspx_th_nested_text_3.setPageContext(_jspx_page_context);
    _jspx_th_nested_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_nested_text_3.setProperty("sipHeader");
    _jspx_th_nested_text_3.setSize("10");
    _jspx_th_nested_text_3.setStyleClass("inputtext");
    _jspx_th_nested_text_3.setStyle("width:200px;");
    _jspx_th_nested_text_3.setOnchange("add_action_for_form(13, -1);");
    int _jspx_eval_nested_text_3 = _jspx_th_nested_text_3.doStartTag();
    if (_jspx_th_nested_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_nested_text_styleClass_style_size_property_onchange_nobody.reuse(_jspx_th_nested_text_3);
    return false;
  }

  private boolean _jspx_meth_bean_message_9(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_9 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_9.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_bean_message_9.setKey("spt.head.sipHeaderContent");
    int _jspx_eval_bean_message_9 = _jspx_th_bean_message_9.doStartTag();
    if (_jspx_th_bean_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_9);
    return false;
  }

  private boolean _jspx_meth_nested_text_4(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:text
    org.apache.struts.taglib.nested.html.NestedTextTag _jspx_th_nested_text_4 = (org.apache.struts.taglib.nested.html.NestedTextTag) _jspx_tagPool_nested_text_styleClass_style_size_property_onchange_nobody.get(org.apache.struts.taglib.nested.html.NestedTextTag.class);
    _jspx_th_nested_text_4.setPageContext(_jspx_page_context);
    _jspx_th_nested_text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_nested_text_4.setProperty("sipHeaderContent");
    _jspx_th_nested_text_4.setSize("10");
    _jspx_th_nested_text_4.setStyleClass("inputtext");
    _jspx_th_nested_text_4.setStyle("width:200px;");
    _jspx_th_nested_text_4.setOnchange("add_action_for_form(13, -1);");
    int _jspx_eval_nested_text_4 = _jspx_th_nested_text_4.doStartTag();
    if (_jspx_th_nested_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_nested_text_styleClass_style_size_property_onchange_nobody.reuse(_jspx_th_nested_text_4);
    return false;
  }

  private boolean _jspx_meth_nested_equal_0(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:equal
    org.apache.struts.taglib.nested.logic.NestedEqualTag _jspx_th_nested_equal_0 = (org.apache.struts.taglib.nested.logic.NestedEqualTag) _jspx_tagPool_nested_equal_value_property.get(org.apache.struts.taglib.nested.logic.NestedEqualTag.class);
    _jspx_th_nested_equal_0.setPageContext(_jspx_page_context);
    _jspx_th_nested_equal_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_nested_equal_0.setValue("REGISTER");
    _jspx_th_nested_equal_0.setProperty("sipMethod");
    int _jspx_eval_nested_equal_0 = _jspx_th_nested_equal_0.doStartTag();
    if (_jspx_eval_nested_equal_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<!-- Only if the method is REGISTER add the registration type field -->\t\t\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t\t\t\t\tReg\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_nested_checkbox_1(_jspx_th_nested_equal_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<!-- Registration Type: Re-Registration -->\n");
        out.write("\t\t\t\t\t\t\t\t\t\tReReg\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_nested_checkbox_2(_jspx_th_nested_equal_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<!-- Registration Type: UnRegistration -->\n");
        out.write("\t\t\t\t\t\t\t\t\t\tDeReg\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_nested_checkbox_3(_jspx_th_nested_equal_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_nested_equal_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_nested_equal_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_nested_equal_value_property.reuse(_jspx_th_nested_equal_0);
    return false;
  }

  private boolean _jspx_meth_nested_checkbox_1(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:checkbox
    org.apache.struts.taglib.nested.html.NestedCheckboxTag _jspx_th_nested_checkbox_1 = (org.apache.struts.taglib.nested.html.NestedCheckboxTag) _jspx_tagPool_nested_checkbox_styleClass_property_onchange_nobody.get(org.apache.struts.taglib.nested.html.NestedCheckboxTag.class);
    _jspx_th_nested_checkbox_1.setPageContext(_jspx_page_context);
    _jspx_th_nested_checkbox_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_equal_0);
    _jspx_th_nested_checkbox_1.setProperty("rtype_reg");
    _jspx_th_nested_checkbox_1.setStyleClass("inputtext");
    _jspx_th_nested_checkbox_1.setOnchange("add_action_for_form(13, -1);");
    int _jspx_eval_nested_checkbox_1 = _jspx_th_nested_checkbox_1.doStartTag();
    if (_jspx_th_nested_checkbox_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_nested_checkbox_styleClass_property_onchange_nobody.reuse(_jspx_th_nested_checkbox_1);
    return false;
  }

  private boolean _jspx_meth_nested_checkbox_2(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:checkbox
    org.apache.struts.taglib.nested.html.NestedCheckboxTag _jspx_th_nested_checkbox_2 = (org.apache.struts.taglib.nested.html.NestedCheckboxTag) _jspx_tagPool_nested_checkbox_styleClass_property_onchange_nobody.get(org.apache.struts.taglib.nested.html.NestedCheckboxTag.class);
    _jspx_th_nested_checkbox_2.setPageContext(_jspx_page_context);
    _jspx_th_nested_checkbox_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_equal_0);
    _jspx_th_nested_checkbox_2.setProperty("rtype_re_reg");
    _jspx_th_nested_checkbox_2.setStyleClass("inputtext");
    _jspx_th_nested_checkbox_2.setOnchange("add_action_for_form(13, -1);");
    int _jspx_eval_nested_checkbox_2 = _jspx_th_nested_checkbox_2.doStartTag();
    if (_jspx_th_nested_checkbox_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_nested_checkbox_styleClass_property_onchange_nobody.reuse(_jspx_th_nested_checkbox_2);
    return false;
  }

  private boolean _jspx_meth_nested_checkbox_3(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:checkbox
    org.apache.struts.taglib.nested.html.NestedCheckboxTag _jspx_th_nested_checkbox_3 = (org.apache.struts.taglib.nested.html.NestedCheckboxTag) _jspx_tagPool_nested_checkbox_styleClass_property_onchange_nobody.get(org.apache.struts.taglib.nested.html.NestedCheckboxTag.class);
    _jspx_th_nested_checkbox_3.setPageContext(_jspx_page_context);
    _jspx_th_nested_checkbox_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_equal_0);
    _jspx_th_nested_checkbox_3.setProperty("rtype_de_reg");
    _jspx_th_nested_checkbox_3.setStyleClass("inputtext");
    _jspx_th_nested_checkbox_3.setOnchange("add_action_for_form(13, -1);");
    int _jspx_eval_nested_checkbox_3 = _jspx_th_nested_checkbox_3.doStartTag();
    if (_jspx_th_nested_checkbox_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_nested_checkbox_styleClass_property_onchange_nobody.reuse(_jspx_th_nested_checkbox_3);
    return false;
  }

  private boolean _jspx_meth_logic_equal_2(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_2 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_equal_2.setPageContext(_jspx_page_context);
    _jspx_th_logic_equal_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_logic_equal_2.setName("TP_Form");
    _jspx_th_logic_equal_2.setProperty("condition_type_cnf");
    _jspx_th_logic_equal_2.setValue("0");
    int _jspx_eval_logic_equal_2 = _jspx_th_logic_equal_2.doStartTag();
    if (_jspx_eval_logic_equal_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\tAND\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_equal_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_equal_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_2);
    return false;
  }

  private boolean _jspx_meth_logic_equal_3(javax.servlet.jsp.tagext.JspTag _jspx_th_nested_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_3 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_equal_3.setPageContext(_jspx_page_context);
    _jspx_th_logic_equal_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_nested_iterate_0);
    _jspx_th_logic_equal_3.setName("TP_Form");
    _jspx_th_logic_equal_3.setProperty("condition_type_cnf");
    _jspx_th_logic_equal_3.setValue("1");
    int _jspx_eval_logic_equal_3 = _jspx_th_logic_equal_3.doStartTag();
    if (_jspx_eval_logic_equal_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\tOR\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_equal_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_equal_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_3);
    return false;
  }

  private boolean _jspx_meth_logic_equal_4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_4 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_equal_4.setPageContext(_jspx_page_context);
    _jspx_th_logic_equal_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
    _jspx_th_logic_equal_4.setName("TP_Form");
    _jspx_th_logic_equal_4.setProperty("condition_type_cnf");
    _jspx_th_logic_equal_4.setValue("1");
    int _jspx_eval_logic_equal_4 = _jspx_th_logic_equal_4.doStartTag();
    if (_jspx_eval_logic_equal_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('A');
        out.write('N');
        out.write('D');
        int evalDoAfterBody = _jspx_th_logic_equal_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_equal_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_4);
    return false;
  }

  private boolean _jspx_meth_logic_equal_5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEmpty_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_5 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_equal_5.setPageContext(_jspx_page_context);
    _jspx_th_logic_equal_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEmpty_0);
    _jspx_th_logic_equal_5.setName("TP_Form");
    _jspx_th_logic_equal_5.setProperty("condition_type_cnf");
    _jspx_th_logic_equal_5.setValue("0");
    int _jspx_eval_logic_equal_5 = _jspx_th_logic_equal_5.doStartTag();
    if (_jspx_eval_logic_equal_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('O');
        out.write('R');
        int evalDoAfterBody = _jspx_th_logic_equal_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_equal_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_logic_equal_value_property_name.reuse(_jspx_th_logic_equal_5);
    return false;
  }
}
