package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class viewProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        ");
  
        out.println(session.getAttribute("loginname")+"<br>");
        out.println("   "+session.getAttribute("accountno")+"<br><br>");
        
      out.write("\n");
      out.write("        <h1>View Update Profile Page !!</h1>\n");
      out.write("        <form action=\"viewProfileUpdate.jsp\" method=\"post\">\n");
      out.write("<!--        <select name=\"choice\">\n");
      out.write("            <option value=\"name\">name</option>\n");
      out.write("            <option value=\"add\">address</option>\n");
      out.write("            <option value=\"mob\">mobile</option>\n");
      out.write("            <option value=\"sques\">security Question</option>\n");
      out.write("            <option value=\"sans\">security Answer</option>\n");
      out.write("            <option value=\"gender\">Gender</option>\n");
      out.write("            <option value=\"dob\">dob</option>\n");
      out.write("        </select>-->\n");
      out.write("        \n");
      out.write("        ");
      
        String query="Select * from account where accno='"+session.getAttribute("accountno")+"';";  
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        
        String accno="";
        String name="";
        String gender="";
        String dob="";
        String address="";
        int mob=0;
        String sques="";
        String sans="";
        
        while(rs.next()){
            accno=rs.getString(1);
            name=rs.getString(2);
            gender=rs.getString(3);
            dob=rs.getString(4);
            address=rs.getString(5);
            mob=rs.getInt(6);
            sques=rs.getString(9);
            sans=rs.getString(10);
            
            
        }

        
      out.write("\n");
      out.write("            \n");
      out.write("            <table border=\"5\" bgcolor=\"cyan\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Account Number</td>\n");
      out.write("                    <td><input type=\"text\" name=\"accno\" value=\"");
 out.println( accno); 
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Customer Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\" value=\"");
 out.println(name); 
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Gender</td>\n");
      out.write("                    <td><select name=\"gender\">\n");
      out.write("                            <option value=\"Male\">Male</option>\n");
      out.write("                            <option value=\"Female\">Female</option>\n");
      out.write("                            <option value=\"Other\">Other</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Date of Birth</td>\n");
      out.write("                    <td><input type=\"date\" name=\"dob\" value=\"");
 out.println(dob); 
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Address</td>\n");
      out.write("                    <td><input type=\"text\" name=\"address\" value=\"");
 out.println(address); 
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Contact Number</td>\n");
      out.write("                    <td><input type=\"text\" name=\"contactno\" value=\"");
 out.println(mob); 
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Security Question</td>\n");
      out.write("                    <td><select name=\"sques\" value=\"");
 out.println(sques); 
      out.write(">\n");
      out.write("                            <option value=\"First Car\">First Car</option>\n");
      out.write("                            <option value=\"First Bank\">First Bank</option>\n");
      out.write("                            <option value=\"First School\">First School</option>\n");
      out.write("                            <option value=\"First Job\">First Job</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Security Ans</td>\n");
      out.write("                    <td><input type=\"text\" name=\"sans\" value=\"");
 out.println(sans); 
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"reset\" name=\"b2\" value=\"Reset\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        \n");
      out.write("        <input type=\"submit\" name=\"b1\" value=\"Update\">\n");
      out.write("    </form>\n");
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
