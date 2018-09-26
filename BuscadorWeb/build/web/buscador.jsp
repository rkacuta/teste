<%-- 
    Document   : buscador
    Created on : 01/11/2017, 19:31:31
    Author     : 31604390
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" type="text/css" href="buscador.css">
        <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Open Sans" rel="stylesheet">
        <script src="buscador.js"></script>
    </head>
    <body>
        <h1 id="titulo">B U S C A D O R</h1>
        <hr>
        <br><br><br>
        <img id="lupa" src="imagens/lupa.png" width="60px">
        <form id="formulario" method="get">
            <input class="procura" type="search" name="BuscaProduto" placeholder="Procure um produto!"> 
            <input id="envia" type="submit" value="Buscar">
        </form>
        <br><br><br>
        <div class="Listproduto">
            <img class="imgprod" src="imagens/ps4.jpg" onMouseOver="bigImg(this)" onMouseOut="normalImg(this)">
            <p class="nomeprod">
                Vivamus aliquam massa vitae erat posuere convallis
            </p>
            <p class="linkloja">ACESSAR LOJA</p>
            <p class="descricao">Lorem ipsum dolor sit amet, consectetur adipiscing elit.<br> Nam bibendum purus ultrices, vulputate </p>
        </div>
    </body>
</html>
