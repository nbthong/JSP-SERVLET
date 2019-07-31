<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book management</title>
</head>
<body>
	<h5>Hello, ${sessionScope.username}</h5>
	<h2 style="text-align:center; color:blue;">WELCOME TO HOME PAGE </h2>
	
	<a href="${pageContext.request.contextPath}/bookList">Book List</a>
	
	<a href="${pageContext.request.contextPath}/createBook">Create Book</a>
	
	<a href="${pageContext.request.contextPath}/login">Login</a>
	
	<a href="${pageContext.request.contextPath}/logout">Logout</a>
	<div>
		<form method="GET" action="${pageContext.request.contextPath}/searchBook">
         <table border="0">
            <tr>
               <td><input type="text" name="name"/></td>
               <td><input type="submit" value="Search" /></td>
            </tr>
         </table>
      </form>
	</div>
</body>
</html>