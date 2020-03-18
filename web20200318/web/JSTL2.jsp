<%-- 
    Document   : JSTL2
    Created on : 2020/3/18, 下午 07:20:35
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
        <c:forEach var="i" begin="1" end="10">
        <LI><c:out value="${i}"/>
            <c:choose>
                <c:when test="${i < 4}">
                    (small)
                </c:when>
                <c:when test="${i < 8}">
                    (medium)
                </c:when>
                <c:otherwise>
                    (large)
                </c:otherwise>
            </c:choose>
        </c:forEach>

    </body>
</html>
