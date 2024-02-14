<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<table border="2">
			<tr>
				<th>BookId</th>
				<th>BookName</th>
				<th>BookPrice</th>
				<th>AuthorName</th>
			</tr>
			
			<c:if test="${data.size() == 0 }">
			<tr>
			<td colspan=4>
			<c:out value="no records found"></c:out>
			</td>
			</tr>
			</c:if>

			<!-- Arranging data in tabular form -->

			<c:forEach items="${data}" var="product">
				<tr>
					<td>${product.bookid }</td>
					<td>${product.bookname }</td>
					<td>${product.bookprice }</td>
					<td>${product.authorname}</td>
				</tr>
			</c:forEach>
		</table>
	
</body>
</html>