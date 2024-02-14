<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${msg != null}">
	<h1 style= "color:green;"></h1><c:out value="${msg}" /></h1>
	</c:if>

	<form action="create" method="post" >
		
		<input type="hidden" name="action" value="create"> 
	
		 Name:<input type="String" name="username"><br>
		 <br>
	     Email:<input type="text" name="useremail"><br>
	     <br>
	     Password: <input type="text" name="userpassword"><br>
	     <br>
	     Phno:<input type="text" name="userphno"><br>
	     <br>
	     
	     <input type="submit" value="Register">
	     <br>
	     <br>
	     
	
	</form>
	
	<a href="login.jsp">Login  Here</a>

</body>
</html>