
package com.admin.Notice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;



/**
 * Servlet implementation class addNoticeServlet
 */
@WebServlet("/addNotices")
public class addNoticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
			
		String title = request.getParameter("notice-title");
		String discription = request.getParameter("notice-description");
		String grade = request.getParameter("grade");
		String date = request.getParameter("notice-date");
		
		
			try {
			
			boolean isTrue = false ;
			
			 isTrue = NoticeDBUtil.addNotice(title, discription, grade, date);
			 
			 if(isTrue == true ) {
				 
				 out.println("<script type='text/javascript'>");
					out.println("alert('Insert Successfully !!');");
					out.println("location='Admin-notice.jsp'");
					out.println("</script>");
				}else {
					out.println("<script type='text/javascript'>");
					out.println("alert('insert unsuccess !!');");
					out.println("location='Admin-notice-add.jsp'");
					out.println("</script>");
				}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
			
	}

}
