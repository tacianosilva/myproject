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
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter saida = response.getWriter();

        saida.append("<br>Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Definir o Tipo do Conteúdo response para HTML
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String number = request.getParameter("number");
        String nome = request.getParameter("nome");
        response.getWriter().append("\nEsse foi o número digitado: " + number);
        response.getWriter().append("\nEsse foi o nome digitado: " + nome);
        if(Integer.parseInt(number) % 2 == 0)
            System.out.println("Numero Par\n");
        else
            System.out.println("Numero Impar\n");

        doGet(request, response);
    }
}
