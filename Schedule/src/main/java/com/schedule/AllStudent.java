package com.schedule;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AllStudent")
public class AllStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<User> allAdmins = UserDBUtil.getAllSchedules();
        request.setAttribute("all", allAdmins);

        RequestDispatcher dispatcher = request.getRequestDispatcher("Dash.jsp");
        dispatcher.forward(request, response);

    }

}
