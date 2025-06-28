<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Add New Test</title>
    <link rel="stylesheet" href="./CSS/InsertRiservations.css" />
</head>
<body>
    <h1>Add New Test</h1>
    <div class="full">
        <form action="insert" method="post">
            <!-- Train Title -->
            <label for="examTitle">Exam Title</label> <br />
            <input type="text" id="examTitle" name="examTitle" required /><br /><br />

            <!-- Subject -->
            <label for="subject">Subject</label> <br />
            <input type="text" id="subject" name="subject" required /><br /><br />

            <!-- Exam Date -->
            <label for="examDate">Exam Date</label> <br />
            <input type="date" id="examDate" name="examDate" required /><br /><br />

            <!-- Start Time -->
            <label for="startTime">Start Time</label> <br />
            <input type="time" id="startTime" name="startTime" required /><br /><br />

            <!-- End Time -->
            <label for="endTime">End Time</label> <br />
            <input type="time" id="endTime" name="endTime" required /><br /><br />

            <!-- Duration -->
            <label for="duration">Duration (in minutes)</label> <br />
            <input type="number" id="duration" name="duration" required /><br /><br />

            <!-- Exam Type -->
<label for="examType">Exam Type</label> <br />
<select id="examType" name="examType" required>
  <option value="structures">Structures</option>
  <option value="mcq">MCQ</option>
  <option value="essay">Essay</option>
  <option value="reading">Reading</option>
</select>
<br /><br />

            <!-- Special Instructions -->
            <label for="specialInstructions">Special Instructions</label> <br />
            <textarea id="specialInstructions" name="specialInstructions"></textarea><br /><br />

            <!-- Invigilator -->
            <label for="invigilator">Invigilator</label> <br />
            <input type="text" id="invigilator" name="invigilator" required /><br /><br />

            <!-- Submit Button -->
            <button type="submit">Add</button>
        </form>
    </div>
    <br><br><br>
    <footer class="footer">
        <div class="footer-content">
            <p>&copy; 2023 Your Company Name. All rights reserved.</p>
            <ul class="footer-links">
                <li><a href="#">Privacy Policy</a></li>
                <li><a href="#">Terms of Service</a></li>
            </ul>
        </div>
    </footer>
</body>
</html>
