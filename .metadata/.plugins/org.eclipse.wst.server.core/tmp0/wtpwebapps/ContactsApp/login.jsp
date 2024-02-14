<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<c:if test="${msg != null}">
	<c:out value="${msg}" />
	</c:if>

	<form action="login" method="post">
		<input type="hidden" name="action" value="login"> 
	     Email:<input type="text" name="useremail"><br>
	     <br>
	     Password: <input type="text" name="userpassword"><br>
	     <br>
	     <input type="submit" value="Login">
	     <br>
	     <br>
	  
	
	</form>
	
	   <a href="register.jsp">Sign Up Here</a>
</body>
</html>