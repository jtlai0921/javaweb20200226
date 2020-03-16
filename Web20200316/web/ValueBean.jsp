<%-- 
    Document   : ValueBean
    Created on : 2020/3/16, 下午 07:04:36
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
        <jsp:useBean id="mv1" class="beans.MyValue" scope="session"></jsp:useBean>
        MyValue Session bean Created
    </body>
</html>
