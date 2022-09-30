<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Square Result</title>
</head>
<body>
<p>${userNumber.getNumInput()} squared is ${userNumber.getNumSquare()}</p>
<a href="squared.jsp">Enter another number</a>
</body>
</html>