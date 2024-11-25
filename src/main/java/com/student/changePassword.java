package com.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class changePassword
 */
@WebServlet("/changePassword")
public class changePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		
		String currentPsw = request.getParameter("current-password");
		
		String newPsw = request.getParameter("new-password");
		
		String confirmPsw = request.getParameter("confirm-password");
		
		String userName = request.getParameter("sid");
		
		
		
		System.out.println(currentPsw + "/" + newPsw +"/"+ confirmPsw );
		
		boolean isTrue = false;
		
		isTrue= StudentDBUtil.validateStudent(userName, currentPsw);
		
		if(newPsw.equals(confirmPsw)  ) {
			
			if(isTrue == true) {
				
				boolean isSuccess = false ;
				
				isSuccess = StudentDBUtil.updatePassword(userName, newPsw);
				
				out.println("<script type='text/javascript'>");
				out.println("alert('Password Updated !!');");
				out.println("location='student-profile.jsp'");
				out.println("</script>");
				
			}else {
				out.println("<script type='text/javascript'>");
				out.println("alert('Wrong password !!');");
				out.println("location='student-profile.jsp'");
				out.println("</script>");
			}
			
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('password dismatched!!');");
			out.println("location='student-profile.jsp'");
			out.println("</script>");
		}
		
		
		
		
	}

}
