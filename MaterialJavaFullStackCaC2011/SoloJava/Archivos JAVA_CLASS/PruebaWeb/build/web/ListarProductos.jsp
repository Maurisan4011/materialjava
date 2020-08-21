<%-- 
    Document   : ListarProductos
    Created on : 28/10/2017, 20:43:33
    Author     : laura.iusifid0706
--%>
<%@page import="PaqueteDao.Productos" %>
<%@page import="java.util.ArrayList" %>
<%@page import="PaqueteDao.ProductoDao" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

                <%
                    ProductoDao dao = new ProductoDao();
                    ArrayList<Productos> lista = dao.listar();
                %> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <fieldset>
            <legend><strong>Lista de Productos</strong></legend>
            <table align="center" border="1px" width="80%">
                <tr>
                    <th>nombre</th>
                    <th>clave</th>
                </tr>

                <%
                    for (Productos p : lista) {
                %>
                <tr>
                    <th><%=p.getNombre()%></th>
                    <th><%=p.getClave()%></th>
                    <th><a href="AlterarProducto?id=<%p.getId();%>">Alterar</a></th>
                </tr>
                <%
                }
                %>
               
            </table>
        </fieldset>
    </body>
</html>
