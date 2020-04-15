/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytag;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import static javax.servlet.jsp.tagext.Tag.SKIP_BODY;
import javax.servlet.jsp.tagext.TagSupport;

public class IfTag extends TagSupport {
    private boolean test;
    
    public void setTest(boolean test) {
        this.test = test;
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();
           if(test) {
               return EVAL_BODY_INCLUDE;
           }
           out.println("hello");
           return SKIP_BODY;
        } catch (IOException ex) {
            Logger.getLogger(IfTag.class.getName()).log(Level.SEVERE, null, ex);
        }
         return SKIP_BODY;
    }
} 
