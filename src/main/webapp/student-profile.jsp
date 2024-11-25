<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Student Dashboard</title>
        <link rel="stylesheet" href="./CSS/student-dashboard.css">
        <link rel="stylesheet" href="./CSS/normalize.css">
        
            <style>
              .hidden {
        display: none;
    }
        </style>

    </head>
    <body>
     <%@include file="navbar.jsp" %>
       

        <section class="main-section">

            <%@include file="sideMenu-student.jsp" %>
            
            
            

        <div class="main-space">
            <div class="profile-main">

                <h1>My Profile</h1>
                <div class="profile">
                    <div class="profile-pic  student-pic" style="background: url(./Assert/Student-main/${photo}) lightgray 50% / cover no-repeat;">

                    </div>
                    <div class="profile-details">
                        <h2>${firstname} ${lastname}</h2>
                        <p>Grade: ${grade}</p>
                        <p>Class: A</p>
                        <p>ID No: ${sid}</p>
                    </div>
                </div>

                 <div class="personal-details">
                    <h2>Personal Details</h2>

                    <form >
                        <label for="name">First Name:</label>
                        <input type="text" id="fname" name="fname"
                            value="${firstname}" disabled>
                        <label for="name">Last Name:</label>
                        <input type="text" id="lname" name="lname"
                            value="${lastname}" disabled>
                        <label for="grade">Grade:</label>
                        <input type="text" id="grade" name="grade" value="${grade}"
                            disabled>
                        <label for="class">Class:</label>
                        <input type="text" id="class" name="class" value="A"
                            disabled>
                        
                        <input type="hidden" id="id" name="id" value="${sid}"
                            disabled>
                        <label for="email">Email:</label>
                        <input type="email" id="email" name="email"
                            value="${email}" disabled>
                        <label for="phone">Phone:</label>
                        <input type="text" id="phone" name="phone"
                            value="${phone}" disabled>
                        <label for="address">Address:</label>
                        <input type="text" id="address" name="address"
                            value="${address}" disabled>
                         
                            
                            
                            
                            
                       
                    </form>
                    
                    <c:url value = "updateStudent.jsp" var="stdupdate">
                
               
                
                	<c:param name= "id" value="${id}"> </c:param>
                	<c:param name= "fName" value="${firstname}"> </c:param>
                	<c:param name= "LName" value="${lastname}"> </c:param>
                	<c:param name= "sid" value="${sid}"> </c:param>
                	<c:param name= "email" value="${email}"> </c:param>
                	<c:param name= "phone" value="${phone}"> </c:param>
                	<c:param name= "photo" value="${photo}"> </c:param>
                	
                	
                </c:url>	
                	
                
                
               		 
               			 <a href="${stdupdate}">
                <button class="editBtn">Update</button>
				</a>    
				
					
					
					
                  

                </div>
                <div class="change-password">
                    <h2>Change Password</h2>
                    <form action="changePassword" method="post">
                        <label for="current-password">Current Password:</label>
                        <input type="password" id="current-password"
                            name="current-password" required>
                        <label for="new-password">New Password:</label>
                        <input type="password" id="new-password"
                            name="new-password" required>
                        <label for="confirm-password">Confirm Password:</label>
                        <input type="password" id="confirm-password"
                            name="confirm-password" required>
                            <input type="hidden" name="sid" value="${userName}" />

                        <button type="submit" class="changeBtn">Change</button>
                    </form>
                </div>
                
               
                


                <div class="delete-account">
                    <h2>Delete Account</h2>
                    <p>Are you sure you want to delete your account?</p>
                    <a href="deleteaccount?userName=${userName}"><button class="deleteBtn">Delete</button></a>
                </div>
                
                <script>
    document.querySelector('.deleteBtn').addEventListener('click', function(event) {
        // Display confirmation dialog box
        var isConfirmed = confirm('Are you sure you want to delete your account?');
        
        // If user confirms deletion, proceed with deletion
        if (isConfirmed) {
            
           
        } else {
            // If user cancels deletion, prevent the default action (i.e., following the link)
            event.preventDefault();
        }
    });
</script>

                <div class="exam-results">
                    <h2>Exam Results</h2>
                    <h3>Term 1</h3>
                    <h3>Grade: 10</h3>
                    <h3>Class: A</h3>
                    <h3>Year: 2023</h3>
                    <table>
                        <tr>
                            <th>Subject</th>
                            <th>Grade</th>

                        </tr>
                        <tr>
                            <td>Maths</td>
                            <td>A</td>
                        </tr>
                        <tr>
                            <td>Science</td>
                            <td>B</td>
                        </tr>
                        <tr>
                            <td>English</td>
                            <td>A</td>
                        </tr>
                        <tr>
                            <td>History</td>
                            <td>C</td>
                        </tr>
                    </table>

                </div>

            </div>

        </section>

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