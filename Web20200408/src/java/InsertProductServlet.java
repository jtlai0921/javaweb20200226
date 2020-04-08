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
import com.google.gson.*;
import model.Product;
/**
 *
 * @author teacher
 */
@WebServlet(urlPatterns = {"/InsertProductServlet"})
public class InsertProductServlet extends HttpServlet {

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
             String data=request.getParameter("products");
             Gson g=new Gson();
             Product[ ]  pts=g.fromJson(data, Product[ ].class);
//             String msg="";
//             for(Product s : pts)
//                 msg+=s.toString()+"\n";
//             out.println(msg);
             boolean f=insert(pts);
             if(f)
                 out.println( "多筆資料新增成功");
             else
                 out.println( "多筆資料新增失敗");
        }
    }
    public boolean insert(Product[ ]  pts){
        boolean flag=true;
         String url = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=CST";
        String username = "root";
        String password = "1234";
        String sql="";
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/goods?serverTimezone=CST","root","1234");
      
             con.setAutoCommit(false);    
             sql="insert into goods.product(pid,productName,price ,place) values(?,?,?,?)";
             for(Product pt : pts){
             PreparedStatement insert = con.prepareStatement(sql);        
                insert.setString(1, pt.getPid()); 
                insert.setString(2, pt.getProductName()); 
                insert.setInt(3, pt.getPrice());
                insert.setString(4, pt.getPlace());           
                insert.executeUpdate();
             }
            flag=true;
            con.commit();
              con.setAutoCommit(true);    
        }catch(Exception ex){
            System.out.println("DB Error:"+ex.getMessage());
            flag=false;
        }
        
        return flag;
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
