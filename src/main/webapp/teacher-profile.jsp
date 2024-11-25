<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Student Dashboard</title>
        <link rel="stylesheet" href="./CSS/student-dashboard.css">
        <link rel="stylesheet" href="./CSS/normalize.css">
        <link
            href="https://fonts.googleapis.com/css2?family=Poppins:wght@200;400;700&display=swap"
            rel="stylesheet">
            <style>
              .hidden {
        display: none;
    }
        </style>

    </head>
    <body>
     <%@include file="navbar.jsp" %>
       

        <section class="main-section">

            <%@include file="sideMenu-teacher.jsp" %>
            
            
            

        <div class="main-space">
            <div class="profile-main">

                <h1>My Profile</h1>
                <div class="profile">
                    <div class="profile-pic  student-pic" style="background: url(./Assert/Student-main/${photo}) lightgray 50% / cover no-repeat;">

                    </div>
                    <div class="profile-details">
                        <h2>${teacherName}</h2>
                        <p>Grade: ${grade}</p>
                        <p>ID No: ${idteacher}</p>
                    </div>
                </div>

                 <div class="personal-details">
                    <h2>Personal Details</h2>

                    <form >
                   		 <input type="hidden" id="id" name="idteacher" value="${idteacher}" disabled>
                    
                        <label for="name">Name:</label>
                        <input type="text" id="fname" name="teacherName" value="${teacherName}" disabled>
                       
                        <label for="grade">Grade:</label>
                        <input type="text" id="grade" name="grade" value="${grade}" disabled>
                        
                        <label for="email">Email:</label>
                        <input type="email" id="email" name="email" value="${email}" disabled>
                        
                        <label for="phone">Phone:</label>
                        <input type="text" id="phone" name="phone" value="${phone}" disabled >
                        
                        <label for="address">Address:</label>
                        <input type="text" id="address" name="address" value="${address}" disabled>
                        
                        <label for="address">Salary:</label>
                        <input type="text" id="address" name="Salary" value="${Salary}" disabled>
                        
                        <label for="address">Gender:</label>
                        <input type="text" id="address" name="Gender" value="${Gender}" disabled>
                        
                        <label for="address">User Name:</label>
                        <input type="text" id="address" name="username" value="${username}" disabled>
 
                    </form>

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
                <p>&copy; 2023 Online School Management System. All
                    rights
                    reserved.</p>
            </div>
        </footer>
    </body>
</html>