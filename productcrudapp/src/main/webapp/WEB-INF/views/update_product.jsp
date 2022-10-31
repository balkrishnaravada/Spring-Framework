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
           <h2 class="text-center"> Update Product Details</h2>
           
            <form action="${pageContext.request.contextPath }/formhandler" method='post'>
                   
                   <input hidden type="text" class="form-control" value="${product.id}" name="id" id="product_id" />
                   
  
				  <div class="form-group">
				    <label for="exampleProductName">Product Name</label>
				    <input type="text" class="form-control" name="name" id="product_name" aria-describedby="emailHelp" placeholder="Enter Product name" value="${product.name}">
				    
				  </div>
				  <div class="form-group">
				    <label for="exampleProductDescription">Description</label>
				    <textarea   rows="4" class="form-control" id="description" aria-describedby="emailHelp" placeholder="Enter Description" name="description" >
				    ${product.description}</textarea>
				  </div>
				  <div class="form-group">
				    <label for="exampleProductPrice">Price</label>
				    <input type="text" class="form-control" name="price" id="price" aria-describedby="emailHelp" placeholder="Enter Price" value="${product.price}">
				  
				  </div>
				  
				  
				  <div class="text-center mb-3">
				  <a href="${pageContext.request.contextPath }/" class="btn btn-outline-light">Back</a>
				  <button type="submit" class="btn btn-outline-light">Update</button>
				  </div>
		   </form>
         
         
         </div>
      </div>
   
   </div>

 </div>
</body>
</html>