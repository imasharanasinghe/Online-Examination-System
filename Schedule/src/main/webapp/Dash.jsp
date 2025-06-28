<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View All Exam Schedules</title>
    <link rel="stylesheet" href="./CSS/Alls.css"> <!-- Link to CSS file -->
    <style>
        /* Basic modal styles */
        .modal {
            display: none; /* Hidden by default */
            position: fixed; /* Stay in place */
            z-index: 1; /* Sit on top */
            left: 0;
            top: 0;
            width: 100%; /* Full width */
            height: 100%; /* Full height */
            overflow: auto; /* Enable scroll if needed */
            background-color: rgba(0, 0, 0, 0.4); /* Black w/ opacity */
        }

        .modal-content {
            background-color: #fefefe;
            margin: 15% auto; /* 15% from the top and centered */
            padding: 20px;
            border: 1px solid #888;
            width: 80%; /* Could be more or less, depending on screen size */
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2); /* Add shadow to modal */
        }

        /* Style for the update and delete buttons */
        button {
            background-color: #003366; /* Button color */
            color: #ffffff; /* Text color */
            padding: 10px 15px; /* Padding */
            border: none; /* Remove border */
            border-radius: 5px; /* Rounded corners */
            cursor: pointer; /* Pointer cursor on hover */
            font-size: 16px; /* Font size */
            transition: background-color 0.3s; /* Transition effect */
        }

        button:hover {
            background-color: #00509e; /* Darker shade on hover */
        }

        a {
            color: #003366; /* Link color */
            text-decoration: none; /* Remove underline */
            padding: 10px 15px; /* Padding */
            border: 1px solid #003366; /* Border for link */
            border-radius: 5px; /* Rounded corners */
            transition: background-color 0.3s, color 0.3s; /* Transition effect */
        }

        a:hover {
            background-color: #00509e; /* Background color on hover */
            color: #ffffff; /* Text color on hover */
        }

        /* Form Input Styles */
        input[type="text"],
        input[type="date"],
        textarea {
            width: 100%; /* Full width */
            padding: 10px; /* Padding */
            margin: 8px 0; /* Margin */
            border: 1px solid #ddd; /* Border */
            border-radius: 5px; /* Rounded corners */
            box-sizing: border-box; /* Box sizing */
        }

        input[type="text"]:focus,
        input[type="date"]:focus,
        textarea:focus {
            border-color: #003366; /* Border color on focus */
            outline: none; /* Remove outline */
        }
    </style>
</head>
<body>
    <header>
        <div class="header-content">
            <h1>View All Exam Schedules</h1>
            <nav>
                <ul>
                   
                </ul>
            </nav>
        </div>
    </header>

    <div class="container">
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Exam Title</th>
                    <th>Subject</th>
                    <th>Exam Date</th>
                    <th>Start Time</th>
                    <th>End Time</th>
                    <th>Duration</th>
                    <th>Exam Type</th>
                    <th>Special Instructions</th>
                    <th>Invigilator</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="user" items="${all}">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.examTitle}</td>
                        <td>${user.subject}</td>
                        <td>${user.examDate}</td>
                        <td>${user.startTime}</td>
                        <td>${user.endTime}</td>
                        <td>${user.duration}</td>
                        <td>${user.examType}</td>
                        <td>${user.specialInstructions}</td>
                        <td>${user.invigilator}</td>
                        <td>
                            <!-- Form to send exam details to Insert.jsp -->
                            <form action="http://localhost:8090/Enroll/Insert.jsp" method="POST">
    <input type="hidden" name="id" value="${user.id}">
    <input type="hidden" name="examTitle" value="${user.examTitle}">
    <input type="hidden" name="subject" value="${user.subject}">
    <input type="hidden" name="examDate" value="${user.examDate}">
    <input type="hidden" name="startTime" value="${user.startTime}">
    <input type="hidden" name="endTime" value="${user.endTime}">
    <input type="hidden" name="duration" value="${user.duration}">
    <input type="hidden" name="examType" value="${user.examType}">
    <input type="hidden" name="specialInstructions" value="${user.specialInstructions}">
    <input type="hidden" name="invigilator" value="${user.invigilator}">
    
    <button type="submit">Enroll</button>
</form>
                            
                            
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
