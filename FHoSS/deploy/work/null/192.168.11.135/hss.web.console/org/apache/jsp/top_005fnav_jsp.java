package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class top_005fnav_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key_nobody;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_message_key_nobody.release();
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style/fokus_ngni.css\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Navigation</title>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#FDDE96\">\n");
      out.write("<table id=\"navigation\" height=\"100%\">\n");
      out.write("\t<tr id=\"bound_bottom\">\n");
      out.write("\t\t<td id=\"bound_left\">&nbsp;</td>\n");
      out.write("\t\t<td><a href=\"http://www.fokus.fraunhofer.de/home/\" target=\"_blank\"><img\n");
      out.write("\t\t\tsrc=\"images/hauptlogo_01_en.gif\" /></a> <br>\n");
      out.write("\t\t</td>\n");
      out.write("\t\t<td><img src=\"images/blind.gif\" height=\"73\" width=\"575\" /></td>\n");
      out.write("\t\t<td><a\n");
      out.write("\t\t\thref=\"http://www.fokus.fraunhofer.de/fokus/branchen-loesungen/testlabs/hauptseite_testbeds.php?lang=en\" target=\"_blank\"><img\n");
      out.write("\t\t\tsrc=\"images/hauptlogo_02_en.gif\" /></a>\n");
      out.write("\t\t</td>\n");
      out.write("\t\t<td id=\"bound_right\">&nbsp;</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr height=\"30\" bgcolor=\"#FFFFFF\" >\n");
      out.write("\t\t<td id=\"bound_left\">&nbsp;</td>\n");
      out.write("\t\t<td colspan=\"3\" id=\"header\">\n");
      out.write("\t\t\t");
      if (_jspx_meth_bean_message_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</td>\n");
      out.write("\t\t<td id=\"bound_right\">&nbsp;</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr id=\"bound_bottom\">\n");
      out.write("\t\t<td id=\"bound_left\">&nbsp;</td>\n");
      out.write("\t\t<td colspan=\"3\">&nbsp;</td>\n");
      out.write("\t\t<td id=\"bound_right\">&nbsp;</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr id=\"bound_bottom\">\n");
      out.write("\t\t<td id=\"bound_left\">&nbsp;</td>\n");
      out.write("\t\t<td id=\"level01\" colspan=\"2\">\n");
      out.write("\t\t\t<a href=\"index.jsp\" target=\"_top\">Home</a>\n");
      out.write("\t\t\t<a href=\"pages/user\" target=\"main\">User Identities</a>\n");
      out.write("\t\t\t<a href=\"pages/services\" target=\"main\">Services</a>\t\t\t\n");
      out.write("\t\t\t<a href=\"pages/network\" target=\"main\">Network Configuration</a>\n");
      out.write("\t\t\t<a href=\"pages/info\" target=\"main\">Statistics</a>\n");
      out.write("\t\t</td>\n");
      out.write("\t\t<td id=\"language\"><a href=\"javascript:alert('Try again later!');\">help</a></td>\n");
      out.write("\t\t<td id=\"bound_right\">&nbsp;</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr id=\"bound_bottom_black\" bgcolor=\"#EB9015\" >\n");
      out.write("\t\t<td id=\"bound_left\">&nbsp;</td>\n");
      out.write("\t\t<td id=\"level02\" colspan=\"3\">&nbsp;</td>\n");
      out.write("\t\t<td id=\"bound_right\">&nbsp;</td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
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
    _jspx_th_bean_message_0.setKey("hss.title");
    int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
    if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key_nobody.reuse(_jspx_th_bean_message_0);
    return false;
  }
}
