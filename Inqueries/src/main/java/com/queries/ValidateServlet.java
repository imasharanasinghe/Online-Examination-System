package com.queries;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ValidateServlet")

public class ValidateServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

	    String username = request.getParameter("username");
	    String email = request.getParameter("email");

	    // Call the new validation method
	    List<User> users = UserDBUtil.validateByUsernameAndEmail(username, email);

	    if (!users.isEmpty()) {
	        // If the user exists, set userDetails and forward to the same page
	        request.setAttribute("userDetails", users);
	        request.setAttribute("error", null); // Clear any previous error
	    } else {
	        // If no user found, set an error message
	        request.setAttribute("error", "No user found with the provided username and email.");
	    }

	    // Forward to the same page for rendering
	    RequestDispatcher dispatcher = request.getRequestDispatcher("Validate.jsp"); // Replace with your actual JSP file name
	    dispatcher.forward(request, response);

	}

}
