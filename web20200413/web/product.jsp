<%-- 
    Document   : product
    Created on : 2020/4/13, 下午 07:55:57
    Author     : teacher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="java.util.*" %>
<jsp:useBean id="catalog"  scope="application"  class="java.util.ArrayList" />
<%! Iterator itr = null; %>
<%        
    itr = catalog.iterator();
   %>
<html>
    <head></head>
    <body>
	<h1>MVC Listener & Beans</h1></br>
	<span>DukeStore MVC-version</span>
	<table border="1">
	    <tr>
		<th>Code</th><th>Price</th>
		<th>Description</th><th>Quantity</th>
	    </tr>
	    <% while (itr.hasNext()) { 
		model.Product prod = (model.Product)itr.next(); %>
		<tr>
		    <td><%=prod.getCode()%></td>
		    <td><%=prod.getPrice()%></td>
		    <td><%=prod.getDescription()%></td>
		    <td><%=prod.getQuantity()%></td>
		</tr>
	    <% } %>
	</table>
    </body>
</html>

