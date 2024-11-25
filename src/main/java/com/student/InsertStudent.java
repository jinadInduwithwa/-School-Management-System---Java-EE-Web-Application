package com.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class InsertStudent
 */
@WebServlet("/InsertStudent")
public class InsertStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String username = request.getParameter("username");
		int grade = Integer.parseInt(request.getParameter("grade"));
		String address = request.getParameter("address");
		String telephone = request.getParameter("phone");
		String dob = request.getParameter("dob");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String rePassword = request.getParameter("cpassword");
		
		
		
		
		
		
		
		
		boolean isTrue ;
		isTrue = StudentDBUtil.insertStudent(fname, lname, username, grade,address, telephone, dob, email, password,rePassword);
		
		if(isTrue == true ) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Insert Successfully !!');");
			out.println("location='waitingApprove.jsp'");
			out.println("</script>");
			
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('insert unsuccess !!');");
			out.println("location='Signup.jsp'");
			out.println("</script>");
		}
	}

}
