import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PickColorServlet", urlPatterns = "/pickcolor")
public class PickColorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/viewcolor.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String userFavColor = request.getParameter("usercolor");
        System.out.println(userFavColor);
        response.sendRedirect("/viewcolor.jsp?usercolor=userFavColor");
    }

}
