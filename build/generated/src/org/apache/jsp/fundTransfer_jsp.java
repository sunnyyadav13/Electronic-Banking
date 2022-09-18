package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;

public final class fundTransfer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/RandomInteger.jsp");
  }

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
      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");

            Random rand=new Random();
        
            int dataid=rand.nextInt(1000);
            session.setAttribute("dataid", dataid);
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Fund Transfer Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"html/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/form.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 align=\"center\">Fund Transfer</h1>\n");
      out.write("        \n");
      out.write("        ");

        out.println(session.getAttribute("loginname"));
        out.println("   "+session.getAttribute("accountno"));
        
        String accountfrom=(String)session.getAttribute("accountno");
        
        
        
        
      out.write("\n");
      out.write("        <form action =\"fundTransferDBMS.jsp\" method=\"post\" class=\"\">\n");
      out.write("            \n");
      out.write("            <table border=\"5\" >\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Account From</td>\n");
      out.write("                    <td><input type=\"text\" name=\"accountfrom\" value=\"");
 out.println(accountfrom); 
      out.write("\" readonly> </td>   \n");
      out.write("                                                                        ");
 // out.println("value= "+accountfrom+""); 
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Account To</td>\n");
      out.write("                    <td><input type=\"text\" name=\"accountto\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Date</td>\n");
      out.write("                    <td><input type=\"date\" name=\"date\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Transaction Id</td>\n");
      out.write("                    <td><input type=\"text\" name=\"transId\" value=\"T");
out.println(session.getAttribute("dataid"));
      out.write("\" readonly></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Amount</td>\n");
      out.write("                    <td><input type=\"text\" name=\"amount\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" name=\"b1\" value=\"TransferNow\"></td>\n");
      out.write("                    <td><input type=\"reset\" name=\"b2\" value=\"Reset\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("      ");

        out.println("<br><br> <a class=\"myclass\" href='customerLogin.jsp'>Back </a>");
        
      out.write("\n");
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
