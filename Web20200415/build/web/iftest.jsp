<%-- 
    Document   : iftest
    Created on : 2020/4/15, 下午 06:56:18
    Author     : teacher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://mytag.test/jstl/fake"   prefix="f" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <f:if test="${param.password == '12345'}">
            你的秘密資料在此！
        </f:if>

    </body>
</html>
