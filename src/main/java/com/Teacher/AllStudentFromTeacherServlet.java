package com.Teacher;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.Student;

/**
 * Servlet implementation class AllStudentFromTeacherServlet
 */
@WebServlet("/AllStudentFromTeacher")
public class AllStudentFromTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> stdDetailsFromTeacher = TeacherDBUtil.getALLstudents();
		request.setAttribute("stdDetailsFromTeacher", stdDetailsFromTeacher);
		
		
		
		RequestDispatcher dis = request.getRequestDispatcher("teacher-dashBoard.jsp");
		dis.forward(request, response);
	}

	

}
