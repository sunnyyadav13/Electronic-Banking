package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class viewProfileDBMS_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Connection con ;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/DBCON.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

        try{
        Class.forName("com.mysql.jdbc.Driver");
        String connectionURL="jdbc:mysql://localhost:3306/soprabanking";
        String dbUser="root";
        String dbPassword="root";
        con=DriverManager.getConnection(connectionURL,dbUser,dbPassword);
//        out.println("Connection Succesfull ....");
        }
        catch(Exception e){
            out.println("Connection Failed ..."+e);
        }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\n');
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
      out.write("    <body>\n");
      out.write("        <h1>View Profile DBMS !!</h1>\n");
      out.write("        \n");
      out.write("        ");

           
//        out.println("Hi, "+session.getAttribute("loginname")+"<br>");
//        out.println("   Your Account number is :"+session.getAttribute("accountno")+"<br> <br>");
          
        try{
            out.println("<h3 class=' text-center text-primary '> hi this is "+session.getAttribute("loginname")+" & Account Number is "+session.getAttribute("accountno")+"..</h3>");
            out.println("<table class=\"table\">  <thead class=\"thead-dark\">    <tr>      <th scope=\"col\">#</th>      <th scope=\"col\">First</th>      <th scope=\"col\">Last</th>      <th scope=\"col\">Handle</th>    </tr>  </thead>  <tbody>    <tr>      <th scope=\"row\">1</th>      <td>Mark</td>      <td>Otto</td>      <td>@mdo</td>    </tr>    <tr>      <th scope=\"row\">2</th>      <td>Jacob</td>      <td>Thornton</td>      <td>@fat</td>    </tr>    <tr>      <th scope=\"row\">3</th>      <td>Larry</td>      <td>the Bird</td>      <td>@twitter</td>    </tr>  </tbody></table><table class=\"table\">  <thead class=\"thead-light\">    <tr>      <th scope=\"col\">#</th>      <th scope=\"col\">First</th>      <th scope=\"col\">Last</th>      <th scope=\"col\">Handle</th>    </tr>  </thead>  <tbody>    <tr>      <th scope=\"row\">1</th>      <td>Mark</td>      <td>Otto</td>      <td>@mdo</td>    </tr>    <tr>      <th scope=\"row\">2</th>      <td>Jacob</td>      <td>Thornton</td>      <td>@fat</td>    </tr>    <tr>      <th scope=\"row\">3</th>      <td>Larry</td>      <td>the Bird</td>      <td>@twitter</td>    </tr>  </tbody></table>");
            
            String viewquery="Select * from account where accno='"+session.getAttribute("accountno")+"';";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(viewquery);
            
            while(rs.next()){
                    out.println(" "+rs.getString(1));
                    out.println(" ||"+rs.getString(2));
                    out.println(" ||"+rs.getString(3));
                    out.println(" ||"+rs.getString(4));
                    out.println(" ||"+rs.getString(5));
                    out.println(" ||"+rs.getInt(6));
                    out.println(" ||"+rs.getString(7));
                    out.println(" ||"+rs.getString(8));
                    out.println(" ||"+rs.getString(9));
                    out.println(" ||"+rs.getString(10));
                    out.println(" <br>");
            }
        }
        catch(Exception e){
            out.println("View Profile Failed !!!"+e);
        }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
