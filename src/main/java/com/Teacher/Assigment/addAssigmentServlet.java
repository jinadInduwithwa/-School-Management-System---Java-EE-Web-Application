package com.Teacher.Assigment;

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
 * Servlet implementation class addAssigmentServlet
 */
@WebServlet("/addAssigment")
@MultipartConfig
public class addAssigmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
	        response.setContentType("text/html");

	        String teacherId = request.getParameter("Teacherid");
	        String assigmentName = request.getParameter("assigmentName");
	        String assigmentDescription = request.getParameter("assigmentDescription");
	        String assigmentUploadDate = request.getParameter("assigmentUploadDate");
	        String assigmentDueDate = request.getParameter("assigmentDueDate");
	        String assigmentFile = request.getParameter("assigmentFile");

	        String fileName;
			
			Part file = request.getPart("assigmentFile");
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

	         isTrue = AssigmentDBUtil.addAssigment(teacherId, assigmentName, assigmentDescription, assigmentUploadDate, assigmentDueDate, fileName);

	        if (isTrue) {
	            out.println("<script type='text/javascript'>");
	            out.println("alert('Upload Successful');");
	            out.println("location='AllAsigment?teacherId=' + '"+teacherId+"'");
	            out.println("</script>");
	        } else {
	            out.println("<script type='text/javascript'>");
	            out.println("alert('Upload Failed');");
	            out.println("location='AllAsigment?teacherId=' + '"+teacherId+"'");
	            out.println("</script>");
	        }
				}catch(Exception e) {
					e.printStackTrace();
				}
	    }
}
