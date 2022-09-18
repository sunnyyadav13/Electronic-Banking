
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fund Transfer Page</title>
        <link rel="stylesheet" href="html/style.css">
        <link rel="stylesheet" href="css/custForm.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
    </head>
    <body class="myclassview">
        <h2 align="top">View Customer Profiles</h2>
        <table align="centre" border="3">
        <form action="viewCustomerDBMS.jsp" method="post">
            <tr><td>Select your Choice</td><td><select name="choice">
                <option value="ALL">ALL</option>
                <option value="AccountNo">Account Number</option>
            </select>
                <td><input type="text" name="txt1"></td></tr>
            <tr><td><input type="submit" name="b1" value="View"></td></tr>
        </form>
        </table>
        <%out.println("<br><br> <a  href='admin.jsp'>Back </a>");%>
    </body>
</html>
