<%-- 
    Document   : fruit
    Created on : 2020/3/18, 下午 08:34:54
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
        <table border="1" width="60%">
            <tr><td>水果名稱</td><td>產地</td><td>價格</td></tr>
        <c:forEach var="f" items="${fruits}">
            <tr>
            <td><c:out value="${f.name}"></c:out></td>
            <td><c:out value="${f.place}"></c:out></td>
            <td><c:out value="${f.price}"></c:out></td>
            </tr>
        </c:forEach>
         </table>
    </body>
</html>
