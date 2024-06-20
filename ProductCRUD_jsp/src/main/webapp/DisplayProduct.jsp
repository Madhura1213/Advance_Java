<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import ="com.demo.beans.*, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
</head>
<body>
<!--  Welcome <%= ((MyUser)session.getAttribute("user")).getUsername() %>-->
<% List<Product> plist=(List<Product>)request.getAttribute("plist");
%>
		<h2> Product Data </h2>
		<table border='1'><caption>Contents</caption><tr>
		<th>Product Id</th>
		<th> Name</th>
		<th>Quantity</th>
		<th>Price </th>
		<th>Action </th>
		</tr>
		<%for(Product p: plist){  %>
		<tr>
		<td><%= p.getPid() %></td>
		<td><%= p.getPname() %></td>
		<td><%= p.getQty() %></td>
		<td><%= p.getPrice() %></td>
		<td> <a href ="editProduct?pid="<%= p.getPid() %>> Edit</a></td>
		<td> <a href ="#"> Delete</a></td>
		</tr>
		<% } %>
		</table>
		<br>
		<a href ="addproduct.jsp">  Add New Product</a>

</body>
</html>