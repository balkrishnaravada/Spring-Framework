<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session" %>
<%@page import="com.entities.Note" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Notes</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>
 <div class="container-fluid p-0 m-0">
    <%@include file="navbar.jsp"%>
 </div>
 
	<div class="container">
	<h1>All Notes</h1>
	  <br/>
	  
	  <div class="row">
	  
	    
			    <%
				 Session s=FactoryProvider.getFactory().openSession();			 
				 Query q=s.createQuery("from Note"); 
				 List<Note> list=q.list();	 
				 for(Note n:list)
				 {
				%> 
			        <div class="col-6">
					<div class="card" style="max-height:1200px" >
					  <img class="card-img-top pl-4 pt-4 mx-auto" style="max-width:80px" src="img/Note.png" alt="Card image cap">
					  <div class="card-body px-5">
					    <h5 class="card-title"><%= n.getTitle() %></h5>
					    <p class="card-text"><%= n.getContent() %></p>
					    <div class="container text-center mt-2">
					    <a href="DeleteServlet?note_id=<%= n.getId() %>" class="btn btn-danger">Delete</a>
					    <a href="editnote.jsp?note_id=<%= n.getId() %>" class="btn btn-primary">Update</a>
					    </div>
					  </div>
					</div>
					 </div>	  
					</br>
				 <% 
				 }
				 
				 s.close();
				 
				 %>
 
	    </div>	  
	  </div>
		
		 
    </div>
    
    
</body>
</html>