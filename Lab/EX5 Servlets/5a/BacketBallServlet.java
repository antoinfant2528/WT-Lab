// Java Servlet (BasketballServlet.java)
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BasketballServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Welcome to the Basketball Section!</h1>");
        out.println("<p>This is served via a Servlet.</p>");
    }
}
