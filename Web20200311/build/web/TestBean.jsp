<%-- 
    Document   : TestBean
    Created on : 2020/3/11, 下午 06:57:12
    Author     : teacher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="beans.Test"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%  Test   t1=new Test();   %>
        Message : <%= t1.msg()  %>
        <p>
        <jsp:useBean class="beans.Test" id="t2"></jsp:useBean>
        Bean Test Message :  ${t2.msg()}
    </body>
</html>
