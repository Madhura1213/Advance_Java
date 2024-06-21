<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ShoppingCart</title>
</head>
<body>
<h1>Select Category</h1>
<form action ="findproduct">
<select name="cart1" id="c">
<c:forEach var="cart" items ="${categorylist}">
<option value ="${cart.cid}"> ${cart.cname}</option>
</c:forEach>
</select>

<button type ="submit" name ="btn" id ="btn" value="find">Find Product</button>
<button type ="submit" name ="btn" id ="btn" value="add">Place Order</button>
</form>
</body>
</html>