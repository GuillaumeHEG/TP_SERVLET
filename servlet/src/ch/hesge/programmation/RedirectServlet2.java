package ch.hesge.programmation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/redirect2")
public class RedirectServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Set response content type
        resp.setContentType("text/html");

        // New location to be redirected
        String site = new String("https://google.com");

        resp.setStatus(resp.SC_MOVED_PERMANENTLY);
        resp.setHeader("Location", site);
    }
}
