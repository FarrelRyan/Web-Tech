import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class movieurl extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Movie URL Rewriting</title></head>");
        out.println("<body class='flex-col'><h1>Movie URL Rewriting</h1>");
        out.println("<a href='restoremovieurl?movie=" + request.getParameter("movie") + "&genre=" + request.getParameter("genre") + "'>Click here to see the URL</a>");
        out.println("</body></html>");
    }
}
