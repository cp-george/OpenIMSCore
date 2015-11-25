package org.apache.jsp.pages.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import de.fhg.fokus.hss.db.model.*;
import de.fhg.fokus.hss.web.util.WebConstants;

public final class impi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_styleClass_style_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_checkbox_styleClass_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_checkbox_styleClass_property_onclick_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_styleClass_style_size_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_button_value_property_onclick_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_button_value_property_onclick_disabled_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_value_styleClass_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_styleClass_style_size_property_onchange_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_size_property_multiple;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_optionsCollection_value_property_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_option_value;

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
    _jspx_tagPool_html_checkbox_styleClass_property_onclick_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_styleClass_style_size_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_button_value_property_onclick_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_button_value_property_onclick_disabled_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_value_styleClass_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_styleClass_style_size_property_onchange_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_size_property_multiple = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_optionsCollection_value_property_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_hidden_value_property_nobody.release();
    _jspx_tagPool_html_hidden_property_nobody.release();
    _jspx_tagPool_html_text_styleClass_style_readonly_property_nobody.release();
    _jspx_tagPool_html_text_styleClass_style_property_nobody.release();
    _jspx_tagPool_html_checkbox_styleClass_property_nobody.release();
    _jspx_tagPool_html_checkbox_styleClass_property_onclick_nobody.release();
    _jspx_tagPool_html_select_styleClass_style_size_property_name.release();
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.release();
    _jspx_tagPool_html_button_value_property_onclick_nobody.release();
    _jspx_tagPool_html_button_value_property_onclick_disabled_nobody.release();
    _jspx_tagPool_html_text_value_styleClass_property_nobody.release();
    _jspx_tagPool_html_select_styleClass_style_size_property_onchange_name.release();
    _jspx_tagPool_html_select_size_property_multiple.release();
    _jspx_tagPool_html_optionsCollection_value_property_label_nobody.release();
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
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>IMPI </title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/hss.web.console/style/fokus_ngni.css\">\n");
      out.write("\n");
      de.fhg.fokus.hss.db.model.IMSU associated_IMSU = null;
      synchronized (request) {
        associated_IMSU = (de.fhg.fokus.hss.db.model.IMSU) _jspx_page_context.getAttribute("associated_IMSU", PageContext.REQUEST_SCOPE);
        if (associated_IMSU == null){
          associated_IMSU = new de.fhg.fokus.hss.db.model.IMSU();
          _jspx_page_context.setAttribute("associated_IMSU", associated_IMSU, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      java.util.List associated_IMPUs = null;
      synchronized (request) {
        associated_IMPUs = (java.util.List) _jspx_page_context.getAttribute("associated_IMPUs", PageContext.REQUEST_SCOPE);
        if (associated_IMPUs == null){
          throw new java.lang.InstantiationException("bean associated_IMPUs not found within scope");
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
      out.write("\t\t\tdocument.IMPI_Form.nextAction.value=\"save\";\n");
      out.write("\t\t\tdocument.IMPI_Form.submit();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 2:\n");
      out.write("\t\t\tdocument.IMPI_Form.nextAction.value=\"reset\";\n");
      out.write("\t\t\tdocument.IMPI_Form.reset();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 3:\n");
      out.write("\t\t\tdocument.IMPI_Form.nextAction.value=\"refresh\";\n");
      out.write("\t\t\tdocument.IMPI_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 4:\n");
      out.write("\t\t\tdocument.IMPI_Form.nextAction.value=\"delete\";\n");
      out.write("\t\t\tdocument.IMPI_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\t\t\n");
      out.write("\t\tcase 5:\n");
      out.write("\t\t\tdocument.IMPI_Form.nextAction.value=\"delete_associated_IMPU\";\n");
      out.write("\t\t \tdocument.IMPI_Form.associated_ID.value=associated_ID;\n");
      out.write("\t\t \tdocument.IMPI_Form.submit();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 6:\n");
      out.write("\t\t\tdocument.IMPI_Form.nextAction.value=\"delete_associated_IMSU\";\n");
      out.write("\t\t \tdocument.IMPI_Form.submit();\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 10:\n");
      out.write("\t\t\tdocument.IMPI_Form.nextAction.value=\"ppr\";\n");
      out.write("\t\t\tdocument.IMPI_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 11:\t\n");
      out.write("\t\t\tdocument.IMPI_Form.nextAction.value=\"rtr_select_identities\";\n");
      out.write("\t\t\tdocument.IMPI_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 12:\t\n");
      out.write("\t\t\tdocument.IMPI_Form.nextAction.value=\"rtr_all\";\n");
      out.write("\t\t\tdocument.IMPI_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 13:\t\n");
      out.write("\t\t\tdocument.IMPI_Form.nextAction.value=\"rtr_selected\";\n");
      out.write("\t\t\tdocument.IMPI_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 14:\n");
      out.write("\t\t\tdocument.IMPI_Form.nextAction.value=\"add_imsu\";\n");
      out.write("\t\t\tdocument.IMPI_Form.submit();\t\t\t\n");
      out.write("\t\t\tbreak;\n");
      out.write("\t\tcase 15:\n");
      out.write("\t\t\tdocument.IMPI_Form.nextAction.value=\"add_impu\";\n");
      out.write("\t\t\tdocument.IMPI_Form.submit();\t\t\t\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("function disable_other_boxes(){\n");
      out.write("\tif (document.IMPI_Form.all.checked){\n");
      out.write("\t\tdocument.IMPI_Form.aka1.disabled=true;\n");
      out.write("\t\tdocument.IMPI_Form.aka2.disabled=true;\n");
      out.write("\t\tdocument.IMPI_Form.md5.disabled=true;\n");
      out.write("\t\tdocument.IMPI_Form.digest.disabled=true;\n");
      out.write("\t\tdocument.IMPI_Form.sip_digest.disabled=true;\n");
      out.write("\t\tdocument.IMPI_Form.http_digest.disabled=true;\t\t\n");
      out.write("\t\tdocument.IMPI_Form.early.disabled=true;\n");
      out.write("\t\tdocument.IMPI_Form.nass_bundle.disabled=true;\t\t\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("\telse{\n");
      out.write("\t\tdocument.IMPI_Form.aka1.disabled=false;\n");
      out.write("\t\tdocument.IMPI_Form.aka2.disabled=false;\n");
      out.write("\t\tdocument.IMPI_Form.md5.disabled=false;\n");
      out.write("\t\tdocument.IMPI_Form.digest.disabled=false;\n");
      out.write("\t\tdocument.IMPI_Form.sip_digest.disabled=false;\n");
      out.write("\t\tdocument.IMPI_Form.http_digest.disabled=false;\t\t\n");
      out.write("\t\tdocument.IMPI_Form.early.disabled=false;\n");
      out.write("\t\tdocument.IMPI_Form.nass_bundle.disabled=false;\t\t\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<table id=\"title-table\" align=\"center\" weight=\"100%\" >\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td align=\"center\">\n");
      out.write("\t\t\t<h1> Private User Identity -IMPI- </h1> \t\t\t\n");
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
      _jspx_th_html_form_0.setAction("/IMPI_Submit");
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
          out.write("\t\t\t\n");
          out.write("\t\t");
          if (_jspx_meth_html_hidden_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\t\t\n");
          out.write("\t\t");
          if (_jspx_meth_html_hidden_3(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\t\t\t\t\t\n");
          out.write("\n");
          out.write("\t\t<table id=\"main-table\" align=\"center\" valign=\"middle\" >\n");
          out.write("\t\t<tr>\n");
          out.write("\t\t\t<td>\n");
          out.write("\t\t \t\t<table id=\"left-side-table\">\t\t\t\t\t\t\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t \t\t<table id=\"impi-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t    <tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t<td>ID </td>\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_text_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\tIdentity* \n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_text_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\tSecret Key*\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_text_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\n");
          out.write("\t\t\t\t\t\t<!-- The Authentication Schemes types -->\n");
          out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t<td> \n");
          out.write("\t\t\t\t\t\t\t\t<br/> <b>Authentication Schemes* </b>\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td></td>\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\tDigest-AKAv1 (3GPP)\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_checkbox_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\tDigest-AKAv2 (3GPP)\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_checkbox_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\tDigest-MD5 (FOKUS)\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_checkbox_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\tDigest (CableLabs)\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_checkbox_3(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\tSIP Digest (3GPP)\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_checkbox_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\tHTTP Digest (ETSI)\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_checkbox_5(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\tEarly-IMS (3GPP)\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_checkbox_6(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\tNASS Bundled (ETSI)\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_checkbox_7(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\tAll\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_checkbox_8(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\tDefault\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</td>\t\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td> <br/> </td>\n");
          out.write("\t\t\t\t\t\t\t\t<td> </td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\tAMF*\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_text_3(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\tOP*\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_text_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td> \n");
          out.write("\t\t\t\t\t\t\t\t\tSQN*\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_text_5(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td> <br/> </td>\n");
          out.write("\t\t\t\t\t\t\t\t<td> </td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\tEarly IMS IP\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_text_6(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\tDSL Line Identifier\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_text_7(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\tGUSS\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t");

									if (id != -1){
								
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t<a href=\"/hss.web.console/GBA_USS_Load.do?id_impi=");
          out.print(id);
          out.write("\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\tConfigure \t\n");
          out.write("\t\t\t\t\t\t\t\t\t</a>\n");
          out.write("\t\t\t\t\t\t\t\t");

									}
								
          out.write("\t\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t</table> <!-- impi-table-->\t\t\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t<td align=\"center\"> \n");
          out.write("\t\t\t\t\t\t\t<b> Mandatory fields were marked with \"*\".<br>\n");
          out.write("\t\t\t\t\t\t\tThe Secret Key in this form is considered in hex representation if its value is 16 bytes long or\n");
          out.write("\t\t\t\t\t\t\telse in ASCII representation.</b>\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\t\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t<td align=center> \n");
          out.write("\t\t\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t");

								if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
							
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t");

								}
							
          out.write("\t\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t");
 
								if (request.isUserInRole(WebConstants.Security_Permission_ADMIN) && id == -1){ 
							
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t");

								}
							
          out.write("\n");
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t");
 
								if (request.isUserInRole(WebConstants.Security_Permission_ADMIN) && id != -1){ 
							
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t");
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
							
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t</table> <!-- left-side-table -->\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t\n");
          out.write("\t\t\t\t");

					if (id != -1){
				
          out.write("\t\n");
          out.write("\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t<table id=\"right-side-table\" align=\"center\">\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t");

						if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
					
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t\t<tr>\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t\t\t<h2> Associate an IMSU </h2>\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<table id=\"associate-imsu-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\n");
          out.write("\t\t\t\t\t\t\t<tr class=\"even\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\tIMSU Identity\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_text_8(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\t\n");
          out.write("\t\t\t\t\t\t\t</table> <!-- associate-imsu-table -->\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t");
	
						}
					
          out.write("\t\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t\t\t<h2> Associated IMSU </h2>\n");
          out.write("\t\t\t\t\t\t\t<table id=\"list-associate-imsu-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\n");
          out.write("\t\t\t\t\t\t\t\t<tr class=\"header\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<td class=\"header\"> ID </td>\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t<td class=\"header\"> IMSU Identity </td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");

										if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
									
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t<td class=\"header\"> Delete </td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");

										}
									
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\t");

									if (associated_IMSU != null && associated_IMSU.getId() > 0){
								
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<tr class=\"even\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>  ");
          out.print( associated_IMSU.getId() );
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>  \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"/hss.web.console/IMSU_Load.do?id=");
          out.print( associated_IMSU.getId() );
          out.write("\" > \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
          out.print( associated_IMSU.getName() );
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");

												if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
											
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td> \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" name=\"delete_associated_imsu\" \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"value=\"Delete\" onclick=\"add_action_for_form(6, ");
          out.print( associated_IMSU.getId() );
          out.write(");\"/>\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");

												}
											
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t");
			
									}
								
          out.write("\n");
          out.write("\t\t\t\t\t\t\t</table> <!-- list-associate-imsu-table -->\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\t\t\n");
          out.write("\n");
          out.write("\t\t\t\t\t");

						if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
					
          out.write("\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t\t\t<h2>\n");
          out.write("\t\t\t\t\t\t\t\t<b>Create & Bind new IMPU </b>\n");
          out.write("\t\t\t\t\t\t\t\t");

									out.println("<a href=\"/hss.web.console/IMPU_Load.do?id=-1&already_assigned_impi_id=" + id + "\" > ");
								
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t<img src=\"/hss.web.console/images/add_obj.gif\" /> \n");
          out.write("\t\t\t\t\t\t\t\t</a>\n");
          out.write("\t\t\t\t\t\t\t</h2>\t\t\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\t\n");
          out.write("\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t<br/>\n");
          out.write("\t\t\t\t\t\t\t<h2>Associate IMPU(s) </h2>\n");
          out.write("\t\t\t\t\t\t\t<table id=\"associate-impu-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\n");
          out.write("\t\t\t\t\t\t\t<tr class=\"even\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\tIMPU Identity\n");
          out.write("\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_text_9(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_5(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\t\n");
          out.write("\t\t\t\t\t\t\t</table> <!-- associate-impu-table -->\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t<table id=\"warning-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\n");
          out.write("\t\t\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t<font color=\"#FF0000\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\tWarning: The current IMPI will be associated with all the corresponding IMPUs (within the same implicit-set)!\n");
          out.write("\t\t\t\t\t\t\t\t\t</font>\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t</table>\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t");

						} // endif ADMIN
					
          out.write("\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t\t\t<h2> List of associated IMPUs </h2>\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<table id=\"list-associate-impu-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\n");
          out.write("\t\t\t\t\t\t\t\t<tr class=\"header\">\n");
          out.write("\t\t\t\t\t\t\t\t\t<td class=\"header\"> ID: </td>\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t<td class=\"header\"> IMPU Identity: </td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");

										if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
									
          out.write("\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t<td class=\"header\"> Delete: </td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");

										}
									
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\t");

									if (associated_IMPUs != null){
										Iterator it = associated_IMPUs.iterator();
										IMPU impu = null;
										int idx = 0;
										while (it.hasNext()){
											impu = (IMPU) it.next();
												
								
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<tr class=\"");
          out.print( idx % 2 == 0 ? "even" : "odd" );
          out.write("\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>  ");
          out.print( impu.getId() );
          out.write("</td>\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>  \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"/hss.web.console/IMPU_Load.do?id=");
          out.print( impu.getId() );
          out.write("\" > \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          out.print( impu.getIdentity() );
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");

													if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
												
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td> \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" name=\"delete_associated_impu\" \n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"value=\"Delete\" onclick=\"add_action_for_form(5, ");
          out.print( impu.getId() );
          out.write(");\"/>\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");

													}
												
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t");
			
											idx++;												
										}
									}
								
          out.write("\n");
          out.write("\t\t\t\t\t\t\t</table> <!-- list-associate-impu-table -->\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\t\t\n");
          out.write("\n");
          out.write("\t\t\t\t\t");

						if (request.isUserInRole(WebConstants.Security_Permission_ADMIN)){
					
          out.write("\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t\t\t<h2> Push Cx Operation </h2>\n");
          out.write("\t\t\t\t\t\t\t<table class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\tApply for\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td align=\"center\">\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_1(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td align=\"center\">\n");
          out.write("\t\t\t\t\t\t\t\t\tExecute\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<td align=\"center\">\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_6(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t</table>\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<tr>\t\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t<br />\n");
          out.write("\t\t\t\t\t\t\t<h2> RTR Operation </h2>\n");
          out.write("\t\t\t\t\t\t\t<table class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" width=\"400\" style=\"border:2px solid #FF6600;\">\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>Apply for</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>Select Identities</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          if (_jspx_meth_html_select_3(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>Reason</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_4(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>Reason Info</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_text_10(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<tr bgcolor=\"#FFCC66\">\n");
          out.write("\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<td align=\"center\" >\n");
          out.write("\t\t\t\t\t\t\t\t\tExecute\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t<td align=\"center\" >\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_7(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_button_8(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\t\n");
          out.write("\t\t\t\t\t\t\t</table>\t\t\t\t\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t");

						} //endif ADMIN
					
          out.write("\n");
          out.write("\t\t\t\t\t</table>\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t\t");

					}
				
          out.write("\n");
          out.write("\t\t\t</tr>\t\t\t\t\t     \t\t\n");
          out.write("\t\t\t</table>\t\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
      out.write("\t\t\t\t\t\n");
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
    _jspx_th_html_hidden_2.setProperty("id_imsu");
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
    _jspx_th_html_hidden_3.setProperty("already_assigned_imsu_id");
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
    _jspx_th_html_text_1.setProperty("identity");
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
    _jspx_th_html_text_2.setProperty("secretKey");
    _jspx_th_html_text_2.setStyleClass("inputtext");
    _jspx_th_html_text_2.setStyle("width:200px;");
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_style_property_nobody.reuse(_jspx_th_html_text_2);
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
    _jspx_th_html_checkbox_0.setProperty("aka1");
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
    _jspx_th_html_checkbox_1.setProperty("aka2");
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
    _jspx_th_html_checkbox_2.setProperty("md5");
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
    _jspx_th_html_checkbox_3.setProperty("digest");
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
    _jspx_th_html_checkbox_4.setProperty("sip_digest");
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
    _jspx_th_html_checkbox_5.setProperty("http_digest");
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
    _jspx_th_html_checkbox_6.setProperty("early");
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
    _jspx_th_html_checkbox_7.setProperty("nass_bundle");
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
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_8 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_styleClass_property_onclick_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_8.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_checkbox_8.setProperty("all");
    _jspx_th_html_checkbox_8.setStyleClass("inputbox");
    _jspx_th_html_checkbox_8.setOnclick("disable_other_boxes();");
    int _jspx_eval_html_checkbox_8 = _jspx_th_html_checkbox_8.doStartTag();
    if (_jspx_th_html_checkbox_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_checkbox_styleClass_property_onclick_nobody.reuse(_jspx_th_html_checkbox_8);
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
    _jspx_th_html_select_0.setProperty("default_auth_scheme");
    _jspx_th_html_select_0.setName("IMPI_Form");
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
        out.write(" \n");
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
    _jspx_th_html_optionsCollection_0.setName("IMPI_Form");
    _jspx_th_html_optionsCollection_0.setProperty("select_auth_scheme");
    _jspx_th_html_optionsCollection_0.setLabel("name");
    _jspx_th_html_optionsCollection_0.setValue("code");
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
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_3 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_style_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_3.setPageContext(_jspx_page_context);
    _jspx_th_html_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_3.setProperty("amf");
    _jspx_th_html_text_3.setStyleClass("inputtext");
    _jspx_th_html_text_3.setStyle("width:100px;");
    int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
    if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_style_property_nobody.reuse(_jspx_th_html_text_3);
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
    _jspx_th_html_text_4.setProperty("op");
    _jspx_th_html_text_4.setStyleClass("inputtext");
    _jspx_th_html_text_4.setStyle("width:300px;");
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
    _jspx_th_html_text_5.setProperty("sqn");
    _jspx_th_html_text_5.setStyleClass("inputtext");
    _jspx_th_html_text_5.setStyle("width:100px;");
    int _jspx_eval_html_text_5 = _jspx_th_html_text_5.doStartTag();
    if (_jspx_th_html_text_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_style_property_nobody.reuse(_jspx_th_html_text_5);
    return false;
  }

  private boolean _jspx_meth_html_text_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_6 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_style_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_6.setPageContext(_jspx_page_context);
    _jspx_th_html_text_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_6.setProperty("ip");
    _jspx_th_html_text_6.setStyleClass("inputtext");
    _jspx_th_html_text_6.setStyle("width:200px;");
    int _jspx_eval_html_text_6 = _jspx_th_html_text_6.doStartTag();
    if (_jspx_th_html_text_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_style_property_nobody.reuse(_jspx_th_html_text_6);
    return false;
  }

  private boolean _jspx_meth_html_text_7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_7 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_style_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_7.setPageContext(_jspx_page_context);
    _jspx_th_html_text_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_7.setProperty("line_identifier");
    _jspx_th_html_text_7.setStyleClass("inputtext");
    _jspx_th_html_text_7.setStyle("width:200px;");
    int _jspx_eval_html_text_7 = _jspx_th_html_text_7.doStartTag();
    if (_jspx_th_html_text_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_style_property_nobody.reuse(_jspx_th_html_text_7);
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

  private boolean _jspx_meth_html_text_8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_8 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_value_styleClass_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_8.setPageContext(_jspx_page_context);
    _jspx_th_html_text_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_8.setProperty("imsu_name");
    _jspx_th_html_text_8.setValue("");
    _jspx_th_html_text_8.setStyleClass("inputtext");
    int _jspx_eval_html_text_8 = _jspx_th_html_text_8.doStartTag();
    if (_jspx_th_html_text_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_value_styleClass_property_nobody.reuse(_jspx_th_html_text_8);
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
    _jspx_th_html_button_4.setProperty("imsu_add_button");
    _jspx_th_html_button_4.setValue("Add/Change");
    _jspx_th_html_button_4.setOnclick("add_action_for_form(14, -1);");
    int _jspx_eval_html_button_4 = _jspx_th_html_button_4.doStartTag();
    if (_jspx_th_html_button_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick_nobody.reuse(_jspx_th_html_button_4);
    return false;
  }

  private boolean _jspx_meth_html_text_9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_9 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_value_styleClass_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_9.setPageContext(_jspx_page_context);
    _jspx_th_html_text_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_9.setProperty("impu_identity");
    _jspx_th_html_text_9.setValue("");
    _jspx_th_html_text_9.setStyleClass("inputtext");
    int _jspx_eval_html_text_9 = _jspx_th_html_text_9.doStartTag();
    if (_jspx_th_html_text_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_value_styleClass_property_nobody.reuse(_jspx_th_html_text_9);
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
    _jspx_th_html_button_5.setProperty("impu_add_button");
    _jspx_th_html_button_5.setValue("Add");
    _jspx_th_html_button_5.setOnclick("add_action_for_form(15);");
    int _jspx_eval_html_button_5 = _jspx_th_html_button_5.doStartTag();
    if (_jspx_th_html_button_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick_nobody.reuse(_jspx_th_html_button_5);
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
    _jspx_th_html_select_1.setProperty("ppr_apply_for");
    _jspx_th_html_select_1.setName("IMPI_Form");
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

  private boolean _jspx_meth_html_optionsCollection_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:optionsCollection
    org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_optionsCollection_1 = (org.apache.struts.taglib.html.OptionsCollectionTag) _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
    _jspx_th_html_optionsCollection_1.setPageContext(_jspx_page_context);
    _jspx_th_html_optionsCollection_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
    _jspx_th_html_optionsCollection_1.setName("IMPI_Form");
    _jspx_th_html_optionsCollection_1.setProperty("select_ppr_apply_for");
    _jspx_th_html_optionsCollection_1.setLabel("name");
    _jspx_th_html_optionsCollection_1.setValue("code");
    int _jspx_eval_html_optionsCollection_1 = _jspx_th_html_optionsCollection_1.doStartTag();
    if (_jspx_th_html_optionsCollection_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_1);
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
    _jspx_th_html_button_6.setProperty("ppr_button");
    _jspx_th_html_button_6.setValue("PPR");
    _jspx_th_html_button_6.setOnclick("add_action_for_form(10, -1);");
    int _jspx_eval_html_button_6 = _jspx_th_html_button_6.doStartTag();
    if (_jspx_th_html_button_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick_nobody.reuse(_jspx_th_html_button_6);
    return false;
  }

  private boolean _jspx_meth_html_select_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_2 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_styleClass_style_size_property_onchange_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_2.setPageContext(_jspx_page_context);
    _jspx_th_html_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_2.setProperty("rtr_apply_for");
    _jspx_th_html_select_2.setName("IMPI_Form");
    _jspx_th_html_select_2.setStyleClass("inputtext");
    _jspx_th_html_select_2.setSize("1");
    _jspx_th_html_select_2.setStyle("width:200px;");
    _jspx_th_html_select_2.setOnchange("add_action_for_form(3, -1);");
    int _jspx_eval_html_select_2 = _jspx_th_html_select_2.doStartTag();
    if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_2.doInitBody();
      }
      do {
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
    _jspx_tagPool_html_select_styleClass_style_size_property_onchange_name.reuse(_jspx_th_html_select_2);
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
    _jspx_th_html_optionsCollection_2.setName("IMPI_Form");
    _jspx_th_html_optionsCollection_2.setProperty("select_rtr_apply_for");
    _jspx_th_html_optionsCollection_2.setLabel("name");
    _jspx_th_html_optionsCollection_2.setValue("code");
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
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_3 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_size_property_multiple.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_3.setPageContext(_jspx_page_context);
    _jspx_th_html_select_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_3.setMultiple("true");
    _jspx_th_html_select_3.setSize("5");
    _jspx_th_html_select_3.setProperty("rtr_identities");
    int _jspx_eval_html_select_3 = _jspx_th_html_select_3.doStartTag();
    if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t    \t");
        if (_jspx_meth_html_optionsCollection_3(_jspx_th_html_select_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t   \t");
        int evalDoAfterBody = _jspx_th_html_select_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_select_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_select_size_property_multiple.reuse(_jspx_th_html_select_3);
    return false;
  }

  private boolean _jspx_meth_html_optionsCollection_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:optionsCollection
    org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_optionsCollection_3 = (org.apache.struts.taglib.html.OptionsCollectionTag) _jspx_tagPool_html_optionsCollection_value_property_label_nobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
    _jspx_th_html_optionsCollection_3.setPageContext(_jspx_page_context);
    _jspx_th_html_optionsCollection_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_3);
    _jspx_th_html_optionsCollection_3.setProperty("rtr_select_identities");
    _jspx_th_html_optionsCollection_3.setLabel("identity");
    _jspx_th_html_optionsCollection_3.setValue("id");
    int _jspx_eval_html_optionsCollection_3 = _jspx_th_html_optionsCollection_3.doStartTag();
    if (_jspx_th_html_optionsCollection_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_optionsCollection_value_property_label_nobody.reuse(_jspx_th_html_optionsCollection_3);
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
    _jspx_th_html_select_4.setProperty("rtr_reason");
    _jspx_th_html_select_4.setName("IMPI_Form");
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
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_option_0(_jspx_th_html_select_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_optionsCollection_4(_jspx_th_html_select_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_html_option_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_0 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_0.setPageContext(_jspx_page_context);
    _jspx_th_html_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_4);
    _jspx_th_html_option_0.setValue("-1");
    int _jspx_eval_html_option_0 = _jspx_th_html_option_0.doStartTag();
    if (_jspx_eval_html_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_option_0.doInitBody();
      }
      do {
        out.write("Select Reason...");
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

  private boolean _jspx_meth_html_optionsCollection_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:optionsCollection
    org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_optionsCollection_4 = (org.apache.struts.taglib.html.OptionsCollectionTag) _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
    _jspx_th_html_optionsCollection_4.setPageContext(_jspx_page_context);
    _jspx_th_html_optionsCollection_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_4);
    _jspx_th_html_optionsCollection_4.setName("IMPI_Form");
    _jspx_th_html_optionsCollection_4.setProperty("select_rtr_reason");
    _jspx_th_html_optionsCollection_4.setLabel("name");
    _jspx_th_html_optionsCollection_4.setValue("code");
    int _jspx_eval_html_optionsCollection_4 = _jspx_th_html_optionsCollection_4.doStartTag();
    if (_jspx_th_html_optionsCollection_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_optionsCollection_value_property_name_label_nobody.reuse(_jspx_th_html_optionsCollection_4);
    return false;
  }

  private boolean _jspx_meth_html_text_10(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_10 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_styleClass_style_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_10.setPageContext(_jspx_page_context);
    _jspx_th_html_text_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_10.setProperty("reasonInfo");
    _jspx_th_html_text_10.setStyleClass("inputtext");
    _jspx_th_html_text_10.setStyle("width:200px;");
    int _jspx_eval_html_text_10 = _jspx_th_html_text_10.doStartTag();
    if (_jspx_th_html_text_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_styleClass_style_property_nobody.reuse(_jspx_th_html_text_10);
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
    _jspx_th_html_button_7.setProperty("rtr_button");
    _jspx_th_html_button_7.setValue("RTR-All");
    _jspx_th_html_button_7.setOnclick("add_action_for_form(12, -1);");
    int _jspx_eval_html_button_7 = _jspx_th_html_button_7.doStartTag();
    if (_jspx_th_html_button_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick_nobody.reuse(_jspx_th_html_button_7);
    return false;
  }

  private boolean _jspx_meth_html_button_8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_8 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_value_property_onclick_nobody.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_8.setPageContext(_jspx_page_context);
    _jspx_th_html_button_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_button_8.setProperty("rtr_button");
    _jspx_th_html_button_8.setValue("RTR-Selected");
    _jspx_th_html_button_8.setOnclick("add_action_for_form(13, -1);");
    int _jspx_eval_html_button_8 = _jspx_th_html_button_8.doStartTag();
    if (_jspx_th_html_button_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick_nobody.reuse(_jspx_th_html_button_8);
    return false;
  }
}
