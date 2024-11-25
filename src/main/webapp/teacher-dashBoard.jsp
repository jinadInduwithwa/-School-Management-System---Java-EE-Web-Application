<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Teacher Dashboard</title>
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
                    <div class="container1-dashboard">
 
                            <div class="btn-viewschool">
                                <h2>ALL STUDENTS</h2>
                            </div>

                    <div class="pending-admission">
                        <div id="pending-admissions-table">
                            <table>
                                <tr>
                                    <th>ID</th>
                                    <th>Photo</th>
                                    <th>Student Name</th>
                                    <th>Class</th>
                                    <th>address</th>
                                    <th>student email</th>
                                </tr>
                                
                              <c:forEach var="std" items="${stdDetailsFromTeacher}">
    
							    <c:set var = "id" value="${std.sid}" />
							    <c:set var = "fName" value="${std.firstName}" />
							    <c:set var = "lName" value="${std.lastName}" />
							    <c:set var = "DOB" value="${std.dob}" />
							    <c:set var = "grade" value="${std.grade}" />
							    <c:set var = "phone" value="${std.phone}" />
							    <c:set var = "photo" value="${std.photo}" />
							    <c:set var = "address" value="${std.address}" />
							    <c:set var = "email" value="${std.email}" />
    
                                <tr>
                                    <td>${id}</td>
                                    <td><div class="profile-pic"
                                            style="background: url(./Assert/Student-main/${photo}) lightgray 50% / cover no-repeat;">

                                        </div></td>
                                    <td>${fName} ${lName}</td>
                                    <td>Grade ${grade}</td>
                                    <td>${address}</td>
                                    <td>${email}</td>

                                </tr>
                                
                           </c:forEach>
                           
                           
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
                <p>&copy; 2023 Online School Management System. All
                    rights
                    reserved.</p>
            </div>
        </footer>
    </body>
</html>