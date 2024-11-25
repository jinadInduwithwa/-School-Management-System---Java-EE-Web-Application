package com.admin;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.student.Student;
import com.student.StudentDBUtil;

/**
 * Servlet implementation class AddStudnetServlet
 */
@WebServlet("/AddStudnet")
@MultipartConfig
public class AddStudnetServlet extends HttpServlet {
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
		String photo = request.getParameter("photo");
		
		
		
		

		
		String fileName;
		
		Part file = request.getPart("photo");
		System.out.println("file name :" +file.getSubmittedFileName());
		fileName = file.getSubmittedFileName();

		
		
	
		
		String path = getServletContext().getRealPath("");
		System.out.println(path);
			
		String uploadPath = "C:/pro/School-information-System/src/main/webapp/Assert/Student-main/"+ fileName ;
			try {
			FileOutputStream fos= new FileOutputStream(uploadPath);
			InputStream is = file.getInputStream();
			
			byte[] data = new byte[is.available()];
			is.read(data);
			fos.write(data);
			fos.close();
			
			boolean isTrue = false ;
			
			 isTrue = AdminDBUtil.addStudent(fname, lname, username,grade ,address,telephone, dob ,email ,password , fileName);
			 
			 if(isTrue == true ) {
				 
				 out.println("<script type='text/javascript'>");
					out.println("alert('Insert Successfully !!');");
					out.println("location='allstudents'");
					out.println("</script>");
				}else {
					out.println("<script type='text/javascript'>");
					out.println("alert('insert unsuccess !!');");
					out.println("location='allstudents'");
					out.println("</script>");
				}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
			
			
	
		

	}
		
	

}
