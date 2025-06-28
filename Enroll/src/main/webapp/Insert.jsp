<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Enroll</title>
    <link rel="stylesheet" type="text/css" href="./CSS/Inserting.css">
</head>
<body>

    <!-- Header Section -->
    <header>
        <div class="logo">
            <h1>Online Examination </h1>
        </div>
        <nav>
            <ul>
                <h1>Enrollment </h1>
                
            </ul>
        </nav>
    </header>

    <!-- Registration Form Section -->
    <section id="register">
        <h2>Enroll your The Future!</h2>
        <form action="CustomerInsert" method="post">
            <div class="form-section">
                <h3>User Details</h3>
                <label for="username">Username</label>
                <input type="text" id="username" name="username" required>

                <label for="email">Email</label>
                <input type="email" id="email" name="email" required>

                <label for="nic">NIC</label>
                <input type="number" id="nic" name="nic" required>
            </div>

            <div class="form-section">
                <h3>Examination Details</h3>
                <label for="examId">Exam ID</label>
                <input type="number" id="examId" name="examId" value="${param.id}" required readonly>

                <label for="examTitle">Exam Title</label>
                <input type="text" id="examTitle" name="examTitle" value="${param.examTitle}" required readonly>

                <label for="subject">Subject</label>
                <input type="text" id="subject" name="subject" value="${param.subject}" required readonly>

                <label for="examDate">Exam Date</label>
                <input type="date" id="examDate" name="examDate" value="${param.examDate}" required readonly>

                <label for="startTime">Start Time</label>
                <input type="time" id="startTime" name="startTime" value="${param.startTime}" required readonly>

                <label for="endTime">End Time</label>
                <input type="time" id="endTime" name="endTime" value="${param.endTime}" required readonly>

                <label for="duration">Duration</label>
                <input type="text" id="duration" name="duration" value="${param.duration}" required readonly>

                <label for="examType">Exam Type</label>
                <input type="text" id="examType" name="examType" value="${param.examType}" required readonly>

                <label for="specialInstructions">Special Instructions</label>
                <textarea id="specialInstructions" name="specialInstructions" readonly rows="4">${param.specialInstructions}</textarea>

                <label for="invigilator">Invigilator</label>
                <input type="text" id="invigilator" name="invigilator" readonly value="${param.invigilator}" required>
            </div>

            <button type="submit">Add</button>
        </form>
       
    </section>

    <!-- Footer Section -->
    <footer>
        <p>&copy; ABC Restaurant. All rights reserved.</p>
        <p>Contact us: info@abcrestaurant.lk | +94 77 123 4567</p>
    </footer>

</body>
</html>
