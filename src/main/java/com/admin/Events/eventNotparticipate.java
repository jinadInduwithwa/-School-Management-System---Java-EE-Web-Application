package com.admin.Events;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class eventNotparticipate
 */
@WebServlet("/Notparticipate")      //specify the URL pattern
public class eventNotparticipate extends HttpServlet {       //inherit the HttpServlet class
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();          //get the writer object
		response.setContentType("text/html");               //set the response type
		
		int eventID = Integer.parseInt(request.getParameter("eventID"));       //get the eventID from the URL
		int stdID = Integer.parseInt(request.getParameter("stdID"));         //get the studentID from the URL
		
		
		boolean isTrue = false ;                //create a boolean variable and assign false to it
		
		
		isTrue = EventsDBUtil.notPartcipate(eventID,stdID);            //call the notPartcipate method and pass the eventID and studentID as arguments
	
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");     //display the alert box
			out.println("alert('Done !!');");
			out.println("location='student-Events.jsp'");
			out.println("</script>");
			
		}else {
			out.println("<script type='text/javascript'>");      //display the alert box
			out.println("alert('Faild !!');");
			out.println("location='student-Events.jsp'");
			out.println("</script>");
		}
	}

	

}
