import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class restoresession extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Restore Movie Session</title></head>");
        out.println("<body class='flex-col'><h1>Session Restored</h1>");
        out.println("<h2>Movie Title: " + session.getAttribute("movie") + "</h2>");
        out.println("</body></html>");
    }
}
