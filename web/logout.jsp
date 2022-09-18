
<html>
    
    <body>
        <h1>Logout Page Successfull</h1>
        <%
        session.invalidate();
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", "0");
        
        response.sendRedirect("login.jsp");
        
        %>
        
<!--        <a href="login.jsp">Back to Login</a>-->
    </body>
</html>
