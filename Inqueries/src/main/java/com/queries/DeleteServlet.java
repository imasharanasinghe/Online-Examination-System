package com.queries;

import jakarta.servlet.*;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userId");
        
        // Call delete method in UserDBUtil
        boolean isDeleted = UserDBUtil.deleteUser(Integer.parseInt(userId));
        
        // Redirect based on the deletion result
        if (isDeleted) {
            response.sendRedirect("Insert.jsp?status=success");
        } else {
            response.sendRedirect("Validate.jsp?status=error");
        }
    }
}
