package ch.hesge.listener;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

@WebServlet("/sessionbindingtest")
public class SessionBindingListenerTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("object",new Object());
        session.setAttribute("date",new java.util.Date());
        session.setAttribute("array", new Object[]{new Object(),new Object(), new java.util.Date()});
        session.setAttribute("list", Arrays.asList(new Object(), new Object(), new java.util.Date()));
    }
}
