<%-- 
    Document   : SessionTest
    Created on : 2020/4/13, 下午 08:39:33
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
        session.setAttribute("userName","John")<br>
        <% session.setAttribute("userName", "John");%>
        session.setAttribute("userName","Mary")<br>
        <% session.setAttribute("userName", "Mary");%>
        session.removeAttribute("userName")<br>
        <% session.removeAttribute("userName");%>        
        <% session.removeAttribute("userName");%>
        目前有<%=application.getAttribute("users")%>個用戶。<br>
        after session.invalidate()<br>
        <% session.invalidate();%>
        目前有<%=application.getAttribute("users")%>個用戶。



    </body>
</html>
