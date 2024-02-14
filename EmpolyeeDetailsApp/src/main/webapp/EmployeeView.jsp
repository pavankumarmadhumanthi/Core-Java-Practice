<%@page import="com.java.employee.*"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>welcome to jsp page</h1>
	
		<table border="2">
		<tr>
			<th>EmployeeId</th>
			<th>EmployeeName</th>
			<th>email</th>
			<th>city</th>
			
		</tr>
		<%
		// Retrieve the ResultSet from the request attribute
		List<EmployeeModel> model=(List<EmployeeModel>)request.getAttribute("employeeById");
		
		for (EmployeeModel i:model) {
		%>
		<!-- Arranging data in tabular form -->
		<tr>
			<td><%=i.getEmployeeId()%></td>
			<td><%=i.getEmployeeName()%></td>
			<td><%=i.getEmail()%></td>
			<td><%=i.getCity()%></td>
			
		</tr>
		<%
		}
		
		%>
	</table>

</body>
</html>