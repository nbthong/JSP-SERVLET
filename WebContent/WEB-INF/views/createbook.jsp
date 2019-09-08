<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
	<title>Create book</title>
</head>
<body>
<jsp:include page="header.jsp" />
	<h2 style="text-align:center; color:blue;">CREATE BOOK</h2>
	
	<form method="POST" action="${pageContext.request.contextPath}/createBook" enctype="multipart/form-data">
         <table border="0">
            <tr>
               <td>Name</td>
               <td><input type="text" name="name"/></td>
            </tr>
            <tr>
               <td>Author</td>
               <td><input type="text" name="author"/></td>
            </tr>
            <tr>
               <td>Publisher</td>
               <td><input type="text" name="publisher"/></td>
            </tr>
             <tr>
               <td>Price</td>
               <td><input type="text" name="price"/></td>
            </tr>
            <tr>
            	<td>Photo</td>
            	<td><input type="file" name="photo" size="50" placeholder="Upload Your Image" required/></td>
            </tr>
            <tr>
            	<td>Create</td>
            	<td><input type="date" name="create"/></td>
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