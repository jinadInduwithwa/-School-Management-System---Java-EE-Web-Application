package com.admin;

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
 * Servlet implementation class getAllstudentsServlet
 */
@WebServlet("/allstudents")
public class getAllstudentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Student> stdDetails = AdminDBUtil.getALLstudents();
		request.setAttribute("stdDetails", stdDetails);
		
		
		
		RequestDispatcher dis = request.getRequestDispatcher("admin-Studnet.jsp");
		dis.forward(request, response);
		
		
	}

}
