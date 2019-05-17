package ch.hesge.programmation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet("/param")
public class ParamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String,String[]> params = req.getParameterMap();
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("Params<table border= 1><thead><tr><th>");
        if(!params.isEmpty()){out.println("<tbody>");}
        for(Map.Entry<String,String[]> entry :params.entrySet()) {
            out.println("<tr>");
            out.println("<td>" + entry.getKey() + "</td>");
            String[] values=  entry.getValue();
            switch (values.length){
                case 0:
                    break;
                case 1:
                    out.print(values[0]);
                    break;
                default:
                    for (String value:values) {
                        out.println("<ul>");
                        out.println("<li>");
                        out.println(value);
                        out.println("</li>");
                        out.println("</ul>");
                    }
            }


        }
    }
}
