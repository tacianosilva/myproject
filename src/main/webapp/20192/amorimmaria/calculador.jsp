<!DOCTYPE html>
<html dir="ltr">
<%@page contentType="text/html" import="java.util.*, java.text.*"
	pageEncoding="UTF-8"%>

<head>
    <title>Tarefa 01 - 2019.2 - JSP e Servlets</title>
    <p> Maria das Graças Dias Amorim</p>
    <ul>
        <li>GitHub: <a href="https://github.com/amorimmaria"target="blank_">amorimmaria</a></li>
        <li>Email: <a href="mailto:mariadasgracasdiasamorim@gmail.com"target="blank_">mariadasgracasdiasamorim</a></li>
      </ul> 

   <link rel="stylesheet" href="designer.css" type="text/css">

</head>

<body>
    <article>
        <header class = "home">
            <h1><strong>Calculadora</strong></h1>
        </header>
        <nav>
            <section>
                <div class = form>
                    <form action="/myproject/CalcServletMaria" method="post">
                        <label for="numero">Número:</label>
                        <input id="numero" type="number" name="numero" /><br><br>
                        <input type="submit" value="Enviar" />
                    </form>
                </div>
            </section>
        </nav>
    </article>
        
</body>

</html>
 