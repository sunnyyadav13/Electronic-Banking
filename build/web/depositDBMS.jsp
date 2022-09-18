<%@include file="RandomInteger.jsp" %>
<%@include file="DBCON.jsp" %>
<%@page import="com.CurrencyWords" %>

<html>
    
    <body>
        
        
        <%
                
                String accountno=request.getParameter("accountno");
                String reference=request.getParameter("ref");
                String dot=request.getParameter("date");
                String transid=request.getParameter("transId");
                String depamount=request.getParameter("depamount");
                
                
                
                
                
//                out.println(accountno);
//                out.println(reference);
//                out.println(dot);
//                out.println(transid);
//                out.println(depamount);
                
                try{
                    
                    String FetchQuery="Select netbal from transactionbank;";
                    
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery(FetchQuery);
                    int lastbal=0;
                    while(rs.next()){
                        lastbal=rs.getInt(1);
                    }
                    
                    String newAccInsertQuery="insert into transactionbank values(?,?,?,?,?,?,?);";
                    
                    PreparedStatement pst=con.prepareStatement(newAccInsertQuery);
                    
                    pst.setString(1, accountno);
                    pst.setString(2, reference);
                    pst.setString(3, dot);
                    pst.setString(4, transid);
                    pst.setInt(5, Integer.parseInt(depamount));
                    pst.setInt(6, 0);
                    pst.setInt(7,lastbal+Integer.parseInt(depamount));
                    
                    
                    pst.executeUpdate();
                    
//                    out.println("Amount Deposited Succesfully in Bank side Account table ...");
                    
                    
                    
                    //------------------------------
                    
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
                    pst2.setInt(5, Integer.parseInt(depamount));
                    pst2.setInt(6, 0);
                    int temp2=lastbal2+Integer.parseInt(depamount);
                    pst2.setInt(7,temp2);
                    
                    pst2.executeUpdate();
                    
//                    out.println("Amount Deposited Succesfully in Customer side Account table ...");
                    
                    out.println("<html>"
                            + "<body>"
                            +"Welcome Your Account No is "+accountno+" and here is your Deposit Receipt"
                            +"<table border='4' align='center'>"
            +"<tr>"
            +   "<th>Account Number</th>"
            +   "<td >"+accountno+"</td>"
            +"</tr>"               
            +    "<th>Reference</th>"
            +    "<td >"+reference+"</td>"       
            +"</tr>"
            +    "<th>Date of Transaction</th>"
            +    "<td >"+dot+"</td>"               
            +"</tr>"
            +    "<th>Transaction Id</th>"
            +    "<td >"+transid+"</td>"                
            +"</tr>"
            +    "<th>Deposit Amount</th>"
            +    "<td >"+Integer.parseInt(depamount)+"</td>"               
            +"</tr>"
            +    "<th>Withdrawl Amount</th>"
            +    "<td >"+0+"</td>"               
            +"</tr>"
            +    "<th>Net Balance in Customer Account</th>"
            +    "<td >"+temp2+"</td>"              
            +"</tr>"
            +    "<th> Amount Deposit(In Words)</th>"
            +    "<td>"+CurrencyWords.convert(Integer.parseInt(depamount))+"</td>"
            +"</tr>"
            
        +"</table>"
        +"<input type=button value=Print onclick=window.print()>"
                            
                            + "</body>"
                            + "</html>");
                    
                    
//            RequestDispatcher dis=request.getRequestDispatcher("Printjsp.jsp");
//            dis.include(request, response);
            
                
                }
                catch(Exception e){
                    out.println("amount Deposit Failed !! "+e);
                }
                
        
        %>
        
        
    </body>
</html>
