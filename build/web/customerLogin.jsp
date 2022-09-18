
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fund Transfer Page</title>
        <link rel="stylesheet" href="html/style.css">
        <link rel="stylesheet" href="css/form.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
    </head>
    <body >
        <% 
            out.println("Welcome to our Customer Page Dear, "+session.getAttribute("loginname")+"<br>"); 
        %>
        <div class="myclass">
        <table >
            <tr><td><a href="viewProfileDBMS.jsp">View Profile</a><br></td></tr>
            <tr><td><a href="viewProfile.jsp">Update Profile</a><br></td></tr>
            <tr><td><a href="changePassword.jsp">Change Password</a><br></td></tr>
            <tr><td><a href="viewStatement.jsp">View Statement</a><br></td></tr>
            <tr><td><a href="fundTransfer.jsp">Fund Transfer </a><br></td></tr>
            <tr><td><a href="logout.jsp">Log out </a><br></td></tr>
        </table>
        </div>
        
        
        
        
    </body>
</html>
