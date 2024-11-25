package com.student;
import com.Teacher.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;





/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session = request.getSession(true);
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if("admin@123".equals(username) && "Admin@123".equals(password)) {
			Student adminObj = new Student();
			adminObj.setUserName("Admin");
			session.setAttribute("adminObj", adminObj);
			response.sendRedirect("admin-Dashboard.jsp");
		}
		
		
		//validate teacher
		if(true == TeacherDBUtil.validateTeacher(username, password)) {
			List<Teacher> teacherDetails = TeacherDBUtil.getTeacher(username);
			request.setAttribute("teacherDetails", teacherDetails);
			
			
			session.setAttribute("teacherDetails", teacherDetails);
			response.sendRedirect("AllStudentFromTeacher");
		}
		
		
		boolean isApprove;
		
		isApprove = StudentDBUtil.isRegisterd(username, password);
		
		
		if(isApprove == true) {
			//validate student
			if(true == StudentDBUtil.validateStudent(username, password)) {
				
				
				List<Student> stdDetails = StudentDBUtil.getStudent(username);
				request.setAttribute("stdDetails", stdDetails);
				
				
				session.setAttribute("stdDetails", stdDetails);
				response.sendRedirect("index.jsp");
				
				
				
//				RequestDispatcher dis = request.getRequestDispatcher("account.jsp");
//				dis.forward(request, response);
				
				}else {
				session.setAttribute("failedMsg", "Email or password incorrect");
			
				out.println("<script type='text/javascript'>");
				out.println("alert('your username or password is incorrect');");
				out.println("location='Login.jsp'");
				out.println("</script>");
			}
			
			
		}else {
			session.setAttribute("failedMsg", "Unregisterd user");
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Waiting for admin approve');");
			out.println("location='waitingApprove.jsp'");
			out.println("</script>");
			
		}
		

	
	}
	

}
