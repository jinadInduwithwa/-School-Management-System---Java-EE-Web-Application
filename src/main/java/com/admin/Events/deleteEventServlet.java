package com.admin.Events;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admin.AdminDBUtil;


@WebServlet("/deleteEvent")  //specify the url to call this servlet   
public class deleteEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		PrintWriter out = response.getWriter();       //get the writer
		response.setContentType("text/html");          //set the type of response
		
		
		String id = request.getParameter("id");          //get the id from the url
				System.out.println(id);                
				
				boolean isTrue = false ;          //create a boolean variable to check the status
				
				isTrue = EventsDBUtil.DeleteEvent(id);         //call the delete function in the DBUtil class
				
				if(isTrue == true) {
					
					out.println("<script type='text/javascript'>");           //display an alert box
					out.println("alert('Deleted successfully !!');");
					out.println("location='allEvents'");
					out.println("</script>");
					
				}else {
					out.println("<script type='text/javascript'>");           //display an alert box
					out.println("alert('Failed');");
					out.println("location='allEvents'");
					out.println("</script>");
					
				}
	}

}
