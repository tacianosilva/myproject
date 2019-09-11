<!DOCTYPE html>
<%@page contentType="text/html" import="java.util.Date, java.text.*"  pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Formulário</title>
        <meta charset="utf-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="style.css" type="text/css">
    </head>
    
    <body>
        <article>
            <header class = "principal">
                <h1><strong>Calculadora</strong></h1>
            </header>
            
            <nav>
                <section>
                    <div class = form>
                        <form action="/myproject/CalcuServlet" method = "POST">

                            <div class = "numberForm">
                                <strong>Número:</strong><br>
                                <input type = "number" name = "number" required /> <br><br>
                            </div>
                            
                            <div class = "nameForm">
                                <strong>Nome:</strong><br>
                                <input type="text" name="name" required/> <br>
                            </div>

                            <div class = "emailForm">
                                <strong>E-mail:</strong><br>
                                <input type="email" name="email" required/><br>
                            <div>

                            <div class = "dateForm">
                                <strong>Data de Nascimento:</strong><br>
                                <input type="date" name="date" required/><br>
                            </div>

                            <div class = "submitForm">
                                <input type = "submit" value = "Enviar" />
                            </div>
                        </form>
                    </div>    
                </section>
            </nav>    

            <footer class = "rodape">
                Feito por Evandir Filho
            </footer>

        </article>
    </body>
</html>