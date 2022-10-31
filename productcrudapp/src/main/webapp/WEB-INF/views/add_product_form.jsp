<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style></style>
<%@include file="./base.jsp" %>
</head>
<body background=<c:url value="/resources/img/bgimage.jpeg"/>>

 <div class="container">
   <div class="row">
      <div class="col-md-6 offset-md-3">
         <div class="card mt-5 mb-5">
           <h2 class="text-center"> Fill the product details</h2>
           
            <form action="formhandler" method='post'>
				  <div class="form-group">
				    <label for="exampleProductName">Product Name</label>
				    <input type="text" class="form-control" name="name" id="product_name" aria-describedby="emailHelp" placeholder="Enter Product name">
				    
				  </div>
				  <div class="form-group">
				    <label for="exampleProductDescription">Description</label>
				    <textarea  rows="4" class="form-control" id="description" aria-describedby="emailHelp" placeholder="Enter Description" name="description">
				    </textarea>
				  </div>
				  <div class="form-group">
				    <label for="exampleProductPrice">Price</label>
				    <input type="text" class="form-control" name="price" id="price" aria-describedby="emailHelp" placeholder="Enter Price">
				  
				  </div>
				  
				  
				  <div class="text-center mb-3">
				  <a href="${pageContext.request.contextPath }/" class="btn btn-outline-light">Back</a>
				  <button type="submit" class="btn btn-outline-light">Add</button>
				  </div>
		   </form>
         
         
         </div>
      </div>
   
   </div>

 </div>
</body>
</html>