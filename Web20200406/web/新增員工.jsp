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
            INSERT INTO 員工(員工, 年紀, 名,姓,性別) VALUES (15, 21, '你好', '痾','女')
        </sql:update> 
        <sql:query dataSource="${sample}" var="result">
            SELECT * from Goods.員工
        </sql:query> 
        <table border="1" width="50%">
            <tr>
                <th>Emp 員工</th>
                <th>名</th>
                <th>姓</th>
                <th>年紀</th>
         <th>性別</th>
            </tr>
            <c:forEach var="row" items="${result.rows}">
                <tr>
                    <td><c:out value="${row.員工}"/></td>
                    <td><c:out value="${row.名}"/></td>
                    <td><c:out value="${row.姓}"/></td>
                    <td><c:out value="${row.年紀}"/></td>
   <td><c:out value="${row.性別}"/></td>
                </tr>
            </c:forEach>
        </table> 

    </body>
</html>
