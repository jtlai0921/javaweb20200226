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
@WebServlet(urlPatterns = {"/SupplierServlet"})
public class SupplierServlet extends HttpServlet {

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
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/goods?serverTimezone=CST","root","1234");
      
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SupplierServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            viewTable(con,out);
            out.println("</body>");
            out.println("</html>");
        }catch(SQLException | ClassNotFoundException ex ){
            System.out.println("SQL Error:"+ex.getMessage());
        }
    }

     public  void viewTable(Connection con,PrintWriter out) throws SQLException {
        Statement stmt = null;
        String query =
                "select SUP_ID, SUP_NAME, STREET, CITY, STATE, ZIP from SUPPLIERS";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            out.println("<table border='1'>");
            while (rs.next()) {             
                out.println("<tr><td>");
                int supplierID = rs.getInt("SUP_ID");
                out.println(""+supplierID);
                out.println("</td><td>");
                String supplierName = rs.getString("SUP_NAME");
                out.println(""+supplierName);
                out.println("</td><td>");
                String street = rs.getString("STREET");
                out.println(""+street);
                out.println("</td><td>");
                String city = rs.getString("CITY");
                 out.println(""+city);
                out.println("</td><td>");
                String state = rs.getString("STATE");
                 out.println(""+state);
                out.println("</td><td>");
                String zip = rs.getString("ZIP");                
                 out.println(""+zip);
                out.println("</td></tr>");
            }
            out.println("</table>");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (stmt != null) {
                stmt.close();
            }
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
