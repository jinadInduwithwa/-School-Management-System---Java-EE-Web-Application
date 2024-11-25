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
                        <h2 class="approve-admis">Manage Teachers</h2>
                        <a href="Admin-add-teacher.jsp"><button class="add-student-btn">Add Teacher</button></a>
                        <div id="pending-admissions-table">
                            <table>
                                <tr>
                                    <th>ID</th>
                                    <th>Photo</th>
                                    <th>Full Name</th>
                                    <th>Class</th>
                                    <th>address</th>
                                   
                                    <th>email</th>
                                    <th>Salary</th>
                                    <th>Action</th>
                                </tr>
                                
                              <c:forEach var="std" items="${teachDetails}">
    
    <c:set var = "id" value="${std.id}" />
    <c:set var = "teacherName" value="${std.teacherName}" />
    <c:set var = "email" value="${std.email}" />
    <c:set var = "phone" value="${std.phone}" />
    <c:set var = "address" value="${std.address}" />
    <c:set var = "Salary" value="${std.getSalary()}" />
    <c:set var = "grade" value="${std.grade}" />
    <c:set var = "Gender" value="${std.getGrade()}" />
    <c:set var = "photo" value="${std.photo}" />
    
                                <tr>
                                    <td>${id}</td>
                                    <td><div class="profile-pic"
                                            style="background: url(./Assert/Student-main/${photo}) lightgray 50% / cover no-repeat;">

                                        </div></td>
                                    <td>${teacherName}</td>
                                    <td>Grade ${grade}</td>
                                    <td>${address}</td>
                                    
                                    <td>${email}</td>
                                    <td>${Salary}</td>
                                    <td>
                                    
                <c:url value = "Admin-update-teacher.jsp" var="teacherUpdate">
                
               
                
                	<c:param name= "id" value="${id}"> </c:param>
                	<c:param name= "teacherName" value="${teacherName}"> </c:param>
                	<c:param name= "email" value="${email}"> </c:param>
                	<c:param name= "phone" value="${phone}"> </c:param>
                	<c:param name= "address" value="${address}"> </c:param>
                	<c:param name= "Salary" value="${Salary}"> </c:param>
                	<c:param name= "grade" value="${grade}"> </c:param>
                	<c:param name= "Gender" value="${Gender}"> </c:param>
                	
                	
                	
                </c:url>
                                        
                                        <a href="${teacherUpdate }"><button
                                            class="approve-btn ">Edit</button></a>

                                        <a href="DeleteTeacher?id=${id}"
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