<%@page import="dbconnect.DBConnect"%>
<%@page import="com.admin.Events.EventDAOimplement"%>
<%@page import="com.admin.Notice.NoticeDAOImplements"%>
<%@page import="com.Teacher.Assigment.AssigmentDAOImplementation"%>
<%@page import="java.util.List"%>
<%@page import="com.admin.Events.Event"%>
<%@page import="com.admin.Notice.Notice"%>
<%@page import="com.Teacher.Assigment.Assigment"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
                    
                    <h1 class="ourteacherH1">Upcomming Events</h1>
                    <div class="event-container">
                    <%  
                    EventDAOimplement dao = new EventDAOimplement(DBConnect.getConnection());
					List<Event> list= dao.getAllEvents();
					for(Event p:list){
					%>
                    
                        <div class="event-card">
                            <h2> Event:<%= p.getEventName() %></h2>
                            <div class="event-img" style="background: url(./Assert/Student-main/<%= p.getEventImage() %>) lightgray 50% / cover no-repeat;"></div>
                            <p class="date-p">Date: <%= p.getEventDate() %></p>
                            <p class="description"><%= p.getEventDescription() %></p>
                            <a href="student-Events-view.jsp?id=<%=p.getIdEvent() %>&name=<%=p.getEventName()%>&description=<%=p.getEventDescription()%>&Date=<%=p.getEventDate()%>&venu=<%=p.getEventLocation() %>&organizer=<%=p.getEventOrganizer()%>&contact=<%=p.getEventContact()%>&photo=<%= p.getEventImage()%>"><button class="details-button">View Details</button></a>
                        </div>
                       <% 
						}
						%>
					<p class="view-all-events"> <a href="student-Events.jsp">View all Events</a> </p>

                    </div>
                        <h2 class="notice">Notices</h2>
                        <ul class="notice-list">
                        
                        
                        <%  
                        NoticeDAOImplements Noticedao = new NoticeDAOImplements(DBConnect.getConnection());
						List<Notice> Noticelist= Noticedao.getThreeNotices();
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

                        </ul>
                        <p class="view-all"> <a href="student-Notice.jsp">View all notices</a>
                        </p>
                    </section>


                    <div class="dashboard-container">
                        <section class="homework-section">
                            <h2>Homework</h2>
                            <ul class="homework-list">
                            
                             <%  
                             	AssigmentDAOImplementation assigmentDAO = new AssigmentDAOImplementation(DBConnect.getConnection());
								List<Assigment> assigmentList= assigmentDAO.getThreeAssigment();
								for(Assigment a:assigmentList){
							 %>
                             <li class="homework-item">
                                    <h3><%= a.getAssigmentName() %></h3>
                                    <p>Due Date : <%= a.getAssigmnmentDueDate()%></p>
                                    <a href="student-assigment-view.jsp?assId=<%=a.getAssId() %>&assigmentName=<%=a.getAssigmentName() %>&assigmentDescription=<%=a.getAssigmentDescription() %>&assigmentUploadDate=<%=a.getAssigmentUploadDate() %>&assigmnmentDueDate=<%=a.getAssigmnmentDueDate() %>&file=<%=a.getFile() %>" class="view-button">View  Details</a>
                            </li>
		                       <% 
								}
								%>
                            </ul>
                            <p class="view-all"> <a href="student-Assigment.jsp">View all Homeworks</a> </p>
                        </section>
                    </div>
                    
                    
    
                    

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