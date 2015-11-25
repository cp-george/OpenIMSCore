package org.apache.jsp.pages.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import de.fhg.fokus.hss.db.model.*;
import de.fhg.fokus.hss.web.util.WebConstants;

public final class impu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_style_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_checkbox_styleClass_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_styleClass_style_size_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_styleClass_style_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_equal_value_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_button_value_property_onclick_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_button_value_property_onclick_disabled_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_value_styleClass_property_nobody;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_style_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_checkbox_styleClass_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_styleClass_style_size_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_styleClass_styleClass_style_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_equal_value_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_button_value_property_onclick_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_button_value_property_onclick_disabled_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_value_styleClass_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_html_hidden_property_nobody.release();
    _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody.release();
    _jspx_tagPool_html_text_styleClass_style_property_nobody.release();
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.release();
    _jspx_tagPool_html_select_styleClass_style_size_property_name.release();
    _jspx_tagPool_html_option_value.release();
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.release();
    _jspx_tagPool_html_text_styleClass_styleClass_style_property_nobody.release();
    _jspx_tagPool_logic_equal_value_property_name.release();
    _jspx_tagPool_html_button_value_property_onclick_nobody.release();
    _jspx_tagPool_html_button_value_property_onclick_disabled_nobody.release();
    _jspx_tagPool_html_text_value_styleClass_property_nobody.release();
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
      out.write("<title>IMPU </title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/hss.web.console/style/fokus_ngni.css\">\n");
      out.write("\n");
      java.util.ArrayList associated_IMPIs = null;
      synchronized (request) {
        associated_IMPIs = (java.util.ArrayList) _jspx_page_context.getAttribute("associated_IMPIs", PageContext.REQUEST_SCOPE);
        if (associated_IMPIs == null){
          associated_IMPIs = new java.util.ArrayList();
          _jspx_page_context.setAttribute("associated_IMPIs", associated_IMPIs, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      java.util.ArrayList implicitset_IMPUs = null;
      synchronized (request) {
        implicitset_IMPUs = (java.util.ArrayList) _jspx_page_context.getAttribute("implicitset_IMPUs", PageContext.REQUEST_SCOPE);
        if (implicitset_IMPUs == null){
          implicitset_IMPUs = new java.util.ArrayList();
          _jspx_page_context.setAttribute("implicitset_IMPUs", implicitset_IMPUs, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      java.util.ArrayList visitedNetworks = null;
      synchronized (request) {
        visitedNetworks = (java.util.ArrayList) _jspx_page_context.getAttribute("visitedNetworks", PageContext.REQUEST_SCOPE);
        if (visitedNetworks == null){
          visitedNetworks = new java.util.ArrayList();
          _jspx_page_context.setAttribute("visitedNetworks", visitedNetworks, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');

	int id = Integer.parseInt(request.getParameter("id"));

      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\">\n");
      out.write("\n");
      out.write("function add_action_for_form(action, associated_ID) {\n");
      out.write("\tswitch(action){\n");
      out.write("\t\tcase 1:\n");
      out.write("\t\t\tdocument.IMPU_Form.nextAction.value=\"save\";\n");
      out.write("\t\t\tdocument.IMPU_Form.submit();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 2:\n");
      out.write("\t\t\tdocument.IMPU_Form.nextAction.value=\"reset\";\n");
      out.write("\t\t\tdocument.IMPU_Form.reset();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 3:\n");
      out.write("\t\t\tdocument.IMPU_Form.nextAction.value=\"refresh\";\n");
      out.write("\t\t\tdocument.IMPU_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 4:\n");
      out.write("\t\t\tdocument.IMPU_Form.nextAction.value=\"delete\";\n");
      out.write("\t\t\tdocument.IMPU_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 5:\n");
      out.write("\t\t\tdocument.IMPU_Form.nextAction.value=\"delete_associated_impi\";\n");
      out.write("\t\t\tdocument.IMPU_Form.associated_ID.value = associated_ID;\n");
      out.write("\t\t\tdocument.IMPU_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 6:\n");
      out.write("\t\t\tdocument.IMPU_Form.nextAction.value=\"delete_impu_from_implicitset\";\n");
      out.write("\t\t\tdocument.IMPU_Form.associated_ID.value = associated_ID;\t\t\t\n");
      out.write("\t\t\tdocument.IMPU_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 7:\n");
      out.write("\t\t\tdocument.IMPU_Form.nextAction.value=\"delete_visited_network\";\n");
      out.write("\t\t\tdocument.IMPU_Form.associated_ID.value = associated_ID;\t\t\t\n");
      out.write("\t\t\tdocument.IMPU_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\tcase 10:\n");
      out.write("\t\t\tdocument.IMPU_Form.nextAction.value=\"ppr\";\n");
      out.write("\t\t\tdocument.IMPU_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\t\t\n");
      out.write("\t\tcase 12:\n");
      out.write("\t\t\tdocument.IMPU_Form.nextAction.value=\"add_impi\";\n");
      out.write("\t\t\tdocument.IMPU_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 13:\n");
      out.write("\t\t\tdocument.IMPU_Form.nextAction.value=\"add_impu_to_implicitset\";\n");
      out.write("\t\t\tdocument.IMPU_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 14:\n");
      out.write("\t\t\tdocument.IMPU_Form.nextAction.value=\"add_vn\";\n");
      out.write("\t\t\tdocument.IMPU_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
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
      out.write("\t\t\t<h1> Public User Identity -IMPU- </h1> \t\t\t\n");
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
      _jspx_th_html_form_0.setAction("/IMPU_Submit");
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
          out.write('\n');
          out.write('	');
          out.write('	');
          if (_jspx_meth_html_hidden_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\t\t\n");
          out.write("\n");
          out.write("\t\t<table id=\"main-table\" align=\"center\" valign=\"middle\">\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t \t\t\t<table id=\"left-side-table\" border=\"0\" align=\"center\" width=\"400\" >\t\t\t\t\t\t\n");
          out.write("\t\t \t\t\t<tr>\n");
          out.write(" \t\t\t\t\t\t<td>\n");
          out.write("\t\t\t \t\t\t\t<table id=\"impu-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td> ID </td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_text_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" </td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>Identity* </td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_text_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" </td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>Barring</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>Service Profile*</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</td>\t\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>Implicit Set</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_text_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>Charging-Info Set</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td> Can Register </td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" </td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\t\t\t\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td> IMPU Type* </td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</td>\t\n");
          out.write("\t\t\t\t\t\t\t</tr>\t\t\t\n");
          out.write("\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td> Wildcard PSI </td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_text_3(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" </td>\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t</tr>\t\t\t\n");
          out.write("\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td> PSI Activation </td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_checkbox_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" </td>\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t</tr>\t\t\t\n");
          out.write("\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td> Display Name </td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_text_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" </td>\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t</tr>\t\t\t\n");
          out.write("\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td> User-Status </td>\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_hidden_3(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_logic_equal_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_logic_equal_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_logic_equal_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_logic_equal_3(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t</table> <!-- impu-table -->\t\t\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td align=\"center\"> \n");
          out.write("\t\t\t\t\t<b> Mandatory fields were marked with \"*\" </b>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\t\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td align=\"center\">\n");
          out.write("\t\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t");

							 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
						
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_html_button_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\t\t");

							}
						
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_html_button_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t");
 
							if (request.isUserInRole(WebConstants.Security_Permission_ADMIN) && id == -1){ 
						
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t");

							}
						
          out.write("\n");
          out.write("\t\t\t\t\t\t");
 
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
          out.write("\t\t\t\t\t\t");

							}
						
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t");

				if (id != -1){
			
          out.write("\t\t\t\n");
          out.write("\t\t\t\t");

					 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
				
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<br/>\n");
          out.write("\t\t\t\t\t\t<h2>Add IMPU(s) to Implicit-Set </h2>\n");
          out.write("\t\t\t\t \t\t<table id=\"implicit-set-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<tr class=\"even\">\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\tIMPU Identity\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_text_5(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t</table>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t");

					} // endif ADMIN
				
          out.write("\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<br/>\n");
          out.write("\t\t\t\t\t\t<h2>List IMPUs from Implicit-Set </h2>\n");
          out.write("\t\t\t\t\t\t<table id=\"list-implicit-set-table\" width=\"400\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"100%\" style=\"border:2px solid #FF6600;\">\t\n");
          out.write("\t\t\t\t\t\t<tr class=\"header\">\n");
          out.write("\t\t\t\t\t\t\t<td class=\"header\"> ID </td>\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<td class=\"header\"> IMPU Identity </td>\n");
          out.write("\t\t\t\t\t\t\t");

								 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
							
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<td class=\"header\"> Delete </td>\n");
          out.write("\t\t\t\t\t\t\t");

								}
							
          out.write("\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t");

							if (implicitset_IMPUs != null && implicitset_IMPUs.size() > 0){
								Iterator it = implicitset_IMPUs.iterator();
								IMPU crt_IMPU = null;
								
								while (it.hasNext()){									
									crt_IMPU = (IMPU) it.next();
						
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t<tr class=\"even\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td>  ");
          out.print( crt_IMPU.getId() );
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td>  \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"/hss.web.console/IMPU_Load.do?id=");
          out.print( crt_IMPU.getId() );
          out.write("\" > \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          out.print( crt_IMPU.getIdentity() );
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t");
							
								 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
										if (crt_IMPU.getId() != id){
						
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td> \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" name=\"delete_impu_from_implicitset\" \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"value=\"Delete\" onclick=\"add_action_for_form(6, ");
          out.print( crt_IMPU.getId() );
          out.write(");\" />\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t");

										} else {
						
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td> </td> \n");
          out.write("\t\t\t\t\t\t");

										}
								}
						
          out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t");
			
								}
							}
						
          out.write("\n");
          out.write("\t\t\t\t\t\t</table> <!-- list-implicit-set-table -->\t\t  \n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t</table> <!-- left-side-table -->\t\t\n");
          out.write("\t\t</td>\t\n");
          out.write("\t\t\n");
          out.write("\t\t<td>\t\n");
          out.write("\t\t\t<table id=\"right-side-table\" align=\"center\" valign=\"middle\">\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t");

				 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
			
          out.write("\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<h2>Add Visited-Networks </h2>\n");
          out.write("\t\t\t\t\t<table id=\"visited-networks-table\" width=\"400\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\t\n");
          out.write("\t\t\t\t\t<tr class=\"even\">\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_3(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_5(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\t\n");
          out.write("\t\t\t\t\t</table> <!-- visited-networks-table -->\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t");

				} //endif ADMIN
			
          out.write("\t\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t<h2> List of Visited Networks </h2>\n");
          out.write("\t\t\t\t\t<table id=\"list-visited-networks-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\n");
          out.write("\t\t\t\t\t<tr class=\"header\">\n");
          out.write("\t\t\t\t\t\t<td class=\"header\"> ID </td>\t\t\t\n");
          out.write("\t\t\t\t\t\t<td class=\"header\"> Identity </td>\n");
          out.write("\t\t\t\t\t\t");

							 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
						
          out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td class=\"header\"> Delete </td>\n");
          out.write("\t\t\t\t\t\t");

							}
						
          out.write("\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t");

						if (visitedNetworks != null && visitedNetworks.size() > 0){
							Iterator it = visitedNetworks.iterator();
							VisitedNetwork crt_VisitedNetwork = null;
										
							while (it.hasNext()){									
								crt_VisitedNetwork = (VisitedNetwork) it.next();
					
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<tr class=\"even\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>  ");
          out.print( crt_VisitedNetwork.getId() );
          out.write("</td>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t<td> \n");
          out.write("\t\t\t\t\t\t\t\t    \t<a href=\"/hss.web.console/VN_Load.do?id=");
          out.print( crt_VisitedNetwork.getId() );
          out.write("\" > \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t ");
          out.print( crt_VisitedNetwork.getIdentity() );
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\t\n");
          out.write("\t\t\t\t\t\t\t\t\t");

										 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
									
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t<td> \n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"button\" name=\"delete_visited_network\" \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\"value=\"Delete\" onclick=\"add_action_for_form(7, ");
          out.print( crt_VisitedNetwork.getId() );
          out.write(");\"/>\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");

										}
									
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t");
			
							}
						}
					
          out.write("\n");
          out.write("\t\t\t\t\t</table> <!-- list-visited-networks-table -->\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t</tr>\t\t\n");
          out.write("\t\t\t");

				 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
			
          out.write("\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t<h2> Associate IMPI(s) to IMPU\n");
          out.write("\t\t\t\t\t<table id=\"associate-impi-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\n");
          out.write("\t\t\t\t\t<tr class=\"even\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\tIMPI Identity\n");
          out.write("\t\t\t\t\t\t</td>\t\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_html_text_6(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_6(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\t\n");
          out.write("\t\t\t\t\t</table> <!-- associate-impi-table -->\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t<table id=\"warning-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\t\t\t\t\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t<font color=\"#FF0000\">\n");
          out.write("\t\t\t\t\t\t\t\tWarning: This IMPI will be associated with all the corresponding IMPUs (within the same implicit-set)!\n");
          out.write("\t\t\t\t\t\t\t</font>\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t</table> <!-- warning-table -->\t\t\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t");
	
				}
			
          out.write("\t\n");
          out.write("\t\t\t\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t<h2> List of associated IMPIs </h2>\n");
          out.write("\t\t\t\t\t<table id=\"list-associate-impi-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t<tr class=\"header\">\n");
          out.write("\t\t\t\t\t\t<td class=\"header\"> ID </td>\t\t\t\n");
          out.write("\t\t\t\t\t\t<td class=\"header\"> IMPI Identity </td>\n");
          out.write("\t\t\t\t\t\t");

							 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
						
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td class=\"header\"> Delete </td>\n");
          out.write("\t\t\t\t\t\t");

							}
						
          out.write("\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t");

						if (associated_IMPIs != null && associated_IMPIs.size() > 0){
							Iterator it = associated_IMPIs.iterator();
							IMPI crt_IMPI = null;
										
							while (it.hasNext()){									
								crt_IMPI = (IMPI) it.next();
					
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<tr class=\"even\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>  ");
          out.print( crt_IMPI.getId() );
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t    \t<a href=\"/hss.web.console/IMPI_Load.do?id=");
          out.print( crt_IMPI.getId() );
          out.write("\" > \n");
          out.write("  \t\t\t\t\t\t\t\t\t\t\t");
          out.print( crt_IMPI.getIdentity() );
          out.write("\n");
          out.write("  \t\t\t\t\t\t\t\t\t\t</a>  \n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t");

										 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
									
          out.write("\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t<td> \n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"button\" name=\"delete_associated_impi\" \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\"value=\"Delete\" onclick=\"add_action_for_form(5, ");
          out.print( crt_IMPI.getId() );
          out.write(");\"/>\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");

										}
									
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t");
			
							}
						}
					
          out.write("\n");
          out.write("\t\t\t\t\t</table> <!-- list-associate-impi-table -->\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t</tr>\t\t\n");
          out.write("\n");
          out.write("\t\t\t");

				 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
			
          out.write("\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t<b> Push Cx Operation </b>\n");
          out.write("\t\t\t\t\t<table id=\"ppr-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\tApply for\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t<td align=\"center\">\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t<td align=\"center\">\n");
          out.write("\t\t\t\t\t\t\tExecute\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td align=\"center\">\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_7(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t</table> <!-- ppr-table -->\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t\t");

				} // endif ADMIN
			
          out.write("\n");
          out.write("\t\t\t</table>\t<!-- right-side-table -->\t\t\t\t\t\n");
          out.write("\t\t</td>\n");
          out.write("\t</tr>\n");
          out.write("\t");

		} // endif id != -1
	
          out.write("\n");
          out.write("\t</table>\t\t\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
      out.write(" <!-- main-table -->\n");
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
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_1 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_1.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_1.setProperty("associated_ID");
    int _jspx_eval_html_hidden_1 = _jspx_th_html_hidden_1.doStartTag();
    if (_jspx_th_html_hidden_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_1);
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
    _jspx_th_html_hidden_2.setProperty("already_assigned_impi_id");
    int _jspx_eval_html_hidden_2 = _jspx_th_html_hidden_2.doStartTag();
    if (_jspx_th_html_hidden_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_2);
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
    _jspx_th_html_text_1.setProperty("identity");
    _jspx_th_html_text_1.setStyleClass("inputtext");
    _jspx_th_html_text_1.setStyle("width:250px;");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_style_property_nobody.reuse(_jspx_th_html_text_1);
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
    _jspx_th_html_checkbox_0.setProperty("barring");
    _jspx_th_html_checkbox_0.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_0 = _jspx_th_html_checkbox_0.doStartTag();
    if (_jspx_th_html_checkbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_0);
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
    _jspx_th_html_select_0.setProperty("id_sp");
    _jspx_th_html_select_0.setName("IMPU_Form");
    _jspx_th_html_select_0.setStyleClass("inputtext");
    _jspx_th_html_select_0.setSize("1");
    _jspx_th_html_select_0.setStyle("width:250px;");
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
        out.write("Select Profile...");
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
    _jspx_th_html_optionsCollection_0.setName("IMPU_Form");
    _jspx_th_html_optionsCollection_0.setProperty("select_sp");
    _jspx_th_html_optionsCollection_0.setLabel("name");
    _jspx_th_html_optionsCollection_0.setValue("id");
    int _jspx_eval_html_optionsCollection_0 = _jspx_th_html_optionsCollection_0.doStartTag();
    if (_jspx_th_html_optionsCollection_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_0);
    return false;
  }

  private boolean _jspx_meth_html_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_2.setPageContext(_jspx_page_context);
    _jspx_th_html_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_2.setProperty("id_impu_implicitset");
    _jspx_th_html_text_2.setReadonly(true);
    _jspx_th_html_text_2.setStyleClass("inputtext_readonly");
    _jspx_th_html_text_2.setStyle("width:100px;");
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody.reuse(_jspx_th_html_text_2);
    return false;
  }

  private boolean _jspx_meth_html_select_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_1 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_1.setPageContext(_jspx_page_context);
    _jspx_th_html_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_1.setProperty("id_charging_info");
    _jspx_th_html_select_1.setName("IMPU_Form");
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
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_option_1(_jspx_th_html_select_1, _jspx_page_context))
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
    _jspx_tagPool_html_select_styleClass_style_size_property_name.reuse(_jspx_th_html_select_1);
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
        out.write("Select Charging-Info...");
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
    _jspx_th_html_optionsCollection_1.setName("IMPU_Form");
    _jspx_th_html_optionsCollection_1.setProperty("select_charging_info");
    _jspx_th_html_optionsCollection_1.setLabel("name");
    _jspx_th_html_optionsCollection_1.setValue("id");
    int _jspx_eval_html_optionsCollection_1 = _jspx_th_html_optionsCollection_1.doStartTag();
    if (_jspx_th_html_optionsCollection_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_1);
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
    _jspx_th_html_checkbox_1.setProperty("can_register");
    _jspx_th_html_checkbox_1.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_1 = _jspx_th_html_checkbox_1.doStartTag();
    if (_jspx_th_html_checkbox_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_1);
    return false;
  }

  private boolean _jspx_meth_html_select_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_2 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_2.setPageContext(_jspx_page_context);
    _jspx_th_html_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_2.setProperty("type");
    _jspx_th_html_select_2.setName("IMPU_Form");
    _jspx_th_html_select_2.setStyleClass("inputtext");
    _jspx_th_html_select_2.setSize("1");
    _jspx_th_html_select_2.setStyle("width:250px;");
    int _jspx_eval_html_select_2 = _jspx_th_html_select_2.doStartTag();
    if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_2.doInitBody();
      }
      do {
        out.write(" \n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_option_2(_jspx_th_html_select_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_optionsCollection_2(_jspx_th_html_select_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_select_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_select_styleClass_style_size_property_name.reuse(_jspx_th_html_select_2);
    return false;
  }

  private boolean _jspx_meth_html_option_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_2 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_2.setPageContext(_jspx_page_context);
    _jspx_th_html_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_2);
    _jspx_th_html_option_2.setValue("-1");
    int _jspx_eval_html_option_2 = _jspx_th_html_option_2.doStartTag();
    if (_jspx_eval_html_option_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_option_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_option_2.doInitBody();
      }
      do {
        out.write("Select type...");
        int evalDoAfterBody = _jspx_th_html_option_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_2);
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
    _jspx_th_html_optionsCollection_2.setName("IMPU_Form");
    _jspx_th_html_optionsCollection_2.setProperty("select_identity_type");
    _jspx_th_html_optionsCollection_2.setLabel("name");
    _jspx_th_html_optionsCollection_2.setValue("code");
    int _jspx_eval_html_optionsCollection_2 = _jspx_th_html_optionsCollection_2.doStartTag();
    if (_jspx_th_html_optionsCollection_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_2);
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
    _jspx_th_html_text_3.setProperty("wildcard_psi");
    _jspx_th_html_text_3.setStyleClass("inputtext");
    _jspx_th_html_text_3.setStyle("width:250px;");
    int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
    if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_style_property_nobody.reuse(_jspx_th_html_text_3);
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
    _jspx_th_html_checkbox_2.setProperty("psi_activation");
    _jspx_th_html_checkbox_2.setStyleClass("inputbox");
    int _jspx_eval_html_checkbox_2 = _jspx_th_html_checkbox_2.doStartTag();
    if (_jspx_th_html_checkbox_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.reuse(_jspx_th_html_checkbox_2);
    return false;
  }

  private boolean _jspx_meth_html_text_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_4 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_styleClass_style_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_4.setPageContext(_jspx_page_context);
    _jspx_th_html_text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_4.setProperty("display_name");
    _jspx_th_html_text_4.setStyleClass("inputtext");
    _jspx_th_html_text_4.setStyleClass("inputtext");
    _jspx_th_html_text_4.setStyle("width:250px;");
    int _jspx_eval_html_text_4 = _jspx_th_html_text_4.doStartTag();
    if (_jspx_th_html_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_styleClass_style_property_nobody.reuse(_jspx_th_html_text_4);
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
    _jspx_th_html_hidden_3.setProperty("user_state");
    int _jspx_eval_html_hidden_3 = _jspx_th_html_hidden_3.doStartTag();
    if (_jspx_th_html_hidden_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_3);
    return false;
  }

  private boolean _jspx_meth_logic_equal_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_0 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_equal_0.setPageContext(_jspx_page_context);
    _jspx_th_logic_equal_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_logic_equal_0.setValue("0");
    _jspx_th_logic_equal_0.setProperty("user_state");
    _jspx_th_logic_equal_0.setName("IMPU_Form");
    int _jspx_eval_logic_equal_0 = _jspx_th_logic_equal_0.doStartTag();
    if (_jspx_eval_logic_equal_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t<td bgcolor=\"#FF6666\"> NOT-REGISTERED </td>\n");
        out.write("\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_logic_equal_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_1 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_equal_1.setPageContext(_jspx_page_context);
    _jspx_th_logic_equal_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_logic_equal_1.setValue("1");
    _jspx_th_logic_equal_1.setProperty("user_state");
    _jspx_th_logic_equal_1.setName("IMPU_Form");
    int _jspx_eval_logic_equal_1 = _jspx_th_logic_equal_1.doStartTag();
    if (_jspx_eval_logic_equal_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t<td bgcolor=\"#33CC66\"> REGISTERED </td>\n");
        out.write("\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_logic_equal_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_2 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_equal_2.setPageContext(_jspx_page_context);
    _jspx_th_logic_equal_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_logic_equal_2.setValue("2");
    _jspx_th_logic_equal_2.setProperty("user_state");
    _jspx_th_logic_equal_2.setName("IMPU_Form");
    int _jspx_eval_logic_equal_2 = _jspx_th_logic_equal_2.doStartTag();
    if (_jspx_eval_logic_equal_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t<td bgcolor=\"#33CCFF\"> UN-REGISTERED </td>\n");
        out.write("\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_logic_equal_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_3 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_equal_3.setPageContext(_jspx_page_context);
    _jspx_th_logic_equal_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_logic_equal_3.setValue("3");
    _jspx_th_logic_equal_3.setProperty("user_state");
    _jspx_th_logic_equal_3.setName("IMPU_Form");
    int _jspx_eval_logic_equal_3 = _jspx_th_logic_equal_3.doStartTag();
    if (_jspx_eval_logic_equal_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t<td bgcolor=\"#FFCC66\"> AUTH-PENDING </td>\n");
        out.write("\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_html_text_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_5 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_value_styleClass_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_5.setPageContext(_jspx_page_context);
    _jspx_th_html_text_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_5.setProperty("impu_implicitset_identity");
    _jspx_th_html_text_5.setValue("");
    _jspx_th_html_text_5.setStyleClass("inputtext");
    int _jspx_eval_html_text_5 = _jspx_th_html_text_5.doStartTag();
    if (_jspx_th_html_text_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_value_styleClass_property_nobody.reuse(_jspx_th_html_text_5);
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
    _jspx_th_html_button_4.setProperty("add_impu_to_implicitset");
    _jspx_th_html_button_4.setValue("Add");
    _jspx_th_html_button_4.setOnclick("add_action_for_form(13, -1);");
    int _jspx_eval_html_button_4 = _jspx_th_html_button_4.doStartTag();
    if (_jspx_th_html_button_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick_nobody.reuse(_jspx_th_html_button_4);
    return false;
  }

  private boolean _jspx_meth_html_select_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_3 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_3.setPageContext(_jspx_page_context);
    _jspx_th_html_select_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_3.setProperty("vn_id");
    _jspx_th_html_select_3.setName("IMPU_Form");
    _jspx_th_html_select_3.setStyleClass("inputtext");
    _jspx_th_html_select_3.setSize("1");
    _jspx_th_html_select_3.setStyle("width:250px;");
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
        if (_jspx_meth_html_option_3(_jspx_th_html_select_3, _jspx_page_context))
          return true;
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
    _jspx_tagPool_html_select_styleClass_style_size_property_name.reuse(_jspx_th_html_select_3);
    return false;
  }

  private boolean _jspx_meth_html_option_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_3 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_3.setPageContext(_jspx_page_context);
    _jspx_th_html_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_3);
    _jspx_th_html_option_3.setValue("-1");
    int _jspx_eval_html_option_3 = _jspx_th_html_option_3.doStartTag();
    if (_jspx_eval_html_option_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_option_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_option_3.doInitBody();
      }
      do {
        out.write("Select Visited-Network...");
        int evalDoAfterBody = _jspx_th_html_option_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_3);
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
    _jspx_th_html_optionsCollection_3.setName("IMPU_Form");
    _jspx_th_html_optionsCollection_3.setProperty("select_vn");
    _jspx_th_html_optionsCollection_3.setLabel("identity");
    _jspx_th_html_optionsCollection_3.setValue("id");
    int _jspx_eval_html_optionsCollection_3 = _jspx_th_html_optionsCollection_3.doStartTag();
    if (_jspx_th_html_optionsCollection_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_3);
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
    _jspx_th_html_button_5.setProperty("add_vn");
    _jspx_th_html_button_5.setValue("Add");
    _jspx_th_html_button_5.setOnclick("add_action_for_form(14, -1);");
    int _jspx_eval_html_button_5 = _jspx_th_html_button_5.doStartTag();
    if (_jspx_th_html_button_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick_nobody.reuse(_jspx_th_html_button_5);
    return false;
  }

  private boolean _jspx_meth_html_text_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_6 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_value_styleClass_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_6.setPageContext(_jspx_page_context);
    _jspx_th_html_text_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_6.setProperty("impi_identity");
    _jspx_th_html_text_6.setValue("");
    _jspx_th_html_text_6.setStyleClass("inputtext");
    int _jspx_eval_html_text_6 = _jspx_th_html_text_6.doStartTag();
    if (_jspx_th_html_text_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_value_styleClass_property_nobody.reuse(_jspx_th_html_text_6);
    return false;
  }

  private boolean _jspx_meth_html_button_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_6 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_value_property_onclick_nobody.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_6.setPageContext(_jspx_page_context);
    _jspx_th_html_button_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_button_6.setProperty("add_impi");
    _jspx_th_html_button_6.setValue("Add");
    _jspx_th_html_button_6.setOnclick("add_action_for_form(12, -1);");
    int _jspx_eval_html_button_6 = _jspx_th_html_button_6.doStartTag();
    if (_jspx_th_html_button_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick_nobody.reuse(_jspx_th_html_button_6);
    return false;
  }

  private boolean _jspx_meth_html_select_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_4 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_4.setPageContext(_jspx_page_context);
    _jspx_th_html_select_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_4.setProperty("ppr_apply_for");
    _jspx_th_html_select_4.setName("IMPU_Form");
    _jspx_th_html_select_4.setStyleClass("inputtext");
    _jspx_th_html_select_4.setSize("1");
    _jspx_th_html_select_4.setStyle("width:200px;");
    int _jspx_eval_html_select_4 = _jspx_th_html_select_4.doStartTag();
    if (_jspx_eval_html_select_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_4.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_optionsCollection_4(_jspx_th_html_select_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_select_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_select_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_select_styleClass_style_size_property_name.reuse(_jspx_th_html_select_4);
    return false;
  }

  private boolean _jspx_meth_html_optionsCollection_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:optionsCollection
    org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_optionsCollection_4 = (org.apache.struts.taglib.html.OptionsCollectionTag) _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
    _jspx_th_html_optionsCollection_4.setPageContext(_jspx_page_context);
    _jspx_th_html_optionsCollection_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_4);
    _jspx_th_html_optionsCollection_4.setName("IMPU_Form");
    _jspx_th_html_optionsCollection_4.setProperty("select_ppr_apply_for");
    _jspx_th_html_optionsCollection_4.setLabel("name");
    _jspx_th_html_optionsCollection_4.setValue("code");
    int _jspx_eval_html_optionsCollection_4 = _jspx_th_html_optionsCollection_4.doStartTag();
    if (_jspx_th_html_optionsCollection_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_4);
    return false;
  }

  private boolean _jspx_meth_html_button_7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_7 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_value_property_onclick_nobody.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_7.setPageContext(_jspx_page_context);
    _jspx_th_html_button_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_button_7.setProperty("ppr_button");
    _jspx_th_html_button_7.setValue("PPR");
    _jspx_th_html_button_7.setOnclick("add_action_for_form(10, -1);");
    int _jspx_eval_html_button_7 = _jspx_th_html_button_7.doStartTag();
    if (_jspx_th_html_button_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick_nobody.reuse(_jspx_th_html_button_7);
    return false;
  }
}
