<html>
<head>
<%@include file="./base.jsp" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ page isELIgnored="false" %>
</head>

<body>
  <div class="container mt-3">
    <div class="row">
       <div class="col-md-12">
         <h1 class="text-center mb-3">Welcome to Product App</h1>
         <table class="table table-dark">
			  <thead>
			    <tr>
			      <th scope="col">#ID</th>
			      <th scope="col">Product Name</th>
			      <th scope="col">Description</th>
			      <th scope="col">Price</th>
			      <th scope="col">Action</th>
			    </tr>
			  </thead>
			  <tbody>
			  <c:forEach items="${products}" var="p">
			    <tr>
			      <th scope="row">${p.id}</th>
			      <td>${p.name}</td>
			      <td>${p.description}</td>
			      <td class="font-weight-bold">  &#x20B9;${p.price}</td>
			      <td>
			      <a href="update/${p.id}" class="btn btn-outline-primary"><i class="fa-solid fa-pencil"></i></a>
			      <a href="delete/${p.id}" class="btn btn-outline-danger"><i class="fa-solid fa-trash"></i></a> 
			      </td>
			    </tr>
			  </c:forEach>
			    <tr>
			      <td colspan="5">
			      <div class="text-center mb-3">
				  <a href="addproduct" class="btn btn-outline-success">Add Product</a>
		         </div>
       
			      </td>
			      
			    </tr>
			  </tbody>
			</table>
			
       
       </div>
    
    </div>  
  </div>


</body>
</html>
