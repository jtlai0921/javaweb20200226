<%-- 
    Document   : ELDemo1
    Created on : 2020/3/30, 下午 07:48:49
    Author     : teacher
--%>

<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>       
        <% 
             java.util.Calendar cd= java.util.Calendar.getInstance(); 
             String dt=" "+cd.get(Calendar.YEAR)+"-"+(cd.get(Calendar.MONTH)+1)+"-"+cd.get(Calendar.DAY_OF_MONTH);
        %>
        Date: <%=dt%>
    </body>
</html>
