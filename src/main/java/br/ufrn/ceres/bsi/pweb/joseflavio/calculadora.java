package br.ufrn.ceres.bsi.pweb.joseflavio;

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
@WebServlet("/calculadora")
public class calculadora extends HttpServlet {

    
  
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculadora() {
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
        ArrayList<Integer> divisores = new ArrayList<Integer>();
   

        String number = request.getParameter("numero");
        String nome = request.getParameter("txtnome");
        String par = "par";
        String per = "Não é perfeito";
        String pin = "Não é primo";
        if(Integer.parseInt(number) % 2 == 0){
           par= "O numero é par";
        }else{
           par= "O numero é impar";
        }
        int prime =0;
        for (int j = 2; j < Integer.parseInt(number); j++) {
            if (Integer.parseInt(number) % j == 0){
                prime++;
                divisores.add(j);
            }     
        }
        divisores.add(Integer.parseInt(number));
        
        if(prime==0){
            pin ="é primo";
        }
        int aux=0;
        for (int i=1 ;i<Integer.parseInt(number);i++){
            if (Integer.parseInt(number) % i==0){
                aux=i+aux;
            }
        }
        if (aux==Integer.parseInt(number)){
            per= "é perfeito";
        }else
            per = "nâo é perfeito";


        request.setAttribute("par", par);
        request.setAttribute("nome", nome);
        request.setAttribute("perfeito", per);
        request.setAttribute("primo", pin);
        request.setAttribute("divisores", divisores);

        request.getRequestDispatcher("20192/JFmaia/calculadora.jsp").forward(request,response);
    }
}
