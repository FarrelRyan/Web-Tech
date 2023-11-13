import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class servlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Movie Hidden Form Fields</title></head>");
        out.println("<body class='flex-col'><h1>Movie Hidden Form Fields</h1>");
        out.println("<form action='restoremoviehidden' method='post'>");
        out.println("<input type='hidden' name='title' value='" + request.getParameter("title") + "' />");
        out.println("<input type='hidden' name='genre' value='" + request.getParameter("genre") + "' />");
        out.println("<input type='submit' value='Restore' />");
        out.println("</form></body></html>");
    }
}
