<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update book</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<h2 style="text-align:center; color:blue;">UPDATE BOOK</h2>
	
	<form method="POST" action="${pageContext.request.contextPath}/updateBook">
         <table border="0">
         	<tr>
               <td>Id</td>
               <td><input type="text" name="id" value="${book.id}" readonly="readonly"/></td>
            </tr>
            <tr>
               <td>Name</td>
               <td><input type="text" name="name" value="${book.name}"/></td>
            </tr>
            <tr>
               <td>Author</td>
               <td><input type="text" name="author" value="${book.author}"/></td>
            </tr>
            <tr>
               <td>Publisher</td>
               <td><input type="text" name="publisher" value="${book.publisher}"/></td>
            </tr>
             <tr>
               <td>Price</td>
               <td><input type="text" name="price" value="${book.price}"/></td>
            </tr>
            <tr>
               <td colspan="2">                   
                   <input type="submit" value="Submit" />
               </td>
            </tr>
         </table>
      </form>
</body>
</html>