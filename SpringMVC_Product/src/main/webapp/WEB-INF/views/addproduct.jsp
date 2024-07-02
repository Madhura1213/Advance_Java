<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <!DOCTYPE html>
 <head>
 <title>Add-Product</title>
 </head>
 <body>
 <form action="insertproducts" method="post">
 	Product Id:<input type="text" id="id" name="id">
 	<br>
 	Product Name:<input type="text" id="name" name="name">
 	<br>
 	Product Qty:<input type="text" id="qty" name="qty">
 	<br>
 	Product Price:<input type="text" id="price" name="price">
 	<br>
 	<button type="submit" id="btn" name="btn">Add product</button>
 </form>
 </body>
 </html>