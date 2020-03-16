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
import javax.servlet.http.HttpSession;
import beans.GuessGameLogic;
/**
 *
 * @author teacher
 */
@WebServlet(urlPatterns = {"/FortuneServlet"})
public class FortuneServlet extends HttpServlet {

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
    HttpSession session = request.getSession();
    GuessGameLogic gameService=(GuessGameLogic)session.getAttribute("GameService");
    if (gameService==null) {
      gameService = new GuessGameLogic(1, 10);
      session.setAttribute("GameService" , gameService);    
    }    
    String guess = request.getParameter("number");
    int guessNum = Integer.parseInt(guess);
    if ( gameService.isCorrectGuess(guessNum) ) {
      generateYouWinResponse(request, response);
      session.invalidate();
    } else {
      int remainder = gameService.getRemainder();
      if ( remainder > 0) {
        generateTryAgainResponse(request, response, remainder);
      } else {
	generateTooManyGuessesResponse(request, response);
	session.invalidate();
      }
    }

    }
     public void generateTryAgainResponse(HttpServletRequest request,
			HttpServletResponse response, int remainder)
	 throws IOException {
    String guess = request.getParameter("number");
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html><head></head><body>");
    out.println("Your guess " + guess + " , and You wrong.</br>");
    out.println("You still have " + remainder + " chances.Try again.</br>");
    out.println("<a href='guess.html'>Gogogo!!</a>");
    out.println("</body></html>");
    out.close();
  }
  public void generateYouWinResponse(HttpServletRequest request,
				     HttpServletResponse response)
	 throws IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html><head></head><body>");
    out.println("Congratulations , You win! <BR>");
    out.println("**<a href='guess.html'>New Game</a>**");
    out.println("</body></html>");
    out.close();
  }
  public void generateTooManyGuessesResponse(HttpServletRequest request,
					     HttpServletResponse response)
	 throws IOException {
    String guess = request.getParameter("number");
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html><head></head><body>");
    out.println("Your guess " + guess + " , and You wrong.</br>");
    out.println("Sorry, You have no change.</br>");
    out.println("**<a href='guess.html'>New Game</a>**");
    out.println("</body></html>");
    out.close();
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
