
<%@include file="DBCON.jsp" %>
<html>
    
    <body>
        <h1> View Customer DBMS Page !</h1>
        <% 
                String choice=request.getParameter("choice");
                String viewquery="";
            try{
                
                if(choice.equals("ALL")){
                    
                viewquery="select * from account;";
                
                }
                else if(choice.equals("AccountNo")){
                    String ac=request.getParameter("txt1");
                    viewquery="Select * from account where accno='"+ac+"';";
                }
                
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery(viewquery);
                
                while(rs.next()){
                    out.println(" "+rs.getString(1));
                    out.println(" ||"+rs.getString(2));
                    out.println(" ||"+rs.getString(3));
                    out.println(" ||"+rs.getString(4));
                    out.println(" ||"+rs.getString(5));
                    out.println(" ||"+rs.getInt(6));
                    out.println(" ||"+rs.getString(7));
                    out.println(" ||"+rs.getString(8));
                    out.println(" ||"+rs.getString(9));
                    out.println(" ||"+rs.getString(10));
                    out.println(" <br>");
                }
            }
            catch(Exception e){
                
                out.println("data not found "+e);
            }
        
        
        %>
    </body>
</html>
