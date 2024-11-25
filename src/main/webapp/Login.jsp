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

        <div class="login-container">
            <div class="login-image">

            </div>
            <div class="login-form">
                <h1>Login</h1>
                <form action="login" method="post">
                    <input type="text" name="username" placeholder="Username">
                    <input type="password" name="password" placeholder="Password" >
                    <button type="submit" name="login"  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}">Login</button> <br>
                    <p class="donthacc">Don't have an account? <a
                            href="Signup.jsp">sign up</a></p>

                </form>
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
                <p>&copy; 2023 Online School Management System. All rights
                    reserved.</p>
            </div>
        </footer>

    </body>
</html>