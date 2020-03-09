<%-- 
    Document   : viewBook
    Created on : 2020/3/9, 下午 07:13:44
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
        <h1>Book</h1>
        Book Author :  ${bookdata.author}
        Book Name: ${bookdata.name}
        Book Price :${bookdata.price}
    </body>
</html>
