<%-- 
    Document   : viewName
    Created on : 2020/3/18, 下午 07:44:38
    Author     : teacher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:forEach var="n" items="${namelist}">
            <h3><c:out value="${n}"></c:out></h3>
        </c:forEach>
    </body>
</html>
