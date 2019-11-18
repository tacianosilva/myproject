<!DOCTYPE html>
<%@page contentType="text/html" import="java.util.*, java.text.*"
	pageEncoding="UTF-8"%>
<html>
   <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <title>Tarefa 01 - 2019.2 - JSP e Servlets</title>
   </head>

  <header>
    <p>Criado por Jaine de Senna Santos</p>
    <nav>
      <ul>
        <li>GitHub: <a href="https://github.com/jainesenna"target="blank_">jainesenna</a></li>
        <li>Email: <a href="mailto:jainesantossenna191@gmail.com"target="blank_">jainesantossenna191</a></li>
      </ul>
    </nav>
  </header>
<body>

    <h1>Calculadora</h1>
        <form action="/myproject/CalcServlet1" method="post">
            Nome:<input type="text" name="nome"/><br><br> 
            Número:<input type="number" name="numero"/><br><br> 
            <input type="submit" value="Enviar"/>
        </form>
</body>
</html>