<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="dbconnect.DBConnect"%>
<%@page import="com.admin.Events.EventDAOimplement"%>

<%@page import="java.util.List"%>
<%@page import="com.admin.Events.EventStudent"%>
<%@page import="com.admin.Teacher"%>
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
                    
                     <%
        	int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String EventDate = request.getParameter("EventDate");
            String EventLocation = request.getParameter("EventLocation");
            String EventDescription = request.getParameter("EventDescription");
            String EventOrganizer = request.getParameter("EventOrganizer");
            String EventContact = request.getParameter("EventContact");
            String EventImage = request.getParameter("EventImage");
        %>

                    <div class="event-view-details">
                        <h2><%= name %></h2>
                        
                        <div class="event-image event-view-image"
                            style="background-image: url(./Assert/Student-main/<%=EventImage %>);">

                        </div>
                        <p class="date">Date:
                            <span><%= EventDate %></span></p>
                        <p class="location">Location: <span><%= EventLocation %></span></p>
                        <p class="description">Description: <span><%= EventDescription %></span></p>
                        <p class="organizer">Organizer: <span><%= EventOrganizer %></span></p>
                        <p class="contact">Contact:
                            <span><%= EventContact %></span></p>
                    </div>
                    
                    
                    <div class="attendees">
                      
                        <h3>Attendees:</h3>
                        
                         
                        <table class="attendees-table">
                        
                      
                            <tr>
                                <th>Student ID</th>
                                <th>Student Name</th>
                                <th>Grade</th>
                            </tr>
                              <%  
                    EventDAOimplement dao2 = new EventDAOimplement(DBConnect.getConnection());
	List<EventStudent> list2= dao2.getAllParticipate(id);
	for(EventStudent p:list2){
	%>
                            <tr>
                                <td><%= p.getStudentId() %></td>
                                <td><%= p.getStudentName() %></td>
                                <td>Grade <%= p.getStudentGrade() %></td>
                            </tr>
                            <% 
	}
		
	
	%>
                        </table>

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