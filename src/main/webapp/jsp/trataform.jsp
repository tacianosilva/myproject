<%@page contentType="text/html" import="java.util.*, java.text.*, java.lang.String" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="topo.jsp"%>
        <h3>Dados do formulário</h3>
        <%
        String numero = request.getParameter("numero");
        int v = Integer.parseInt(numero);
        out.println("Divisores:<br>");
        out.println("É par ou ímpar?<br>");
        if (ehPar(v)) {
            out.println("<strong>O número " + v + " é par!!</strong><br>");
        } else {
            out.println("<strong>O número " + v + " é ímpar!!</strong><br>");
        }
        out.println("É primo?<br>");
        out.println("É perfeito?<br>");
        %>
        
        <hr>
        
        <%
        String nome = request.getParameter("txtnome");
        if(nome=="") {
            out.println("Nome não foi digitato");
        } else {
            out.println("Seu nome é " + nome);
        }
        %>
        <br><br>
        E-Mail: <%=request.getParameter("txtemail")%><br>
        Data de Nascimento: <%=request.getParameter("txtdtnasc")%><br>

        <%@include file="rodape.jsp"%>
    </body>
</html>