package com.admin.Events;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admin.AdminDBUtil;
import com.student.Student;

/**
 * Servlet implementation class allEventsServlet
 */
@WebServlet("/allEvents")          //specify the URL pattern
public class allEventsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Event> eventDetails = EventsDBUtil.getALLEvents();        //get all the events from the database
		request.setAttribute("eventDetails", eventDetails);            //set the attribute
		
		
		
		RequestDispatcher dis = request.getRequestDispatcher("Admin-Event.jsp");       //redirect to the Admin-Event.jsp
		dis.forward(request, response);                                     //forward the request and response
	}

}
