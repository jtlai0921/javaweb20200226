<%-- 
    Document   : newjsp
    Created on : 2020/3/2, 下午 09:04:04
    Author     : student
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HashMap<String, String> userPass = new HashMap<>();
            userPass.put("Amy", "a123");
            userPass.put("Mary", "m123");
            userPass.put("John", "j123");

            String u = request.getParameter("user");
            String p = request.getParameter("pass");

            String pass = userPass.get(u);
            boolean flag = p.equals(pass);
        %>
        <%if (flag == true) {  %>
        <h1 style="color:green"> 帳號密碼正確</h1>
        <%} else {%>
        <h1 style="color:red"> 帳號密碼不正確</h1>
        <%}%>
    </body>
</html>
