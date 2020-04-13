<%-- 
    Document   : ServletAttrDemo
    Created on : 2020/4/13, 下午 07:04:58
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
        <%
              out.println("add username: Mary");
              application.setAttribute("username", "Mary");
              out.println("add edit username from Mary to John");
              application.setAttribute("username", "John");
              out.println("remove username John");
              application.removeAttribute("username");
        %>
    </body>
</html>
