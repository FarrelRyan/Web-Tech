import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MovieServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Movie Servlet</title></head>");
        out.println("<body class='flex-col'><h1>Movie Servlet</h1>");
        out.println("<table><tr><th>Movie</th><th>Director</th><th>Release Date</th></tr>");
        out.println("<tr><td>Movie 1</td><td>Director 1</td><td>2023-01-15</td></tr>");
        out.println("<tr><td>Movie 2</td><td>Director 2</td><td>2023-03-20</td></tr>");
        out.println("<tr><td>Movie 3</td><td>Director 3</td><td>2023-05-10</td></tr>");
        out.println("</table></body></html>");
    }
}
