<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>View</title>
    <link href="./CSS/Login.css" rel="stylesheet">
  </head>
  <body>
    <!-- Header Section -->
    <header>
        <div class="logo">
            <h1>ABC Restaurant</h1>
        </div>
        <nav>
          
        </nav>
    </header>

    <!-- Login Form Section -->
    <div class="container">
     
      <div class="login-form">
        <h1> Login to your Enrolled Tests </h1>
        <form action="login" method="post">
          <label for="username">User Name</label>
          <input type="text" id="username" name="username" class="form-group" placeholder="Enter your username" required>

          <label for="password">NIC</label>
          <input type="number" id="nic" name="nic" class="form-group" placeholder="Enter your nic" required>

          <input class="btnn" type="submit" name="submit" value="Login">
        </form>
        
      </div>
    </div>

    <!-- Footer Section -->
    <footer>
        <p>&copy; 2024 ABC Restaurant. All rights reserved.</p>
        <p>Contact us: info@abcrestaurant.lk | +94 77 123 4567</p>
    </footer>

  </body>
</html>
