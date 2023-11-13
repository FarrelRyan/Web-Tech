import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class evaluationquiz extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String answer1 = request.getParameter("answer1");
        String answer2 = request.getParameter("answer2");
        String answer3 = request.getParameter("answer3");
        String answer4 = request.getParameter("answer4");
        String answer5 = request.getParameter("answer5");

        String correctAnswer1 = "Christopher Nolan";
        String correctAnswer2 = "Leonardo DiCaprio";
        String correctAnswer3 = "1993";
        String correctAnswer4 = "Emma Stone";
        String correctAnswer5 = "Casablanca";

        int score = 0;
        if(answer1.equalsIgnoreCase(correctAnswer1)) {
            score += 20;
        }
        if(answer2.equalsIgnoreCase(correctAnswer2)) {
            score += 20;
        }
        if(answer3.equalsIgnoreCase(correctAnswer3)) {
            score += 20;
        }
        if(answer4.equalsIgnoreCase(correctAnswer4)) {
            score += 20;
        }
        if(answer5.equalsIgnoreCase(correctAnswer5)) {
            score += 20;
        }

        // Store the score in the session for display
        HttpSession session = request.getSession();
        session.setAttribute("score", score);

        // Display the score
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='style.css' /> <title>Quiz Evaluation</title></head>");
        out.println("<body class='flex-col'><h1>Movie Quiz Results</h1><h2>Your Score: " + score + "</h2>");
        out.println("</body></html>");
    }
}
