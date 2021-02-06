<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="web10.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>information</title>
</head>
<body>
	<%int id=Integer.parseInt(request.getParameter("id")); 
	Product p=ProductsDAO.getPrdById(id);%>
	<p>ID:<%=p.getId() %></p>
	<p>Name:<%=p.getPName() %></p>
	<p>Origin:<%=p.getOrigin() %></p>
	<p>Price:<%=p.getPrice() %></p>
	<p>Inventory:<%=p.getInventory() %></p>
	<a href="prdlist.jsp">Back</a>
</body>
</html>