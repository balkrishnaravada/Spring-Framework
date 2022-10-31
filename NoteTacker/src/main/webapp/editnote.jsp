<%@page import="com.helper.FactoryProvider"%>
<%@page import="com.entities.Note"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Note</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>

 <div class="container-fluid p-0 m-0">
    <%@include file="navbar.jsp"%>
    </div>
    <div class="container">
    <h2>Update Your Note</h2>
    <br/>
    
    <%
    
    int noteId=Integer.parseInt( request.getParameter("note_id").trim());
	
	Session s=FactoryProvider.getFactory().openSession();
	
	Note note=(Note) s.get(Note.class, noteId);
	
	//s.close();
    
    
    %> 
    <form action="UpdateServlet" method="post">
		  <div class="form-group">
		  <input type="hidden" value="<%= note.getId() %>" name="noteId"/>
		    <label for="title">Note Title</label>
		    <input name="title" type="text" class="form-control" id="title" required placeholder="Enter Title" value="<%= note.getTitle() %>"/>
		  </div>
		  <div class="form-group">
		    <label for="content">Note Content</label>
		    <textarea id="content" class="form-control"  name="content" required style=height:300px ><%= note.getContent() %> </textarea>
		  </div>
		  
		  <div class="container text-center">
		  <button type="submit" class="btn btn-primary">Add</button>
		  </div>
		</form>
		
		</div>
</body>
</html>