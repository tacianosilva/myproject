package br.ufrn.ceres.bsi.pweb.marcelorai;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletCalc")
public class ServletCalc extends HttpServlet
{
    private static final long serialVersionUID=1L;
    public ServletCalc()
    {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
        {
            //PrintWriter saida=response.getWriter();
            //saida.append("<br>Served at: ").append(request.getContextPath());
        }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
        {
            response.setCharacterEncoding("UTF-8");
            String number=request.getParameter("numero");
            response.getWriter().append("<br>Esse foi o número digitado: " + number);
            int num=Integer.parseInt(number);
            if(num%2==0)
            {
                response.getWriter().append("<br>Ele é par!");
            }
            else
            {
            response.getWriter().append("<br>Ele é ímpar!");
            }
            int numDiv=0;
            for(int i=1; i<=num; i++)
            {
                if(num%i==0)
                {
                    numDiv++;
                }
            }
            if(numDiv==2)
            {
                response.getWriter().append("<br>Ele é primo!");
            }
            else
            {
            response.getWriter().append("<br>Ele não é primo!");
            }
            ArrayList<Integer> listaDiv=new ArrayList<Integer>();
            for(int div=1; div<=num; div++)
            {
                if(num%div==0)
                {
                    listaDiv.add(div);
                }
            }
            response.getWriter().append("<br>Os divisores dele são:<br>");
            for(Integer numero:listaDiv)
            {
                response.getWriter().append(String.valueOf(numero) + " ");
            }
            int x=0;
            for(int i=1; i<num; i++)
            {
                if(num%i==0)
                {
                    x=i+x;
                }
            }
            if(x==num)
            {
                response.getWriter().append("<br>Ele é perfeito!");
            }
            else
            {
                response.getWriter().append("<br>Ele não é perfeito!");
            }
            doGet(request, response);
        }
}