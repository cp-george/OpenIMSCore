package org.apache.jsp.pages.services;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import de.fhg.fokus.hss.db.model.*;

public final class dsai_005fsearch_005fresult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_property_onchange;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_property_onchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_message_key_nobody.release();
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_hidden_property_nobody.release();
    _jspx_tagPool_html_select_property_onchange.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      java.util.List resultList = null;
      synchronized (request) {
        resultList = (java.util.List) _jspx_page_context.getAttribute("resultList", PageContext.REQUEST_SCOPE);
        if (resultList == null){
          throw new java.lang.InstantiationException("bean resultList not found within scope");
        }
      }
      out.write('\n');
      java.lang.String maxPages = null;
      synchronized (request) {
        maxPages = (java.lang.String) _jspx_page_context.getAttribute("maxPages", PageContext.REQUEST_SCOPE);
        if (maxPages == null){
          throw new java.lang.InstantiationException("bean maxPages not found within scope");
        }
      }
      out.write('\n');
      java.lang.String currentPage = null;
      synchronized (request) {
        currentPage = (java.lang.String) _jspx_page_context.getAttribute("currentPage", PageContext.REQUEST_SCOPE);
        if (currentPage == null){
          throw new java.lang.InstantiationException("bean currentPage not found within scope");
        }
      }
      out.write('\n');
      java.lang.String rowPerPage = null;
      synchronized (request) {
        rowPerPage = (java.lang.String) _jspx_page_context.getAttribute("rowPerPage", PageContext.REQUEST_SCOPE);
        if (rowPerPage == null){
          throw new java.lang.InstantiationException("bean rowPerPage not found within scope");
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/hss.web.console/style/fokus_ngni.css\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>");
      if (_jspx_meth_bean_message_0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\">\n");
      out.write("\n");
      out.write("function submitForm(pageId){\n");
      out.write("\tdocument.DSAI_SearchForm.crtPage.value = pageId;\n");
      out.write("\tdocument.DSAI_SearchForm.submit();\n");
      out.write("}\n");
      out.write("\n");
      out.write("function rowsPerPageChanged(){\n");
      out.write("\tdocument.DSAI_SearchForm.crtPage.value = 1;\r\n");
      out.write("\t//document.DSAI_SearchForm.rowsPerPageChanged=true;\n");
      out.write("\tdocument.DSAI_SearchForm.submit();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\r\n");
      out.write("\t<table id=\"title-table\" align=\"center\" weight=\"100%\" >\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t<h1> DSAI Search </h1>\r\n");
      out.write("\t\t\t<br/><br/>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t</table> <!-- title-table -->\r\n");
      out.write("\r\n");
      out.write("\t<table id=\"main-table\" align=\"center\" valign=\"middle\">\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>\n");
      out.write("\t \t\t<table id=\"main-table\" class=\"as\" border=\"0\" cellspacing=\"1\" align=\"center\" style=\"border:2px solid #FF6600;\" width=\"400\">\n");
      out.write("\t\t\t\t<tr class=\"header\">\n");
      out.write("\t\t\t\t\t<td class=\"header\" width=\"50\"> ID </td>\n");
      out.write("\t\t\t\t\t<td class=\"header\"> DSAI-Tag </td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t");

				if (resultList != null && resultList.size() > 0){
					DSAI dsai;
					int idx = 0;
					Iterator it = resultList.iterator();

					while (it.hasNext()){
						dsai = (DSAI) it.next();
				
      out.write("\n");
      out.write("\t\t\t\t\t<tr class=\"");
      out.print( idx % 2 == 0 ? "even" : "odd" );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( dsai.getId() );
      out.write("\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/hss.web.console/DSAI_Load.do?id=");
      out.print( dsai.getId() );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print( dsai.getDsai_tag() );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t");


						idx++;
					} //while
				} // if
				else{
				
      out.write("\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_bean_message_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t");

				}
				
      out.write("\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td colspan=\"3\" class=\"header\">\n");
      out.write("\t\t\t");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("/DSAI_Search");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t<table align=\"center\">\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t");

							int length = Integer.parseInt(maxPages) + 1;
							int cPage = Integer.parseInt(currentPage) + 1;
							for (int iy = 1; iy < length; iy++) {
								if (cPage != iy) {
						
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:submitForm(");
          out.print(String.valueOf(iy));
          out.write(");\">");
          out.print(iy);
          out.write("</a>\n");
          out.write("\t\t\t\t\t\t");

								} else {
						
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t<font style=\"color:#FF0000;font-weight: 600;\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          out.print(String.valueOf(iy));
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t</font>\n");
          out.write("\t\t\t\t\t\t\t\t");
 }
							}
						
          out.write("\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_bean_message_2(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("<br>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_html_hidden_0(_jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property_onchange.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_0.setPageContext(_jspx_page_context);
          _jspx_th_html_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_0.setProperty("rowsPerPage");
          _jspx_th_html_select_0.setOnchange("javascript:rowsPerPageChanged();");
          int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
          if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_0.doInitBody();
            }
            do {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t\t<option value=\"20\"\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              out.print( rowPerPage.equals("20") ? "selected" : "" );
              out.write(" >20 </option>\n");
              out.write("\t\t\t\t\t\t\t\t<option value=\"30\"\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              out.print( rowPerPage.equals("30") ? "selected" : "" );
              out.write(" >30 </option>\n");
              out.write("\t\t\t\t\t\t\t\t<option value=\"50\"\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              out.print( rowPerPage.equals("50") ? "selected" : "" );
              out.write(" >50</option>\n");
              out.write("\t\t\t\t\t\t\t\t<option value=\"100\"\n");
              out.write("\t\t\t\t\t\t\t\t\t");
              out.print( rowPerPage.equals("100") ? "selected" : "" );
              out.write(" >100</option>\n");
              out.write("\t\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_html_select_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_property_onchange.reuse(_jspx_th_html_select_0);
          out.write("\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t</table>\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
      out.write("\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\t</table>\n");
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

  private boolean _jspx_meth_bean_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_0.setParent(null);
    _jspx_th_bean_message_0.setKey("result.title");
    int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
    if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_1 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_1.setParent(null);
    _jspx_th_bean_message_1.setKey("result.emptyResultSet");
    int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
    if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_2 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key_nobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_2.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_message_2.setKey("result.rowsPerPage");
    int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
    if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_2);
    return false;
  }

  private boolean _jspx_meth_html_hidden_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_0 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_html_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_hidden_0.setProperty("crtPage");
    int _jspx_eval_html_hidden_0 = _jspx_th_html_hidden_0.doStartTag();
    if (_jspx_th_html_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_nobody.reuse(_jspx_th_html_hidden_0);
    return false;
  }
}
