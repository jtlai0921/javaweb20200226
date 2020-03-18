<%-- 
    Document   : message
    Created on : 2020/3/18, 下午 07:58:54
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
        <jsp:useBean id="messageService" class="model.MessageService"/>
        <table style="text-align: left; width: 50%;" border="1">
            <tr>
                <td>姓名</td><td>訊息</td>
            </tr>
            <c:forEach var="m" items="${messageService.messages}">
                <tr>
                    <td>${m.name}</td><td>${m.text}</td>
                </tr>
            </c:forEach>
        </table>

    </body>
</html>
