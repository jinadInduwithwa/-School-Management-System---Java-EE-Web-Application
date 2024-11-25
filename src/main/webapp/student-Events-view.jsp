<%@page import="dbconnect.DBConnect"%>
<%@page import="com.admin.Events.EventDAOimplement"%>

<%@page import="java.util.List"%>
<%@page import="com.admin.Events.Event"%>


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
                
                <%
        	String id = request.getParameter("id");
            String name = request.getParameter("name");
            String description = request.getParameter("description");
            String Date = request.getParameter("Date");
            String venu = request.getParameter("venu");
            String organizer = request.getParameter("organizer");
            String contact = request.getParameter("contact");
            String photo = request.getParameter("photo");
            
        %>

                <div class="evnt-card">
                    <div class="event-image"
                        style="background-image: url(./Assert/Student-main/<%=photo %>;">
                    </div>
                    <div class="event-details">
                        <h2>Event Name : <%=name %></h2>
                        <p>Event Description : <%=description %></p>
                        <p>Event Date :  <%=Date %></p>
                        <p>Event Organizer :  <%=organizer %></p>
                        <p>Event Contact No :  <%=contact %></p>
                        <p>Event Venue :  <%=venu %></p>
                    </div>
                    <div class="event-btn">
                        <a href="eventParticipate?eventID=<%=id%>&stdID=${sid}&stdName=${firstname}&Grade=${grade}"><button class="going-button">I am going</button> </a>
                        <a href="Notparticipate?eventID=<%=id%>&stdID=${sid}&stdName=${firstname}&Grade=${grade}"><button class="not-going-button">not going</button></a>
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