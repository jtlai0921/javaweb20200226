<%-- 
    Document   : errorDemo
    Created on : 2020/3/16, 下午 08:37:36
    Author     : teacher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"   isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Error Page</h1>
        <%=exception.getMessage()%>

    </body>
</html>
