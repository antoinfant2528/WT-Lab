// CounterServlet.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CounterServlet extends HttpServlet {
    private int counter = 0;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        counter++;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Basketball Page Counter</h1>");
        out.println("<p>Number of visits: " + counter + "</p>");
    }
}
