<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
<table border='2'>
	<tr>
	<th>Product Id</th>
	<th>Product Name</th>
	<th>Product Qty</th>
	<th>Product Price</th>
	<th>Actions </th>
	</tr>
	<c:forEach var="prod" items="${plist}">
   <tr>
      <td>${prod.id}</td>
      <td>${prod.name}</td>
      <td>${prod.qty}</td>
      <td>${prod.price}</td>
      <td>
         <a href="deleteproduct/${prod.id}">delete</a>/
         
         <a href="editproduct/${prod.id}">edit</a>/
         <a href="#">view</a>
      </td>
   </tr>
</c:forEach>
</table>
<a href="addnewproduct">Add New Product</a>
</body>
</html>
