import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class accessquiz extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");

        if (username == null) {
            response.sendRedirect("login.html");
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><head>");
            out.println("<link rel='stylesheet' href='style.css' /> <title>Access Movie Quiz</title></head>");
            out.println("<body class='flex-col'><h2>Welcome to the Movie Quiz, " + username + "!</h2>");
            out.println("<form class='flex-col' action='evaluationmoviequiz' method='post'>");
            out.println("Question 1: Who directed the movie 'Inception'?");
            out.println("<input type='text' name='answer1'>");
            out.println("Question 2: Which actor played the character 'Jack Dawson' in 'Titanic'?");
            out.println("<input type='text' name='answer2'>");
            out.println("Question 3: What year was the movie 'Jurassic Park' released?");
            out.println("<input type='text' name='answer3'>");
            out.println("Question 4: Who won the Academy Award for Best Actress in a Leading Role for 'La La Land'?");
            out.println("<input type='text' name='answer4'>");
            out.println("Question 5: Which movie is known for the quote 'Here's looking at you, kid'?");
            out.println("<input type='text' name='answer5'>");
            out.println("<input type='submit' value='Evaluate'>");
            out.println("</form>");
            out.println("</body></html>");
        }
    }
}
