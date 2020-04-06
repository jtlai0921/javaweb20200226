<%-- 
    Document   : deleteEmployee
    Created on : 2020/4/6, 下午 07:54:12
    Author     : teacher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <sql:setDataSource var="sample" driver="com.mysql.cj.jdbc.Driver"
                           url="jdbc:mysql://localhost:3306/goods?serverTimezone=CST"
                           user="root"  password="1234"/> 
           <c:set var="empId" value="105"/>
    
 
<sql:update dataSource="${sample}" var="count">
       delete from employees  where ID= ${empId} 
</sql:update>
 
<sql:query dataSource="${sample}" var="result">
   SELECT * from Employees
</sql:query>
 
<table border="1" width="100%">
<tr>
   <th>Emp ID</th>
   <th>First Name</th>
   <th>Last Name</th>
   <th>Age</th>
</tr>
<c:forEach var="row" items="${result.rows}">
<tr>
   <td><c:out value="${row.id}"/></td>
   <td><c:out value="${row.firstname}"/></td>
   <td><c:out value="${row.lastname}"/></td>
   <td><c:out value="${row.age}"/></td>
</tr>
</c:forEach>
</table> 

    </body>
</html>
