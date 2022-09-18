<%@include file="RandomInteger.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fund Transfer Page</title>
        <link rel="stylesheet" href="html/style.css">
        <link rel="stylesheet" href="css/custForm.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
    </head>
    
    <body class="myclassform ">
        
        
        
        <table border="3" class="myclassview">
            <h2> Welcome to Deposit Page </h2>
        
        <form action ="depositDBMS.jsp" method="post">
            
            
                <tr>
                    <td>Account No</td>
                    <td><input type="text" name="accountno" ></td>
                </tr>
                <tr>
                    <td>Reference</td>
                    <td><input type="text" name="ref"></td>
                </tr>
                <tr>
                    <td>Date of Transaction</td>
                    <td><input type="date" name="date"></td>
                </tr>
                <tr>
                    <td>Transaction Id</td>
                    <td><input type="text" name="transId" value="T<%out.println(session.getAttribute("dataid"));%>" readonly></td>
                </tr>
                
                <tr>
                    <td>Deposit Amount</td>
                    <td><input type="text" name="depamount"></td>
                </tr>
                
                
                <tr>
                    <td><input type="submit" name="b1" value="Deposit"></td>
                    <td><input type="reset" name="b2" value="Reset"></td>
                </tr>
        </form>
                
            </table>
                
       <a href="admin.jsp">Back</a>
    </body>
</html>
