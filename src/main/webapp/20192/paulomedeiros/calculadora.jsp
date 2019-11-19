<!DOCTYPE html>
<%@page contentType="text/html" import="java.util.*, java.text.*"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Calculadora JSP</title>
</head>
<body>

    <h1>Resultados</h1>

    <%
    int numero = Integer.parseInt(request.getParameter("numero"));
    if(numero % 2 == 0){
        out.println("O número é par <br>");
    } else {
        out.println("O número é ímpar <br>");
    }

    boolean primo = true;

    for(int j = 2; j < numero; j++){
        if(numero % j == 0){
            primo = false;
        }
    }

    if(primo == true){
        out.println("O número é primo <br>");
    } else {
        out.println("O número não é primo <br>");
    }

    out.println("Divisores do número: ");
    for(int i = numero; i>0;i--){
        if(numero%i==0){
            out.println(i);
        }
    }

    out.println("<br>");

    int metade = numero/2;
    int soma = 0;
    
    for (int k = 1; k <= metade; k++){
        if(numero % k == 0){
            soma = soma + k;
        }
    }

    if (soma == numero){
        out.println("O número é perfeito <br>");
    } else {
        out.println("O número não é perfeito <br>");
    }
    %>
</body>
</html>