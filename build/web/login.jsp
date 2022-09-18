<%@include file="html/style.jsp" %>

<html>
    <head>
        <link rel="stylesheet" href="html/style.css">
    </head>
    <body bgcolor="yellow ">
        <h1 align="center" > welcome To XYZ Bank</h1>
        <section class="vh-100">
            
            <div class="container-fluid h-custom">
            <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col-md-9 col-lg-6 col-xl-5">
                        <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
                            class="img-fluid" alt="Sample image">
                </div>
                
      <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
          
          
      <form action="check.jsp" method="post">
            
          
        <select class="form-select" aria-label="Default select example" name="role">
                        <option selected>Choose Your Role</option>
                        <option >Admin</option>
                        <option >Customer</option>
                        
        </select>
        
          <!-- Email input -->
          <div class="form-outline mb-4">
            <br>
            <label class="form-label" for="form3Example3">Account Number</label>
            <input type="text" id="form3Example3" class="form-control form-control-lg"
              placeholder="Enter a valid Account Number" name="accountno"/>
            
          </div>

          <!-- Password input -->
          <div class="form-outline mb-3">
            <label class="form-label" for="form3Example4">Password</label>
            <input type="password" id="form3Example4" class="form-control form-control-lg"
              placeholder="Enter password" name="password"/>
          </div>
           <%
                    StringBuffer sb = new StringBuffer();
                    for (int i = 1; i <= 5; i++) {
                        sb.append((char) (int) (Math.random() * 79 + 23 + 7));
                    }
                    String cap = new String(sb);
                    session.setAttribute("cap_passed", cap);
                %> 
          
          <div class="form-outline mb-3">
            <label class="form-label" for="form3Example4">Enter Captcha</label>
            <input type="text"  class="form-control form-control-lg"
              placeholder="Enter Captcha" name="cap1"/>
            <div style="background-color: white"><h2><s><i><font face="TIMES NEW ROMAN"><%=cap%></font></i></s></h2></div>
          </div>
          

          <div class="d-flex justify-content-between align-items-center">
          </div>
            
          <!-- Button -->
          <div class="text-center text-lg-start mt-4 pt-2">
            <input type="submit" class="btn btn-primary btn-lg"
              style="padding-left: 2.5rem; padding-right: 2.5rem;" value="Login">
            
            
          </div>
          
        </form>
          <br>
          <button  class="btn btn-primary btn-lg"
                     style="padding-left: 2.5rem; padding-right: 2.5rem;" value="Forget Password" onclick="location.href='forgetPassword.jsp'">Forget Password</button>
      </div>
    </div>
  </div>

        
<!--        <form action="check.jsp" method="post" align="center">
            Select Role <select name="role">
                                    <option >Admin</option>
                                    <option>Customer</option>
            </select><br>
            Enter Account Number <input type="text" name="accountno"><br>
            Enter Password <input type="text" name="password"><br>
            <input type="submit" name="b1"value="Login">
            <input type="reset" name="b2" value="Reset">
        </form>-->
        
    </body>
</html>
