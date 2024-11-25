package com.admin.Events;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class displayEventsServlet
 */
@WebServlet("/student-main-dashboard")   // URL
public class displayEventsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		List<Event> eventDetails = EventsDBUtil.getALLEvents();   // get all events from the database
		request.setAttribute("eventDetails", eventDetails);       // set the events to the request object
		
		ServletContext sc = this.getServletContext();         // get the servlet context
		
		
		
		RequestDispatcher dis = sc.getRequestDispatcher("/student-main-dashboard.jsp");      // redirect to the student-main-dashboard.jsp
		dis.forward(request, response);            // forward the request and response
		
		PrintWriter writer = response.getWriter();          // get the writer object
		writer.write("<h1>Hellow </h1>");           
        
        
	}

}
