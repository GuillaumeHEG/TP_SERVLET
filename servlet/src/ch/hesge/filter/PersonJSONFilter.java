package ch.hesge.filter;

import ch.hesge.model.Person;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/person/json")
public class PersonJSONFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // NOTHING TO DO
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest, servletResponse);

        HttpServletRequest request = (HttpServletRequest)servletRequest;
        Person person = (Person)request.getAttribute("person");


        servletResponse.setContentType("application/json");
        PrintWriter out = servletResponse.getWriter();

        out.println("{");
        out.println("   \"person\": {");
        out.println("       \"firstName\":" +person.firstName + "," );
        out.println("       \"lastName\":" + person.lastName);
        out.println("   }");
        out.println("}");

    }

    @Override
    public void destroy() {
        // NOTHING TO DO
    }
}
