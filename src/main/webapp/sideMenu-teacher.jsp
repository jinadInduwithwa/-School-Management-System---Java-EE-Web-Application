<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="side-menu">

 
                   <div class="profile-pic" style="background: url(./Assert/Student-main/${photo}) lightgray 50% / cover no-repeat;">
                
                </div>

                <ul>
                    <li><a href="AllStudentFromTeacher">Dashboard</a></li>
                    <li><a href="teacher-profile.jsp">My Profile</a></li>
                    <li><a href="AllAsigment?teacherId=${idteacher}" data-url="/assigment">Assignment</a></li>
                    <li><a href="#">Notice</a></li>
                    <li><a href="#p">Events</a></li>
                </ul>
            </div>