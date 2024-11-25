package com.student;

import java.io.File;

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





/**
 * Servlet implementation class updateStudentServlet
 */

@WebServlet(urlPatterns = "/updateStudent")          //specify the url to call this servlet
@MultipartConfig                           //specify the servlet is a multipart form data
public class updateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();           //create printwriter object to write the response
		response.setContentType("text/html");           //set the response content type
		
		
		//get the values from the form
		String id = request.getParameter("id");
		String fName = request.getParameter("fname");
		String Lname = request.getParameter("lname");
		String grade = request.getParameter("grade");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String existing_photo = request.getParameter("existing_photo");
		
		
		
		System.out.println(existing_photo);      //print the existing photo name for debugging
		
		String fileName;                 //create a string variable to store the file name
		
		Part file = request.getPart("photo");             //get the file part from the form
		System.out.println("file name :" +file.getSubmittedFileName());         //print the file name for debugging
		fileName = file.getSubmittedFileName();                             //get the file name

		
		
	
		
		String path = getServletContext().getRealPath("");             //get the path of the project
		System.out.println(path);                    //print the path for debugging
		
		if(fileName.isBlank()) {                      //check if the file name is empty
			fileName = existing_photo;                       //assign the existing photo name to the file name
			String uploadPath = "C:/Y2S1_Project/School-information-Project.zip_expanded/School-information-System/src/main/webapp/Assert/Student-main"+ fileName ;      //create the upload path
		}else {
			String uploadPath = "C:/Y2S1_Project/School-information-Project.zip_expanded/School-information-System/src/main/webapp/Assert/Student-main"+ fileName ;     //create the upload path
			try {
			FileOutputStream fos= new FileOutputStream(uploadPath);      //create a file output stream object
			InputStream is = file.getInputStream();                    //create a input stream object
			
			byte[] data = new byte[is.available()];          //create a byte array
			is.read(data);
			fos.write(data);                                   //write the data to the file
			fos.close();
			
			}catch(Exception e) {
				e.printStackTrace();                   //print the exception
			}
			
			
		}
		
	
		
		
		
		
		
		
		boolean isTrue = StudentDBUtil.updateStudent(id, fName, Lname,grade, phone, email, address,fileName );   //call the update student method
		
		if(isTrue == true) {
			
			List<Student> stdDetails = StudentDBUtil.getStudentDetails(id);     //get the student details
			
			request.setAttribute("stdDetails", stdDetails);        //set the student details to the request
			
			 HttpSession session = request.getSession(true);           //create a session
			
			session.setAttribute("stdDetails", stdDetails);               //set the student details to the session
			
			
			
			RequestDispatcher dis = request.getRequestDispatcher("student-profile.jsp");        //redirect to the student profile page
			dis.forward(request, response);                                       //forward the request and response
			
		}else {
			
			List<Student> stdDetails = StudentDBUtil.getStudentDetails(id);        //get the student details
			request.setAttribute("stdDetails", stdDetails);                     //set the student details to the request
			
			out.println("<script type='text/javascript'>");                  //print the alert box
			out.println("alert('update unsuccessfully !!');");
			out.println("location='account.jsp");
			out.println("</script>");
		}
	}

}
