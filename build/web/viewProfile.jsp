<%@include file="DBCON.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fund Transfer Page</title>
        <link rel="stylesheet" href="html/style.css">
        <link rel="stylesheet" href="css/form.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
    </head>
    <body>
        <%  
        out.println(session.getAttribute("loginname")+"<br>");
        out.println("   "+session.getAttribute("accountno")+"<br><br>");
        %>
        <h2> Update Profile Page </h2>
        <form action="viewProfileUpdate.jsp" method="post">
<!--        <select name="choice">
            <option value="name">name</option>
            <option value="add">address</option>
            <option value="mob">mobile</option>
            <option value="sques">security Question</option>
            <option value="sans">security Answer</option>
            <option value="gender">Gender</option>
            <option value="dob">dob</option>
        </select>-->
        
        <%      
        String query="Select * from account where accno='"+session.getAttribute("accountno")+"';";  
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        
        String accno="";
        String name="";
        String gender="";
        String dob="";
        String address="";
        int mob=0;
        String sques="";
        String sans="";
        
        while(rs.next()){
            accno=rs.getString(1);
            name=rs.getString(2);
            gender=rs.getString(3);
            dob=rs.getString(4);
            address=rs.getString(5);
            mob=rs.getInt(6);
            sques=rs.getString(9);
            sans=rs.getString(10);
            
            
        }

        %>
            
            <table >
                <tr>
                    <td>Account Number</td>
                    <td><input type="text" name="accno" value="<% out.println( accno); %>" readonly></td>
                </tr>
                <tr>
                    <td>Customer Name</td>
                    <td><input type="text" name="name" value="<% out.println(name); %>"></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td><select name="gender">
                            <option value="Male">Male</option>
                            <option value="Female">Female</option>
                            <option value="Other">Other</option>
                        </select></td>
                </tr>
                <tr>
                <tr>
                    <td>Date of Birth</td>
                    <td><input type="date" name="dob" value="<% out.println(dob); %>"></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><input type="text" name="address" value="<% out.println(address); %>"></td>
                </tr>
                <tr>
                    <td>Contact Number</td>
                    <td><input type="text" name="contactno" value="<% out.println(mob); %>"></td>
                </tr>
                
                <tr>
                    <td>Security Question</td>
                    <td><select name="sques" value="<% out.println(sques); %>>
                            <option value="First Car">First Car</option>
                            <option value="First Bank">First Bank</option>
                            <option value="First School">First School</option>
                            <option value="First Job">First Job</option>
                        </select></td>
                </tr>
                <tr>
                    <td>Security Ans</td>
                    <td><input type="text" name="sans" value="<% out.println(sans); %>"></td>
                </tr>
                <tr>
                    <td><input type="reset" name="b2" value="Reset"></td>
                    <td><input type="submit" name="b1" value="Update"></td>
                    
                </tr>
                
            </table>
        
        
        
    </form>
    <%
        out.println("<br><br> <a class=\"myclass\" href='customerLogin.jsp'>Back </a>");
        %> 
    </body>
</html>
