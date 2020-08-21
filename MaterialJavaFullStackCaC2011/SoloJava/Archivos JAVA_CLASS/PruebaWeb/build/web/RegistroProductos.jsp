<%-- 
    Document   : RegistroProductos "SE EJECUTA DESDE ESTE ARCHIVO"
    Created on : 28/10/2017, 20:57:20
    Author     : laura.iusifid0706
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
        <form action="NuevosProductos" method="post">
            <table border="1" align="center">
                <tr>
                    <td>nombre:<input type="text" name="nombre"></td><br>
                </tr>
                <tr>
                    <td>clave :<input type="text" name="clave"></td><br>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit">
                    </td>
                </tr>
            </table>
            
        </form>
    </body>
</html>
