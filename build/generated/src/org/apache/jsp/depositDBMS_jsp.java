package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;
import java.sql.*;

public final class depositDBMS_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Connection con ;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/RandomInteger.jsp");
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
//        out.println("Connection Succesfull ....");
        }
        catch(Exception e){
            out.println("Connection Failed ..."+e);
        }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

                
                String accountno=request.getParameter("accountno");
                String reference=request.getParameter("ref");
                String dot=request.getParameter("date");
                String transid=request.getParameter("transId");
                String depamount=request.getParameter("depamount");
                
                
                
                
//                out.println(accountno);
//                out.println(reference);
//                out.println(dot);
//                out.println(transid);
//                out.println(depamount);
                
                try{
                    
                    String FetchQuery="Select netbal from transactionbank;";
                    
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery(FetchQuery);
                    int lastbal=0;
                    while(rs.next()){
                        lastbal=rs.getInt(1);
                    }
                    
                    String newAccInsertQuery="insert into transactionbank values(?,?,?,?,?,?,?);";
                    
                    PreparedStatement pst=con.prepareStatement(newAccInsertQuery);
                    
                    pst.setString(1, accountno);
                    pst.setString(2, reference);
                    pst.setString(3, dot);
                    pst.setString(4, transid);
                    pst.setInt(5, Integer.parseInt(depamount));
                    pst.setInt(6, 0);
                    pst.setInt(7,lastbal+Integer.parseInt(depamount));
                    
                    
                    pst.executeUpdate();
                    
//                    out.println("Amount Deposited Succesfully in Bank side Account table ...");
                    
                    
                    
                    //------------------------------
                    
                    String FetchQuery2="Select netbal from "+accountno+";";
                    
                    Statement st2=con.createStatement();
                    ResultSet rs2=st.executeQuery(FetchQuery2);
                    int lastbal2=0;
                    while(rs2.next()){
                        lastbal2=rs2.getInt(1);
                    }
                    String newAccInsertQuery2="insert into "+accountno+" values(?,?,?,?,?,?,?);";
                    
                    PreparedStatement pst2=con.prepareStatement(newAccInsertQuery2);
                    
                    pst2.setString(1, accountno);
                    pst2.setString(2, reference);
                    pst2.setString(3, dot);
                    pst2.setString(4, transid);
                    pst2.setInt(5, Integer.parseInt(depamount));
                    pst2.setInt(6, 0);
                    pst2.setInt(7,lastbal2+Integer.parseInt(depamount));
                    
                    pst2.executeUpdate();
                    
//                    out.println("Amount Deposited Succesfully in Customer side Account table ...");
                    
                    out.println("<html>"
                            + "<body>"
                            +"Welcome Your Account No is"+accountno+" and here is your Deposit Receipt"
                            +"<table border='4' align='center'>"
            +"<tr>"
            +   "<th>Account Number</th>"
            +    "<th>Reference</th>"
            +    "<th>Date of Transaction</th>"
            +    "<th>Transaction Id</th>"
            +    "<th>Deposit Amount</th>"
            +    "<th>Withdrawl Amount</th>"
            +    "<th>Net Balance in Customer Account</th>"
            +"</tr>"
            +"<tr>"
            +   "<td ></td>"
            +    "<td ></td>"
            +    "<td ></td>"
            +    "<td ></td>"
            +    "<td ></td>"
            +    "<td ></td>"
            +    "<td ></td>"
            +"</tr>"
        +"</table>"
                            + "</body>"
                            + "</html>");
                    
                    
            RequestDispatcher dis=request.getRequestDispatcher("Printjsp.jsp");
            dis.include(request, response);
            
                
                }
                catch(Exception e){
                    out.println("amount Deposit Failed !! "+e);
                }
                
        
        
      out.write("\n");
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
