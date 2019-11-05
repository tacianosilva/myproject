package br.ufrn.ceres.bsi.pweb.arthurmdros;

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
@WebServlet("/Calculadora")
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
            doPost(request, response);
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

        String name = request.getParameter("nome");
        String mail = request.getParameter("email");
        String num = request.getParameter("numero");
        
        PrintWriter out = response.getWriter();        
        try{
            if(num.equals("")){
                out.println("Campo número não foi preenchido.");
            }
            else{
                out.println("Nome: "+name);
                out.println("<br>E-mail: "+mail);
                out.println("<br>Número: "+num);
                out.println("<br>");
                    if(getPrimo(num) == 1){
                        out.println("Número é primo!");
                    }else{
                        out.println("Número não é primo!");
                    }
                    out.println("<br>Lista de divisores:");                                    
                    int tamDiv = listarDivisores(num).length;
                    for (int a = 0; a != tamDiv; a++){
                        if(listarDivisores(num)[a]!=0){
                            out.println(" "+listarDivisores(num)[a]);
                        }        
                    }
                    out.println("<br>");
                    if(numeroPerfeito(num,listarDivisores(num)) == 1){
                        out.println("O número é perfeito!");                
                    }else{
                        out.println("O número não é perfeito!");                
                    }     
                }                     
        }finally{
            out.close();
        }
        doGet(request, response);
    }
    
    protected int getPrimo(String numero){                                
            int num = Integer.parseInt(numero);    
            int k, resultado = 0;        
    
            for (k = 2; k <= num / 2; k++) {
                if (num % k == 0) {
                    resultado++;
                    break;
                }
            }
        
            if(resultado == 0){
                return 1;
            }else{
                return 0;
            }
            
    }


    protected int[] listarDivisores(String numero){        
        int[] divisores = new int[10];
        int num = Integer.parseInt(numero);
        
        int j = 0;

        for(int i = 1; i <= num; i++){               
            if(num % i == 0){
                 divisores[j] = i;
                 j++;
            }
         }                    
         return divisores;                 
    }
    protected int numeroPerfeito(String numero, int[]divisores){            
            int num = Integer.parseInt(numero);
            int result = 0;
            int tamDiv = divisores.length;
            for(int i = 0; i < tamDiv; i++){
                result = result + divisores[i];                
            }
            result -= num;
            if(result == num){
                return 1;
            }else {
                return 0;
            }
    }

}