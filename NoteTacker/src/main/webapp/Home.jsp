<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <%@include file="all_js_css.jsp"%>
 
</head>
<body>
<div class="container-fluid p-0 m-0">
    <%@include file="navbar.jsp"%>
    </div>
    <h1 class="text-primary text-uppercase p-3 mb-2 bg-info text-light">Welcome to Note tacker</h1>
    <br/>
    <div class="container">
     <div class="col-12">
					<div class="card" >
					  <img class="card-img-top pl-4 pt-4 mx-auto" style="max-width:200px" src="img/Note.png" alt="Card image cap">
					  <div class="card-body px-5">
					  <h2 class="text-primary text-uppercase text-center"> Start taking Your Notes...</h2>
					  
					  <div class="container text-center">
					  
					  <a href="addnote.jsp" class="btn btn-success">Start here </a>
					  
					    </div>
					  </div>
					</div>
					 </div>	
    </div>
    
</body>
</html>