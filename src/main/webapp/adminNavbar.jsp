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

    <link rel="stylesheet" href="./CSS/admin-dashboard.css">
    <link rel="stylesheet" href="/Assert/fonts/css/all.min.css">
    <body>
    
    
     
       
       <c:if test="${empty adminObj}">
    <script type="text/javascript">
        alert('access denied !!');
        location='LogoutServlet';
    </script>
</c:if>

        <div class="container-header">
            <div class="nav">
                <ul>
                    <h2 class="logoName">SCHOOLWeb</h2>
                    <li><i class="fa-solid fa-house"></i><a
                            href="admin-Dashboard.jsp">Home</a></li>
                    <li><i class="fa-solid fa-user"></i><a
                            href="allstudents">Students</a></li>
                    <li><i class="fa-solid fa-user"></i><a
                            href="getAllTeachers">Teachers</a></li>
                    <li><i class="fa-solid fa-file-pen"></i><a
                            href="contact.html">Reports</a></li>

                    <li><a href="LogoutServlet"><div class="loginBtn">LOgout</div></a></li>
                </ul>
            </div>
        </div>

        <main>
            <section class="main-section">
                <div class="side-navBar">
                    <h2 class="main-menu">Main Menu</h2>
                    <ul class="sidebar-menu">
                        <li><a href="admin-Dashboard.jsp" data-url="/dashboard">Dashboard</a></li>
                        <li><a href="admission" data-url="/admission">Admission</a></li>
                        <li><a href="allstudents" data-url="/students">Students</a></li>
                        <li><a href="getAllTeachers" data-url="/teachers">Teachers</a></li>
                        <li><a href="#" data-url="/classes">Exam</a></li>
                        <li><a href="allEvents" data-url="/events">Events</a></li>
                        <li><a href="allNotice" data-url="/notices">Notices</a></li>
                    </ul>

                </div>
                
           