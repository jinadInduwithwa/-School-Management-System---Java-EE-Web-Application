package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateStudnetServlet
 */
@WebServlet("/updateStudnet")
public class updateStudnetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		int id = Integer.parseInt(request.getParameter("id"));
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		int grade = Integer.parseInt(request.getParameter("grade"));
		String address = request.getParameter("address");
		String telephone = request.getParameter("phone");
		String dob = request.getParameter("dob");
		String email = request.getParameter("email");
		
		

		boolean isTrue = false ;
		
		 isTrue = AdminDBUtil.updateStudent(id, fname, lname, grade, address, telephone,  dob,email);
		 
		 if(isTrue == true ) {
				
				out.println("<script type='text/javascript'>");
				out.println("alert('update Successfully !!');");
				out.println("location='allstudents'");
				out.println("</script>");
				
			}else {
				out.println("<script type='text/javascript'>");
				out.println("alert('update failed !!');");
				out.println("location='allstudents'");
				out.println("</script>");
			}
	}

}
