package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteTeacherServlet
 */
@WebServlet("/DeleteTeacher")
public class DeleteTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		String sid = request.getParameter("id");
		
		System.out.println(sid);
		
		boolean isTrue = false ;
		
		isTrue = AdminDBUtil.deleteTeacher(sid);
		
		if(isTrue == true) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Deleted successfully !!');");
			out.println("location='getAllTeachers'");
			out.println("</script>");
			
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Failed');");
			out.println("location='getAllTeachers'");
			out.println("</script>");
			
		}
	}

}
