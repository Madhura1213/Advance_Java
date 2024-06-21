<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment</title>
</head>
<body>
<% String btn = request.getParameter("btn");
if(btn.equals("pay")) {
%>
<form action= "Logout.jsp">
Credit card No <input type="text" name="cno" id="cno" maxlength="8"><br>
Amount ${param.amt}
<br>
 <button type="submit" name="btn" id="btn" value="pay">Pay Amount</button>
</form>
<% } else { %>
<jsp:forward page="findCategory"></jsp:forward>
<%} %>
</body>
</html>