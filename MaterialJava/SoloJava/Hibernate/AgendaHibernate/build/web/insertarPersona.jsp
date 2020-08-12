<%-- 
    Document   : insertarPersona
    Created on : 13/11/2017, 18:18:54
    Author     : Branko
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="#3577FB">
        <h1 align="center" style="color:gray">Formulario persona</h1>
        
        <jsp:useBean id="perso" class="d.model.pojos.Persona"/>
        <jsp:useBean id="dao" class="cl.model.dao.PersonaDAO"/>
        <center>
            <fieldset style="width: 250px">
                <legend align="center"><big><b>Datos</b></big></legend> 

                <form action="insertarPersona.jsp" method="POST">
                    <table align='center'>
                        <tr><td>RUT</td><td><input type="text" name="ru" value='${param.ru}' size="45"></td></tr>
                        <tr><td>NOMBRE</td><td><input type="text" name="nom" value="${param.nom}" size="45"></td></tr>
                        <tr><td>TELEFONO</td><td><input type="text" name="fijo" value="${param.fijo}" size="45"></td></tr>
                        <tr><td>CELULAR</td><td><input type="text" name="cel" value="${param.cel}" size="45"></td></tr>
                        <tr><td>EMAIL</td><td><input type="text" name="em" value="${param.em}" size="45"></td></tr>                    
                        <tr><td colspan="2" align="right"><input type="submit" name="bt" value="Agregar"></td></tr>                                        
                        <tr><td colspan="2" align="center"><a href="index.jsp">Volver</a></td></tr>
                    </table>              

                    <c:choose>
                        <c:when test="${not empty param.ru && not empty param.nom && not empty param.fijo && not empty param.cel && not empty param.em}">
                            <fmt:parseNumber var="fijo" integerOnly="true" type="number" value="${param.fijo}"/>
                            <fmt:parseNumber var="cel" integerOnly="true" type="number" value="${param.cel}"/> 

                            <jsp:setProperty name="perso" property="rut" value="${param.ru}"/>
                            <jsp:setProperty name="perso" property="nombre" value="${param.nom}"/>
                            <jsp:setProperty name="perso" property="fijo" value="${param.fijo}"/>
                            <jsp:setProperty name="perso" property="celular" value="${param.cel}"/>
                            <jsp:setProperty name="perso" property="email" value="${param.em}"/>

                            <font color='green'><c:out value="Persona insertada ${dao.insertar(perso)}"/></font>

                        </c:when>
                        <c:when test="${empty param.bt}"></c:when>
                        <c:otherwise>
                            <font color='red'><c:out value="Faltan llenar campos"/></font>
                        </c:otherwise>
                    </c:choose>
                </form>            
            </fieldset>
        </center>
    </body>
</html>
