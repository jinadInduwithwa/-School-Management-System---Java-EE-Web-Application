<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

        
                <div class="main-space main-admision">
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
                        <h2 class="approve-admis">Approve Admissions</h2>
                        <div id="pending-admissions-table">
                            <table>
                                <tr>
                                    <th>ID</th>
                                    <th>Student Name</th>
                                    <th>Class</th>
                                    <th>DOB</th>
                                    <th>Contact Number</th>
                                    <th>Approve</th>
                                    <th>Reject</th>
                                </tr>
                                
                     <c:forEach var="std" items="${stdDetails}">
    
    <c:set var = "id" value="${std.sid}" />
    <c:set var = "fName" value="${std.firstName}" />
    <c:set var = "lName" value="${std.lastName}" />
    <c:set var = "DOB" value="${std.dob}" />
    <c:set var = "grade" value="${std.grade}" />
    <c:set var = "phone" value="${std.phone}" />
    
    
    
    
            
                     
                                <tr>
                                    <td>${id}</td>
                                    <td>${fName } ${lName }</td>
                                    <td>Grade ${grade}</td>
                                    <td>${DOB }</td>
                                    <td>${phone }</td>
                                    <td><a href="approveStudent?id=${id}"
                            class="btn-edit"><button
                                            class="approve-btn ">Approve</button></a></td>
                                    <td><a href="RejectStudent?id=${id}"
                            class="btn-edit"><button
                                            class="reject-btn">Reject</button></a></td>
                                </tr>
             </c:forEach>
                            </table>
                        </div>
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
                <p>&copy; 2023 Online School Management System. All rights
                    reserved.</p>
            </div>
        </footer>

    </body>
</html>