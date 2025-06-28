package com.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteCustomerServlet")
public class DeleteCustomerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("cusid");

        boolean isTrue = UserDBUtil.deleteCustomer(id);

        if (isTrue) {
            // If deletion is successful, redirect to home page
            RequestDispatcher dis = request.getRequestDispatcher("Login.jsp");
            dis.forward(request, response);
        } else {
            // Deletion failed, stay on the profile page
            List<User> userDetails = UserDBUtil.getCustomerDetails(id);
            request.setAttribute("cusDetails", userDetails); // Corrected attribute name

            RequestDispatcher dis = request.getRequestDispatcher("Profile.jsp");
            dis.forward(request, response);
        }
    }
}
