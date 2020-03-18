<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <UL>
            <c:forTokens var="color"
                         items="(red (orange) yellow)(green)((blue) violet)"
                         delims="()">
                <LI><c:out value="${color}"/>
                </c:forTokens>
        </UL>
    </body>
</html>
