<%-- 
    Document   : ShowCityCount
    Created on : 2020/3/30, 下午 08:55:52
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
        <h1>Hello World!</h1>
        City Count:<%=request.getAttribute("citycount") %><br>
        City Count: ${citycount} <br>
    </body>
</html>
