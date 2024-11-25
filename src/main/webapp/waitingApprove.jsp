<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login</title>
    </head>

    <link rel="stylesheet" href="./CSS/Style.css">
    <link rel="stylesheet" href="./CSS/login.css">
    <link rel="stylesheet" href="./Assert/fonts/css/all.min.css">
    <body>

         <%@include file="navbar.jsp" %>

        <div class="signup-container">
            <div class="signup-image">

            </div>
            <div class="waiting-for-admin-approvers">
                <h1> Waiting for Admin Approval</h1> <br>
                <p> Your account is waiting for admin approval. Please wait
                    until the admin approves your account.</p>
                <a href="Login.jsp"> <button class="btn"> Go back</button> </a>
                <div class="waiting-img"> <img
                        src="./Assert/gif/waiting.gif" alt="waiting">
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