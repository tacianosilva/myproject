package br.ufrn.ceres.bsi.pweb.kaelsilva;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/KaelServlet")
public class KaelServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    
    public KaelServlet() {
        super();
    }

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter saida = response.getWriter();

        saida.append("<br>Served at: ").append(request.getContextPath());
        
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Definir o Tipo do Conteúdo response para HTML
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        
        String numero, ePar, ePerfeito, ePrimo;
        ArrayList<Integer> lista = new ArrayList<>();
        //int i = 0;
        
        numero = request.getParameter("numero");
        
        
        
        
        	//response.getWriter().append("Esse foi o número digitado: " + number + "<br>");
        	
        	//Exibindo se é par ou ímpar
        	if (parImpar(Integer.parseInt(numero)) == 1) {
            	//response.getWriter().append("É par.<br>");
        		ePar = "é par";
        		
            } else {
            	//response.getWriter().append("<br>É ímpar.<br>");
            	ePar = "é ímpar";
            }
            
        	
        	//Exibindo se é primo
            if (primo(Integer.parseInt(numero)) == 1) {
                //response.getWriter().append("É primo.<br>");
            	ePrimo = "é primo";
            } else {
                //response.getWriter().append("Não é primo.<br>");
                ePrimo = "não é primo";
            }
            
            
            //Exibindo lista de divisores
            lista = listaDeDivisores(Integer.parseInt(numero));
            /*response.getWriter().append("Lista de divisores: ");
            while(i != lista.size()-1) {
                response.getWriter().append(""+lista.get(i)+"    ");
                i++;
            }
            i = 0;
            response.getWriter().append(""+number+"<br>");*/
            
            
            
            //Exibindo se o número é perfeito
            if (numeroPerfeito(Integer.parseInt(numero), lista) == 1) {
                //response.getWriter().append("É perfeito.<br>");
            	ePerfeito = "é perfeito";
            } else {
                //response.getWriter().append("Não é perfeito.<br>");
            	ePerfeito = "não é perfeito";
            }
        
        
        //RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/20192/kaelsilva/calculadora.jsp");
        //dispatcher.forward(request, response);
        request.setAttribute("ePar", ePar);
        request.setAttribute("ePrimo", ePrimo);
        request.setAttribute("ePerfeito", ePerfeito);
        request.setAttribute("lista", lista);
        request.setAttribute("numero", numero);
        request.getRequestDispatcher("20192/kaelsilva/calculadora.jsp").forward(request,response);
        //doGet(request, response);

    }
    
    public int parImpar(Integer n){
    	//retorna 1 se é par, retorna 0 caso contrário
        if (n%2 == 0)
            return 1;
        return 0;
    }
    
    public int primo(Integer n){
    	//retorna 1 se é primo, retorna 0 caso contrário
    	if (n == 2)
    	    return 1;
    	
        if (n%2 == 0 || n == 1)
            return 0;
        
        int i = 3;
        while (i <= n) {
            if (n%i == 0) {
            	if (i == n)
            	    return 1;
                return 0;
            }
            i += 2;
        }
        return 0;
    }
    
    public ArrayList<Integer> listaDeDivisores(Integer n) {
    	//retorna um arraylist com todos os divisores de n
        Integer i = 1;
        ArrayList<Integer> lista = new ArrayList<>();
        while (i <= n) {
            if (n%i == 0)
        	    lista.add(i);
            i++;
        }
        
        return lista;
    }
    
    public int numeroPerfeito(Integer n, ArrayList<Integer> lista){
        //retorna 1 se for perfeito, 0 se não for.
    	int i = 0, soma = 0;
    	
    	while (i < lista.size()-1) {
    	    soma += lista.get(i);
    		i++;
    	}
    	
    	if (soma == n)
    	    return 1;
        return 0;
    }
}
