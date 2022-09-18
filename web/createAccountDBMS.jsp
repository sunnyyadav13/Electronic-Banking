<%@include file="DBCON.jsp" %>

<html>
    
    <body>
        <h1>Create Account DBMS </h1>
        
        <%
                String accno=request.getParameter("accno");
                String name=request.getParameter("name");
                String gender=request.getParameter("gender");
                String dob=request.getParameter("dob");
                String address=request.getParameter("address");
                String contactno=request.getParameter("contactno");
                String password=request.getParameter("password");
                String sques=request.getParameter("sques");
                String sans=request.getParameter("sans");
                
                
//                String role=request.getParameter("role");
                
//                out.println(accno);
//                out.println(name);
//                out.println(gender);
//                out.println(dob);
//                out.println(address);
//                out.println(contactno);
//                out.println(role);
                
                try{
                    
                    String newAccInsertQuery="insert into account values(?,?,?,?,?,?,?,?,?,?);";
                    
                    PreparedStatement pst=con.prepareStatement(newAccInsertQuery);
                    
                    pst.setString(1, accno);
                    pst.setString(2, name);
                    pst.setString(3, gender);
                    pst.setString(4, dob);
                    pst.setString(5, address);
                    pst.setInt(6, Integer.parseInt(contactno));
                    pst.setString(7, "CUSTOMER");
                    pst.setString(8, password);
                    pst.setString(9, sques);
                    pst.setString(10, sans);
                    
                    pst.executeUpdate();
                    
                    out.println("Customer Account created Succesfully in Bank Account table ...\n");
                    
                    //------------------------
                    String Customeraccount="create table "+accno+"(accountno varchar(20),ref varchar(20),dotrans varchar(20),transid varchar(20),depamount int,wdrwamount int,netbal int);";
                    
                    PreparedStatement pst2=con.prepareStatement(Customeraccount);
                    pst2.executeUpdate();
                    
                    out.println("Customer Individual Table created Succesfully ...\n");
                    
                
                }
                catch(Exception e){
                    out.println("account not created !! "+e);
                }
        
        %>
        
        
    </body>
</html>
