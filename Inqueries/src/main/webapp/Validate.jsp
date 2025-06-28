<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View</title>
    <link rel="stylesheet" href="./CSS/Validates.css"> <!-- Link to your CSS file -->
</head>
<body>
<div class="con">
    <div class="container">
        <h2>View Your Query</h2>
        <form action="ValidateServlet" method="post"> <!-- Correct action -->
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>

            <input type="submit" value="Validate">
        </form>

        <c:if test="${not empty error}">
            <div class="error-message">
                <p>${error}</p>
            </div>
        </c:if>

        <c:if test="${not empty userDetails}">
    <h3>User Details:</h3>
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
                <th>Action</th> <!-- New column for actions -->
            </tr>
        </thead>
        <tbody>
            <c:forEach var="user" items="${userDetails}">
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
                        <form action="DeleteServlet" method="post">
                            <input type="hidden" name="userId" value="${user.id}">
                            <input type="submit" value="Delete">
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</c:if>


    </div>
    </div>
</body>
</html>
