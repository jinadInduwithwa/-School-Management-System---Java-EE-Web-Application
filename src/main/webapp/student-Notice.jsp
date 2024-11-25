<%@page import="dbconnect.DBConnect"%>
<%@page import="com.admin.Events.EventDAOimplement"%>
<%@page import="com.admin.Notice.NoticeDAOImplements"%>
<%@page import="java.util.List"%>
<%@page import="com.admin.Events.Event"%>
<%@page import="com.admin.Notice.Notice"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Student Dashboard</title>
        <link rel="stylesheet" href="./CSS/student-dashboard.css">
        

    </head>
    <body>
        <%@include file="navbar.jsp" %>

        <section class="main-section">

           <%@include file="sideMenu-student.jsp" %>

            <div class="main-space">
                <div class="main-banner">
                    <p class="date-dashboard"> September 4, 2023</p>
                    <h1>Welcome back, ${firstname} !</h1>
                    <p class="msg">Always stay updated in your student
                        portal</p>
                    <div class="banner-img"> <img
                            src="./Assert/Student-main/Scholarcap scroll.png"
                            alt="student-dashboard"> </div>

                </div>

                <div class="dashboard-container">
         <section class="notice-section">
                    
                   <h2 class="notice">Notices</h2>
                        <ul class="notice-list">
                        
                        
                        <%  
                        NoticeDAOImplements Noticedao = new NoticeDAOImplements(DBConnect.getConnection());
						List<Notice> Noticelist= Noticedao.getAllNotices();
						for(Notice n:Noticelist){
						%>
                            <li class="notice-item">
                                <h3><%= n.getNoticeTitle() %></h3>
                                <p><%= n.getNoticePublishDate() %> Grade : <%= n.getNoticeGrade() %>.</p>
                                <p><%= n.getNoticeDiscription() %></p>
                            </li>
                       <% 
						}
						%>

                </div>

            </div>

        </section>

        <footer>
            <div class="footer-links">
                <a href="about.html">About Us</a>
                <a href="contact.html">Contact Us</a>
                <a href="faq.html">FAQ</a>
                <a href="terms.html">Terms & Condition</a>
                <a href="privacy.html">Privacy Policy</a>
            </div>
            <div class="footer-contact">
                <p>Phone: 0772931811</p>
                <p>Email: Sliit@gmail.com</p>
                <p>Address: 202/1 Matara</p>
            </div>
            <div class="copyright">
                <p>&copy; 2023 Online School Management System. All rights
                    reserved.</p>
            </div>
        </footer>
    </body>
</html>