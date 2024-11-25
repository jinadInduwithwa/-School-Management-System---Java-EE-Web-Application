package com.admin;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class AddTeacherServlet
 */
@WebServlet("/AddTeacher")
@MultipartConfig
public class AddTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		
		String teacherName = request.getParameter("teacherName");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		double Salary = Double.parseDouble(request.getParameter("Salary"));
		int grade = Integer.parseInt(request.getParameter("grade"));
		String Gender = request.getParameter("Gender");
		String password = request.getParameter("password");
		String username = request.getParameter("username");
	
		
		
		
		

		
		String fileName;
		
		Part file = request.getPart("teacher_photo");
		System.out.println("file name :" +file.getSubmittedFileName());
		fileName = file.getSubmittedFileName();

		
		
	
		
		String path = getServletContext().getRealPath("");
		System.out.println(path);
			
		String uploadPath = "C:/Y2S1_Project/School-information-Project.zip_expanded/School-information-System/src/main/webapp/Assert/Student-main"+ fileName ;
			try {
			FileOutputStream fos= new FileOutputStream(uploadPath);
			InputStream is = file.getInputStream();
			
			byte[] data = new byte[is.available()];
			is.read(data);
			fos.write(data);
			fos.close();
			
			boolean isTrue = false ;
			
			 isTrue = AdminDBUtil.addTeacher(teacherName, email, phone, address, Salary,  grade, Gender, password, fileName,username);
			 
			 if(isTrue == true ) {
				 
				 out.println("<script type='text/javascript'>");
					out.println("alert('Insert Successfully !!');");
					out.println("location='getAllTeachers'");
					out.println("</script>");
				}else {
					out.println("<script type='text/javascript'>");
					out.println("alert('insert unsuccess !!');");
					out.println("location='getAllTeachers'");
					out.println("</script>");
				}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
			
			
	
		

	
	}

}
