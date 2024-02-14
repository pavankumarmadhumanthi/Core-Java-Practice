<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
        .centered-div {
            width: 300px; /* Set the desired width */
            margin: 0 auto; /* Set left and right margins to "auto" */
        }
    </style>
<title>Insert title here</title>

</head> 
<body class="centered-div"><h1> Product Info</h1>

 <form action="productdetails" method="post">
 <br>
 Product Name:<input type="text" name="productname"><br>
 Product Price:<input type="number" name="productprice"><br><br>
 
 Product Qty:<input type="number" name="productQty"><br>
          <input type="submit" value ="Save Product">

   <a href="Searchproduct.jsp"><input type="button" value="Searchproduct"></a>
 
 
 
 </form>



</body>
</html>