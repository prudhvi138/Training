<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
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
<th>Id</th>
<th>UserName</th>
<th>Password</th>
<th>Email</th>
<th>Phone</th>
<th>Enabled</th>
</tr>
<c:forEach var="user" items="${list }">
<tr>
<td>${user.id}</td>
<td>${user.username}</td>
<td>${user.password}</td>
<td>${user.email}</td>
<td>${user.phone}</td>
<td>${user.enabled}</td>
</tr>
</c:forEach>

</table>
</body>
</html>