package br.ufrn.ceres.bsi.pweb.kaelsilva;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


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
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        
        String numero, ePar, ePerfeito, ePrimo;
        ArrayList<Integer> lista = new ArrayList<>();
        
        numero = request.getParameter("numero");
        
        
        
        
        	if (parImpar(Integer.parseInt(numero)) == 1) {
        		ePar = "é par";
            } else {
            	ePar = "é ímpar";
            }
            
        	
            if (primo(Integer.parseInt(numero)) == 1) {
            	ePrimo = "é primo";
            } else {
                ePrimo = "não é primo";
            }
            
            
            lista = listaDeDivisores(Integer.parseInt(numero));
            
            
            
            if (numeroPerfeito(Integer.parseInt(numero), lista) == 1) {
            	ePerfeito = "é perfeito";
            } else {
            	ePerfeito = "não é perfeito";
            }
        
        
        request.setAttribute("ePar", ePar);
        request.setAttribute("ePrimo", ePrimo);
        request.setAttribute("ePerfeito", ePerfeito);
        request.setAttribute("lista", lista);
        request.setAttribute("numero", numero);
        request.getRequestDispatcher("20192/kaelsilva/calculadora.jsp").forward(request,response);
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
