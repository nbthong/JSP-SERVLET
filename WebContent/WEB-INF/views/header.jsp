<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<div style="background-color: #d0d0d0; heigh:100px;"> 
		<h5>Hello, ${sessionScope.username}</h5>
		
		<a href="${pageContext.request.contextPath}/home">Home</a>
		
		<a href="${pageContext.request.contextPath}/bookList">Book List</a>
		
		<a href="${pageContext.request.contextPath}/createBook">Create Book</a>
		
		<a href="${pageContext.request.contextPath}/logout">Logout</a>
	</div>
</body>
</html>