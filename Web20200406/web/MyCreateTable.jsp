<%-- 
    Document   : MyCreateTable
    Created on : 2020/4/6, 下午 06:47:14
    Author     : teacher
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
 
<html>
<head>
<title>Create Operation</title>
</head>
<body> 
<sql:setDataSource var="sample" driver="com.mysql.cj.jdbc.Driver"
     url="jdbc:mysql://localhost:3306/goods?serverTimezone=CST"
     user="root"  password="1234"/> 
<sql:update dataSource="${sample}" var="result">
   create table Employees
    (
     id int not null primary key ,
     age int not null,
     firstname varchar (255),
     lastname varchar (255)
    )
</sql:update> 
 <c:out  value="Finish"/> 
</body>
</html>
