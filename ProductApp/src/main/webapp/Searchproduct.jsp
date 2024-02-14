
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
	<form action="productdetails" method="get">

		Product ID:<input type="number" name="productid"><br> <input
			type="submit" value="Search"><br>


	</form>
	
	

		<table border="2">
			<tr>
				<th>ProductId</th>
				<th>ProductName</th>
				<th>ProductPrice</th>
				<th>ProductQty</th>
			</tr>
			
			<c:if test="${productdeatails.size() == 0 }">
			<tr>
			<td colspan=4>
			<c:out value="no records found"></c:out>
			</td>
			</tr>
			</c:if>

			<!-- Arranging data in tabular form -->

			<c:forEach items="${productdeatails}" var="product">
				<tr>
					<td>${product.productid }</td>
					<td>${product.productname }</td>
					<td>${product.productprice }</td>
					<td>${product.productQuantity}</td>
				</tr>
			</c:forEach>
		</table>
	



</body>
</html>