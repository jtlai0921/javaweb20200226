
import javax.naming.Context;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Web application lifecycle listener.
 *
 * @author teacher
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {
     ServletContext context;
     public void contextDestroyed(ServletContextEvent sce) {
        logout("contextDestroyed()-->ServletContext被銷毀");
        this.context = null;
    }

    public void contextInitialized(ServletContextEvent sce) {
        this.context = sce.getServletContext();
        context.setAttribute("CompanyAddr", "Taipei Taiwan");
        logout("contextInitialized()-->ServletContext初始化了");
    }//ServletContextListener
      private void logout(String message) {

       System.out.println(message);
    }

}
