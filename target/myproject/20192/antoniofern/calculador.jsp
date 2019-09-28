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
        <article>
            <h1>Tarefa 01 - 2019.2 - PWEB</h1>
            <p>JSP e Servlets</p>
        </article>
        <section>
            <h1>Calculadora</h1>
            <p>Uma calculadora que verifica se o número é par ou ímpar, se ele é primo, exibe a lista de divisores e se ele é perfeito ou não.</p>
        </section>
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

    <footer>
        <p>Feito por Antonio Fernandes</p>
        <p>Github: <a href="https://github.com/antoniofern/">github.com/antoniofern</a></p>
    </footer>
</html>

