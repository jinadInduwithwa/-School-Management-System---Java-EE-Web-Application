package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteStudentServlet
 */
@WebServlet("/DeleteStudent")
public class DeleteStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		String sid = request.getParameter("id");
		
		System.out.println(sid);
		
		boolean isTrue = false ;
		
		isTrue = AdminDBUtil.RejectStudent(sid);
		
		if(isTrue == true) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Deleted successfully !!');");
			out.println("location='allstudents'");
			out.println("</script>");
			
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Failed');");
			out.println("location='allstudents'");
			out.println("</script>");
			
		}
	}

}
