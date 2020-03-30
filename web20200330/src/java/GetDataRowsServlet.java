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
import java.util.*;
import model.*;
/**
 *
 * @author teacher
 */
@WebServlet(urlPatterns = {"/GetDataRows"})
public class GetDataRowsServlet extends HttpServlet {

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
       String url = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=CST";
        String username = "root";
        String password = "1234";
        PrintWriter out = response.getWriter();
        String city=request.getParameter("city");
        ArrayList<SimpleEmp> list=new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            CallableStatement cStmt = con.prepareCall("{CALL GetEmployeeByCity(?)}");
            cStmt.setString(1, city);
            ResultSet rs=cStmt.executeQuery();
            // print(out, rs);
            fillList(rs, list);
            request.getSession().setAttribute("emps", list);
           request.getRequestDispatcher("ShowEmpInCity.jsp").forward(request, response);
                 
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
      public void fillList(ResultSet rs, ArrayList<SimpleEmp> list) {
        try {
            while (rs.next()) {
                SimpleEmp emp=new SimpleEmp(
                        rs.getInt("employeeNumber"),rs.getString("firstname"),
                        rs.getString("lastname"),rs.getString("email"));
                list.add(emp);
            }
        } catch (Exception ex) {
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
