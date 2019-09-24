<!DOCTYPE html>
<%@page contentType="text/html" import="java.util.*, java.text.*"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Formulário Número</title>
</head>
<body>

    <h1>Formulário</h1>
        <form action="calculadora.jsp" method="post">
            Número:<input type="number" name="numero"/><br><br>
            <input type="submit" value="Enviar"/>
        </form>
</body>
</html>