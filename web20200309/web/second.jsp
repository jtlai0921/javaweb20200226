<%-- 
    Document   : second
    Created on : 2020/3/9, 下午 08:50:34
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
            Object data= session.getAttribute("username");
             if(data==null){
                 response.sendRedirect("login.html");
            return;
        }
        %>
     User Name: ${ sessionScope.username }<br/>
     password: ${ sessionScope.password }
    </body>
</html>
