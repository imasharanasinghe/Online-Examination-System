<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Login Page</title>
      <link href="CSS/Login.css" rel="stylesheet">
  </head>
  <body>
  
    <div class="container">
      <div class="profile-icon">
        <img src="CSS/user.png" alt="Profile Icon" />
      </div>
      <div class="right-half">
        <h1>Student Login</h1>
        <form action="login" method="post">
		User Name <input type="text" name="username" class="form-group" placeholder="Enter your username"><br><br>
		Password <input type="password" name="password" class="form-group" placeholder="Enter your password"><br>
		<input class="btnn" type="submit" name="submit" value="Login">
	</form>
	 <p>Don't have an account? <a href="http://localhost:8090/User/Register.jsp">Register here</a></p>
      </div>
    </div>
    <footer class="footer">
        <div class="footer-content">
            <p>&copy; 2023 Online Examination. All rights reserved.</p>
            <ul class="footer-links">
                <li><a href="#">Privacy Policy</a></li>
                <li><a href="#">Terms of Service</a></li>
            </ul>
        </div>
    </footer>
  </body>
</html>
