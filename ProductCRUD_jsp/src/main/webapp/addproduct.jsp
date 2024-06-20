<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
</head>
<body>

<h3>Add Product Details </h3>
<form action="insertproduct" method="post">

Product ID : <input type="text" name="pid" id="pid"><br><br>
Product Name: <input type="text" name="pname" id="pname"><br><br>
Product Quantity: <input type="text" name="pqty" id="pqty"><br><br>
Product Price: <input type="text" name="price" id="price"><br><br>

<button type="submit" name="btn" value="Login" id="login">Add Product</button>


</form>

</body>
</html>