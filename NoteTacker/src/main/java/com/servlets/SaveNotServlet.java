package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.Note;
import com.helper.FactoryProvider;


public class SaveNotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SaveNotServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			String title=request.getParameter("title");
			String content=request.getParameter("content");
			
			Note n=new Note(title,content,new Date());
			
			//System.out.println("Id : "+n.getId()+"Title : "+n.getTitle());
		    Session s= FactoryProvider.getFactory().openSession();
		    Transaction tx=s.beginTransaction();
		    s.save(n);
		    tx.commit();
		    s.close();
			PrintWriter out=response.getWriter();
			response.setContentType("text");
			out.println("<h1 style='text-align:center'>Note is added Seccessfully</h1>");
			out.println("<h1 style='text-align:center'><a href='allnotes.jsp'>View All Notes</a></h1>");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
