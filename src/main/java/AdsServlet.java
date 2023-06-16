import DAO.Ad;
import DAO.DaoFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdsServlet", urlPatterns = "/ads")
public class AdsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Ad> ads = DaoFactory.getAdsDao().all();
        req.setAttribute("ads", ads);
        req.setAttribute("title", "Ads Lister");
        System.out.println(ads.get(0).getTitle());
        req.getRequestDispatcher("ads/index.jsp").forward(req, resp);
    }
}
