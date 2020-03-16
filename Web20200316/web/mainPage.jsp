<%-- 
    Document   : mainPage
    Created on : 2020/3/16, 下午 08:34:53
    Author     : teacher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"  errorPage="errorDemo.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>Calculation</h1>
        <%
                String s="X";
                int v=Integer.parseInt(s);
                out.println(v);
            %>

    </body>
</html>
