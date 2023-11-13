import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class movie extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie titleCookie = new Cookie("title", request.getParameter("title"));
        Cookie genreCookie = new Cookie("genre", request.getParameter("genre"));
        titleCookie.setMaxAge(60*60*24);
        genreCookie.setMaxAge(60*60*24);
        response.addCookie(titleCookie);
        response.addCookie(genreCookie);

        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Movie Added</title></head>");
        out.println("<body class='flex-col'><h1>Movie Added</h1>");
        out.println("<a href='showmovies'>Click here to see the movies</a>");
        out.println("</body></html>");
    }
}
