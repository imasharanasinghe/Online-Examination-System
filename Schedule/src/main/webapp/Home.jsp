<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Home</title>
    <link rel="stylesheet" href="./CSS/Home.css" />
</head>
<body>
    <header>
        <div class="header-content">
            <h2>Welcome to the Examination Schedules System</h2>
        </div>
    </header>
</br></br>
    <div class="container">
        <div class="image-animation">
            <img src="./CSS/1.gif" alt="Exam Animation" />
        </div> </br></br>
        <form action="viewAll" method="get">
            <button class="flm">View Added Tests</button>
        </form>
    </div>

    <footer class="footer">
        <div class="footer-content">
            <p>&copy; Online Examination All rights reserved.</p>
            <ul class="footer-links">
                <li><a href="#">Privacy Policy</a></li>
                <li><a href="#">Terms of Service</a></li>
            </ul>
        </div>
    </footer>
</body>
</html>
