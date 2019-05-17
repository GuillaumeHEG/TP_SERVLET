package ch.hesge.filter;

import ch.hesge.model.Person;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/person/html")
public class PersonHTMLFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // NOTHING TO DO
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest, servletResponse);

        HttpServletRequest request = (HttpServletRequest)servletRequest;
        Person person = (Person)request.getAttribute("person");

        servletResponse.setContentType("text/html");
        PrintWriter out = servletResponse.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Person</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Person</h1>");
        out.println("<p><span style=\"font-weight:bold\">First Name</span> :"+person.firstName+"</p>");
        out.println("<p><span style=\"font-weight:bold\">Last Name</span> : "+person.lastName+"</p>");
        out.println("</body>");
        out.println("</html>");


    }

    @Override
    public void destroy() {
        // NOTHING TO DO
    }
}
