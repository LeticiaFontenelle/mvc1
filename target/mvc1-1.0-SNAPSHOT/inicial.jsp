<%-- 
    Base Exerc - Prof. Chiara   : inicial
    
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Controle de Aquecedor</title>
    </head>
    <body>
        <h1>Controle de Aquecedor</h1>
        <p>
        <%
            Temperatura de aquecedor = (Temperatura) request.getAttribute("aquecedor"); 
            out.print("A temperatura do aquecedor será " + aquecedor.getT()); 
        %>    
        </p>
        <form action="controle" method=""post">
            <input type="submit" name="acao" value="aumentar"> 
            <input type="submit" name="acao" value="diminuir">
        </form>    
    </body>
</html>
