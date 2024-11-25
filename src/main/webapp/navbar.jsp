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

    <link rel="stylesheet" href="./CSS/Style.css">
    <link rel="stylesheet" href="./Assert/fonts/css/all.min.css">
    
    <body>
    <!--  	student navigation bar 	-->
     <c:if test = "${not empty stdDetails }">
     
     <c:forEach var="std" items="${stdDetails}">
     					<c:set var = "sid" value="${std.sid}" />
               			 <c:set var = "firstname" value="${std.firstName}" />
               			  <c:set var = "lastname" value="${std.lastName}" />
               			  <c:set var = "dob" value="${std.dob}" />
               			  <c:set var = "address" value="${std.address}" />
               			  <c:set var = "phone" value="${std.phone}" />
               			  <c:set var = "grade" value="${std.grade}" />
               			 <c:set var = "userName" value="${std.userName}" />
               			 <c:set var = "email" value="${std.email}" />
               			 <c:set var = "regStatus" value="${std.regStatus}" />
               			  <c:set var = "photo" value="${std.photo}" />
     </c:forEach>
     
     
     <div class="container-header">
            <div class="nav">
                <ul>
                    <h2 class="logoName">SCHOOLWeb</h2>
                    <li><i class="fa-solid fa-house"></i><a
                            href="index.jsp">Home</a></li>

                    <li><i class="fa-solid fa-file-pen"></i><a
                            href="student-main-dashboard.jsp">My Dashboard</a></li>
                    <li><i class="fa-solid fa-file-pen"></i><a
                            href="student-Notice.jsp">Notice</a></li>
                    <li><i class="fa-solid fa-file-pen"></i><a
                            href="student-Events.jsp">Events</a></li>

                    <li><a href="LogoutServlet"><div class="loginBtn">LOgout</div></a></li>
                </ul>
            </div>
        </div>
     
     </c:if>
     
     <!--  	teacher navigation bar 	-->
     <c:if test = "${not empty teacherDetails }">
			<c:forEach var="t" items="${teacherDetails}">
				<c:set var = "idteacher" value="${t.idteacher}" />
				<c:set var = "teacherName" value="${t.teacherName}" />
				<c:set var = "email" value="${t.email}" />
				<c:set var = "phone" value="${t.phone}" />
				<c:set var = "address" value="${t.address}" />
				<c:set var = "Salary" value="${t.salary}" />
				<c:set var = "grade" value="${t.grade}" />
				<c:set var = "Gender" value="${t.gender}" />
				<c:set var = "password" value="${t.password}" />
				 <c:set var = "username" value="${t.username}" />
				<c:set var = "photo" value="${t.photo}" />
			</c:forEach>
     
     
     <div class="container-header">
            <div class="nav">
                <ul>
                    <h2 class="logoName">SCHOOLWeb</h2>
                    <li><i class="fa-solid fa-house"></i><a
                            href="index.jsp">Home</a></li>

                    <li><i class="fa-solid fa-file-pen"></i><a
                            href="teacher-profile.jsp">Profile</a></li>

                    <li><a href="LogoutServlet"><div class="loginBtn">Logout</div></a></li>
                </ul>
            </div>
        </div>
     
     </c:if>
     
     <c:if test = "${empty stdDetails &&  empty teacherDetails}">

        <div class="container-header">
            <div class="nav">
                <ul>
                    <h2 class="logoName">SCHOOLWeb</h2>
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="#event-container">Event</a></li>
                    <li><a href="about.html">Teachers</a></li>
                    <li><a href="contact.html">Contact</a></li>
                    <li><a href="Signup.jsp">sign up</a></li>
                    <li><a href="Login.jsp"><div class="loginBtn">Login</div></a></li>
                </ul>
            </div>
        </div>
       </c:if>