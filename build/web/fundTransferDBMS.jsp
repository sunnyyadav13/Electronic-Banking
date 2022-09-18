
<%@include file="DBCON.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fund Transfer DBMS Page</title>
        <link rel="stylesheet" href="css/failedSuccess.css">
    </head>
    <body>
        
        
        
        <%
                out.println(session.getAttribute("loginname"));
                out.println("   "+session.getAttribute("accountno"));
                
//                String accountfrom=request.getParameter("accountfrom");
                String accountfrom=(String)session.getAttribute("accountno");
                String accountto=request.getParameter("accountto");
                String transId=request.getParameter("transId");
                String date=request.getParameter("date");
                String amount=request.getParameter("amount");
                
                
//                out.println(transId);
//                out.println(accountto);
//                out.println(accountfrom);
//                out.println(date);
//                out.println(amount);
                
                try{
                    
                    String FetchQuery="Select netbal from "+accountfrom+";";
                    
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery(FetchQuery);
                    int lastbal=0;
                    while(rs.next()){
                        lastbal=rs.getInt(1);
                    }
                    
                    
                    if(lastbal >= Integer.parseInt(amount)){
                    
                    String newAccInsertQuery="insert into "+accountfrom+" values(?,?,?,?,?,?,?);";
                    
                    PreparedStatement pst=con.prepareStatement(newAccInsertQuery);
                    
                    pst.setString(1, accountfrom);
                    pst.setString(2, accountto);
                    pst.setString(3, date);
                    pst.setString(4, transId);
                    pst.setInt(5, 0);
                    pst.setInt(6, Integer.parseInt(amount));
                    pst.setInt(7,lastbal-Integer.parseInt(amount));
                    
                    pst.executeUpdate();
                    
                    out.println("Amount transfer Succsessfull from Accountfrom  table ...<br>");
                    
                    //--------------------------
                    String FetchQuery2="Select netbal from "+accountto+";";
                    
                    Statement st2=con.createStatement();
                    ResultSet rs2=st.executeQuery(FetchQuery2);
                    int lastbal2=0;
                    while(rs2.next()){
                        lastbal2=rs2.getInt(1);
                    }
                    String newAccInsertQuery2="insert into "+accountto+" values(?,?,?,?,?,?,?);";
                    
                    PreparedStatement pst2=con.prepareStatement(newAccInsertQuery2);
                    
                    pst2.setString(1, accountto);
                    pst2.setString(2, accountfrom);
                    pst2.setString(3, date);
                    pst2.setString(4, transId);
                    pst2.setInt(5, Integer.parseInt(amount));
                    pst2.setInt(6, 0);
                    pst2.setInt(7,lastbal2+Integer.parseInt(amount));
                    
                    pst2.executeUpdate();
                    
                    out.println("Amount transfer Succsessfull from Accountto  table ...<br>");
                    }
                    else{
                        out.println("Balance Insufficient !!<br>");
                    }
  
                
                }
                catch(Exception e){
                    out.println("amount Withdraw Failed !! "+e);
                }
                
        
        %>
        
        
    </body>
</html>
