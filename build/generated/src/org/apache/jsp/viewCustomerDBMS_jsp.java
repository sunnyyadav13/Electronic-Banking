package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class viewCustomerDBMS_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Connection con ;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/DBCON.jsp");
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

      out.write('\n');
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
        out.println("Connection Succesfull ....");
        }
        catch(Exception e){
            out.println("Connection Failed ..."+e);
        }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <h1> View Customer DBMS Page !</h1>\n");
      out.write("        ");
 
                
            
            try{
                String viewquery="select * from account;";
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
                
                out.println("data not found "+e);
            }
        
        
        
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
