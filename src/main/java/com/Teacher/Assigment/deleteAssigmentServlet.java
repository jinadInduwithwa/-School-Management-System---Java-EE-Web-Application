package com.Teacher.Assigment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admin.Events.EventsDBUtil;

/**
 * Servlet implementation class deleteAssigmentServlet
 */
@WebServlet("/deleteAssigment")
public class deleteAssigmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		String id = request.getParameter("id");
		System.out.println(id);
				
				boolean isTrue = false ;
				
				isTrue = AssigmentDBUtil.DeleteAssigment(id);
				
				if(isTrue == true) {
					
					out.println("<script type='text/javascript'>");
					out.println("alert('Deleted successfully !!');");
					out.println("location='teracher-addAssigment.jsp'");
					out.println("</script>");
					
				}else {
					out.println("<script type='text/javascript'>");
					out.println("alert('Deletion Failed');");
					out.println("location='teracher-addAssigment.jsp'");
					out.println("</script>");
					
				}
	}

}
