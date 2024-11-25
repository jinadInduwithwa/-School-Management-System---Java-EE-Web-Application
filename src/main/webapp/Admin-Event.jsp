<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>SchoolWeb</title>
    </head>

    <link rel="stylesheet" href="./CSS/admin-Dashboard.css">
    <link rel="stylesheet" href="/Assert/fonts/css/all.min.css">
    <body>

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
                    <div class="pending-admission">
                        <h2 class="approve-admis">Manage Events</h2>
                        <a href="Admin-event-add.jsp"><button class="add-student-btn">Add Event</button></a>
                        <div class="dashboard-container">
                            <div class="content">

                                <div class="events-list">
                                
                                
                                 <c:forEach var="std" items="${eventDetails}">
    
    <c:set var = "id" value="${std.idEvent}" />
    <c:set var = "name" value="${std.getEventName()}" />
    <c:set var = "EventDate" value="${std.getEventDate()}" />
    <c:set var = "EventLocation" value="${std.getEventLocation()}" />
    <c:set var = "EventDescription" value="${std.getEventDescription()}" />
    <c:set var = "EventOrganizer" value="${std.getEventOrganizer()}" />
    <c:set var = "EventContact" value="${std.getEventContact()}" />
    <c:set var = "EventImage" value="${std.getEventImage()}" />
    <c:set var = "EventParticipants" value="${std.getEventParticipants()}" />
    
    
    
     <c:url value = "Admin-event-update.jsp" var="eventUpdate">
                
               
                
                	<c:param name= "id" value="${id}"> </c:param>
                	<c:param name= "name" value="${name}"> </c:param>
                	<c:param name= "EventDate" value="${EventDate}"> </c:param>
                	<c:param name= "EventLocation" value="${EventLocation}"> </c:param>
                	<c:param name= "EventDescription" value="${EventDescription}"> </c:param>
                	<c:param name= "EventOrganizer" value="${EventOrganizer}"> </c:param>
                	<c:param name= "EventContact" value="${EventContact}"> </c:param>
                	<c:param name= "EventImage" value="${EventImage}"> </c:param>
                	<c:param name= "EventParticipants" value="${EventParticipants}"> </c:param>
                	
                </c:url>
                
                <c:url value = "Admin-Event-view.jsp" var="eventView">
                
               
                
                	<c:param name= "id" value="${id}"> </c:param>
                	<c:param name= "name" value="${name}"> </c:param>
                	<c:param name= "EventDate" value="${EventDate}"> </c:param>
                	<c:param name= "EventLocation" value="${EventLocation}"> </c:param>
                	<c:param name= "EventDescription" value="${EventDescription}"> </c:param>
                	<c:param name= "EventOrganizer" value="${EventOrganizer}"> </c:param>
                	<c:param name= "EventContact" value="${EventContact}"> </c:param>
                	<c:param name= "EventImage" value="${EventImage}"> </c:param>
                	<c:param name= "EventParticipants" value="${EventParticipants}"> </c:param>
                	
                	
                </c:url>
    
    
                                    <div class="event-card">
                                        <img
                                            src="./Assert/Student-main/${EventImage }"
                                            alt="Event Image">
                                        <h3>${name }</h3>
                                        <p>Date: ${EventDate }</p>
                                        <p>Location: ${EventLocation }</p>
                                        <a href="${eventView }"
                            class="btn-edit"><button class="edit-btn">View</button></a>
                                         <a href="${eventUpdate }"
                            class="btn-edit"><button class="edit-btn">Edit</button></a>
                                        <a href="deleteEvent?id=${id}"
                            class="btn-edit"><button
                                            class="delete-btn">Delete</button></a>
                                    </div>
                              </c:forEach>
                                </div>
                            </div>
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
                    <p>&copy; 2023 Online School Management System.
                        All rights
                        reserved.</p>
                </div>
            </footer>

        </body>
    </html>