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

                        <div class="dashboard-container">
                            <div class="form-container" id="add-teacher-form">
                                <h2>Add Event</h2>
                                
                                
                                <%
        	String id = request.getParameter("id");
            String name = request.getParameter("name");
            String EventDate = request.getParameter("EventDate");
            String EventLocation = request.getParameter("EventLocation");
            String EventDescription = request.getParameter("EventDescription");
            String EventOrganizer = request.getParameter("EventOrganizer");
            String EventContact = request.getParameter("EventContact");
        %>

                                <form id="edit-event-form" action="updateEvents" method="POST" >
                                    <input type="hidden" name="id" value="<%= id %>">
                                    
                                    <div class="form-group">
                                        <label for="event-name">Event
                                            Name:</label>
                                        <input type="text" id="event-name"
                                            name="event-name" value="<%= name %>" required
                                            >
                                    </div>

                                    <div class="form-group">
                                        <label for="event-date">Date:</label>
                                        <input type="text" id="event-date"
                                            name="event-date" value="<%= EventDate %>" required
                                            >
                                    </div>

                                    <div class="form-group">
                                        <label
                                            for="event-location">Location:</label>
                                        <input type="text" id="event-location"
                                            name="event-location" value="<%= EventLocation %>" required
                                           >
                                    </div>

                                    <div class="form-group">
                                        <label
                                            for="event-description">Description:</label>
                                        <textarea id="event-description"
                                            name="event-description"><%= EventDescription %></textarea>
                                    </div>

                                    <div class="form-group">
                                        <label
                                            for="event-organizer">Organizer:</label>
                                        <input type="text" id="event-organizer"
                                            name="event-organizer" value="<%= EventOrganizer %>"
                                            >
                                    </div>

                                    <div class="form-group">
                                        <label
                                            for="event-organizer-contact">Organizer
                                            Contact:</label>
                                        <input type="text"
                                            id="event-organizer-contact"
                                            name="event-organizer-contact" value="<%= EventContact %>"
                                            >
                                    </div>

                                   

                                    <button type="submit">Update Event</button>
                                </form>
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