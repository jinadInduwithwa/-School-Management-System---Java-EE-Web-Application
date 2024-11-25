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
                        <div class="add-student">
                        
                         <%
        	String id = request.getParameter("id");
            String fName = request.getParameter("fName");
            String lName = request.getParameter("lName");
            String DOB = request.getParameter("DOB");
            String grade = request.getParameter("grade");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
        %>

                            <center><h2>Update Student</h2></center>
                            <form action="updateStudnet" method="POST">
                            <input type="hidden" name="id" value="<%=id %>">
                                <label for="fname">First Name:</label>
                                <input type="text" id="fname" name="fname" value="<%=fName %>">
                                <label for="lname">Last Name:</label>
                                <input type="text" id="lname" name="lname" value="<%=lName %>">
                                <label for="grade">Grade:</label>
                                <input type="text" id="grade" name="grade" value="<%=grade %>">
                                <label for="class">DOB:</label>
                                <input type="date" id="dob" name="dob" value="<%=DOB %>">
                                

                                <label for="email">Email:</label>
                                <input type="email" id="email" name="email" value="<%=email %>">
                                <label for="phone">Phone:</label>
                                <input type="text" id="phone" name="phone" value="<%=phone %>">
                                <label for="address">Address:</label>
                                <input type="text" id="address" name="address" value="<%=address %>">
                                
                                
                                

                                <button type="submit" id="saveBtn"
                                    class="saveBtn hidden">Update</button>
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