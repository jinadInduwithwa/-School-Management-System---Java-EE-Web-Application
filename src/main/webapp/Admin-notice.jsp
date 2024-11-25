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
                            <h2 class="main-h2">Welcome to the Admin Dashboard</h2>
                        </div>
                        <div>
                            <div class="btn-viewschool">
                                <h2>View School Profile</h2>
                            </div>
                        </div>
                    </div>
                    <div class="pending-admission">
                        <h2 class="approve-admis">Manage Notices</h2>
                        <a href="Admin-notice-add.jsp"><button class="add-student-btn">Add Notices</button></a>
                        <div id="pending-admissions-table">
                            <table>
                                <tr>
                                    <th>ID</th>
                                    <th>Title</th>
                                    <th>Description</th>
                                    <th>Grade</th>
                                    <th>Publish date</th>
                                    <th>Action</th>
                                </tr>
	                                
	                              <c:forEach var="std" items="${noticeDetails}">
									    <c:set var = "noticeId" value="${std.noticeId}" />
									    <c:set var = "noticeTitle" value="${std.noticeTitle}" />
									    <c:set var = "noticeDiscription" value="${std.noticeDiscription}" />
									    <c:set var = "noticeGrade" value="${std.noticeGrade}" />
									    <c:set var = "noticePublishDate" value="${std.noticePublishDate}" />
									    
	    
	                                 <tr>
	                                    <td>${noticeId}</td>
	                                    <td>${noticeTitle}</td>
	                                    <td>${noticeDiscription}</td>
	                                    <td>${noticeGrade}</td>
	                                    <td>${noticePublishDate}</td>
	                                    
	                                    
	                                    <td>
		                                    <c:url value = "Admin-update-notice.jsp" var="noticeUpdate">
							                	<c:param name= "noticeId" value="${noticeId}"> </c:param>
							                	<c:param name= "noticeTitle" value="${noticeTitle}"> </c:param>
							                	<c:param name= "noticeDiscription" value="${noticeDiscription}"> </c:param>
							                	<c:param name= "noticeGrade" value="${noticeGrade}"> </c:param>
							                	<c:param name= "noticePublishDate" value="${noticePublishDate}"> </c:param>
	                						</c:url>
	                                        
	                                        <a href="${noticeUpdate }"><button class="approve-btn ">Edit</button></a>
	
	                                        <a href="DeleteNotice?id=${noticeId}" class="btn-edit"><button class="reject-btn">Remove</button></a>
		                                    
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