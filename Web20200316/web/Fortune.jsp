<%-- 
    Document   : Fortune
    Created on : 2020/3/16, 下午 07:24:39
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
        <jsp:useBean id="Fortune" class="beans.GuessGameLogic" scope="session">
            <% Fortune.initialize(1, 10); %>
        </jsp:useBean>
        <%
            String guess = request.getParameter("number");
            int guessNum = Integer.parseInt(guess);
            if (Fortune.isCorrectGuess(guessNum)) {
                session.invalidate();
        %><jsp:forward page="bingo.jsp" /><%
        } else {
            int remainder = Fortune.getRemainder();
            if (remainder > 0) {
        %>The number <%=guess%> is not correct.</br>
        You still have <%=remainder%> changes.</br>
        <%= Fortune.getHint()%> <br/>
        <a href="guess.html">Try again</a><%
        } else {
            session.invalidate();
        %><jsp:forward page="noChances.jsp" /><%
                }
            }
        %>

        <h1>Hello World!</h1>
    </body>
</html>
