<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>This is Home Page</h1>
<h1>Called by Home Controller</h1>
<h1>url /home</h1>
<%
String name=(String)request.getAttribute("name");

List<String> student=(List<String>)request.getAttribute("student");

%>
<h1>My name is <%= name %></h1>

<h1> Students are</h1>
<%
for(String s: student)
{
	out.println(s);
	
}

%>

<c:forEach var="item" items="${ student}">

<h1> ${item}</h1>

</c:forEach>

</body>
</html>