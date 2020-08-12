<%-- 
    Document   : InsertarPersona.jsp
    Created on : 14/11/2017, 11:06:16
    Author     : alumno
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar Persona</title>
    </head>
    <body bgcolor="#01A9DB">
        <h1 style="color: gray">Formulario Persona</h1>
        <jsp:useBean id="perso" class="model_pojos.Persona"/>
        <jsp:useBean id="dao" class="model_dao.PersonaDAO"/>
        
        <fieldset style="width: 280px">
            <legend align="center"><big><b>Datos</b></big></legend>
            <form action="InsertarPersona.jsp" method="post">
                <table>
                    <tr><td>Cuil</td><td><input type="text" name="cuil" value="${param.cuil}" size="45"</td></tr>
                    <tr><td>Nombre</td><td><input type="text" name="nom" value="${param.nom}" size="45"</td></tr>
                    <tr><td>Telefono Fijo</td><td><input type="text" name="fij" value="${param.fij}" size="45"</td></tr>
                    <tr><td>Celular</td><td><input type="text" name="cel" value="${param.cel}" size="45"</td></tr>
                    <tr><td>Email</td><td><input type="text" name="em" value="${param.em}" size="45"</td></tr>
                    <tr><td colspan="2" align = "right"><input type="submit" name="bt" value="Agregar"></td></tr>
                    <tr><td colspan="2" align = "center"><a href="index.jsp">Volver</a></td></tr>
                </table>

                    <%--
                        Document   : aplicacion JSTL
                        JSTL: JSP STANDARD TAG LIBRARY
                        validar campos vacios, los datos fijo y celular tienen que ser de tipo numerico
                        en el formulario son de tipo string por tanto hay que hacer una conversion a entero 
                        atravez de la etiqueta de formato
                    --%>
                    <c:choose>
                    <c:when test="${not empty param.cuil && not empty param.nom && not empty param.fij
                                        && not empty param.cel && not empty param.em && not empty param.bt}">
                        
                        <fmt:parseNumber var="fij" integerOnly="true" type="number" value="${param.fij}"/>
                        <fmt:parseNumber var="cel" integerOnly="true" type="number" value="${param.cel}"/>
                        
                        <jsp:setProperty name="perso" property="cuil" value="${param.cuil}"/>
                        <jsp:setProperty name="perso" property="nombre" value="${param.nom}"/>
                        
                        <jsp:setProperty name="perso" property="fijo" value="${param.fij}"/>
                        <jsp:setProperty name="perso" property="celular" value="${param.cel}"/>
                        
                        <jsp:setProperty name="perso" property="email" value="${param.em}"/>    
                        
                        <font color="green"><c:out value="persona insertada${dao.Insertar(perso)}"/></font>
                    </c:when>

                        <c:when test="${empty param.bt}">
                            
                        </c:when>
                        
                        <c:otherwise>
                            <font color="red"><c:out value="falta llenar campos"/></font>
                        </c:otherwise>
                    </c:choose>
            </form>
        </fieldset>
    </body>

</html>

