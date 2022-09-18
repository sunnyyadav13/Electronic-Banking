<%@include file="DBCON.jsp" %>
<%@include file="html/style.jsp" %>

<html>
    <head>
        <link rel="stylesheet" href="html/style.css">
        <link rel="stylesheet" href="css1/table.scss">
        
    </head>
    
    <body>
        
        
        <%
           
//        out.println("Hi, "+session.getAttribute("loginname")+"<br>");
//        out.println("   Your Account number is :"+session.getAttribute("accountno")+"<br> <br>");
          
        try{
            out.println("<h3 class=' text-center text-primary '> hi, "+session.getAttribute("loginname")+" & Your  Account Number is "+session.getAttribute("accountno")+"..</h3>");
            
            String viewquery="Select * from account where accno='"+session.getAttribute("accountno")+"';";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(viewquery);
            
            while(rs.next()){
                out.println("<div class=\"myclass\"> <table class=\"table table-striped \"  > <thead class=\"thead-dark\">    <tr>      <th scope=\"col\">Account No</th>      <th scope=\"col\">Name</th>      <th scope=\"col\">Gender</th>      <th scope=\"col\">Date of Birth</th>      <th scope=\"col\">Address </th>      <th scope=\"col\">Mobile Number </th>	  <th scope=\"col\">Role </th>	      </tr>  </thead>  <tbody >    <tr>      <th scope=\"row\">"+rs.getString(1)+"</th>      <td>"+rs.getString(2)+"</td>      <td>"+rs.getString(3)+"</td>      <td>"+rs.getString(4)+"</td>	  <td>"+rs.getString(5)+"</td>	  <td>"+rs.getString(6)+"</td>	  <td>"+rs.getString(7)+"</td>    </tr>      </tbody></table></div>");
            }
        }
        catch(Exception e){
            out.println("View Profile Failed !!!"+e);
        }
        
        out.println("<br><br> <a class=\"myclass\" href='customerLogin.jsp'>Back </a>");
        
        %>
    </body>
</html>