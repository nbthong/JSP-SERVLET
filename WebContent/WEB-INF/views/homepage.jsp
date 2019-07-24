<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book management</title>
</head>
<body>
	<h1 style="text-align:center; color:blue;">WELCOME TO HOME PAGE</h1>
	
	<a href="${pageContext.request.contextPath}/bookList">Book List</a>
	
	<a href="${pageContext.request.contextPath}/createBook">Create Book</a>
	
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