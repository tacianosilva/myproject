package br.ufrn.ceres.bsi.pweb.gabrielbatista;

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
@WebServlet("/CalcGB")
public class Calculadora extends HttpServlet {

    
  
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculadora() {
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
        
        //Cria variáveis
        String nome = request.getParameter("nome");
        String numero = request.getParameter("numero");
        String par;
        String primo;
        String perf;
        ArrayList<Integer> div = new ArrayList<Integer>();
        
        //Checa se é par
        if(Integer.parseInt(numero) % 2 == 0)
           par = "Sim";
        else
           par = "Não";
        
        //adiciona o 1 no vetor de divisores.
        div.add(1);

        //Se encontrar qualquer divisor entre 2 e "numero" adicione-o no vetor "div" e some 1 a variável "testePrimo".
        int testePrimo = 0;
        for (int aux = 2; aux < Integer.parseInt(numero); aux++) {
            if (Integer.parseInt(numero) % aux == 0){
                div.add(aux);
                testePrimo++;
            }     
        }
        div.add(Integer.parseInt(numero));
        
        //Se "testePrimo" for igual a zero então "numero" é primo
        if(testePrimo == 0)
            primo = "Sim";
        else
            primo = "Não";
        
        //"testePerf" atribuido como "-Integer.parseInt(numero)" para que o número seja desconsiderado da soma.
        int testePerf = -Integer.parseInt(numero);
        //Soma todos os valores do vetor de divisores e coloca o resultado em "testePerf".
        for (int i = 0; i < div.size();i++) 
            testePerf += div.get(i);
        
        //Se "testePerf" for igual a "numero" então é perfeito
        if (testePerf == Integer.parseInt(numero))
            perf= "Sim";
        else
            perf = "Não";

        request.setAttribute("nome", nome);
        request.setAttribute("numero", numero);
        request.setAttribute("par", par);
        request.setAttribute("primo", primo);
        request.setAttribute("perfeito", perf);
        request.setAttribute("div", div);

        request.getRequestDispatcher("20192/gabrielBatista/calculadora.jsp").forward(request,response);
    }
}
