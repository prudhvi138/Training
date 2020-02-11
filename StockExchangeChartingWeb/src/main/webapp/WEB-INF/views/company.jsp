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
<th>Name</th>
<th>Sector</th>
<th>CEO Name</th>
<th>Turnover</th>
</tr>
<c:forEach var="company" items="${list }">
<tr>
<td>${company.id}</td>
<td>${company.name}</td>
<td>${company.sector}</td>
<td>${company.ceoName}</td>
<td>${company.turnOver}</td>
</tr>
</c:forEach>

</table>
</body>
</html>