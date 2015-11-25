package org.apache.jsp.pages.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import de.fhg.fokus.hss.path.TreeNode;
import de.fhg.fokus.hss.web.util.WebConstants;

public final class menu_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"/hss.web.console/style/fokus_ngni.css\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>User Menu Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<table id=\"main\" height=\"100%\">\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td id=\"bound_left\">&nbsp;</td>\n");
      out.write("\t\t<td valign=\"top\" bgcolor=\"#FFFFFF\">\n");
      out.write("\t\t\t<h2> User Identities </h2>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<ul>\n");
      out.write("\n");
      out.write("\t\t\t<!-- IMSU-->\n");
      out.write("\t\t\t<li> <b> IMS Subscription </b> <br>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- link to search IMSU-->\n");
      out.write("\t\t\t<a href=\"imsu_search.jsp?action=search\" target=\"content\"> Search </a> <br>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- link to create IMSU-->\t\t\t\n");
      out.write("\t\t\t");
 if(request.isUserInRole(WebConstants.Security_Permission_ADMIN)) { 
      out.write("\n");
      out.write("\t\t\t\t<a href=\"/hss.web.console/IMSU_Load.do?id=-1\" target=\"content\"> Create </a> <br>\n");
      out.write("\t\t\t");
 } 
      out.write(" <br>\n");
      out.write("\n");
      out.write("\t\t\t<!-- IMPI-->\n");
      out.write("\t\t\t<li> <b> Private Identity </b> <br>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- link to search IMPI-->\n");
      out.write("\t\t\t<a href=\"impi_search.jsp\" target=\"content\"> Search </a> <br>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- link to search IMPI-->\n");
      out.write("\t\t\t");
 if(request.isUserInRole(WebConstants.Security_Permission_ADMIN)) { 
      out.write("\n");
      out.write("\t\t\t\t<a href=\"/hss.web.console/IMPI_Load.do?id=-1\" target=\"content\"> Create </a> <br>\n");
      out.write("\t\t\t");
 } 
      out.write(" <br>\n");
      out.write("\n");
      out.write("\t\t\t<!-- IMPU-->\n");
      out.write("\t\t\t<li> <b> Public User Identity </b> <br>\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- link to search IMPU-->\n");
      out.write("\t\t\t<a href=\"impu_search.jsp\" target=\"content\"> Search </a> <br>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- link to create IMPU -->\n");
      out.write("\t\t\t");
 if(request.isUserInRole(WebConstants.Security_Permission_ADMIN)) { 
      out.write("\n");
      out.write("\t\t\t\t<a href=\"/hss.web.console/IMPU_Load.do?id=-1\" target=\"content\"> Create </a> <br>\n");
      out.write("\t\t\t");
 } 
      out.write(" <br>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</body>");
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
}
