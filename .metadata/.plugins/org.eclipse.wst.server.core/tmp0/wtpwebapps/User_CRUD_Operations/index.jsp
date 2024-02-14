<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${user!=null}">
		<c:set var="user" value="${user}" />
		<form action="update" method="post">
			<input type="hidden" name="action" value="update"> 
			<input type="hidden" name="userid" value="${user.userid}">
			UserName:<input type="text" name="username" value="${user.username}"><br>
			UserEmail:<input type="text" name="useremail" value="${user.useremail}"><br> 
			UserPhno:<input type="number" name="userphno" value="${user.userphno}"> <br>
			
			<input type="submit" value="update">
		</form>
	</c:if>


	<c:if test="${user==null}">
		<form action="create" method="get">
			<input type="hidden" name="action" value="create"> 
			UserName:<input type="text" name="username"><br> 
			UserEmail:<input type="text" name="useremail"><br>
			UserPhno:<input type="number" name="userphno"><br> 
			
			<input type="submit"  value="create">
		</form>
		<br>
		<a href="*?action=retrieve">view users</a>
	</c:if>

</body>
</html>