<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Teacher Add Asigment</title>
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
                    
                              

                    <form id="edit-event-form" action="addAssigment" method="POST" enctype="multipart/form-data" >
                    
                   		<input type="text" id="id" name="Teacherid" value="${idteacher}" hidden>    
                    
                        <label for="name">Assignment Name:</label>
                        <input type="text" id="fname" name="assigmentName" required >  
                       
                        
                        <label for="email">Assignment Description:</label>
                        <input type="text" id="email" name="assigmentDescription" required>
                        
                      
                         <label for="event-date">Upload Date:</label>
                         <input type="date" id="event-date" name="assigmentUploadDate" >
                         
                         <label for="event-date">Due Date:</label>
                         <input type="date" id="event-date" name="assigmentDueDate" >
                                  
                        <label for="event-image">Image:</label>
                        <input type="file" id="event-image" name="assigmentFile" >   
                          
                        <button type="submit"  id="editBtn" class="editBtn">Upload</button>
                        
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