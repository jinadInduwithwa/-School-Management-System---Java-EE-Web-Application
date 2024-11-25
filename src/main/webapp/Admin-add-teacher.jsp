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
                        <h2 class="approve-admis">Add New Teacher</h2>
                        <div class="add-teacher-form">

                            <form id="add-teacher-form" action="AddTeacher" 
                                method="POST" enctype="multipart/form-data">
                                <div class="form-group">
                                    <label for="teacher-name">Full Name:</label>
                                    <input type="text" id="teacherName"
                                        name="teacherName" required>
                                </div>
                                <div class="form-group">
                                    <label for="username">User name:</label>
                                    <input type="text" id="teacherName"
                                        name="username" required>
                                </div>
                                <div class="form-group">
                                    <label for="email">Email:</label>
                                    <input type="email" id="email" name="email"
                                        required>
                                </div>
                                <div class="form-group">
                                    <label for="phone">Phone:</label>
                                    <input type="text" id="phone" name="phone"
                                        required>
                                </div>
                                <div class="form-group">
                                    <label for="address">Address:</label>
                                    <input type="text" id="address"
                                        name="address"
                                        required>
                                </div>
                                <div class="form-group">
                                    <label for="Salary">Salary:</label>
                                    <input type="text" id="Salary"
                                        name="Salary"
                                        required>
                                </div>

                                <div class="form-group">
                                    <label for="grade">Grade:</label>
                                    <select id="grade" name="grade">
                                        <option value="1">Grade 1</option>
                                        <option value="2">Grade 2</option>
                                        <option value="3">Grade 3</option>
                                        <option value="4">Grade 4</option>
                                        <option value="5">Grade 5</option>
                                        <option value="6">Grade 6</option>
                                        <option value="7">Grade 7</option>
                                        <option value="8">Grade 8</option>
                                        <option value="9">Grade 9</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="Gender">Gender:</label>
                                    <select id="Gender" name="Gender">
                                        <option value="Male">Male</option>
                                        <option value="Female">Female</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="password">password:</label>
                                    <input type="password" id="password"
                                        name="password"
                                        required>
                                </div>

                                <div class="form-group">
                                    <label for="teacher-photo">
                                        Teacher Photo:</label>
                                    <input type="file" id="teacher-photo"
                                        name="teacher_photo"
                                        required>
                                </div>

                                <button type="submit">Add Teacher</button>
                            </form>
                        </div>

                    </div>

                </section>
            </main>

            <footer>
                <div class="footer-links">
                    <a href="about.html">About Us</a>
                    <a href="contact.html">Contact Us</a>
                    <a href="faq.html">FAQ</a>
                    <a href="terms.html">Terms &
                        Condition</a>
                    <a href="privacy.html">Privacy
                        Policy</a>
                </div>
                <div class="footer-contact">
                    <p>Phone: 0772931811</p>
                    <p>Email: Sliit@gmail.com</p>
                    <p>Address: 202/1 Matara</p>
                </div>
                <div class="copyright">
                    <p>&copy; 2023 Online School Management
                        System.
                        All rights
                        reserved.</p>
                </div>
            </footer>

        </body>
    </html>