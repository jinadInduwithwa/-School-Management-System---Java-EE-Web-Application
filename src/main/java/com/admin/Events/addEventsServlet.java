package com.admin.Events;

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

import com.admin.AdminDBUtil;


@WebServlet("/addEvents")        //specify the url to call this servlet
@MultipartConfig                //used to upload file
public class addEventsServlet extends HttpServlet {                 //class for add events
	private static final long serialVersionUID = 1L;                

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();               //printwriter to print the response
		response.setContentType("text/html");                       //set the response type
			
		String Name = request.getParameter("event-name");               //get the parameters from the form
		String date = request.getParameter("event-date");                 
		String Location = request.getParameter("event-location");                 
		String description = request.getParameter("event-description");          
		String organizer = request.getParameter("event-organizer");
		String contact = request.getParameter("event-organizer-contact");
		
		
		
String fileName;     //variable to store the file name
		
		Part file = request.getPart("event-image");                  //get the file from the form
		System.out.println("file name :" +file.getSubmittedFileName());          //print the file name
		fileName = file.getSubmittedFileName();                      //store the file name in the variable

		
		
	
		
		String path = getServletContext().getRealPath("");          //get the path of the project
		System.out.println(path);                               //print the path
		
		String uploadPath = "C:/Y2S1_Project/School-information-Project.zip_expanded/School-information-System/src/main/webapp/Assert/Student-main"+ fileName ;     //set the path to store the file
			try {
			FileOutputStream fos= new FileOutputStream(uploadPath);            //file output stream to store the file
			InputStream is = file.getInputStream();                             //input stream to read the file
			
			byte[] data = new byte[is.available()];              //byte array to store the file
			is.read(data);                                     //read the file
			fos.write(data);                                  //write the file
			fos.close();                                       //close the file output stream
			
			boolean isTrue = false ;                           //boolean variable to check the insert status
			
			 isTrue = EventsDBUtil.addEvent(Name, date, Location, description, organizer, contact, fileName);     //call the addEvent method in EventsDBUtil class
			 
			 if(isTrue == true ) {
				 
				 out.println("<script type='text/javascript'>");             //print the response
					out.println("alert('Insert Successfully !!');");
					out.println("location='allEvents'");
					out.println("</script>");
				}else {
					out.println("<script type='text/javascript'>");         //print the response
					out.println("alert('insert unsuccess !!');");
					out.println("location='allEvents'");
					out.println("</script>");
				}
			
			}catch(Exception e) {
				e.printStackTrace();            //print the exception
			}
			
			
	}

}
