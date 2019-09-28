<!DOCTYPE HTML>
<%@page contentType="text/html" import="java.util.*, java.text.*"
	pageEncoding="UTF-8"%>
<html>
    <head>
        <title>
            Página Calculadora
        </title>
    </head>

    <body>
        <form action="/myproject/AntonioServlet" method="post">
            Digite um número:
            <input type="number" name="numero">
            <br>
            Digite Seu nome:
            <input type="text" name="txtnome">
            <br>
            <input type="submit" value="Enviar">
        </form>    
    </body>
</html>

