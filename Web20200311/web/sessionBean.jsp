<%-- 
    Document   : sessionBean
    Created on : 2020/3/11, 下午 09:02:46
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
          <H1>Using Beans and Session Scope</H1>
        <jsp:useBean id="bean1" class="beans.Counter"  scope="session" />
        <% 
        bean1.setCounter(bean1.getCounter() + 1);
        %>
        The counter value is: <jsp:getProperty  name="bean1"  property="counter" /> 

    </body>
</html>
