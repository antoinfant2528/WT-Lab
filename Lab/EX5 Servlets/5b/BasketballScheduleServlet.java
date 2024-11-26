// BasketballScheduleServlet.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BasketballScheduleServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Basketball Game Schedule</h1>");
        out.println("<ul>");
        out.println("<li>Team A vs Team B - 7:00 PM</li>");
        out.println("<li>Team C vs Team D - 9:00 PM</li>");
        out.println("</ul>");
    }
}
