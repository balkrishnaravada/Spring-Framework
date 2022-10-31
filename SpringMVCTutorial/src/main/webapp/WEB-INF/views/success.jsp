<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page isELIgnored="false" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 class="text-center">${Header}</h1>
<h3>${desc}</h3>
<hr>
<hr>
<h1>${msg }</h1>
<h1>Email: ${user.email }</h1>
<h1>User NAme: ${user.username }</h1>
<h1>Password: ${user.password }</h1>

</body>
</html>