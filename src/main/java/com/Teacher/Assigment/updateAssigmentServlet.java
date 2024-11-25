package com.Teacher.Assigment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateAssigment")
public class updateAssigmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		int assId = Integer.parseInt((request.getParameter("assId")));
		int teacherId = Integer.parseInt((request.getParameter("teacherId")));
		String assigmentName = request.getParameter("assigmentName");
		String assigmentDescription = request.getParameter("assigmentDescription");
		String assigmentUploadDate = request.getParameter("assigmentUploadDate");
		String assigmnmentDueDate = request.getParameter("assigmnmentDueDate");


		boolean isTrue = false;
		
		isTrue = AssigmentDBUtil.updateAssigment(assId, teacherId, assigmentName, assigmentDescription, assigmentUploadDate, assigmnmentDueDate);
		
		if(isTrue == true ) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('update Successfully !!');");
			out.println("location='AllAsigment?teacherId=' + '"+teacherId+"'");
			out.println("</script>");
			
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('update failed !!');");
			out.println("location='AllAsigment?teacherId=' + '"+teacherId+"'");
			out.println("</script>");
		}
	}

}
