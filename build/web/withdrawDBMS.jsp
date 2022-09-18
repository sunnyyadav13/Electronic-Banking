
<%@include file="DBCON.jsp" %>
<html>
    
    <body>
        <h1>Withdraw DBMS </h1>
        
        <%
                String accountno=request.getParameter("accountno");
                String reference=request.getParameter("ref");
                String dot=request.getParameter("date");
                String transid=request.getParameter("transId");
                String withdrawamount=request.getParameter("amount");
                
                
//                out.println(accountno);
//                out.println(reference);
//                out.println(dot);
//                out.println(transid);
//                out.println(withdrawamount);
                
                try{
                    
                    String FetchQuery="Select netbal from transactionbank;";
                    
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery(FetchQuery);
                    int lastbal=0;
                    while(rs.next()){
                        lastbal=rs.getInt(1);
                    }
                    
                    
                    if(lastbal >= Integer.parseInt(withdrawamount)){
                    
                    String newAccInsertQuery="insert into transactionbank values(?,?,?,?,?,?,?);";
                    
                    PreparedStatement pst=con.prepareStatement(newAccInsertQuery);
                    
                    pst.setString(1, accountno);
                    pst.setString(2, reference);
                    pst.setString(3, dot);
                    pst.setString(4, transid);
                    pst.setInt(5, 0);
                    pst.setInt(6, Integer.parseInt(withdrawamount));
                    pst.setInt(7,lastbal-Integer.parseInt(withdrawamount));
                    
                    pst.executeUpdate();
                    
//                    out.println("Amount Withdraw Succesfully from Bank side Table ...");
                    
                    String FetchQuery2="Select netbal from "+accountno+";";
                    
                    Statement st2=con.createStatement();
                    ResultSet rs2=st.executeQuery(FetchQuery2);
                    int lastbal2=0;
                    while(rs2.next()){
                        lastbal2=rs2.getInt(1);
                    }
                    String newAccInsertQuery2="insert into "+accountno+" values(?,?,?,?,?,?,?);";
                    
                    PreparedStatement pst2=con.prepareStatement(newAccInsertQuery2);
                    
                    pst2.setString(1, accountno);
                    pst2.setString(2, reference);
                    pst2.setString(3, dot);
                    pst2.setString(4, transid);
                    pst2.setInt(5, 0);
                    pst2.setInt(6, Integer.parseInt(withdrawamount));
                    int temp2=lastbal2-Integer.parseInt(withdrawamount);
                    pst2.setInt(7,temp2);
                    
                    pst2.executeUpdate();
                    
                    out.println("<html>"
                            + "<body>"
                            +"Welcome Your Account No is "+accountno+" and here is your Withdraw Receipt"
                            +"<table border='4' align='center'>"
            +"<tr>"
            +   "<th>Account Number</th>"
            +    "<th>Reference</th>"
            +    "<th>Date of Transaction</th>"
            +    "<th>Transaction Id</th>"
            +    "<th>Deposit Amount</th>"
            +    "<th>Withdrawl Amount</th>"
            +    "<th>Net Balance in Customer Account</th>"
            +"</tr>"
            +"<tr>"
            +   "<td >"+accountno+"</td>"
            +    "<td >"+reference+"</td>"
            +    "<td >"+dot+"</td>"
            +    "<td >"+transid+"</td>"
            +    "<td >"+0+"</td>"
            +    "<td >"+Integer.parseInt(withdrawamount)+"</td>"
            +    "<td >"+temp2+"</td>"
            +"</tr>"
        +"</table>"
        +"<input type=button value=Print onclick=window.print()>"
                            
                            + "</body>"
                            + "</html>");
                    
//                    out.println("Amount Withdraw Succesfully in Customer side Account table ...");
                    }
                    else{
                        out.println("Balance Insufficient !!");
                    }
                    //-------------------------------------------
                    
                    
                    
                
                }
                catch(Exception e){
                    out.println("amount Withdraw Failed !! "+e);
                }
                
                
        
        %>
        
        
    </body>
</html>
