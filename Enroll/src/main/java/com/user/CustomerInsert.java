package com.user;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CustomerInsert")
public class CustomerInsert extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Extract parameters from the request
        int examId = Integer.parseInt(request.getParameter("examId"));  // Added examId
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

        boolean isTrue;

        // Call the insertCustomer method with the examId and other parameters
        isTrue = UserDBUtil.insertCustomer(examId, examTitle, subject, examDate, startTime, endTime, duration, examType, specialInstructions, invigilator, email, username, nic);

        if (isTrue) {
            // Successfully inserted user and exam details
            response.setContentType("text/html");
            response.getWriter().println("<script type='text/javascript'>");
            response.getWriter().println("alert('Registered successfully!');");
            response.getWriter().println("window.location.href = 'http://localhost:8090/Enroll/Login.jsp';");
            response.getWriter().println("</script>");
        } else {
            // Registration failed, forward to an error page
            RequestDispatcher dis2 = request.getRequestDispatcher("/unsuccess.jsp");
            dis2.forward(request, response);
        }
    }
}
