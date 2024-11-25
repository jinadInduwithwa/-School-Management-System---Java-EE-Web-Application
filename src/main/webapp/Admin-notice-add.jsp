<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
                        <h2 class="approve-admis">Manage Notice</h2>

                        <div class="dashboard-container">
                            <div class="form-container" id="add-teacher-form">
                                <h2>Add Notice</h2>

                                <form id="edit-event-form" action="addNotices" method="POST">
                                    <div class="form-group">
                                        <label for="event-name">Title:</label>
                                        <input type="text" id="event-name" name="notice-title" required>
                                    </div>
                                    
                                     <div class="form-group">
                                        <label for="event-description">Description:</label>
                                        <textarea id="event-description" name="notice-description"></textarea>
                                    </div>
                                    
									 <div class="form-group">
					                        <i class="fas fa-user"></i>
					
					                        <select name="grade" id="grade">
					                        	<option value="All" selected>All Grades</option>
					                            <option value="6">Grade 6</option>
					                            <option value="7">Grade 7</option>
					                            <option value="8">Grade 8</option>
					                            <option value="9">Grade 9</option>
					                            <option value="10">Grade 10</option>
					                            <option value="11">Grade 11</option>
					                            <option value="12">Grade 12</option>
					                        </select>
					
					                 </div>
					                 
                                    <div class="form-group">
                                        <label for="event-date">Date:</label>
                                        <input type="date" id="event-date"name="notice-date">
                                    </div>

                                    <button type="submit">Add Notice</button>
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