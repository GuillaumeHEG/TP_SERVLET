package ch.hesge.filter;

import ch.hesge.model.Person;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/person/xml")
public class PersonXMLFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // NOTHING TO DO
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest, servletResponse);

        HttpServletRequest request = (HttpServletRequest)servletRequest;
        Person person = (Person)request.getAttribute("person");

        servletResponse.setContentType("text/xml");
        PrintWriter out = servletResponse.getWriter();

        out.println("<person>");
        out.println("<firstName>"+person.firstName+"</firstName>");
        out.println("<lastName>"+person.lastName+"</lastName>");
        out.println("</person>");

    }

    @Override
    public void destroy() {
        // NOTHING TO DO
    }
}
