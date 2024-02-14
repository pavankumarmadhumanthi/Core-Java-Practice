<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User CRUD</title>
</head>
<body>
    <c:choose>
        <c:when test="${not empty userToEdit}">
            <h2>Edit User</h2>
            <form action="UserServlet?action=update" method="post">
                <input type="hidden" name="id" value="${userToEdit.id}">
                Username: <input type="text" name="username" value="${userToEdit.username}"><br>
                Email: <input type="text" name="useremail" value="${userToEdit.useremail}"><br>
                Phone Number: <input type="text" name="userphno" value="${userToEdit.userphno}"><br>
                <input type="submit" value="Update">
            </form>
        </c:when>
        <c:otherwise>
            <h2>Create User</h2>
            <form action="UserServlet?action=create" method="post">
                Username: <input type="text" name="username"><br>
                Email: <input type="text" name="useremail"><br>
                Phone Number: <input type="text" name="userphno"><br>
                <input type="submit" value="Create">
            </form>
        </c:otherwise>
    </c:choose>

    <h1>User List</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Username</th>
            <th>Email</th>
            <th>Phone Number</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.useremail}</td>
                <td>${user.userphno}</td>
                <td>
                    <a href="UserServlet?action=edit&id=${user.id}">Edit</a> |
                    <a href="UserServlet?action=delete&id=${user.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
