<%-- 
    Document   : ELListView
    Created on : 2020/3/18, 下午 08:56:33
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
            <tr><td>編號</td><td>作者</td></tr>
        <c:forEach var="f" items="${authors}">
            <tr>
            <td><c:out value="${f.id}"></c:out></td>
            <td><c:out value="${f.name}"></c:out></td>            
            </tr>
        </c:forEach>
         </table>
    </body>
</html>
