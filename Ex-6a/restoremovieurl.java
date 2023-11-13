import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class restoremovieurl extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Restore Movie URL Rewriting</title></head>");
        out.println("<body class='flex-col'><h1>Restore Movie URL Rewriting</h1>");
        out.println("<h2>Movie Title: " + request.getParameter("movie") + "</h2>");
        out.println("<h2>Genre: " + request.getParameter("genre") + "</h2>");
        out.println("</body></html>");
    }
}
