package br.ufrn.ceres.bsi.pweb.jainesenna.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/CalcServlet1")
public class CalcServlet1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet1() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //PrintWriter saida = response.getWriter();

        //saida.append("<br>Served at: ").append(request.getContextPath());
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
        
        String nome = request.getParameter("nome");
        String number = request.getParameter("numero");
        
        response.getWriter().append("<br>Seu nome: " + nome);
        response.getWriter().append("<br>Esse foi o número digitado: " + number);
        
        // Verifica se o número é par ou impar
        int num = Integer.parseInt(number);

        if (num % 2 == 0){
            response.getWriter().append("<br>Ele é par ");
        }else{
            response.getWriter().append("<br>Ele é impar");
        }

        //verifica se o número é primo ou não
        int numDiv = 0;
        for (int i = 1; i<=num; i++){
            if(num % i == 0){
                numDiv ++;
            }
        }
        if(numDiv == 2){
            response.getWriter().append("<br>Ele é primo ");
        }else{
            response.getWriter().append("<br>Ele não é primo ");
        }

        // mostra os divisores
        ArrayList<Integer> listaDiv = new ArrayList<Integer>();
        for (int div = 1; div<=num; div++){
            if(num % div == 0){
                listaDiv.add(div);
            }
        }
        response.getWriter().append("<br>Os divisores dele são:<br>");
        for(Integer numero:listaDiv){
            response.getWriter().append(String.valueOf(numero) + " ");
        }

        //verifica se o número é perfeito
        int x = 0;
        for (int i = 1;i < num; i++){
            if (num % i==0){
                x = i+x;
            }
        }
        if (x == num){
            response.getWriter().append("<br>Ele é perfeito ");
        }else
            response.getWriter().append("<br>Ele não é perfeito ");

        doGet(request, response);

    }
}
