
<%@page import="java.util.Random"%>
<html>
    
    <body>
        <%
            Random rand=new Random();
        
            int dataid=rand.nextInt(1000);
            session.setAttribute("dataid", dataid);
        %>
    </body>
</html>
