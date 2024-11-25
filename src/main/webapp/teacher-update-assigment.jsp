<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Teacher Update Asigment</title>
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

                

                 <div class="personal-details">
                    <h2>Add Assignment</h2>
                    
                    
                    <%
			        	String assId = request.getParameter("assId");
			            String assigmentName = request.getParameter("assigmentName");
			            String assigmentDescription = request.getParameter("assigmentDescription");
			            String assigmentUploadDate = request.getParameter("assigmentUploadDate");
			            String assigmnmentDueDate = request.getParameter("assigmnmentDueDate");
			            String file = request.getParameter("file");
			            String teacherId = request.getParameter("teacherId");
			        %>
                    
                              

                    <form id="edit-event-form" action="updateAssigment" method="POST" >
                    	<input type="text" id="id" name="assId" value="<%= assId %>" hidden>    
                    
                   		<input type="text" id="id" name="teacherId" value="<%= teacherId %>" hidden>    
                    
                        <label for="name">Assignment Name:</label>
                        <input type="text" id="fname" name="assigmentName" value="<%= assigmentName %>" >  
                       
                        
                        <label for="email">Assignment Description:</label>
                        <input type="text" id="email" name="assigmentDescription" value="<%= assigmentDescription %>">
                        
                      
                         <label for="event-date">Upload Date:</label>
                         <input type="date" id="event-date" name="assigmentUploadDate" value="<%= assigmentUploadDate %>">
                         
                         <label for="event-date">Due Date:</label>
                         <input type="date" id="event-date" name="assigmnmentDueDate" value="<%= assigmnmentDueDate %>">
 
                        <button type="submit"  id="editBtn" class="editBtn">Update</button>
                        
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