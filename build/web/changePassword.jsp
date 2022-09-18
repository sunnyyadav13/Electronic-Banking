

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fund Transfer Page</title>
        <link rel="stylesheet" href="html/style.css">
        <link rel="stylesheet" href="css/custForm.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
    </head>
    <body>
        <h1>change Password Page</h1>
        <div class="myclass">
        Welcome Dear:
        <%
        
        out.println(session.getAttribute("loginname"));
        out.println("   "+session.getAttribute("accountno"));
        
        %>
        
        <table>
        <form action="changePasswordCheck.jsp" method="post" class="myclassform">
            <tr><td>Enter old password</td> <td> <input type="text" name="oldpass"></td><br>
            <tr><td>Enter New password </td> <td><input type="text" name="newpass"></td><br>
            <tr><td>Confirm password </td> <td><input type="text" name="cnpass"></td><br>
            <tr><td><input type="submit" name="b1" value="Change Password"></td></tr>
        </form>
         
        </table>
        <%
        out.println("<br><br> <a class=\"myclass\" href='customerLogin.jsp'>Back </a>");
        %> 
        </div>
    </body>
</html>
