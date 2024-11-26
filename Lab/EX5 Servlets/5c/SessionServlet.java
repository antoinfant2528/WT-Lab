// SessionServlet.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        Integer visitCount = (Integer) session.getAttribute("visitCount");
        if (visitCount == null) {
            visitCount = 1;
        } else {
            visitCount++;
        }
        session.setAttribute("visitCount", visitCount);
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Basketball Session</h1>");
        out.println("<p>Number of visits: " + visitCount + "</p>");
    }
}
