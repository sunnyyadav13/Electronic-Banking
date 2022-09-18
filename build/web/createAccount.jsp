<%@include file="RandomInteger.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fund Transfer Page</title>
        <link rel="stylesheet" href="html/style.css">
        <link rel="stylesheet" href="css/form.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
    </head>
    
    <body>
        <h2  >Create A new Account for Customer</h2>
        <form action ="createAccountDBMS.jsp" method="post">
            
            <table border="5" >
                <tr>
                    <td>Account Number</td>
                    <td><input type="text" name="accno" value="C<%out.println(session.getAttribute("dataid"));%>" readonly></td>
                </tr>
                <tr>
                    <td>Customer Name</td>
                    <td><input type="text" name="name"></td>
                </tr>
<!--                <tr>
                    <td>Password</td>
                    <td><input type="text" name="password"></td>
                </tr>-->
                <tr>
                    <td>Gender</td>
                    <td><select name="gender">
                            <option>Male</option>
                            <option>Female</option>
                            <option>Other</option>
                        </select></td>
                </tr>
                <tr>
                <tr>
                    <td>Date of Birth</td>
                    <td><input type="date" name="dob"></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><input type="text" name="address"></td>
                </tr>
                <tr>
                    <td>Contact Number</td>
                    <td><input type="text" name="contactno"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="text" name="password"></td>
                </tr>
                <tr>
                    <td>Security Question</td>
                    <td><select name="sques">
                            <option>First Car</option>
                            <option>First Bank</option>
                            <option>First School</option>
                            <option>First Job</option>
                        </select></td>
                </tr>
                <tr>
                    <td>Security Ans</td>
                    <td><input type="text" name="sans"></td>
                </tr>
<!--                <tr>
                    <td>Role</td>
                    <td><input type="text" name="role"></td>
                </tr>-->
<!--                <tr>
                    <td>Account Type</td>
                    <td><input type="text" name="accounttype"></td>
                </tr>-->
                <tr>
                    <td><input type="submit" name="b1" value="Create"></td>
                    <td><input type="reset" name="b2" value="Reset"></td>
                </tr>
            </table>
        </form>
        
       <%
        out.println("<br><br> <a class=\"myclass\" href='customerLogin.jsp'>Back </a>");
        %> 
    </body>
</html>
