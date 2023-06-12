import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {

    private int counter = 0;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        String empty = req.getParameter("empty");

        if (empty == null){
            counter ++;
            out.println("<h3>Page Views: " + counter + "</h3>");
        } else {
            counter = 1;
            out.println("<h3>Page Views: " + counter + "</h3>");
        }
    }

}
