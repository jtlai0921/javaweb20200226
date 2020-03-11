<%-- 
    Document   : appbean
    Created on : 2020/3/11, 下午 09:08:52
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
          <H1>Using the Application Object</H1>
       <jsp:useBean id="bean1" class="beans.Counter"  scope="session" />
       <jsp:useBean id="bean2" class="beans.Counter"  scope="application" />
          <% 
            bean1.setCounter(bean1.getCounter() + 1);
            bean2.setCounter(bean2.getCounter() + 1);
          %>

        You have visited this page  The counter value is: <jsp:getProperty  name="bean1"  property="counter" /> times.
        <BR>
        This page has been visited by all users  The counter value is: <jsp:getProperty  name="bean2"  property="counter" /> times.

    </body>
</html>
