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
                    
                    <%
        	String id = request.getParameter("id");
            String teacherName = request.getParameter("teacherName");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            String Salary = request.getParameter("Salary");
            String grade = request.getParameter("grade");
            String Gender = request.getParameter("Gender");
        %>
        
        
                    <div class="pending-admission">
                        <h2 class="approve-admis">Add New Teacher</h2>
                        <div class="add-teacher-form">

                            <form id="add-teacher-form" action="updateTeacher" 
                                method="POST" >
                                <input type="hidden" name="id" value="<%= id %>" >
                                
                                <div class="form-group">
                                    <label for="teacher-name">Full Name:</label>
                                    <input type="text" id="teacherName"
                                        name="teacherName" value="<%= teacherName %>" required>
                                </div>
                                
                                <div class="form-group">
                                    <label for="email">Email:</label>
                                    <input type="email" id="email" name="email" value="<%= email %>" 
                                        required>
                                </div>
                                <div class="form-group">
                                    <label for="phone">Phone:</label>
                                    <input type="text" id="phone" name="phone" value="<%= phone %>" 
                                        required>
                                </div>
                                <div class="form-group">
                                    <label for="address">Address:</label>
                                    <input type="text" id="address" value="<%= address %>" 
                                        name="address"
                                        required>
                                </div>
                                <div class="form-group">
                                    <label for="Salary">Salary:</label>
                                    <input type="text" id="Salary" value="<%= Salary %>" 
                                        name="Salary"
                                        required>
                                </div>

                                <div class="form-group">
                                    <label for="grade">Grade:</label>
                                    <input type="text" id="grade" name="grade" value="<%= grade %>" >
                                        
                                </div>
                                
                                

                                

                                <button type="submit">Update Teacher</button>
                            </form>
                        </div>

                    </div>

                </section>
            </main>

            <footer>
                <div class="footer-links">
                    <a href="about.html">About Us</a>
                    <a href="contact.html">Contact Us</a>
                    <a href="faq.html">FAQ</a>
                    <a href="terms.html">Terms &
                        Condition</a>
                    <a href="privacy.html">Privacy
                        Policy</a>
                </div>
                <div class="footer-contact">
                    <p>Phone: 0772931811</p>
                    <p>Email: Sliit@gmail.com</p>
                    <p>Address: 202/1 Matara</p>
                </div>
                <div class="copyright">
                    <p>&copy; 2023 Online School Management
                        System.
                        All rights
                        reserved.</p>
                </div>
            </footer>

        </body>
    </html>