 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link href="CSS/Register.css" rel="stylesheet">
</head>
<body>

	<%
	 String id = request.getParameter("id");
    String username = request.getParameter("username");
	String email = request.getParameter("email");  
	String password = request.getParameter("password");
   %>
	
	
	<div class="container">
<div class="profile-icon">
        <img src="CSS/user.png" alt="Profile Icon" />
      </div>

	<h1>Customer Account Delete</h1>

	<form action="delete" method="post">
	 
        <div class="form-group">
        
           <label for="id">Email</label>
            <input type="text"  name="cusid" value= "<%= id %>" readonly/>
            
            <label for="email">Email</label>
            <input type="text"  name="email" value= "<%= email %>" readonly/>
          
         
            <label for="username">User Name</label>
            <input type="text"  name="uname" value= "<%= username %>" readonly />
          </div><br>
          
          
	<input type="submit" name="submit" value="Delete My Account">
	</form>
</div>
</body>
</html>