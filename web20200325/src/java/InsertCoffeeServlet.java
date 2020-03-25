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
/**
 *
 * @author teacher
 */
@WebServlet(urlPatterns = {"/InsertCoffeeServlet"})
public class InsertCoffeeServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InsertCoffeeServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            String coffee=request.getParameter("coffee");
            String sale=request.getParameter("sale");
            String total=request.getParameter("total");         
            String supplier=request.getParameter("supplier");
            String price=request.getParameter("price");         
            try {
                InsertCoffee(coffee,sale,total,supplier,price);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            out.println("新增完成");

            out.println("</body>");
            out.println("</html>");
        }
    }
   public void InsertCoffee(String coffee,String sale,String total,String supplier,String price)
    throws SQLException {
    Connection con=null;
    PreparedStatement  insert= null;
   

    String insertStatement =
        "insert into COFFEES( COF_NAME , SUP_ID , PRICE , SALES ,TOTAL)" +
        "values ( ? , ? ,? ,? ,?)";

    try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/goods?serverTimezone=CST","root","1234");
      
        con.setAutoCommit(false);    
        insert = con.prepareStatement(insertStatement);

        //for (Map.Entry<String, Integer> e : salesForWeek.entrySet()) { }
           insert.setString(1, coffee); 
           insert.setInt(2, Integer.parseInt(supplier));           
           insert.setDouble(3, Double.parseDouble(price));
           insert.setInt(4, Integer.parseInt(sale));
           insert.setInt(5, Integer.parseInt(total));
            insert.executeUpdate();
            con.commit();
        
    } catch (Exception e ) {
        System.out.println(e.getMessage());
        if (con != null) {
            try {
                System.err.print("Transaction is being rolled back");
                con.rollback();
            } catch(SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    } finally {
        if (insert != null) {
            insert.close();
        }
        if (insert != null) {
            insert.close();
        }
        con.setAutoCommit(true);
    }
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
