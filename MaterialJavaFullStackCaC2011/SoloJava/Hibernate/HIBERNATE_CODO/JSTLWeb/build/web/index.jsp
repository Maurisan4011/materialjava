<%-- 
    Document   : index
    Created on : 16/11/2017, 19:10:59
    Author     : laura.iusifid0706
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
   <head>
      <title> Tag Example</title>
   </head>

   <body>
      <c:set var = "salario" scope = "session" value = "${2000*2}"/>
      <p>Su salario es : <c:out value = "${salario}"/></p>
      <c:choose>
         
         <c:when test = "${salario <= 0}">
            El Salario es muy bajo.
         </c:when>
         
         <c:when test = "${salario > 1000}">
            El Salario es muy bueno.
         </c:when>
         
         <c:otherwise>
            No hay comentario...
         </c:otherwise>
      </c:choose>
   
   </body>
</html>

