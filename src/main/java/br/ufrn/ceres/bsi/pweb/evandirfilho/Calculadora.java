package br.ufrn.ceres.bsi.pweb.evandirfilho;

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
@WebServlet("/CalcuServlet")
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
        // Definir o Tipo do Conteúdo response para HTML
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String number = request.getParameter("number");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String date = request.getParameter("date");
        String isEven = "não é par";
        int sumDivisors = 0;
        String isPrime = "não é primo";
        String isPerfect = "não é perfeito";
        ArrayList<Integer> divisors = new ArrayList<Integer>();
     //   SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
      //  date = formatter.format(date);
                  

    
        divisors.add(1);


        if (Integer.parseInt(number) % 2 == 0)
            isEven = "é par";

        int prime = 0;
        for (int i = 2; i < Integer.parseInt(number); i++){
            if (Integer.parseInt(number) % i == 0){
                prime++;
                divisors.add(i);
            }
        }
        
        for (int divisor: divisors){
            sumDivisors += divisor;
        }

        divisors.add(Integer.parseInt(number));

        if (sumDivisors == Integer.parseInt(number))
            isPerfect = "é perfeito";


        if (prime == 0)
            isPrime = "é primo";

        request.setAttribute("number", number);
        request.setAttribute("isEven", isEven);
        request.setAttribute("isPrime", isPrime);
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("date", date);
        request.setAttribute("divisors", divisors);
        request.setAttribute("isPerfect", isPerfect);
        

        
/*      response.getWriter().append("Esse foi o número digitado: " + number);
        response.getWriter().append("<br>Esse foi o nome digitado: " + nome);
        response.getWriter().append("<br>Esse foi o email digitado: " + email);
        response.getWriter().append("<br>Esse foi a data digitada: " + data);
        response.getWriter().append("<br>");
*/
        request.getRequestDispatcher("20192/ridnave/calculadora.jsp").forward(request, response);


        // doGet(request, response);
    }
}
