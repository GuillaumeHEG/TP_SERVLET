package ch.hesge.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {

     /*   incrementCount(httpSessionEvent);*/
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
     /*   decrementCount(httpSessionEvent);*/
    }

    private void incrementCount(HttpSessionEvent event){

        changeCount(event, 1);
    }

    private void decrementCount(HttpSessionEvent event) {
        changeCount(event, -1);
    }

    private void changeCount(HttpSessionEvent event, int value) {
        if (event.getSession().getServletContext().getAttribute("count") == null){
            storeTheCount(event.getSession(), value);
        }
        int count = (int)event.getSession().getServletContext().getAttribute("count");

        int newCount = count+value;
        storeTheCount(event.getSession(),newCount);
    }

    private void storeTheCount(HttpSession session, int count){
        session.setAttribute("count", count);
        session.getServletContext().setAttribute("count", count);
    }

}
