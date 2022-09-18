
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fund Transfer Page</title>
        <link rel="stylesheet" href="html/style.css">
        <link rel="stylesheet" href="css/form.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
    </head>
    <body>
        <% 
            out.println("Welcome Admin : "+session.getAttribute("loginname")+"<br>"); 
        %>
        
        <div class="myclass">
        <table>
            <tr><td><a href="createAccount.jsp">New Account</a><br></td></tr>
            <tr><td><a href="viewCustomer.jsp">View Customer's</a><br></td></tr>
            <tr><td><a href="viewStatement.jsp">View Statement</a><br></td></tr>
            <tr><td><a href="deposit.jsp">Deposit </a><br></td></tr>
            <tr><td><a href="withdraw.jsp">Withdraw</a><br></td></tr>
            <tr><td><a href="transaction.jsp">View Transaction</a><br></td></tr>
            <tr><td><a href="login.jsp">login Page</a><br></td></tr>
        </table>
        </div>
    </body>
</html>
