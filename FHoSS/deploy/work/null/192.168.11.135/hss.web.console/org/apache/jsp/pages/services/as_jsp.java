package org.apache.jsp.pages.services;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import de.fhg.fokus.hss.db.model.*;
import de.fhg.fokus.hss.web.util.WebConstants;

public final class as_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_style_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_styleClass_style_size_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_checkbox_styleClass_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_button_value_property_onclick_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_button_value_property_onclick_disabled_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_value_styleClass_style_size_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_option_value;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_style_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_styleClass_style_size_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_checkbox_styleClass_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_button_value_property_onclick_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_button_value_property_onclick_disabled_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_value_styleClass_style_size_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody.release();
    _jspx_tagPool_html_text_styleClass_style_property_nobody.release();
    _jspx_tagPool_html_select_styleClass_style_size_property_name.release();
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.release();
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.release();
    _jspx_tagPool_html_button_value_property_onclick_nobody.release();
    _jspx_tagPool_html_button_value_property_onclick_disabled_nobody.release();
    _jspx_tagPool_html_select_value_styleClass_style_size_property_name.release();
    _jspx_tagPool_html_option_value.release();
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
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title> AS </title>\n");
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
      out.write("\t\t\tdocument.AS_Form.nextAction.value=\"save\";\n");
      out.write("\t\t\tdocument.AS_Form.submit();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 2:\n");
      out.write("\t\t\tdocument.AS_Form.nextAction.value=\"refresh\";\n");
      out.write("\t\t\tdocument.AS_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 3:\n");
      out.write("\t\t\tdocument.AS_Form.nextAction.value=\"reset\";\n");
      out.write("\t\t\tdocument.AS_Form.reset();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 4:\n");
      out.write("\t\t\tdocument.AS_Form.nextAction.value=\"delete\";\n");
      out.write("\t\t\tdocument.AS_Form.submit();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 5:\n");
      out.write("\t\t\tdocument.AS_Form.nextAction.value=\"detach_ifc\";\n");
      out.write("\t\t\tdocument.AS_Form.associated_ID.value = associated_ID;\t\t\t\n");
      out.write("\t\t\tdocument.AS_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 12:\n");
      out.write("\t\t\tdocument.AS_Form.nextAction.value=\"attach_ifc\";\n");
      out.write("\t\t\tdocument.AS_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<table id=\"title-table\" align=\"center\" weight=\"100%\" >\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td align=\"center\">\n");
      out.write("\t\t\t<h1> Application Server -AS- </h1> \t\t\t\n");
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
      _jspx_th_html_form_0.setAction("/AS_Submit");
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
          out.write("\t \t\t<table id=\"top-side-table\" border=\"0\" align=\"center\">\t\t\t\t\t\t\n");
          out.write(" \t\t\t<tr>\n");
          out.write(" \t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<table id=\"as-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\t\t\t\t\t\t\n");
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
          out.write("\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td>Server Name* </td>\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_text_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" </td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td>Diameter FQDN*</td>\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_text_3(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" </td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td>Default Handling*</td>\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td>Service Info</td>\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_text_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" </td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td> Rep-Data Limit </td>\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_text_5(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" </td>\n");
          out.write("\t\t\t\t\t</tr>\t\t\t\t\t\n");
          out.write("\t\t\t\t\t</table> <!-- fields-table-->\t\t\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<b>Sh Interface - Permissions</b>\t\n");
          out.write("\t\t\t\t\t<table id=\"sec-perm\" class=\"as\" border=\"0\" cellspacing=\"1\" width=\"200\" align=\"center\" style=\"border:2px solid #FF6600;\">\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t<tr class=\"header\">\n");
          out.write("\t\t\t\t\t\t<td width=\"60%\"> Permission for </td>\n");
          out.write("\t\t\t\t\t\t<td class=\"header\"> UDR </td>\n");
          out.write("\t\t\t\t\t\t<td class=\"header\"> PUR </td>\n");
          out.write("\t\t\t\t\t\t<td class=\"header\"> SNR </td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td> Allowed Request </td>\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td> ");
          if (_jspx_meth_html_checkbox_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t </td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td> ");
          if (_jspx_meth_html_checkbox_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t </td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td> ");
          if (_jspx_meth_html_checkbox_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t </td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td> Repository-Data </td>\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_3(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_5(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td> IMPU </td>\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_6(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td></td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_7(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td> IMS User State </td>\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_8(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td> </td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_9(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td> S-CSCF Name </td>\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_10(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td></td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_11(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td> iFC </td>\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_12(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td></td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_13(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td> Location </td>\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_14(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td></td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td></td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td> User-State </td>\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_15(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" </td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td></td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td></td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td> Charging-Info </td>\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_16(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" </td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td></td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td></td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td> MS-ISDN </td>\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_17(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" </td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td></td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td></td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td> PSI Activation </td>\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_18(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_19(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_20(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td> DSAI </td>\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_21(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_22(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_23(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td> Aliases Rep Data </td>\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_24(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_25(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_26(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t</td>\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t</table> <!-- sec-perm-table -->\t\t\n");
          out.write("\t\t\t\t</td>\t\t\t\t\t\n");
          out.write("\t\t\t</tr>\t\t\n");
          out.write("\t\t\t</table> <!-- top-side-table-->\t\t\n");
          out.write("\t\t</td>\n");
          out.write("\t</tr>\t\n");
          out.write("\t<tr>\n");
          out.write("\t\t<td>\n");
          out.write("\t\t\t<table id=\"buttons-table\" align=\"center\">\t\t\t\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td align=\"center\"> \n");
          out.write("\t\t\t\t<b> Mandatory fields were marked with \"*\" </b>\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t</tr>\t\n");
          out.write(" \t\t\t<tr>\n");
          out.write("\t\t\t\t<td align=center> <br/>\n");
          out.write("\t\t\t\t\t");

						 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
					
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_html_button_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\t");

						}
					
          out.write("\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_html_button_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t");
 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN) && id == -1){ 
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_html_button_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t");
}
          out.write("\n");
          out.write("\t\t\t\t\t");
 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN) && id != -1){ 
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          //  html:button
          org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_3 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_value_property_onclick_disabled_nobody.get(org.apache.struts.taglib.html.ButtonTag.class);
          _jspx_th_html_button_3.setPageContext(_jspx_page_context);
          _jspx_th_html_button_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_button_3.setProperty("delete_button");
          _jspx_th_html_button_3.setValue("Delete");
          _jspx_th_html_button_3.setOnclick("add_action_for_form(4);");
          _jspx_th_html_button_3.setDisabled(Boolean.parseBoolean((String)request.getAttribute("deleteDeactivation")) );
          int _jspx_eval_html_button_3 = _jspx_th_html_button_3.doStartTag();
          if (_jspx_th_html_button_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_button_value_property_onclick_disabled_nobody.reuse(_jspx_th_html_button_3);
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\t");
}
          out.write("\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t</table> <!-- buttons-table -->\n");
          out.write("\t\t</td>\n");
          out.write("\t</tr>\n");
          out.write("\t");

		if (id != -1){
	
          out.write("\n");
          out.write("\t<tr>\n");
          out.write("\t\t<td>\n");
          out.write("\t\t\t<table id=\"bottom-side-table\" class=\"as\" align=\"center\">\n");
          out.write("\t\t\t");

				 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
			
          out.write("\t\t\t\t\t\t\t\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t<h2>Attach IFC(s) </h2>\n");
          out.write("\t\t\t\t\t<table id=\"ifc-table\" class=\"as\" border=\"0\" width=\"400\" cellspacing=\"1\" align=\"center\" style=\"border:2px solid #FF6600;\">\n");
          out.write("\t\t\t\t\t<tr class=\"even\">\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\t\n");
          out.write("\t\t\t\t\t</table> <!-- ifc-table -->\n");
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t");

				} //endif ADMIN
			
          out.write("\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<br />\t\t\n");
          out.write("\t\t\t\t\t<h2> List of attached IFCs </h2>\n");
          out.write("\t\t\t\t\t<table id=\"list-ifc-table\" class=\"as\" width=\"400\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"100%\" style=\"border:2px solid #FF6600;\">\n");
          out.write("\t\t\t\t\t<tr class=\"header\">\n");
          out.write("\t\t\t\t\t\t<td class=\"header\"> ID </td>\t\t\t\n");
          out.write("\t\t\t\t\t\t<td class=\"header\"> IFC Name </td>\n");
          out.write("\t\t\t\t\t\t");

							 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
						
          out.write("\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td class=\"header\"> Detach </td>\n");
          out.write("\t\t\t\t\t\t");

							}
						
          out.write("\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t");

						if (attached_ifc_list != null){
							Iterator it = attached_ifc_list.iterator();
							IFC ifc = null;
							int idx = 0;
							while (it.hasNext()){
								ifc = (IFC) it.next();
												
					
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<tr class=\"");
          out.print( idx % 2 == 0 ? "even" : "odd" );
          out.write("\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<td>  ");
          out.print( ifc.getId() );
          out.write("</td>\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<td>  \n");
          out.write("\t\t\t\t\t\t\t\t\t<a href=\"/hss.web.console/IFC_Load.do?id=");
          out.print( ifc.getId() );
          out.write("\" > \n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          out.print( ifc.getName() );
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t</a>\t\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t");

									 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
								
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<td> \n");
          out.write("\t\t\t\t\t\t\t\t\t<input type=\"button\" name=\"detach_ifc\" \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\"value=\"Detach\" onclick=\"add_action_for_form(5, ");
          out.print( ifc.getId() );
          out.write(");\"/>\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t");

									}
								
          out.write("\n");
          out.write("\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t");
			
								idx++;												
								}
							}
					
          out.write("\n");
          out.write("\t\t\t\t\t</table> <!-- list-ifc-table -->\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t</tr> <!-- bottom-side-table -->\n");
          out.write("\t\t</td>\n");
          out.write("\t</tr>\n");
          out.write("\t");

		}
	
          out.write("\t\t\t\t\n");
          out.write("\t</table><!-- main-table -->\t\t\n");
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
    _jspx_th_html_text_0.setProperty("id");
    _jspx_th_html_text_0.setReadonly(true);
    _jspx_th_html_text_0.setStyleClass("inputtext_readonly");
    _jspx_th_html_text_0.setStyle("width:200px;");
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
    _jspx_th_html_text_2.setProperty("server_name");
    _jspx_th_html_text_2.setStyleClass("inputtext");
    _jspx_th_html_text_2.setStyle("width:200px;");
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_style_property_nobody.reuse(_jspx_th_html_text_2);
    return false;
  }

  private boolean _jspx_meth_html_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_3 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_style_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_3.setPageContext(_jspx_page_context);
    _jspx_th_html_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_3.setProperty("diameter_address");
    _jspx_th_html_text_3.setStyleClass("inputtext");
    _jspx_th_html_text_3.setStyle("width:200px;");
    int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
    if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_style_property_nobody.reuse(_jspx_th_html_text_3);
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
    _jspx_th_html_select_0.setProperty("default_handling");
    _jspx_th_html_select_0.setName("AS_Form");
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
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_optionsCollection_0(_jspx_th_html_select_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
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
    _jspx_th_html_optionsCollection_0.setName("AS_Form");
    _jspx_th_html_optionsCollection_0.setProperty("select_default_handling");
    _jspx_th_html_optionsCollection_0.setLabel("name");
    _jspx_th_html_optionsCollection_0.setValue("code");
    int _jspx_eval_html_optionsCollection_0 = _jspx_th_html_optionsCollection_0.doStartTag();
    if (_jspx_th_html_optionsCollection_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_0);
    return false;
  }

  private boolean _jspx_meth_html_text_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_4 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_style_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_4.setPageContext(_jspx_page_context);
    _jspx_th_html_text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_4.setProperty("service_info");
    _jspx_th_html_text_4.setStyleClass("inputtext");
    _jspx_th_html_text_4.setStyle("width:200px;");
    int _jspx_eval_html_text_4 = _jspx_th_html_text_4.doStartTag();
    if (_jspx_th_html_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_style_property_nobody.reuse(_jspx_th_html_text_4);
    return false;
  }

  private boolean _jspx_meth_html_text_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_5 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_style_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_5.setPageContext(_jspx_page_context);
    _jspx_th_html_text_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_5.setProperty("rep_data_size_limit");
    _jspx_th_html_text_5.setStyleClass("inputtext");
    _jspx_th_html_text_5.setStyle("width:100px;");
    int _jspx_eval_html_text_5 = _jspx_th_html_text_5.doStartTag();
    if (_jspx_th_html_text_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_style_property_nobody.reuse(_jspx_th_html_text_5);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_0 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_0.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_0.setProperty("udr");
    _jspx_th_html_checkbox_0.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_0 = _jspx_th_html_checkbox_0.doStartTag();
    if (_jspx_th_html_checkbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_0);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_1 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_1.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_1.setProperty("pur");
    _jspx_th_html_checkbox_1.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_1 = _jspx_th_html_checkbox_1.doStartTag();
    if (_jspx_th_html_checkbox_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_1);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_2 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_2.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_2.setProperty("snr");
    _jspx_th_html_checkbox_2.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_2 = _jspx_th_html_checkbox_2.doStartTag();
    if (_jspx_th_html_checkbox_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_2);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_3 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_3.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_3.setProperty("udr_rep_data");
    _jspx_th_html_checkbox_3.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_3 = _jspx_th_html_checkbox_3.doStartTag();
    if (_jspx_th_html_checkbox_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_3);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_4 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_4.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_4.setProperty("pur_rep_data");
    _jspx_th_html_checkbox_4.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_4 = _jspx_th_html_checkbox_4.doStartTag();
    if (_jspx_th_html_checkbox_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_4);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_5 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_5.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_5.setProperty("snr_rep_data");
    _jspx_th_html_checkbox_5.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_5 = _jspx_th_html_checkbox_5.doStartTag();
    if (_jspx_th_html_checkbox_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_5);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_6 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_6.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_6.setProperty("udr_impu");
    _jspx_th_html_checkbox_6.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_6 = _jspx_th_html_checkbox_6.doStartTag();
    if (_jspx_th_html_checkbox_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_6);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_7 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_7.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_7.setProperty("snr_impu");
    _jspx_th_html_checkbox_7.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_7 = _jspx_th_html_checkbox_7.doStartTag();
    if (_jspx_th_html_checkbox_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_7);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_8 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_8.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_8.setProperty("udr_ims_user_state");
    _jspx_th_html_checkbox_8.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_8 = _jspx_th_html_checkbox_8.doStartTag();
    if (_jspx_th_html_checkbox_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_8);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_9 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_9.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_9.setProperty("snr_ims_user_state");
    _jspx_th_html_checkbox_9.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_9 = _jspx_th_html_checkbox_9.doStartTag();
    if (_jspx_th_html_checkbox_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_9);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_10(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_10 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_10.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_10.setProperty("udr_scscf_name");
    _jspx_th_html_checkbox_10.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_10 = _jspx_th_html_checkbox_10.doStartTag();
    if (_jspx_th_html_checkbox_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_10);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_11(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_11 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_11.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_11.setProperty("snr_scscf_name");
    _jspx_th_html_checkbox_11.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_11 = _jspx_th_html_checkbox_11.doStartTag();
    if (_jspx_th_html_checkbox_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_11);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_12(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_12 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_12.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_12.setProperty("udr_ifc");
    _jspx_th_html_checkbox_12.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_12 = _jspx_th_html_checkbox_12.doStartTag();
    if (_jspx_th_html_checkbox_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_12);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_13(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_13 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_13.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_13.setProperty("snr_ifc");
    _jspx_th_html_checkbox_13.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_13 = _jspx_th_html_checkbox_13.doStartTag();
    if (_jspx_th_html_checkbox_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_13);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_14(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_14 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_14.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_14.setProperty("udr_location");
    _jspx_th_html_checkbox_14.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_14 = _jspx_th_html_checkbox_14.doStartTag();
    if (_jspx_th_html_checkbox_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_14);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_15(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_15 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_15.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_15.setProperty("udr_user_state");
    _jspx_th_html_checkbox_15.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_15 = _jspx_th_html_checkbox_15.doStartTag();
    if (_jspx_th_html_checkbox_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_15);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_16(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_16 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_16.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_16.setProperty("udr_charging_info");
    _jspx_th_html_checkbox_16.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_16 = _jspx_th_html_checkbox_16.doStartTag();
    if (_jspx_th_html_checkbox_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_16);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_17(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_17 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_17.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_17.setProperty("udr_msisdn");
    _jspx_th_html_checkbox_17.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_17 = _jspx_th_html_checkbox_17.doStartTag();
    if (_jspx_th_html_checkbox_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_17);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_18(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_18 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_18.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_18.setProperty("udr_psi_activation");
    _jspx_th_html_checkbox_18.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_18 = _jspx_th_html_checkbox_18.doStartTag();
    if (_jspx_th_html_checkbox_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_18);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_19(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_19 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_19.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_19.setProperty("pur_psi_activation");
    _jspx_th_html_checkbox_19.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_19 = _jspx_th_html_checkbox_19.doStartTag();
    if (_jspx_th_html_checkbox_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_19);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_20(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_20 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_20.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_20.setProperty("snr_psi_activation");
    _jspx_th_html_checkbox_20.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_20 = _jspx_th_html_checkbox_20.doStartTag();
    if (_jspx_th_html_checkbox_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_20);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_21(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_21 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_21.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_21.setProperty("udr_dsai");
    _jspx_th_html_checkbox_21.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_21 = _jspx_th_html_checkbox_21.doStartTag();
    if (_jspx_th_html_checkbox_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_21);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_22(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_22 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_22.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_22.setProperty("pur_dsai");
    _jspx_th_html_checkbox_22.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_22 = _jspx_th_html_checkbox_22.doStartTag();
    if (_jspx_th_html_checkbox_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_22);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_23(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_23 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_23.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_23.setProperty("snr_dsai");
    _jspx_th_html_checkbox_23.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_23 = _jspx_th_html_checkbox_23.doStartTag();
    if (_jspx_th_html_checkbox_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_23);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_24(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_24 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_24.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_24.setProperty("udr_aliases_rep_data");
    _jspx_th_html_checkbox_24.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_24 = _jspx_th_html_checkbox_24.doStartTag();
    if (_jspx_th_html_checkbox_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_24);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_25(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_25 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_25.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_25.setProperty("pur_aliases_rep_data");
    _jspx_th_html_checkbox_25.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_25 = _jspx_th_html_checkbox_25.doStartTag();
    if (_jspx_th_html_checkbox_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_25);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_26(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_26 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_26.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_26.setProperty("snr_aliases_rep_data");
    _jspx_th_html_checkbox_26.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_26 = _jspx_th_html_checkbox_26.doStartTag();
    if (_jspx_th_html_checkbox_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_26);
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
    _jspx_th_html_button_0.setOnclick("add_action_for_form(1);");
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
    _jspx_th_html_button_1.setOnclick("add_action_for_form(2);");
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
    _jspx_th_html_button_2.setOnclick("add_action_for_form(3);");
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
    _jspx_th_html_select_1.setName("AS_Form");
    _jspx_th_html_select_1.setStyleClass("inputtext");
    _jspx_th_html_select_1.setSize("1");
    _jspx_th_html_select_1.setStyle("width:250px;");
    int _jspx_eval_html_select_1 = _jspx_th_html_select_1.doStartTag();
    if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_option_0(_jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_optionsCollection_1(_jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
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
    _jspx_th_html_optionsCollection_1.setName("AS_Form");
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
}
