<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Note</title>
 <%@include file="all_js_css.jsp"%>
</head>
<body>
 <div class="container-fluid p-0 m-0">
    <%@include file="navbar.jsp"%>
    </div>
    <div class="container">
    <br/>
    <h1>Please Fill your Note Details</h1>
    <br/>
		<form action="SaveNotServlet" method="post">
		  <div class="form-group">
		    <label for="title">Note Title</label>
		    <input name="title" type="text" class="form-control" id="title" required placeholder="Enter Title"/>
		  </div>
		  <div class="form-group">
		    <label for="content">Note Content</label>
		    <textarea id="content" class="form-control"  name="content" required style=height:300px> </textarea>
		  </div>
		  
		  <div class="container text-center">
		  <button type="submit" class="btn btn-primary">Add</button>
		  </div>
		</form>
    </div>

</body>
</html>