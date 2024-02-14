<%@page import="java.sql.ResultSet"%>
<%@page import="com.java.jsp.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student details</title>
</head>
<body style="background-color: lightblue;">
	

	<table border="2">
		<tr>
			<th>StudentId</th>
			<th>StudentName</th>
			<th>StudentCourse</th>
			<th>StudentPhone</th>
			<th>Join</th>
			<th>Email</th>
			<th>Password</th>
		</tr>
		<%
		// Retrieve the ResultSet from the request attribute
		ResultSet rs = (ResultSet) request.getAttribute("studentdata");
		while (rs.next()) {
		%>
		<!-- Arranging data in tabular form -->
		<tr>
			<td><%=rs.getInt(1)%></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getString(3)%></td>
			<td><%=rs.getString(4)%></td>
			<td><%=rs.getString(5)%></td>
			<td><%=rs.getString(6)%></td>
			<td><%=rs.getInt(7)%></td>
		</tr>
		<%
		}
		
		%>
	</table>
</body>
</html>
