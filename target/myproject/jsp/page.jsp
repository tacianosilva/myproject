<!DOCTYPE html>
<%@page contentType="text/html" import="java.util.*, java.text.*"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Página JSP Olá Mundo</title>
</head>
<body>
        <%@include file="topo.jsp"%>

        <form action="trataform.jsp" method="post">
            Número:<input type="number" name="numero"/><br><br>
            Nome:<input type="text" name="txtnome"/><br>
            E-Mail:<input type="text" name="txtemail"/><br>
            Data de Nascimento:<input type="text" name="txtdtnasc"/><br>
            <input type="submit" value="Enviar"/>

        </form>
        <%@include file="rodape.jsp"%>
</body>
</html>
