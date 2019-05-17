package ch.hesge.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import java.lang.reflect.Array;
import java.util.Collection;


@WebListener
public class SessionBindingListener implements HttpSessionAttributeListener {

    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {

        /*if (httpSessionBindingEvent.getValue() instanceof Collection) {
            Collection collection = (Collection) httpSessionBindingEvent.getValue();

            for (Object object : collection) {
               // System.out.print("key: " + httpSessionBindingEvent.getName() + "; value: " + object);
            }
        } else if (httpSessionBindingEvent.getValue() instanceof Object[]) {
            Object[] array = (Object[]) httpSessionBindingEvent.getValue();
            for (Object object : array) {
               // System.out.print("key: " + httpSessionBindingEvent.getName() + "; value: " + object);
            }
        } else {
            //System.out.println("key: " + httpSessionBindingEvent.getName() + "; value: " + httpSessionBindingEvent.getValue());
        }*/
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
        // NOTHING TO DO
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
        // NOTHING TO DO
    }
}
