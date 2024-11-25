package com.admin.Events;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateeventServlet
 */
@WebServlet("/updateEvents")
public class updateeventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		int id = Integer.parseInt((request.getParameter("id")));
		String Name = request.getParameter("event-name");
		String date = request.getParameter("event-date");
		String Location = request.getParameter("event-location");
		String description = request.getParameter("event-description");
		String organizer = request.getParameter("event-organizer");
		String contact = request.getParameter("event-organizer-contact");
		
		System.out.println(id + Name + date + Location + description + organizer +contact);
		
		
		boolean isTrue = false;
		
		isTrue = EventsDBUtil.updateEvent(id, Name, date, Location, description, organizer, contact);
		
		if(isTrue == true ) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('update Successfully !!');");
			out.println("location='allEvents'");
			out.println("</script>");
			
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('update failed !!');");
			out.println("location='allEvents'");
			out.println("</script>");
		}
	}

}
