package com.queries;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateCustomerServlet")
public class UpdateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
        String username = request.getParameter("username");  // New field
        String email = request.getParameter("email");        // New field
        String queryCategory = request.getParameter("queryCategory");
        String queryText = request.getParameter("queryText");
        String submittedAt = request.getParameter("submittedAt");
        String respondedAt = request.getParameter("respondedAt");
        String responseText = request.getParameter("responseText");

        boolean isTrue;

        isTrue = UserDBUtil.updateCustomer(Integer.parseInt(id), username, email, queryCategory, queryText, submittedAt, respondedAt, responseText);

        if (isTrue) {
            List<User> cusDetails = UserDBUtil.getCustomerDetails(Integer.parseInt(id));
            request.setAttribute("cusDetails", cusDetails);

            RequestDispatcher dis = request.getRequestDispatcher("Home.jsp");
            dis.forward(request, response);
        } else {
            List<User> cusDetails = UserDBUtil.getCustomerDetails(Integer.parseInt(id));
            request.setAttribute("cusDetails", cusDetails);

            RequestDispatcher dis = request.getRequestDispatcher("Insert.jsp");
            dis.forward(request, response);
        }
    }
}
