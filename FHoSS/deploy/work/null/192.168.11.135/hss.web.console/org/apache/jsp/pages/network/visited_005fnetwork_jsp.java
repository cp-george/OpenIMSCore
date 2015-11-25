package org.apache.jsp.pages.network;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import de.fhg.fokus.hss.web.util.WebConstants;

public final class visited_005fnetwork_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_style_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_button_value_property_onclick_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_button_value_property_onclick_disabled_nobody;

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
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody.release();
    _jspx_tagPool_html_text_styleClass_style_property_nobody.release();
    _jspx_tagPool_html_button_value_property_onclick_nobody.release();
    _jspx_tagPool_html_button_value_property_onclick_disabled_nobody.release();
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
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title> Visited Networks </title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/hss.web.console/style/fokus_ngni.css\">\n");
      out.write("\n");

	int id = Integer.parseInt(request.getParameter("id"));

      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\">\n");
      out.write("function add_action_for_form(a) {\n");
      out.write("\tswitch(a){\n");
      out.write("\t\tcase 1:\n");
      out.write("\t\t\tdocument.VN_Form.nextAction.value=\"save\";\n");
      out.write("\t\t\tdocument.VN_Form.submit();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 2:\n");
      out.write("\t\t\tdocument.VN_Form.nextAction.value=\"reset\";\n");
      out.write("\t\t\tdocument.VN_Form.reset();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 3:\n");
      out.write("\t\t\tdocument.VN_Form.nextAction.value=\"refresh\";\n");
      out.write("\t\t\tdocument.VN_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 4:\n");
      out.write("\t\t\tdocument.VN_Form.nextAction.value=\"delete\";\n");
      out.write("\t\t\tdocument.VN_Form.submit();\n");
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
      out.write("\t\t\t<h1> Visited Networks Identifiers </h1> \t\t\t\n");
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
      _jspx_th_html_form_0.setAction("/VN_Submit");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          out.write('	');
          out.write('	');
          if (_jspx_meth_html_hidden_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t<table id=\"main-table\" align=\"center\" valign=\"middle\">\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t \t\t<table id=\"vn-table\" border=\"0\" align=\"center\" width=\"400\" >\t\t\t\t\t\t\n");
          out.write("\t\t\t \t\t<tr>\n");
          out.write("\t\t\t \t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t \t\t<table id=\"fields-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"100%\" style=\"border:2px solid #FF6600;\">\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<td> ID </td>\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_text_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>Identity* </td>\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_text_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\t</table>\t\t\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t<table id=\"buttons-table\" align=\"center\">\n");
          out.write("\t\t\t\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\"> \n");
          out.write("\t\t\t\t\t\t\t\t\t\t<b> Mandatory fields were marked with \"*\" </b>\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\t\n");
          out.write("\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t<td align=center> \n");
          out.write("\t\t\t\t\t\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");

											 if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
										
          out.write("\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");

											}
										
          out.write("\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
 
											if (request.isUserInRole(WebConstants.Security_Permission_ADMIN) && id == -1){ 
										
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
          out.write("\t\t\t\t\t\t\t\t\t\t");

											}
										
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t</table> <!-- button-tables -->\t\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t</table> <!-- vn-table -->\n");
          out.write("\t\t\t</td>\n");
          out.write("\t\t</tr>\n");
          out.write("\t\t</table>\t<!-- main-table-->\t\t\n");
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
    _jspx_th_html_text_1.setStyle("width:200px;");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_style_property_nobody.reuse(_jspx_th_html_text_1);
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
}
