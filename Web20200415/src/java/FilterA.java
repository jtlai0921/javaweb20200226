/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 *
 * @author teacher
 */
@WebFilter(filterName = "FilterA", urlPatterns = {"/FilterDemo"})
public class FilterA implements Filter {
    
   private FilterConfig filterConfig = null;
   
    public void doFilter(ServletRequest request, ServletResponse response,   FilterChain chain)
            throws IOException, ServletException {
      System.out.println("Pre-Process Start");
       System.out.println("Pre-Process==>"+filterConfig.getFilterName());
      long start=System.currentTimeMillis();
      chain.doFilter(request, response);
      long end=System.currentTimeMillis();
      System.out.println("執行時間:"+(end-start)+"ms");
      System.out.println("Post-Process==>"+filterConfig.getFilterName());
       System.out.println("=====================================");
      
    }    
   @Override
    public void destroy() {        
    }   
   @Override
    public void init(FilterConfig filterConfig) {        
        this.filterConfig = filterConfig;
        if (filterConfig != null) {
           
        }
    }
  
    @Override
    public String toString() {
        if (filterConfig == null) {
            return ("FilterA()");
        }
        StringBuffer sb = new StringBuffer("FilterA(");
        sb.append(filterConfig);
        sb.append(")");
        return (sb.toString());
    }          
    public void log(String msg) {
        filterConfig.getServletContext().log(msg);        
    }
  
}
