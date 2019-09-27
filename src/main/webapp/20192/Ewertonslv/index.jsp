<!DOCTYPE html>
<%@page contentType="text/html" import="java.util.*, java.text.*, java.lang.String" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta charset="UTF-8" />
        <title>Página JSP calculadora Ewerton</title>
    </head>
    
    
    <body>
        <h3>Atividade de PWEB</h3>
        <header>
            <nav>Informações sobre um número.</nav>
        </header>
        <article>
            <section>
                <p>Um número é par quando o resto de sua divisão por 2 resulte em 0.</p>
            </section>
            <section>
                <p>Um número é primo quando só é divisível por 1 e por ele mesmo.</p>
            </section>
            <section>
                <p>Um número perfeito quando a soma de todos os seus divisores, 
                exceto ele mesmo, resulta em 0.</p>
            </section>
        </article>
        <form action="/myproject/Servlet" method="post">
            <label for="numero">Número:</label>
                <input type="number" id="numero" name="numero" maxlength="5" required />
                <input type="submit" value="Enviar" />
        </form>
        <footer>
       
        </footer>
    </body>
    
    
    <footer>
    </footer>
</html>
