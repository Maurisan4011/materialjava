<%-- 
    Document   : Productos
    Created on : 03/11/2017, 15:50:36
    Author     : ivan lencina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP</title>
    </head>
    <body>
        <h1>productos !</h1>
        <form action="Productos" method="post"
               <table border="1" align="center">
                <tr>
                    <td>Producto:<input type="text" name="producto"></td><br>
                </tr>
                <tr>
                    <td>Precio :<input type="text" name="precio"></td><br>
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
