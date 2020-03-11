<%-- 
    Document   : LoginBean
    Created on : 2020/3/11, 下午 08:18:58
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
         <jsp:useBean id="user"  class="beans.LoginBean">
               <jsp:setProperty name="user" property="*" />
          </jsp:useBean>
        Name: <jsp:getProperty  name="user" property="user" /> <br/>
        Password:<jsp:getProperty  name="user" property="password" />
        Phone:<jsp:getProperty  name="user" property="phone" />
    </body>
</html>
