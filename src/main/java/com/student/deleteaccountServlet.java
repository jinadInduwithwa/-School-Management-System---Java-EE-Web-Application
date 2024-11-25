package com.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class deleteaccountServlet
 */
@WebServlet("/deleteaccount")
public class deleteaccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		String username = request.getParameter("userName");
		
		System.out.println(username);
		
		boolean isSuccess = false ;
		
		isSuccess = StudentDBUtil.DeleteAccount(username);
		
		
		if(isSuccess == true) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Delete successfully !!');");
			out.println("location='account.jsp");
			out.println("</script>");
			
			
			try {
				HttpSession session = request.getSession(); 
				session.removeAttribute("cusObj");
				session.removeAttribute("stdDetails");
				
				HttpSession session2 = request.getSession();
				session.setAttribute("succMsg", "Logout sucessfully");
				response.sendRedirect("Login.jsp");
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}else {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Delete unsuccessfully !!');");
			out.println("location='account.jsp");
			out.println("</script>");
			
		}
		
		
		
		
	}
		
	

}
