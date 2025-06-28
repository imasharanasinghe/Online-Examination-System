package com.schedule;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CustomerInsert")
public class InsertServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get exam schedule parameters
        String examTitle = request.getParameter("examTitle");
        String subject = request.getParameter("subject");
        String examDate = request.getParameter("examDate");
        String startTime = request.getParameter("startTime");
        String endTime = request.getParameter("endTime");
        String duration = request.getParameter("duration"); // Ensure this is an integer
        String examType = request.getParameter("examType");
        String specialInstructions = request.getParameter("specialInstructions");
        String invigilator = request.getParameter("invigilator");

        boolean isSuccess;

        // Insert new exam schedule into the database
        isSuccess = UserDBUtil.insertExamSchedule(examTitle, subject, examDate, startTime, endTime, duration, examType, specialInstructions, invigilator);
        if (isSuccess) {
            response.setContentType("text/html");
            response.getWriter().println("<script type='text/javascript'>");
            response.getWriter().println("alert('Added successfully!');");
            response.getWriter().println("window.location.href = 'http://localhost:8090/Shedules/Home.jsp';");
            response.getWriter().println("</script>");
        } else {
            RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
            dis2.forward(request, response);
        }
    }
}
