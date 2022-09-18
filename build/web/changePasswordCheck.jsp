
<%@include file="DBCON.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <body>
        <h1>change Password Check Page</h1>
        Welcome Dear:
        <%
        int flag=1;
        out.println(session.getAttribute("loginname"));
        out.println("   "+session.getAttribute("accountno"));
        
        %>
        
        <%
        
        
        String s1oldpass=request.getParameter("oldpass");
        String s1newpass=request.getParameter("newpass");
        String s1cnpass=request.getParameter("cnpass");
        
        try{
            if(s1newpass.equals(s1cnpass)){
                if(session.getAttribute("loginpassword").equals(s1oldpass)){
                    try{
                        String query="update account set password='"+s1newpass+"' where accno='"+session.getAttribute("accountno")+"'";
                        PreparedStatement pst=con.prepareStatement(query);
                        pst.executeUpdate();
                        
                        out.println("Dear "+session.getAttribute("accountno")+" Password Changed Succesfully ... <br>");
                        flag++;
//                        session.invalidate();
//                        response.setHeader("Cache-Control", "no-store");
//                        response.setHeader("Pragma", "no-cache");
//                        response.setHeader("Expires", "0");
                        
                        out.println("<a href='login.jsp'>Login Again</a>");
                    }
                    catch(Exception ee){
                        out.println("<br> Password Not change "+ee);
                    }
                }
                else{
                    out.println("<br> Old Password is Incorrect ");
                }
            }
            else{
                out.println("<br> New Password & Confirm Password Mismatched");
            }
        }
        catch(Exception e){
            out.println(e);
        }
        
        
        %>
        
        
    </body>
</html>
