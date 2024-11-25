package com.admin.Events;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/eventParticipate")     // specify the url to call this servlet
public class eventParticipateServlet extends HttpServlet {      // inherit from HttpServlet class
	private static final long serialVersionUID = 1L;              

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();    // get the response writer
		response.setContentType("text/html");      
		
		int eventID = Integer.parseInt(request.getParameter("eventID"));  // get the parameters from the form
		int stdID = Integer.parseInt(request.getParameter("stdID"));
		String stdName = request.getParameter("stdName");
		int Grade = Integer.parseInt(request.getParameter("Grade"));
		
		boolean isTrue = false ;               // create a boolean variable to check the status of the query
		
		
		isTrue = EventsDBUtil.addPartcipate(eventID,stdID,stdName,Grade);        // call the addPartcipate method in EventsDBUtil class
		
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");      // show an alert box if the query is success
			out.println("alert('Done !!');");
			out.println("location='student-Events.jsp'");
			out.println("</script>");
			
		}else {
			out.println("<script type='text/javascript'>");           // show an alert box if the query is fail
			out.println("alert('Faild !!');");
			out.println("location='student-Events.jsp'");
			out.println("</script>");
		}
		
		
		
	}

}
