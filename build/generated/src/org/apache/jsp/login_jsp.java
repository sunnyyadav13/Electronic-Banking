package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/html/style.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <title>Bank</title>\n");
      out.write("    \n");
      out.write("  \n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      \n");
      out.write("    <h1></h1>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"html/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"yellow \">\n");
      out.write("        <h1 align=\"center\" > welcome To XYZ Bank</h1>\n");
      out.write("        <section class=\"vh-100\">\n");
      out.write("            \n");
      out.write("            <div class=\"container-fluid h-custom\">\n");
      out.write("            <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("                <div class=\"col-md-9 col-lg-6 col-xl-5\">\n");
      out.write("                        <img src=\"https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp\"\n");
      out.write("                            class=\"img-fluid\" alt=\"Sample image\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("      <div class=\"col-md-8 col-lg-6 col-xl-4 offset-xl-1\">\n");
      out.write("          \n");
      out.write("          \n");
      out.write("      <form action=\"check.jsp\" method=\"post\">\n");
      out.write("            \n");
      out.write("          \n");
      out.write("        <select class=\"form-select\" aria-label=\"Default select example\" name=\"role\">\n");
      out.write("                        <option selected>Choose Your Role</option>\n");
      out.write("                        <option >Admin</option>\n");
      out.write("                        <option >Customer</option>\n");
      out.write("                        \n");
      out.write("        </select>\n");
      out.write("        \n");
      out.write("          <!-- Email input -->\n");
      out.write("          <div class=\"form-outline mb-4\">\n");
      out.write("            <br>\n");
      out.write("            <label class=\"form-label\" for=\"form3Example3\">Account Number</label>\n");
      out.write("            <input type=\"text\" id=\"form3Example3\" class=\"form-control form-control-lg\"\n");
      out.write("              placeholder=\"Enter a valid Account Number\" name=\"accountno\"/>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <!-- Password input -->\n");
      out.write("          <div class=\"form-outline mb-3\">\n");
      out.write("            <label class=\"form-label\" for=\"form3Example4\">Password</label>\n");
      out.write("            <input type=\"password\" id=\"form3Example4\" class=\"form-control form-control-lg\"\n");
      out.write("              placeholder=\"Enter password\" name=\"password\"/>\n");
      out.write("          </div>\n");
      out.write("           ");

                    StringBuffer sb = new StringBuffer();
                    for (int i = 1; i <= 5; i++) {
                        sb.append((char) (int) (Math.random() * 79 + 23 + 7));
                    }
                    String cap = new String(sb);
                    session.setAttribute("cap_passed", cap);
                
      out.write(" \n");
      out.write("          \n");
      out.write("          <div class=\"form-outline mb-3\">\n");
      out.write("            <label class=\"form-label\" for=\"form3Example4\">Enter Captcha</label>\n");
      out.write("            <input type=\"text\"  class=\"form-control form-control-lg\"\n");
      out.write("              placeholder=\"Enter Captcha\" name=\"cap1\"/>\n");
      out.write("            <div style=\"background-color: white\"><h2><s><i><font face=\"TIMES NEW ROMAN\">");
      out.print(cap);
      out.write("</font></i></s></h2></div>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("\n");
      out.write("          <div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("          <!-- Button -->\n");
      out.write("          <div class=\"text-center text-lg-start mt-4 pt-2\">\n");
      out.write("            <input type=\"submit\" class=\"btn btn-primary btn-lg\"\n");
      out.write("              style=\"padding-left: 2.5rem; padding-right: 2.5rem;\" value=\"Login\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("        </form>\n");
      out.write("          <button  class=\"btn btn-primary btn-lg\"\n");
      out.write("                     style=\"padding-left: 2.5rem; padding-right: 2.5rem;\" value=\"Forget Password\" onclick=\"location.href='forgetPassword.jsp'\">Forget Password</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("<!--        <form action=\"check.jsp\" method=\"post\" align=\"center\">\n");
      out.write("            Select Role <select name=\"role\">\n");
      out.write("                                    <option >Admin</option>\n");
      out.write("                                    <option>Customer</option>\n");
      out.write("            </select><br>\n");
      out.write("            Enter Account Number <input type=\"text\" name=\"accountno\"><br>\n");
      out.write("            Enter Password <input type=\"text\" name=\"password\"><br>\n");
      out.write("            <input type=\"submit\" name=\"b1\"value=\"Login\">\n");
      out.write("            <input type=\"reset\" name=\"b2\" value=\"Reset\">\n");
      out.write("        </form>-->\n");
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
