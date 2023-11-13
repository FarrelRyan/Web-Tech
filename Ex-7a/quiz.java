import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class quiz extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            // Perform authentication or use a database to validate the user

            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            response.sendRedirect("accessmoviequiz");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
