import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class session extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("movie", request.getParameter("movie"));
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Movie Session</title></head>");
        out.println("<body class='flex-col'><h1>Session Created</h1>");
        out.println("<a href='restoremoviesession'>Click here to see the session</a>");
        out.println("</body></html>");
    }
}
