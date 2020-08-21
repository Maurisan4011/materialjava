<%-- 
    Document   : Ingresar
    Created on : 07/11/2017, 09:51:05
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>RegistroProductos</h1>
        <form action="Servlet" method="post">
            <table border="1" align="center">
                <tr>
                    <td>Producto:<input type="text" name="prod"></td><br>
                </tr>
                 <tr>
                    <td>Precio:<input type="text" name="precio"></td><br>
                </tr>
                    <td colspan="2">
                        <input type="submit">
                    </td>
                </tr>
            </table>
            
        </form>
    </body>
</html>
