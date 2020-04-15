<%-- 
    Document   : format
    Created on : 2020/4/15, 下午 07:30:27
    Author     : teacher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://mytag.com/jsp/tlds/mytags" prefix="mytags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <mytags:formatNumber number="100050.574" format="#,###.00"/><br><br>
 
         <mytags:formatNumber number="1234.567" format="$# ###.00"/><br><br>

    </body>
</html>
