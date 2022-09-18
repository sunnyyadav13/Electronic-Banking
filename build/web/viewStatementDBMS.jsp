<%@include file="DBCON.jsp" %>
<html>
    
    <body>
        <h1>View Statement DBMS Page!!</h1>
        
        <%
            
        out.println(session.getAttribute("loginname")+"<br>");
        out.println("   "+session.getAttribute("accountno")+"<br><br>");
          
        try{
            String viewquery="Select * from "+request.getParameter("accno")+";";
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
            out.println("View Statement Failed !!!"+e);
        }
        %>
    </body>
</html>
