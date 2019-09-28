package br.ufrn.ceres.bsi.pweb.antoniofern;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/AntonioServlet")
public class AntonioServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AntonioServlet() {
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

        String number = request.getParameter("numero");
        String nome = request.getParameter("txtnome");

        response.getWriter().append("Esse foi o número digitado: " + number);
        response.getWriter().append("<br>Esse foi o nome digitado: " + nome);
        response.getWriter().append("<br>");
        int n = Integer.parseInt(number);
        if (n%2==0){
            response.getWriter().append("Esse número é par");
        }else{
            response.getWriter().append("Esse número é ímpar");
        }

        
        int numDivisiores = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                numDivisiores++;
            }
        }
        if (numDivisiores == 2){
            response.getWriter().append("<br>O número é primo");
        }else{
            response.getWriter().append("<br>O número não é primo");
        }
        
        ArrayList<Integer> listaDivisores = new ArrayList<Integer>();
        if (n == 0){
            response.getWriter().append("<br>Não há divisores pra esse número");
        }else{
            listaDivisores.add(1);

            for (int div = 2; div <= n; div++){
                if (n % div == 0){
                    listaDivisores.add(div);
                }
            }
            response.getWriter().append("<br>Divisores<br>");
            for(Integer numero:listaDivisores){
                response.getWriter().append(String.valueOf(numero)+" ");
            }
        }
        
        


        doGet(request, response);
    }
}
