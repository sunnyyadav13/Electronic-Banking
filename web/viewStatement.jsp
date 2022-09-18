
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fund Transfer Page</title>
        <link rel="stylesheet" href="html/style.css">
        <link rel="stylesheet" href="css/welcome.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
    </head>
    <body>
        
         <% 
             out.println("Welcome Dear : "+session.getAttribute("loginname")+"<br>");
             out.println("<br> Your Account Number is :"+session.getAttribute("accountno")+"<br><br>");
         
         %> 
         <div>
             <table style="margin-left: 40% ">
         <form action="viewStatementDBMS.jsp" method="post">
             <tr><td>Enter Customer Account no </td><td><input type="text" name="accno" ></td></tr><br>
             <tr><td><input type="submit" name="b1" value="Submit"></td></tr>
             <tr><td> <a href=""> </a></td></tr>
         </form>
             </table>
             <a href="customerLogin.jsp"> <-- Back </a>
          
         </div>
    </body>
</html>
