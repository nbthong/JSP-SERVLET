<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book management</title>
</head>
<body>
	<jsp:include page="header.jsp" />  

	<h2 style="text-align:center; color:blue;">WELCOME TO HOME PAGE </h2>
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