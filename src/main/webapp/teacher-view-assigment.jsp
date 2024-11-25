<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Teacher View Assigment</title>
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
             <div class="pending-admission">
                        <h2 class="approve-admis">Assigment</h2>
                        <a href="teracher-addAssigment.jsp"><button class="approve-btn">Add Assigment</button></a>
                        <div id="pending-admissions-table">
                            <table>
                                <tr>
                                    <th>Assigment Id</th>
                                    <th>File</th>
                                    <th>Assigment Name</th>
                                    <th>Assigment description</th>
                                    <th>Assigment Upload Date</th>
                                    <th>Assigment Due Date</th>
                                    <th>Action</th>

                                </tr>
 
                                <c:forEach var="std" items="${assigmentDetails}">
    
									    <c:set var = "assId" value="${std.assId}" />
									    <c:set var = "assigmentName" value="${std.assigmentName}" />
									    <c:set var = "assigmentDescription" value="${std.assigmentDescription}" />
									    <c:set var = "assigmentUploadDate" value="${std.assigmentUploadDate}" />
									    <c:set var = "assigmnmentDueDate" value="${std.assigmnmentDueDate}" />
									    <c:set var = "file" value="${std.file}" />
									    <c:set var = "teacherId" value="${std.teacherId}" />
									    
    							<tr>
                                    <td>${assId}</td>
                                    <td><div class="passigmentPic"style="background: url(./Assert/Student-main/${file}) lightgray 50% / cover no-repeat;"></div></td>
                                    <td>${assigmentName}</td>
                                    <td>${assigmentDescription}</td>
                                    <td>${assigmentUploadDate}</td>
                                    <td>${assigmnmentDueDate}</td>
                                    <td>
                                    
                                    <c:url value = "teacher-update-assigment.jsp" var="assigmentUpdate">
					                	<c:param name= "assId" value="${assId}"> </c:param>
					                	<c:param name= "assigmentName" value="${assigmentName}"> </c:param>
					                	<c:param name= "assigmentDescription" value="${assigmentDescription}"> </c:param>
					                	<c:param name= "assigmentUploadDate" value="${assigmentUploadDate}"> </c:param>
					                	<c:param name= "assigmnmentDueDate" value="${assigmnmentDueDate}"> </c:param>
					                	<c:param name= "file" value="${file}"> </c:param>
					                	<c:param name= "teacherId" value="${teacherId}"> </c:param>
               					 </c:url>
                                    
                                    
                                    
                                     <a href="${assigmentUpdate}"><button class="approve-btn ">Edit</button></a>
									 <a href="deleteAssigment?id=${assId}" class="btn-edit"><button class="reject-btn">Remove</button></a>
                                    </td>
                                </tr>
 
                           </c:forEach>
                      </table>
                   </div>
                </div>
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