package br.ufrn.ceres.bsi.pweb.amorimmaria;

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
@WebServlet("/CalcServletMaria")
public class CalcServletMaria extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServletMaria() {
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

        //String numero = request.getParameter("numero");
        int numero = Integer.parseInt(request.getParameter("numero"));
        String num;
        String numPrimo;
        String perfeito;
       
        

         if(numero % 2 == 0){
             num = "é par.";
        }else{
             num = "é ímpar.";
        }
        
        int primo = 0;
        for (int cont = 1; cont <= numero; cont++) {
            if (numero % cont == 0){
                primo++;
            }     
        } 
        if(primo == 2){
            numPrimo = " é primo.";
        }
        else{
            numPrimo = "não é primo.";
        }
        
        ArrayList<Integer> divisores = new ArrayList<Integer>();
        for(int i = 1; i <= numero; i++){
            if(numero % i == 0) {
                divisores.add(i);
            }           
        }
			
        int numPerf = 0;
        for (int i = 1; i < numero;i++) {
            if(numero % i == 0)
                numPerf += i;
        }
        if (numPerf == numero){
            perfeito = "é perfeito";
        }     
        else{
            perfeito = "não é perfeito";
        }
          
        response.getWriter().append("Esse foi o número digitado: " + numero + ", ele " + num); 
        response.getWriter().append("<br>Este número " + numPrimo); 
        response.getWriter().append("<br>Estes são seus divisores " + divisores); 
        response.getWriter().append("<br>Este número "  + perfeito);    

        doGet(request, response);
    }
}
