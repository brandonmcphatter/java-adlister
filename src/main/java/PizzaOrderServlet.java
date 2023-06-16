import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizza-order.jsp").forward(request,response);
        }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Pizza Order = new Pizza();
        Order.pieSize = request.getParameter("pizza-size");
        Order.crust = request.getParameter("pizza-crust");
        Order.sauce = request.getParameter("pizza-sauce");
        Order.toppings = request.getParameterValues("toppings");
        Order.address = request.getParameter("delivery-address");

        System.out.println(Order);
        response.sendRedirect("http://localhost:8080/pizza-order.jsp");
    }
}
