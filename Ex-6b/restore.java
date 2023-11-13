import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class restore extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Restore Movie Hidden Form Fields</title></head>");
        out.println("<body class='flex-col'><h1>Restore Movie Hidden Form Fields</h1>");
        out.println("<h2>Title: " + request.getParameter("title") + "</h2>");
        out.println("<h2>Genre: " + request.getParameter("genre") + "</h2>");
        out.println("</body></html>");
    }
}
