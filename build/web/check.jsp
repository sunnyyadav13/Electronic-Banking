
<%--<%@include file="login.jsp" %>--%>
<%@include file="DBCON.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <link rel="stylesheet" href="html/style.css">
    </head>
    <body>
        <h1>Check Page</h1>
        <%
            String role=request.getParameter("role");
            String accountno=request.getParameter("accountno");
            String password=request.getParameter("password");
            String cap1=request.getParameter("cap1");
            String cap=(String)session.getAttribute("cap_passed");
            
            String  loginname="";
            try 
            {
                if (cap1.equals("")) {
                    out.println("Please Enter Captcha");
                } else if (!cap1.equals(cap)) {
                    out.println("Invalid Captcha!! Please try again");
                    RequestDispatcher disp=request.getRequestDispatcher("login.jsp");
                    disp.include(request, response);
                } else if (cap1.equals(cap)) {
                    
                String viewquery="select * from account";
                Statement stmt= con.createStatement();
                ResultSet rs=stmt.executeQuery(viewquery);
                
                int count=0;
                while(rs.next())
                {
                    if(role.equalsIgnoreCase(rs.getString(7)) && accountno.equalsIgnoreCase(rs.getString(1)) && password.equals(rs.getString(8)))
                    {
//                        session.setAttribute("user_id", role);
//                        session.setAttribute("pass_word", upass);
                        
                        count++;
                        loginname=rs.getString(2);
                        break;
                    }
                   
                }    
                if(count>0)
                {
                    session.setAttribute("accountno", accountno);
                    session.setAttribute("loginname",loginname);
                    session.setAttribute("loginpassword", password);
                    
                    if(role.equalsIgnoreCase("Admin"))
                    {
                        response.sendRedirect("admin.jsp");
                    }
                    else
                    {
                        response.sendRedirect("customerLogin.jsp");
                    }
                    //out.println("login Su,ccess");
                    //response.sendRedirect("Success.jsp");;
                }
                else 
                {
                    RequestDispatcher disp=request.getRequestDispatcher("login.jsp");
                    disp.include(request, response);
                    out.println("<br> Invalid Username and password ");
                }
                    
                } 
            }
            catch(Exception e)
            {
                out.println("Invalid Login "+e);
            }
           
        %>
<!--            try{
                String viewQuery="select * from account;";
                Statement st =con.createStatement();
                ResultSet rs =st.executeQuery(viewQuery);
                
                String loginname="";
                int count=0;
                while(rs.next()){
                    
                    if(role.equalsIgnoreCase(rs.getString(7))&& accountno.equalsIgnoreCase(rs.getString(1))&&password.equalsIgnoreCase(rs.getString(8)))
                    {
//                        
                        count++; 
                        loginname=rs.getString(2); 
                        break;
                        
                    }
                    
                }
                if(count>0){
                    session.setAttribute("accountno", accountno);
                    session.setAttribute("loginname", loginname);
                    session.setAttribute("loginpassword", password);
                    
                    if(role.equalsIgnoreCase("Admin")){
                        response.sendRedirect("admin.jsp");
                    }
                    else if(role.equalsIgnoreCase("Customer")){
                        response.sendRedirect("customerLogin.jsp");
                    }
//                    out.println("Data Matched Login Successful <br>");
//                    response.sendRedirect("Success.jsp");
                }
                else{
//                    RequestDispatcher dis=request.getRequestDispatcher("login.jsp");
//                    dis.include(request, response);
                    out.println("Invalid Login & Password<br>");
                    }
                
            }
            catch(Exception e){
                out.println("Connection Failed Login Page ...."+e);
            }
            
            
            
            

            
        
        %>-->
    </body>
</html>
