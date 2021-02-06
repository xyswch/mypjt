<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="web10.*" %>
<%String pName=request.getParameter("pName");
  String origin=request.getParameter("origin");
  double price=Double.parseDouble(request.getParameter("price"));
  int inventory=Integer.parseInt(request.getParameter("inventory"));
  Product p = new Product(pName,origin,price,inventory);
  ProductsDAO.addPrd(p);
%>
<jsp:forward page="menu.html"/>