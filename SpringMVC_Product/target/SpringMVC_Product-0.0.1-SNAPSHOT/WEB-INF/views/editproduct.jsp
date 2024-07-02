<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EditProduct</title>
</head>
<body>
<form action="/SpringMVC_Product/product/updateproduct" method="post">
Product Id:<input type="text" id="id" name="id" value="${id}">
<br>
Product Name:<input type="text" id="nm" name="name" value="${name}">
<br>
Product Qty:<input type="text" id="qty" name="qty" value="${qty}">
<br>
Product Price:<input type="text" id="price" name="price" value="${price}">
<br>
<button type="submit" id="btn" name="btn">Update Product</button>
<br>
</form>

</body>
</html>