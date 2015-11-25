package org.apache.jsp.pages.info;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import de.fhg.fokus.hss.web.util.LoggerHelper;

public final class logging_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	// This jsp access hibernate directly to collect
	// information about the hss data content.
	String loglevel = "";
	if(request.getParameter("clear") != null){
		LoggerHelper.clear();
	}
	if(request.getParameter("off") != null){
		LoggerHelper.off();
	}
	loglevel= request.getParameter("start");
	if (loglevel != null){
		if(loglevel.equals("info"))
		{
	    	LoggerHelper.STATUS=true;
		    LoggerHelper.loglevel="info";
		    LoggerHelper.init();
		}else{
		    LoggerHelper.STATUS=true;
		    LoggerHelper.loglevel="debug";
		    LoggerHelper.init();
		}
	}

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"/hss.web.console/style/fokus_ngni.css\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Info Page</title>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#FFFFFF\">\n");
      out.write("<table id=\"main\" height=\"100%\">\n");
      out.write("\t<tr id=\"bound_bottom_black\">\n");
      out.write("\t\t<td valign=\"top\" bgcolor=\"#FFFFFF\">\n");
      out.write("\t\t<table class=\"as\" width=\"100%\" height=\"100%\" border=\"0\">\n");
      out.write("\t\t\t<tr class=\"header\">\n");
      out.write("\t\t\t\t<td height=\"10px\">\n");
      out.write("\t\t\t\t\tLogging\n");
      out.write("\t\t\t\t\t<a href=\"logging.jsp\" target=\"content\">[REFRESH]</a>\n");
      out.write("\t\t\t\t\t<a href=\"logging.jsp?clear=true\" target=\"content\">[CLEAR]</a>\n");
      out.write("\t\t\t\t\t");
 if(LoggerHelper.STATUS == true) { 
      out.write("\n");
      out.write("\t\t\t\t\t\t<a href=\"logging.jsp?off=true\" target=\"content\">[TURN OFF]</a>\n");
      out.write("\t\t\t\t\t");
 } else { 
      out.write("\n");
      out.write("\t\t\t\t\t\t<a href=\"logging.jsp?start=debug\" target=\"content\">[TURN ON - DEBUG]</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"logging.jsp?start=info\" target=\"content\">[TURN ON - INFO]</a>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr class=\"formular\">\n");
      out.write("\t\t\t    <td><textarea style=\"width:100%;height:100%;wrap:hard\">");
      out.print(LoggerHelper.BUFFER.getBuffer().toString());
      out.write("</textarea></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\t\t\t\t\n");
      out.write("</body>\n");
      out.write("</html>");
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
