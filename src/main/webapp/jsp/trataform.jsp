<%@page contentType="text/html" import="java.util.*, java.text.*, java.lang.String" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="topo.jsp"%>
        Dados do formulário<br>
        <%
        String nome = request.getParameter("txtnome");
        if(nome=="") {
            out.println("Nome não foi digitato");
        } else {
             out.println("Seu nome é " + nome);
        }
        %>
        <br>
        <br>E-Mail: <%=request.getParameter("txtemail")%><br>
        Data de Nascimento: <%=request.getParameter("txtdtnasc")%><br>
        <%
        String numero = request.getParameter("numero");
        int v = Integer.parseInt(numero);
        if (ehPar(v)) {
            out.println("O número é par!!");
        } else {
            out.println("O número é ímpar!!");
        }
        %>
        <%@include file="rodape.jsp"%>
    </body>
</html>