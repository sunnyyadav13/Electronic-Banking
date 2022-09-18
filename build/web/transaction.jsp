
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fund Transfer Page</title>
        <link rel="stylesheet" href="html/style.css">
        <link rel="stylesheet" href="css/custForm.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
    </head>
    <body class="myclassform ">
        
        <table border="2" class="myclassview">
            <h2> Welcome to Transaction View Page </h2>
        <% 
             out.println("<p> Welcome Dear : "+session.getAttribute("loginname")+"</p>");
             out.println("<p>Account Number: "+session.getAttribute("accountno")+"</p>");
         
         %> 
         
         
         <form action="transactiondbms.jsp" method="post">
             Enter Your Choice 
                 <select name="choice">
                 <option value="accno" selected>Account Number</option>
                 <option value="dot">Date of Transaction</option>
                 <option value="transid">Transaction Id</option>
                 <option value="depoamt">Deposit Amount</option>
                 <option value="wtdramt">Withdraw Amount</option>
                 <option value="all">See All</option>
                 </select>
            <input type="text" name="text1"><br>
            <input type="submit" name="b1" value="Submit">
         </form>
         
        </table>
         <a href="admin.jsp">Back</a>
    </body>
</html>
