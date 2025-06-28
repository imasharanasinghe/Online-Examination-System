<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>All Queries Details</title>
    <link rel="stylesheet" href="./CSS/All.css" />
</head>
<body>
    <header>
        <div class="header-content">
            <h1>Check All Query Details</h1>
            <nav>
                <ul>
                    <li><a href="http://localhost:8090/Main/StaffDash.jsp">Back to Dashboard</a></li>
                </ul>
            </nav>
        </div>
    </header>
    
    <div class="container">
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Username</th>
                    <th>Email</th>
                    <th>Query Category</th>
                    <th>Query Text</th>
                    <th>Submitted At</th>
                    <th>Responded At</th>
                    <th>Response Text</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="user" items="${allUsers}">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.username}</td>
                        <td>${user.email}</td>
                        <td>${user.queryCategory}</td>
                        <td>${user.queryText}</td>
                        <td>${user.submittedAt}</td>
                        <td>${user.respondedAt}</td>
                        <td>${user.responseText}</td>
                        <td>
                            <a href="Update.jsp?id=${user.id}&username=${user.username}&email=${user.email}&queryCategory=${user.queryCategory}&queryText=${user.queryText}&submittedAt=${user.submittedAt}&respondedAt=${user.respondedAt}&responseText=${user.responseText}">
                                <button class="update-btn">Respond</button>
                            </a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <br><br><br>
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
