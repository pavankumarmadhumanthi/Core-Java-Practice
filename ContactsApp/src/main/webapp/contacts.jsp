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
		<c:set var="user" value="${sessionScope.user}" />
<form action="addcontact" method="post">
		<input type="hidden" name="user" value="${user}">
		
		<input type="hidden" name="action" value="addcontact">

         Name:<input type="String" name="contactname">  
		 
	     Email:<input type="text" name="contactemail">
	    
	     Phno:<input type="text" name="contact"><br>
	     
	     <input type="submit" name="add contact">

</form> 


		<table border="2">
			<tr>
				<th>S.no</th>
				<th>ContactName</th>
				<th>Email</th>
				<th>Contact</th>
				
			</tr>
			
			<c:if test="${List == null}">
			<tr>
			<td colspan=4>
			<c:out value="no records found"></c:out>
			</td>
			</tr>
			</c:if>


			<c:forEach items="${List}" var="contact">
				<tr>
					<td>${contact.user }</td>
					<td>${contact.contactname }</td>
					<td>${contact.contactemail }</td>
					<td>${contact.contact }</td>
					
			</c:forEach>
		</table>
	
<form action="logout" method="post">
	<input type="hidden" name="action" value="logout">
	<input type="submit" value="Logout">
</form>

</body>
</html>