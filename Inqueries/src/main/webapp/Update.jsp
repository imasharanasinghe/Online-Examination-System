<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Edit Query Details</title>
    <link rel="stylesheet" href="./CSS/Updates.css" />
</head>
<body>
    <header>
        <div class="header-content">
            <h1>Reply to all Inqueries </h1>
        </div>
    </header>

    <div class="container">
        <form action="update" method="post">
            <label for="id">Query ID</label>
            <input type="text" id="id" name="id" readonly value="<%= request.getParameter("id") %>" /><br><br>

            <label for="username">Username</label>
            <input type="text" id="username" name="username" value="<%= request.getParameter("username") %>" readonly /><br><br>

            <label for="email">Email</label>
            <input type="email" id="email" name="email" value="<%= request.getParameter("email") %>" readonly /><br><br>

            <label for="queryCategory">Query Category</label>
            <input type="text" id="queryCategory" name="queryCategory" value="<%= request.getParameter("queryCategory") %>" readonly /><br><br>

            <label for="queryText">Query Text</label>
            <input type="text" id="queryText" name="queryText" value="<%= request.getParameter("queryText") %>" readonly /><br><br>

            <label for="submittedAt">Submitted At</label>
            <input type="text" id="submittedAt" name="submittedAt" value="<%= request.getParameter("submittedAt") %>" readonly /><br><br>

            <label for="respondedAt">Responded At</label>
            <input type="date" id="respondedAt" name="respondedAt" value="<%= request.getParameter("respondedAt") %>" /><br><br>

            <label for="responseText">Response Text</label>
            <input type="text" id="responseText" name="responseText" value="<%= request.getParameter("responseText") %>" /><br><br>

            <button type="submit" class="submit-btn">Submit Response</button>
        </form>
    </div>

    <footer class="footer">
        <div class="footer-content">
            <p>&copy; 2024 Online Examination. All rights reserved.</p>
            <ul class="footer-links">
                <li><a href="#">Privacy Policy</a></li>
                <li><a href="#">Terms of Service</a></li>
            </ul>
        </div>
    </footer>
</body>
</html>
