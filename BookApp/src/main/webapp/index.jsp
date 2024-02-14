<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="bookcontroller" method="post">
 BookName:<input type="text" name="bookname"><br>
 BookPrice:<input type="number" name="bookprice"><br>
 AuthorName;<input type="text" name="authorname"><br>
          <input type="submit" value="Add Book">
 
 </form>
 <br><br>
 <a href="bookcontroller"><input type="button" value="view Books"></a><br>

</body>
</html>