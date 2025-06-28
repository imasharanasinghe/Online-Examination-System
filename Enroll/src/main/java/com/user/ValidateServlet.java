package com.user;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String nic = request.getParameter("nic");

        try {
            List<User> cusDetails = UserDBUtil.validate(username, nic);
            if (cusDetails != null && !cusDetails.isEmpty()) {
                // Pass the customer details as a request attribute
                request.setAttribute("cusDetails", cusDetails);
                // Forward the request to Tests.jsp
                RequestDispatcher dispatcher = request.getRequestDispatcher("Tests.jsp");
                dispatcher.forward(request, response);
            } else {
                response.setContentType("text/html");
                response.getWriter().println("<script type='text/javascript'>");
                response.getWriter().println("alert('Invalid username or nic');");
                response.getWriter().println("location='Login.jsp';");
                response.getWriter().println("</script>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
