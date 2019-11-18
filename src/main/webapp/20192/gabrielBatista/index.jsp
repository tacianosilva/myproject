<!DOCTYPE html>
<%@page contentType="text/html" import="java.util.*, java.text.*" pageEncoding="UTF-8"%>
<html lang="pt-br">
    <head>
        <title>Tarefa 01 - 2019.2 - JSP e Servlets</title>
    </head>
    <body>
        <h1>
            <p>Calculadora</p>
        </h1>
        <form action="/myproject/calculadora" method="post">
                Nome: <input type="text" name="nome"/><br>
                Numero: <input type="number" name="numero"/><br>
                <input type="submit" value="submit"/>
        </form>
    </body>
</html>

