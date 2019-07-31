<%@ page language="java" contentType="text/html; charset=UTF-8" session="false"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
</head>
<body>

	<h2 style="text-align:center; color:blue;">LOGIN</h2>
	<h4 style="color: red;">${errormessage}</h4>
	<form method="POST" action="${pageContext.request.contextPath}/login">
		Username:<input type="text" name="username"/><br/>  
		Password:<input type="password" name="password"/><br/>  
		  
		<input type="submit" value="login">  
	</form>  
</body>
</html>