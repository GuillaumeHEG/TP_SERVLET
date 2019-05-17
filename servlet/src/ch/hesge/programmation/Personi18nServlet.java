package ch.hesge.programmation;

import javax.ejb.Local;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

@WebServlet("/person")
public class Personi18nServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String param = req.getParameter("lang");
        Locale locale = new Locale(param);
        req.getSession().setAttribute("locale", locale);

       // resp.setContentType("text/html");
        req.getRequestDispatcher("WEB-INF/person.jsp").forward(req,resp);
    }

}
