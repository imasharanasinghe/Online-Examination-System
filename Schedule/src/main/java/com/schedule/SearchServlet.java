package com.schedule;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import javax.servlet.RequestDispatcher;

@WebServlet("/LoginServlet")
public class SearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String examTitle = request.getParameter("examTitle");
        String examDate = request.getParameter("examDate");

        try {
            
        	List<User> cusDetails = UserDBUtil.validate(examTitle, examDate);
            request.setAttribute("cusDetails", cusDetails);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Forward request to the appropriate JSP page (for example, 'Delete.jsp')
        RequestDispatcher dis = request.getRequestDispatcher("Delete.jsp");
        dis.forward(request, response);
    }
}
