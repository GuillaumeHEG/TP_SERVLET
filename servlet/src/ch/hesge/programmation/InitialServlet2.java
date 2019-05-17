package ch.hesge.programmation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/initial2")
public class InitialServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out =resp.getWriter();
        out.println("<html><body>");
        out.println("<p>Somethings</p>");
        req.getRequestDispatcher("/include").include(req,resp);
        out.println("<p>Other Somethings</p>");
        out.println("</body></html>");
    }
}
