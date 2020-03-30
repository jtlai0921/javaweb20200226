<%-- 
    Document   : ShowEmpInCity
    Created on : 2020/3/30, 下午 09:23:51
    Author     : teacher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="java.util.* , model.SimpleEmp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
          <table border="1">
        <%
            ArrayList<SimpleEmp> list=new ArrayList<SimpleEmp>() ;
            list=(ArrayList<SimpleEmp>)session.getAttribute("emps");
            for(SimpleEmp ep :list){
           %>   
           <tr>
           <td><%= ep.getId()%></td>
           <td><%= ep.getFname()%></td>
           <td><%= ep.getLname()%></td>
           <td><%= ep.getEmail()%></td></tr>
          <% 
           }           
            
        %>
        </table>

    </body>
</html>
