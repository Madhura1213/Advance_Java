<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginPage</title>
</head>
<body>
${msg}
<form action="validateuser" >
User Name : <input type="text" name ="uname" id="uname">
<br>
Password : <input type="text" name ="pass" id="pass">
 <br>
 <button type="submit" name ="btn" id="btn"> Login </button>
 </form>
</body>
</html>