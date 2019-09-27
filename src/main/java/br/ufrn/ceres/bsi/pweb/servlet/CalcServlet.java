package br.ufrn.ceres.bsi.pweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
<<<<<<< HEAD
        
=======
>>>>>>> 08365b2b1b7963448a6c48468025a14c5fd1b204
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
<<<<<<< HEAD
   
=======
>>>>>>> 08365b2b1b7963448a6c48468025a14c5fd1b204
        PrintWriter saida = response.getWriter();

        saida.append("<br>Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
<<<<<<< HEAD
        // TODO Auto-generated method stub
       

        String number = request.getParameter("numero");
        String nome = request.getParameter("txtnome");

        response.getWriter().append("Número digitado: " + number);
        response.getWriter().append("<br>Nome digitado: " + nome);
=======
        //Definir o Tipo do Conteúdo response para HTML
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String number = request.getParameter("numero");
        String nome = request.getParameter("txtnome");
        
        response.getWriter().append("Esse foi o número digitado: " + number);
        response.getWriter().append("<br>Esse foi o nome digitado: " + nome);
>>>>>>> 08365b2b1b7963448a6c48468025a14c5fd1b204
        response.getWriter().append("<br>");

        doGet(request, response);
    }
}
