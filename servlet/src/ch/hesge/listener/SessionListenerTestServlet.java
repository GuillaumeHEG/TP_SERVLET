package ch.hesge.listener;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/count")
public class SessionListenerTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int count = getSessionCount(req);
        req.setAttribute("count", count);
        req.getRequestDispatcher("WEB-INF/count.jsp").forward(req, resp);
    }

    private int getSessionCount(HttpServletRequest req){
        if (req.getSession().getAttribute("count") == null){
            return 0;
        }else {
            return (int)req.getSession().getAttribute("count");
        }
    }

}
