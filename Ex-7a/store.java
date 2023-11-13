import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class store extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String name = request.getParameter("name");
            String movie = request.getParameter("movie");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://172.18.0.2:3306/movies","root","10022004");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into movies values('" + name + "','" + movie + "')");
            stmt.close();
            con.close();
            PrintWriter out = response.getWriter();
            out.println("<html><head>");
            out.println("<link rel='stylesheet' href='style.css' /> <title>Store Movie</title></head>");
            out.println("<body class='flex-col'><h1>Movie Database</h1>");
            out.println("<h2>Movie added successfully</h2>");
            out.println("<a href='accessmovie'>Click here to see the database</a>");
            out.println("</body></html>");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
