<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="dbconnect.DBConnect"%>
<%@page import="com.admin.Events.EventDAOimplement"%>

<%@page import="java.util.List"%>
<%@page import="com.admin.Events.Event"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>SchoolWeb</title>
    </head>

    <link rel="stylesheet" href="./CSS/admin-dashboard.css">
    <link rel="stylesheet" href="/Assert/fonts/css/all.min.css">
    <link rel="stylesheet" href="./CSS/Style.css">
   
   
    <%@include file="adminNavbar.jsp" %>
                <div class="main-space">
                    <div class="container1-dashboard">
                        <div>
                            <h1 class="main-h1">SCHOOLWeb</h1>
                            <h2 class="main-h2">Welcome to the Admin
                                Dashboard</h2>
                        </div>
                        <div>
                            <div class="btn-viewschool">
                                <h2>View School Profile</h2>
                            </div>
                        </div>
                    </div>
                    <div class="Main-cards-container">
                        <div class="main-card">
                            <div>
                                <h2>Students</h2>
                            </div>
                            <div>
                                <h3>2,300</h3>
                            </div>
                        </div>
                        <div class="main-card">
                            <div>
                                <h2>Teachers</h2>
                            </div>
                            <div>
                                <h3>100</h3>
                            </div>
                        </div>
                        <div class="main-card">
                            <div>
                                <h2>Classes</h2>
                            </div>
                            <div>
                                <h3>10</h3>
                            </div>
                        </div>
                        <div class="main-card">
                            <div>
                                <h2>Subjects</h2>
                            </div>
                            <div>
                                <h3>45</h3>
                            </div>
                        </div>

                    </div>

                    <div class="event-text">
                        <h1>Upcoming Events</h1>

                        <div class="event-list">

                             <%  
                    EventDAOimplement dao = new EventDAOimplement(DBConnect.getConnection());
	List<Event> list= dao.getAllEvents();
	for(Event p:list){
	%>
            <div class="event-card">
                                        <img
                                            src="./Assert/Student-main/<%=p.getEventImage() %>"
                                            alt="Event Image">
                                        <h3><%= p.getEventName() %></h3>
                                        <p>Date: <%= p.getEventDate() %></p>
                                        <p>Location: <%=p.getEventLocation() %></p>
                                        
                                    </div>
            <% 
	}
		
	
	%>
					</div>
                        

                    </div>

                    <div class="notice-section">
                        <div class="notice-header">
                            <h2>Notices</h2>
                            <a href="#" class="view-all">View All</a>
                        </div>
                        <ul class="notice-list">
                            <li>
                                <h4>Annual Sports Meet Postponed</h4>
                                <p>Due to unforeseen weather conditions, the
                                    sports meet has been postponed to March
                                    30th...</p>
                            </li>
                            <li>
                                <h4>Annual Sports Meet Postponed</h4>
                                <p>Due to unforeseen weather conditions, the
                                    sports meet has been postponed to March
                                    30th...</p>
                            </li>
                            <li>
                                <h4>Annual Sports Meet Postponed</h4>
                                <p>Due to unforeseen weather conditions, the
                                    sports meet has been postponed to March
                                    30th...</p>
                            </li>
                        </ul>
                    </div>

                </div>
            </section>
        </main>

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