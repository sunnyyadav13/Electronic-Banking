package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customerLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("     <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Fund Transfer Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"html/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/form.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
            out.println("Welcome to our Customer Page Dear, "+session.getAttribute("loginname")+"<br>"); 
        
      out.write("\n");
      out.write("        <div class=\"myclass\">\n");
      out.write("        <table >\n");
      out.write("            <tr><td><a href=\"viewProfileDBMS.jsp\">View Profile</a><br></td></tr>\n");
      out.write("            <tr><td><a href=\"viewProfile.jsp\">Update Profile</a><br></td></tr>\n");
      out.write("            <tr><td><a href=\"changePassword.jsp\">Change Password</a><br></td></tr>\n");
      out.write("            <tr><td><a href=\"viewStatement.jsp\">View Statement</a><br></td></tr>\n");
      out.write("            <tr><td><a href=\"fundTransfer.jsp\">Fund Transfer </a><br></td></tr>\n");
      out.write("            <tr><td><a href=\"logout.jsp\">Log out </a><br></td></tr>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <a href=\"viewStatement.jsp\">View Statement</a><br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
