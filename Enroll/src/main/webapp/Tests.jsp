<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Enrolled Tests</title>
    <link rel="stylesheet" href="CSS/Test.css" />
</head>
<body>
    <div class="container">
        <h1>Enrolled Tests</h1>

        <div class="card-container">
            <!-- Iterate through the customer details list -->
            <c:forEach var="cus" items="${cusDetails}">
                <div class="card">
                    <h2>User Information</h2>
                    <p><strong>ID:</strong> ${cus.id}</p>
                    <p><strong>Username:</strong> ${cus.username}</p>
                    <p><strong>Email:</strong> ${cus.email}</p>
                    <p><strong>NIC:</strong> ${cus.nic}</p>
                    <p><strong>Exam ID:</strong> ${cus.examId}</p>
                    <p><strong>Exam Title:</strong> ${cus.examTitle}</p>
                    <p><strong>Subject:</strong> ${cus.subject}</p>
                    <p><strong>Exam Date:</strong> ${cus.examDate}</p>
                    <p><strong>Start Time:</strong> ${cus.startTime}</p>
                    <p><strong>End Time:</strong> ${cus.endTime}</p>
                    <p><strong>Duration:</strong> ${cus.duration}</p>
                    <p><strong>Exam Type:</strong> ${cus.examType}</p>
                    <p><strong>Special Instructions:</strong> ${cus.specialInstructions}</p>
                    <p><strong>Invigilator:</strong> ${cus.invigilator}</p>

                    <!-- Update Button to trigger modal and pass data -->
                    <button onclick="openModal(
                        '${cus.id}', 
                        '${cus.username}', 
                        '${cus.email}', 
                        '${cus.nic}', 
                        '${cus.examId}',
                        '${cus.examTitle}', 
                        '${cus.subject}', 
                        '${cus.examDate}', 
                        '${cus.startTime}', 
                        '${cus.endTime}', 
                        '${cus.duration}', 
                        '${cus.examType}', 
                        '${cus.specialInstructions}', 
                        '${cus.invigilator}')">Update </button>

                    <!-- Deletion form -->
                    <form action="DeleteCustomerServlet" method="post" style="display:inline;">
                        <input type="hidden" name="cusid" value="${cus.id}" />
                        <button type="submit" name="delete">Delete </button>
                    </form>
                </div>
            </c:forEach>
        </div>

        <a href="http://localhost:8090/User/Home.jsp"><button>Home</button></a>
    </div>

    <!-- Modal for Updating Profile -->
    <div id="updateModal" class="modal" style="display: none;">
        <div class="modal-content">
            <span class="close" onclick="closeModal()">&times;</span>
            <h2>Update Profile</h2>
            <form action="UpdateCustomerServlet" method="post">
                <input type="hidden" id="id" name="id" value="" />
                <!-- Display ID in the modal -->
                <label for="idDisplay">ID:</label>
                <input type="text" id="idDisplay" value="" readonly />
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" value="" required />
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" value="" required />
                <label for="nic">NIC:</label>
                <input type="text" id="nic" name="nic" value="" required />
                <label for="examId">Exam ID:</label>
                <input type="text" id="examId" name="examId" value="" required readonly/>
                <label for="examTitle">Exam Title:</label>
                <input type="text" id="examTitle" name="examTitle" value="" required readonly/>
                <label for="subject">Subject:</label>
                <input type="text" id="subject" name="subject" value="" required readonly/>
                <label for="examDate">Exam Date:</label>
                <input type="date" id="examDate" name="examDate" value="" required readonly />
                <label for="startTime">Start Time:</label>
                <input type="time" id="startTime" name="startTime" value="" required readonly/>
                <label for="endTime">End Time:</label>
                <input type="time" id="endTime" name="endTime" value="" required readonly />
                <label for="duration">Duration:</label>
                <input type="text" id="duration" name="duration" value="" required readonly/>
                <label for="examType">Exam Type:</label>
                <input type="text" id="examType" name="examType" value="" required readonly/>
                <label for="specialInstructions">Special Instructions:</label>
                <input type="text" id="specialInstructions" name="specialInstructions" value="" required readonly/>
                <label for="invigilator">Invigilator:</label>
                <input type="text" id="invigilator" name="invigilator" value="" required  readonly/>
                <button type="submit">Update</button>
            </form>
        </div>
    </div>

    <script>
        function openModal(id, username, email, nic, examId, examTitle, subject, examDate, startTime, endTime, duration, examType, specialInstructions, invigilator) {
            document.getElementById("id").value = id; // Hidden input for form submission
            document.getElementById("idDisplay").value = id; // Display ID in modal
            document.getElementById("username").value = username;
            document.getElementById("email").value = email;
            document.getElementById("nic").value = nic;
            document.getElementById("examId").value = examId;
            document.getElementById("examTitle").value = examTitle;
            document.getElementById("subject").value = subject;
            document.getElementById("examDate").value = examDate;
            document.getElementById("startTime").value = startTime;
            document.getElementById("endTime").value = endTime;
            document.getElementById("duration").value = duration;
            document.getElementById("examType").value = examType;
            document.getElementById("specialInstructions").value = specialInstructions;
            document.getElementById("invigilator").value = invigilator;

            document.getElementById("updateModal").style.display = "block";
        }

        function closeModal() {
            document.getElementById("updateModal").style.display = "none";
        }
    </script>

</body>
</html>
