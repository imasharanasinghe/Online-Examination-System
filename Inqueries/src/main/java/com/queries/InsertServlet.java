package com.queries;

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

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String queryCategory = request.getParameter("queryCategory");
        String queryText = request.getParameter("queryText");
        String submittedAt = request.getParameter("submittedAt");
        String respondedAt = request.getParameter("respondedAt");
        String responseText = request.getParameter("responseText");

        // Check if the email already exists
        if (UserDBUtil.emailExists(email)) {
            request.setAttribute("error", "Email already exists in the system");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Insert.jsp");
            dispatcher.forward(request, response);
            return;
        }

        // Continue with the insertion if the email does not exist
        boolean isSuccess = UserDBUtil.insertCustomer(username, email, queryCategory, queryText, submittedAt, respondedAt, responseText);

        if (isSuccess) {
            response.setContentType("text/html");
            response.getWriter().println("<script type='text/javascript'>");
            response.getWriter().println("alert('Query inserted successfully!');");
            response.getWriter().println("window.location.href = 'http://localhost:8090/Inqueries/Validate.jsp';");
            response.getWriter().println("</script>");
        } else {
            RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
            dis2.forward(request, response);
        }
    }
}

