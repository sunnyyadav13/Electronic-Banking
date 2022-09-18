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
        
        
        <h1 align="center">Fund Transfer</h1>
        
         <%
         
        out.println("Hi, "+session.getAttribute("loginname")+"<br>");
        out.println("<br>Your Account Number is :"+session.getAttribute("accountno"));
        
        String accountfrom=(String)session.getAttribute("accountno");
        
        
        
        
        
        %>
        
        <form action ="fundTransferDBMS.jsp" method="post" >
           
            <table border="5" >
                
                <tr>
                    <td>Account From</td>
                    <td><input type="text" name="accountfrom" value="<% out.println(accountfrom); %>" readonly> </td>   
                                                                        <% // out.println("value= "+accountfrom+""); %>
                </tr>
                <tr>
                    <td>Account To</td>
                    <td><input type="text" name="accountto"></td>
                </tr>
                <tr>
                    <td>Date</td>
                    <td><input type="date" name="date"></td>
                </tr>
                <tr>
                    <td>Transaction Id</td>
                    <td><input type="text" name="transId" value="T<%out.println(session.getAttribute("dataid"));%>" readonly></td>
                </tr>
                <tr>
                    <td>Amount</td>
                    <td><input type="text" name="amount"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="b1" value="TransferNow"></td>
                    <td><input type="reset" name="b2" value="Reset"></td>
                </tr>
            </table>
                
        </form>
                <a href="admin.jsp">Back </a>    
           
    </body>
</html>
