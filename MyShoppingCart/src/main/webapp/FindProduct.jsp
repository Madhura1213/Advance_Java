<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ShoppingCart</title>
</head>
<body>
<form action ="addtocart">
<table>

<c:forEach var="product" items="${productlist}">
<tr>
<td> 
<input type ="checkbox" name ="product1" id="p" value="${product.pid}:${product.pname}:${product.price}">
</td> 
<td>
<label>${product.pname}</label> 
</td>
<td>
 <input type="text" name='${product.pname}' id='${product.pname}'>
</td>
</tr>
</c:forEach>

</table>
<button type="submit" name="btn" id="add" value="add">Add to cart</button>
 <button type="submit" name="btn" id="sel" value="sel">Select Different Category</button>
</form>
</body>
</html>