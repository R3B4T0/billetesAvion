<%-- 
    Document   : muestraDatos
    Created on : 22-ene-2021, 21:35:40
    Author     : David Rebato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Billete"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% request.getAttribute("billete"); %>
        <h2>Número de billetes: ${billete.cant}</h2>
        <h2>Fecha: ${billete.FechaVuelo}</h2>
        <h2>Importe de los billetes: ${billete.getImporte()}</h2>
    </body>
</html>
