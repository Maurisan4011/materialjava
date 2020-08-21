<%-- 
    Document   : index
    Created on : 13/11/2017, 18:01:09
    Author     : Branko
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="#3577FB">
        <h1 align="center" style="color:gray">Agenda de contactos</h1>
    <center>
        <fieldset style="width: 250px">
            <legend align="center"><big><b>Menu</b></big></legend>
            <table align="center">
                <tr><td>1</td><td><a href="insertarPersona.jsp">Ingresar contacto</a></td></tr>
                <tr><td>2</td><td><a href="borrarPersona.jsp">Eliminar contacto</a></td></tr>
                <tr><td>3</td><td><a href="modificarPersona.jsp">Modificar contacto</a></td></tr>
                <tr><td>4</td><td><a href="verPersona.jsp">Ver contactos</a></td></tr>
            </table>
        </fieldset>
    </center>
    </body>
</html>
