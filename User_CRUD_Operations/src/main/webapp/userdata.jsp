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

	</form>

		<table border="2">
			<tr>
				<th>UserId</th>
				<th>UserName</th>
				<th>UserEmail</th>
				<th>UserPhno</th>
				<th>Action</th>
			</tr>
			
			<c:if test="${data == null}">
			<tr>
			<td colspan=4>
			<c:out value="no records found"></c:out>
			</td>
			</tr>
			</c:if>


			<c:forEach items="${data}" var="user">
				<tr>
					<td>${user.userid }</td>
					<td>${user.username }</td>
					<td>${user.useremail }</td>
					<td>${user.userphno }</td>
					<td><a href="edit?userid=${user.userid}&action=edit">Edit</a><a href="*?action=delete&userid=${user.userid}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	
<a href="index.jsp">add new user</a>

</body>
</html>