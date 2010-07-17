<%-- 
    Document   : UnidadeDeMedida
    Created on : 08/07/2010, 12:47:50
    Author     : clayton.kendy
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Cadastro de unidade de medidas</title>
    </head>
    <body>
        <h1>Cadastro de unidade de medidas</h1>
        <form action="/total-flex-webjsf/servlet/UnidadeDeMedidaServlet">
            <legend>Nome: <input type="text" name="nome" id="nome"/></legend>
            <legend >abreviacao<input type="text" name="abreviacao" id="abreviacao"/></legend>
            <button type="submit" value="Salvar" title="Salvar" id="Salvar"/>
        </form>
    </body>
</html>