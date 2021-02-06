<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="web10.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>products list</title>
</head>
<body>
	<% List<Product> products=ProductsDAO.showAll(); %>
	<table border="1">
		<tr><td>Id</td><td>Name</td></tr>
		<% int size=products.size();
		for(int i=0;i<size;i++){%>
		<tr>
			<td><%=products.get(i).getId()%></td>
			<td><a href="info.jsp?id=<%=products.get(i).getId()%>"><%= products.get(i).getPName() %></a></td>
		</tr>
		<%} %>
	</table>
	<a href="menu.html">Home</a>
</body>
</html>