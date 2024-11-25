package com.admin.Notice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admin.AdminDBUtil;

/**
 * Servlet implementation class deleteNoticeServlet
 */
@WebServlet("/DeleteNotice")
public class deleteNoticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		String noticeId = request.getParameter("id");
		
		System.out.println(noticeId);
		
		boolean isTrue = false ;
		
		isTrue = NoticeDBUtil.deleteNotice(noticeId);
		
		if(isTrue == true) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Deleted successfully !!');");
			out.println("location='allNotice'");
			out.println("</script>");
			
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Deletion Failed');");
			out.println("location='allNotice'");
			out.println("</script>");
			
		}
	}

}
