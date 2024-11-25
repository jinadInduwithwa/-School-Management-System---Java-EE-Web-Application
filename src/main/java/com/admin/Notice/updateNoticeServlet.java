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
 * Servlet implementation class updateNoticeServlet
 */
@WebServlet("/updateNotice")
public class updateNoticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int noticeId = Integer.parseInt(request.getParameter("noticeId"));  
		String noticeTitle = request.getParameter("noticeTitle");
		String noticeDiscription = request.getParameter("noticeDiscription");
		String noticeGrade = request.getParameter("noticeGrade");
		String noticePublishDate = request.getParameter("noticePublishDate");
		
		boolean isTrue = false ;
		
		 isTrue = NoticeDBUtil.updateNotice(noticeId, noticeTitle, noticeDiscription, noticeGrade, noticePublishDate);
		 
		 if(isTrue == true ) {
				
				out.println("<script type='text/javascript'>");
				out.println("alert('update Successfully !!');");
				out.println("location='allNotice'");
				out.println("</script>");
				
			}else {
				out.println("<script type='text/javascript'>");
				out.println("alert('update failed !!');");
				out.println("location='allNotice'");
				out.println("</script>");
			}
	}

}
