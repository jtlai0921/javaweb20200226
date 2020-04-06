<%-- 
    Document   : MyTbInsert
    Created on : 2020/4/6, 下午 06:54:50
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
        <sql:update dataSource="${sample}" var="result">
            INSERT INTO Employees(id, age, firstname,lastname) VALUES (100, 20, 'Mary', 'Wang')
        </sql:update> 
        <sql:query dataSource="${sample}" var="result">
            SELECT * from Goods.Employees
        </sql:query> 
        <table border="1" width="50%">
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
