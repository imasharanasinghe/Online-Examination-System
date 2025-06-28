<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .login-container {
            background-color: white;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 400px;
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        .form-group {
            margin-bottom: 15px;
            padding-right: 10px;
        }

        label {
            display: block;
            margin-bottom: 5px;
        }

        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        button {
            width: 100%;
            padding: 10px;
            background-color: #004380;
            border: none;
            border-radius: 3px;
            color: white;
            font-size: 16px;
            cursor: pointer;
        }

        button:hover {
            background-color: #003366; /* Slightly darker blue on hover */
        }

        .error-message {
            color: red;
            text-align: center;
            margin-top: 10px;
        }
    </style>
    <script>
        function validateForm() {
            const username = document.getElementById('username').value;
            const password = document.getElementById('password').value;
            const errorMessage = document.getElementById('error-message');

            // Admin credentials
            const adminUsername = 'admin';
            const adminPassword = '123'; // Updated password as per your requirement

            // Validate username and password
            if (username === adminUsername && password === adminPassword) {
                // Redirect to the Home.jsp page on successful login
                window.location.href = 'http://localhost:8090/Main/AdminDash.jsp';
                return false; // Prevent form submission since we're redirecting
            } else {
                errorMessage.textContent = 'Invalid username or password. Please try again.';
                return false; // Prevent form submission
            }
        }
    </script>
</head>
<body>
    <div class="login-container">
        <h2>Admin Login</h2>
        <form id="adminLoginForm" onsubmit="return validateForm()">
            <div class="form-group">
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <button type="submit">Login</button>
        </form>
        <div id="error-message" class="error-message"></div>
    </div>
</body>
</html>
