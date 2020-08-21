<%-- 
    Document   : index.jsp
    Created on : 14/11/2017, 10:43:59
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="#f0f0f0">
        <h1 align="center" style="color:gray">Agenda de Contactos</h1>
    <center>
        <fieldset stryle="width: 250px">
            <legend aling="center">
                <big><b>Menu</b></big>
            </legend>
            <table align="center">
                <tr><td>1</td><td><a href="InsertarPersona.jsp">Ingresar Contacto</a></td></tr>
                <tr><td>2</td><td><a href="borrarPersona.jsp">Borrar Contacto</a></td></tr>
                <tr><td>3</td><td><a href="modificarPersona.jsp">Modificar Contactos</a></td></tr>
                <tr><td>4</td><td><a href="verPersona.jsp">Ver Contacts</a></td></tr>
            </table>
        </fieldset>
    </center>
    </body>
</html>
