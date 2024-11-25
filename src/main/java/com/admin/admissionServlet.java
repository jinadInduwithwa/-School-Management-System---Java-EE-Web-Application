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


@WebServlet("/admission")
public class admissionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("addmission");
		
		List<Student> stdDetails = AdminDBUtil.getAdmissionStudent();
		
		request.setAttribute("stdDetails", stdDetails);
		
		System.out.println(stdDetails);
		
		RequestDispatcher dis = request.getRequestDispatcher("admin-admision.jsp");
		dis.forward(request, response);
	}


}
