package com.schedule;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        boolean isDeleted = UserDBUtil.deleteExamSchedule(Integer.parseInt(id));
        
        if (isDeleted) {
            response.sendRedirect("http://localhost:8090/Shedules/Home.jsp"); // Redirect to view page
        } else {
            // Handle error (e.g., show an error message)
            response.getWriter().print("Error deleting the schedule.");
        }
    }
}
