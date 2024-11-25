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
                        <h2 class="approve-admis">Manage Students</h2>
                        <a href="admin-add-student.jsp"><button class="add-student-btn">Add Student</button></a>
                        <div id="pending-admissions-table">
                            <table>
                                <tr>
                                    <th>ID</th>
                                    <th>Photo</th>
                                    <th>Student Name</th>
                                    <th>Class</th>
                                    <th>address</th>
                                   
                                    <th>student email</th>
                                    
                                    <th>Action</th>
                                </tr>
                                
                              <c:forEach var="std" items="${stdDetails}">
    
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
                                    
                                    <td>
                                    
                                    <c:url value = "admin-update-student.jsp" var="studentUpdate">
                
               
                
                	<c:param name= "id" value="${id}"> </c:param>
                	<c:param name= "fName" value="${fName}"> </c:param>
                	<c:param name= "lName" value="${lName}"> </c:param>
                	<c:param name= "DOB" value="${DOB}"> </c:param>
                	<c:param name= "grade" value="${grade}"> </c:param>
                	<c:param name= "phone" value="${phone}"> </c:param>
                	<c:param name= "photo" value="${photo}"> </c:param>
                	<c:param name= "address" value="${address}"> </c:param>
                	<c:param name= "email" value="${email}"> </c:param>
                	
                	
                	
                </c:url>
                                        
                                        <a href="${studentUpdate }"><button
                                            class="approve-btn ">Edit</button></a>

                                        <a href="DeleteStudent?id=${id}"
                            class="btn-edit"><button
                                            class="reject-btn">Remove</button></a>
                                    </td>
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
                    <p>&copy; 2023 Online School Management System.
                        All rights
                        reserved.</p>
                </div>
            </footer>

        </body>
    </html>