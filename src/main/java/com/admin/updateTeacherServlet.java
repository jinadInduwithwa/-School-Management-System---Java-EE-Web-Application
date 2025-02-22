package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateTeacherServlet
 */
@WebServlet("/updateTeacher")
public class updateTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int id = Integer.parseInt(request.getParameter("id"));
		String teacherName = request.getParameter("teacherName");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		double Salary = Double.parseDouble(request.getParameter("Salary"));
		int grade = Integer.parseInt(request.getParameter("grade"));
		
		boolean isTrue = false ;
		
		 isTrue = AdminDBUtil.updateTeacher(id, teacherName, email, phone, address, Salary,  grade);
		 
		 if(isTrue == true ) {
				
				out.println("<script type='text/javascript'>");
				out.println("alert('update Successfully !!');");
				out.println("location='getAllTeachers'");
				out.println("</script>");
				
			}else {
				out.println("<script type='text/javascript'>");
				out.println("alert('update failed !!');");
				out.println("location='getAllTeachers'");
				out.println("</script>");
			}
	}

}
