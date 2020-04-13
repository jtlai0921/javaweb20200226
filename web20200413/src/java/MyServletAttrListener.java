
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
@WebListener
public class MyServletAttrListener implements ServletContextAttributeListener {

       public void attributeAdded(ServletContextAttributeEvent scae) {
        logout("增加了一個ServletContext屬性：attributeAdded('" + scae.getName() + "', '"
                + scae.getValue() + "')");
    }

    public void attributeRemoved(ServletContextAttributeEvent scae) {
        logout("刪除了一個ServletContext屬性：attributeRemoved('" + scae.getName() + "', '"
                + scae.getValue() + "')");
    }

    public void attributeReplaced(ServletContextAttributeEvent scae) {

        logout("某個ServletContext的屬性被改變：attributeReplaced('" + scae.getName() + "', '"
                + scae.getValue() + "')");
    }

    private void logout(String message) {

       System.out.println(message);
    }

}
