<%-- 
    Document   : UnidadeFederativaFrm.jsp
    Created on : 17/07/2010, 05:24:05
    Author     : clayton.kendy
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Cadastro de unidade federativa</title>
    </head>
    <body>
        <h1>Cadastro de unidade federativa</h1>
        <form action="<%= application.getContextPath()%>/servlet/UnidadeFederativaServlet">
            <legend><input type="text" name="abreviacao" id="abreviacao"/> </legend>
            <legend><input type="text" name="nome" id="nome"/> </legend>
            <button type="submit" value="Salvar"  id="salvar" name="Salvar" > </button>
            
        </form>
    </body>
</html>
