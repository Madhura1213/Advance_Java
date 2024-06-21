<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.cart.beans.Product,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BillPayment</title>
</head>
<body>
<%double total =0; %>
<table border=3>
<tr><th>Product ID</th>
<th>Name</th>
<th>Order Qty</th>
<th>Price</th>
<th>Total</th></tr>
<% List<Product> plist = (List<Product>)session.getAttribute("cart"); %>
<% for(Product prod : plist) { %>
<tr><td><%= prod.getPid() %></td>
<td><%= prod.getPname() %></td>
<td><%= prod.getQty() %></td>
<td><%= prod.getPrice() %></td>
<td><%= prod.getPrice() * prod.getQty() %></td></tr>

<% total = total+(prod.getQty()*prod.getPrice()); %>
<%} %>
 <tr>
      <td colspan='4'>Total bill amount</td>
      <td><%=total %></td>
   </tr>
   </table>
   <form action="doPayment.jsp">
   <input type="hidden" name="amt" id="amt" value="<%=total %>"></input>
   <br><br>
   <button type="submit" name="btn" id="btn" value="pay">Pay the bill</button>
   <button type="submit" name="btn" id="btn" value="add">Add more Products</button>
</form>
</body>
</html>