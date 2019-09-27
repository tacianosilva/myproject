<!DOCTYPE html>
<%@page contentType="text/html" import="java.util.*, java.text.*"
	pageEncoding="UTF-8"%>
<html>
   <head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <title>Tarefa 01 - 2019.2 - JSP e Servlets</title>
   </head>
<body>

    <h1>Calculadora</h1>
        <form action="/myproject/CalcServlet1" method="post">
            Nome:<input type="text" name="nome"/><br><br> 
            Número:<input type="number" name="numero"/><br><br> 
            <input type="submit" value="Enviar"/>
        </form>
</body>
</html>