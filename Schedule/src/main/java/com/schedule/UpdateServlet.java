package com.schedule;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get parameters from the request
    	 int id = Integer.parseInt(request.getParameter("id"));
        String examTitle = request.getParameter("examTitle");
        String subject = request.getParameter("subject");
        String examDate = request.getParameter("examDate");
        String startTime = request.getParameter("startTime");
        String endTime = request.getParameter("endTime");
        String duration =  request.getParameter("duration");
        String examType = request.getParameter("examType");
        String specialInstructions = request.getParameter("specialInstructions");
        String invigilator = request.getParameter("invigilator");

        // Here you would typically retrieve the exam ID from the request
        // If you haven't passed the ID from the modal, you need to adjust the modal
        // and include the ID in the form submission, e.g., add a hidden input for it.
        // Ensure you pass this ID from the modal

        // Update the exam schedule
        boolean isSuccess = UserDBUtil.updateExamSchedule(id, examTitle, subject, examDate, startTime, endTime, duration, examType, specialInstructions, invigilator);
        if (isSuccess) {
            response.sendRedirect("Home.jsp"); // Redirect to success page
        } else {
            response.sendRedirect("error.jsp"); // Redirect to error page
        }
    }
}
