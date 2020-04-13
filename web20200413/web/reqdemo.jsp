<%-- 
    Document   : reqdemo
    Created on : 2020/4/13, 下午 09:18:40
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
            if (((Boolean) request.getAttribute("isLogin")).equals(new Boolean(true))) {
                session.setAttribute("isLogin", new Boolean(true));
                response.sendRedirect("index.html");
            } else {
        %>
        請輸入登錄資訊:<form action="loginRequest.jsp" method="get">
            <br>用戶名：<input type=text name=user>
            <br>密碼：<input type=password name=password>
            <br><input type=submit name=submit>
        </form>
        <%    }   %>

    </body>
</html>
