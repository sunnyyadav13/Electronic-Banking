<%@include file="DBCON.jsp" %>
<%@include file="transaction.jsp" %>
<html>
    
    <body>
        <h1>Transaction DBMS Page!!</h1>
        
        <%
            
        out.println(session.getAttribute("loginname"));
        out.println("   "+session.getAttribute("accountno"));
          
        try{
            
            String viewquery="";
            String choice=request.getParameter("choice");
            if(choice.equals("accno")){
                String ac=request.getParameter("text1");
                viewquery="Select * from transactionbank where accountno='"+ac+"';";
            }
            else if(choice.equals("dot")){
                viewquery="Select * from transactionbank where dotrans='"+request.getParameter("text1")+"';";
            }
            else if(choice.equals("transid")){
                viewquery="Select * from transactionbank where transid='"+request.getParameter("text1")+"';";
            }
            else if(choice.equals("depoamt")){
                viewquery="Select * from transactionbank where depamount='"+request.getParameter("text1")+"';";
            }
            else if(choice.equals("wtdramt")){
                viewquery="Select * from transactionbank where wdrwamount='"+request.getParameter("text1")+"';";
            }
            else if(choice.equals("all")){
                viewquery="Select * from transactionbank;";
            }
            
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(viewquery);
            
            while(rs.next()){
                    out.println(" "+rs.getString(1));
                    out.println(" ||"+rs.getString(2));
                    out.println(" ||"+rs.getString(3));
                    out.println(" ||"+rs.getString(4));
                    out.println(" ||"+rs.getInt(5));
                    out.println(" ||"+rs.getInt(6));
                    out.println(" ||"+rs.getInt(7));
                    
                    out.println(" <br>");
                }
        }
        catch(Exception e){
            out.println("View Transaction Failed !!!"+e);
        }
        %>
    </body>
</html>
