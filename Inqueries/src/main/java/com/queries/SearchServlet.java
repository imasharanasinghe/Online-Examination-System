package com.queries;

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
		
		
		String queryCategory = request.getParameter("queryCategory");
		String submittedAt = request.getParameter("submittedAt");
		
		
		try {
			List<User> cusDetails = UserDBUtil.validate(queryCategory,submittedAt);
			request.setAttribute("cusDetails", cusDetails);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
			RequestDispatcher dis = request.getRequestDispatcher("Delete.jsp");
			dis.forward(request, response);
	}

}
