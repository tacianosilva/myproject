<!DOCTYPE html>
<%@page contentType="text/html" import="java.util.*, java.text.*, java.lang.String" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Calculadora para PWEB</title>                   
    <link rel="stylesheet" type="text/css" href="estilo.css">  
</head>
<body>    
<script>
  alert("O número deve ser enviado obrigatoriamente!");
</script>
<div id = "index">


    <form  id = "formulario" action="/myproject/Calculadora" method="post">                                         
      <fieldset>
        <legend>Informe um:</legend>
        <label>Nome:</label><input class = "campo_nome" name = "nome" type="text"><br>
        <label>E-mail:</label><input class = "campo_email" name = "email" type="text"><br>
        <label>Número:</label><input class = "campo_num" name = "numero" type="number"><br>
        <input class = "btn_submit" type="submit" value="Enviar">      
      </fieldset>
    </form>          
</div>           
</body>
</html>