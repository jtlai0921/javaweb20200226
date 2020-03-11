<%-- 
    Document   : test2bean
    Created on : 2020/3/11, 下午 07:24:21
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
        <jsp:useBean id="test2" class="beans.Test2"></jsp:useBean>
        <jsp:setProperty name="test2" property="message" value="Bean Property seting"></jsp:setProperty>
        Get Test2 Message   : ${test2.message}
        Msg: ${test2.msg}
    </body>
</html>
