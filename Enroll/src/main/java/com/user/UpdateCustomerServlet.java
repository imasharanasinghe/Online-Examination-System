package com.user;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateCustomerServlet")
public class UpdateCustomerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Extract parameters from the request
        String id = request.getParameter("id");
        String examId = request.getParameter("examId");

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String nic = request.getParameter("nic");

        String examTitle = request.getParameter("examTitle");
        String subject = request.getParameter("subject");
        String examDate = request.getParameter("examDate");
        String startTime = request.getParameter("startTime");
        String endTime = request.getParameter("endTime");
        String duration = request.getParameter("duration");
        String examType = request.getParameter("examType");
        String specialInstructions = request.getParameter("specialInstructions");
        String invigilator = request.getParameter("invigilator");

        boolean isUpdated = UserDBUtil.updateCustomer(id, examId, examTitle, subject, examDate, startTime, endTime, duration, examType, specialInstructions, invigilator, email, username, nic);
        
        // Check if the update was successful
        if (isUpdated) {
            // Fetch updated user details
            List<User> userDetails = UserDBUtil.getCustomerDetails(examId);
            request.setAttribute("userDetails", userDetails);
            
            // Forward to Tests.jsp
            RequestDispatcher dis = request.getRequestDispatcher("Login.jsp");
            dis.forward(request, response);
        } else {
            // Optionally handle the case where the update failed, if necessary
            // You can set an error message or just redirect back to the same page
            request.setAttribute("updateError", "Update failed. Please try again.");
            
            // Forward back to the profile page
            RequestDispatcher dis = request.getRequestDispatcher("Profile.jsp");
            dis.forward(request, response);
        }
    }
}
