<!DOCTYPE html>
<%@page contentType="text/html" import="java.util.*, java.text.*, java.lang.String" pageEncoding="UTF-8"%>
<%
    /*String number = (String) request.getAttribute("number");
    String ePar = (String) request.getAttribute("ePar");
    String ePrimo = (String) request.getAttribute("ePrimo");
    String ePerfeito = (String) request.getAttribute("ePerfeito");
    ArrayList<Integer> lista = (ArrayList<Integer>) request.getAttribute("lista");*/
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
        <title>Resultado da calculadora</title>
    </head>
    
    
    <body>
            <p>O número digitado foi ${numero}.</p><br />
            <p>O número ${ePar}.</p><br />
            <p>O número ${ePrimo}.</p><br />
            <p>Lista de divisores: ${lista}</p>
            <% /*for (int i = 0; i < lista.size(); i++){
                    //lista.get(i);
                    out.print(""+i+"    ");
               }*/
            %><br />
            <p>O número ${ePerfeito}.</p><br />
    </body>
</html>