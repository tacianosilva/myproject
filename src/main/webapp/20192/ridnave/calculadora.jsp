<!DOCTYPE html>
<%@page contentType="text/html" import="java.util.Date, java.text.*"  pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Calculadora</title>
    </head>
    
    <body>
        <ul>
            <li>O nome recebido foi ${name}.</li><br>
            <li>O e-mail recebido foi ${email}.</li><br>
            <li>A data recebida foi ${date}.</li><br>
            <li>O número recebido foi ${number}.</li><br>
            <li>O número ${number} ${isEven}.</li><br>
            <li>O número ${number} ${isPrime}.</li><br>
            <li>Seus divisores são: ${divisors}.</li><br>
            <li>O número ${number} ${isPerfect}.</li><br>
        </ul>
    </body>
</html>