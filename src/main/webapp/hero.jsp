<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hero Form</title>
</head>
<body>
<h1>Hero Application</h1>
<form action="heroServlet" action="post">
	Enter your name, hero:
	<input type="text" name="userName" size="10">
	<input type="submit" value = "Begin your journey">
</form>
<a href="squared.jsp">Wanna square a number?</a>
</body>
</html>