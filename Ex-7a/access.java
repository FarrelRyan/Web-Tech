import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class access extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PrintWriter out = response.getWriter();
            out.println("<html><head>");
            out.println("<link rel='stylesheet' href='style.css' /> <title>Access Movie</title></head>");
            out.println("<body class='flex-col'><h1>Movie Database</h1>");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://172.18.0.2:3306/movies","root","10022004");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from movies");
            out.println("<table><tr><th>Name</th><th>Movie</th></tr>");
            while(rs.next()) {
                out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td></tr>");
            }
            out.println("</table>");
            out.println("</body></html>");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
