<%-- 
    Document   : appVar
    Created on : 2020/3/9, 下午 09:07:49
    Author     : teacher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            application.setAttribute("author", "Chaitanya");
            application.setAttribute("Site", "BeginnesBook.com");
        %>
        <a href="display.jsp">Click</a>

    </body>
</html>
