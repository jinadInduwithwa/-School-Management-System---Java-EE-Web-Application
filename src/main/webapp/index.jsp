<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="dbconnect.DBConnect"%>
<%@page import="com.admin.Events.EventDAOimplement"%>
<%@page import="java.util.List"%>
<%@page import="com.admin.Events.Event"%>
<%@page import="com.admin.Teacher"%>
<%@page import="dbconnect.DBConnect"%>
<%@page import="com.admin.Events.EventDAOimplement"%>
<%@page import="com.admin.Notice.NoticeDAOImplements"%>
<%@page import="java.util.List"%>
<%@page import="com.admin.Events.Event"%>
<%@page import="com.admin.Notice.Notice"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>SchoolWeb</title>
    </head>

    <link rel="stylesheet" href="./CSS/Style.css">
    <link rel="stylesheet" href="./Assert/fonts/css/all.min.css">
    <link rel="stylesheet" href="./CSS/normalize.css">
    <link rel="stylesheet" href="./CSS/student-dashboard.css">
    
    <body>

       <%@include file="navbar.jsp" %>
        <div class="hero-section">

        </div>

        <h1 class="ourteacherH1">Our Teachers</h1>
        <div class="container-teachers">
        
        <%  
                    EventDAOimplement dao2 = new EventDAOimplement(DBConnect.getConnection());
	List<Teacher> list2= dao2.getAllTeachers();
	for(Teacher p:list2){
	%>
	
			<div class="teacher">
                <div class="teacher-img" style="background: url(./Assert/Student-main/<%= p.getPhoto() %>) lightgray 50% / cover no-repeat;">
                    
                </div>
                <div class="teacher-info">
                    <h2><%= p.getTeacherName() %></h2>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit.
                        Quisquam, quos.</p>
                </div>
            </div>
        
        <% 
	}
		
	
	%>
        

            

            
            
            </div>
        </div>

        <h1 class="ourteacherH1">Our Events</h1>
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
                           
                        </div>
            <% 
	}
		
	
	%>
              
                   
        </div>
        
        
        
        


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
              <p>&copy; 2023 Online School Management System. All rights reserved.</p>
            </div>
          </footer>

    </body>
</html>