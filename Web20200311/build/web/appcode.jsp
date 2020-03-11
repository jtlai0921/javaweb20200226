<%-- 
    Document   : appcode
    Created on : 2020/3/11, 下午 09:31:29
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
           <%
        Object counter =session.getAttribute("counter");
        String heading = null;
        if (counter == null) {
            counter = new Integer(1);
        } else {
            Integer it=(Integer)counter;
            counter = new Integer(it.intValue() + 1);
        }

        session.setAttribute("counter", counter);

        Object i =application.getAttribute("i");
        if (i == null) {
            i = new Integer(1);
        } else {
            Integer it2=(Integer)i;
            i = new Integer(it2.intValue() + 1);
        }

        application.setAttribute("i", i);
        %>
        You have visited this page <%=counter%> times.
        <BR>
        This page has been visited by all users <%=i%> times.

    </body>
</html>
