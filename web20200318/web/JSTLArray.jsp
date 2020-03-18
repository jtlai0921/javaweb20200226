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
        <% String[] words = {"foo", "bar", "baz"};
            pageContext.setAttribute("words", words);%>        
        <H2>Key Words:</H2>
        <UL>
            <c:forEach var="word"   items="${words}">
                <LI><c:out value="${word}"/>
                </c:forEach>
        </UL>        
        <br/>
        <h2>Country Array </h2>
        <c:forEach
            var="country"
            items="Australia,Canada,Japan,Philippines,USA">
        <LI><c:out value="${country}"/>
        </c:forEach>
    </body>
</html>
