/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import model.Supplier;
import com.google.gson.*;
/**
 *
 * @author teacher
 */
@WebServlet(urlPatterns = {"/SupplierJsonServlet"})
public class SupplierJsonServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String id=request.getParameter("supid");
        String s1=query(id);
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println(s1);
            
        }
    }
   String query(String id){
       Supplier sp=null;
       String ret="";
       try{
              String url = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=CST";
              String username = "root";
              String password = "1234";
              Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con = DriverManager.getConnection(url, username, password);
              String sql="select * from goods.suppliers  where sup_id=?";
              PreparedStatement st=  con.prepareStatement(sql);
              st.setInt(1, Integer.parseInt(id));
              ResultSet rs=st.executeQuery();
              rs.next();
              sp=new Supplier();
              sp.setSup_id(rs.getInt("sup_id"));
              sp.setSup_name(rs.getString("sup_name"));
              sp.setStreet(rs.getString("street"));
              sp.setCity(rs.getString("city"));
              sp.setState(rs.getString("state"));
              sp.setZip(rs.getString("zip"));
              Gson g= new Gson();
              ret=g.toJson(sp);
              con.close();
              
       }catch(SQLException |  ClassNotFoundException ex ){
           System.out.println("Mysql Error :"+ex.getMessage());
       }
       
       return  ret;
   }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
