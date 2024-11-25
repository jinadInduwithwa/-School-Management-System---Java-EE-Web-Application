package com.Teacher.Assigment;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admin.Notice.Notice;
import com.admin.Notice.NoticeDBUtil;

/**
 * Servlet implementation class AllAsigmentServlet
 */
@WebServlet("/AllAsigment")
public class AllAsigmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // Get the idTeacher parameter from the URL
        String idTeacher = request.getParameter("teacherId");
        System.out.println("idTeacher: " + idTeacher);
        
        
        List<Assigment> assigmentDetails = AssigmentDBUtil.getAssigmentByTeacher(idTeacher);
		request.setAttribute("assigmentDetails", assigmentDetails);
		
		RequestDispatcher dis = request.getRequestDispatcher("teacher-view-assigment.jsp");
		dis.forward(request, response);
	}

}
