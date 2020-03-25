<%-- 
    Document   : viewSupplier
    Created on : 2020/3/25, 下午 09:16:11
    Author     : teacher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1" width="70%">
            <tr>
                <td>Supplier ID</td> <td>Supplier Name</td> <td>Street</td>
                <td>City</td>   <td>State</td>   <td>zip</td>                
            </tr>>
            
          <c:forEach var="sp"   items="${supplier}">
              <tr>
                  <td><c:out value="${sp.supId}"/></td>
                  <td><c:out value="${sp.supName}"/></td>
                  <td><c:out value="${sp.street}"/></td>
                  <td><c:out value="${sp.city}"/></td>
                  <td><c:out value="${sp.state}"/></td>
                  <td><c:out value="${sp.zip}"/></td>
               </tr>
           </c:forEach>
    </body>
</html>
