<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="index.jsp">Home</a>
<a href="index.html">Register</a>
<a href="login.jsp">Login</a>
<a href="register.jsp">Registration</a>
<a href="implicit-objects.jsp">Implicit</a>
<a href="action.jsp">Actions</a>
<a href="expression.jsp">Expression</a>
<a href="jstlCore.jsp">Jstl</a>
<a href="session.jsp">session</a>
Welcome :<% session.getAttribute("loggedInUser"); %>
<hr>
</body>
</html>