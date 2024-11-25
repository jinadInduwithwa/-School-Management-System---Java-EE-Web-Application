<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Sign up</title>
    </head>

    <link rel="stylesheet" href="./CSS/Style.css">
    <link rel="stylesheet" href="./CSS/login.css">
    <link rel="stylesheet" href="./Assert/fonts/css/all.min.css">
    <body>

        <%@include file="navbar.jsp" %>

        <div class="signup-container">
            <div class="signup-image">

            </div>
            <div class="signup-form">
                <h2> Sign up</h2>
                <form action="InsertStudent" method="POST">
                    <div class="input-field">
                        <i class="fas fa-user"></i>
                        <input type="text" name="fname" placeholder="First Name"
                            required>
                    </div>
                    <div class="input-field">
                        <i class="fas fa-user"></i>
                        <input type="text" name="lname" placeholder="Last Name"
                            required>
                    </div>

                    <div class="input-field">
                        <i class="fas fa-user"></i>
                        <input type="text" name="username"
                            placeholder="Username"
                            required>
                    </div>
                    <div class="input-field">
                        <i class="fas fa-user"></i>

                        <select name="grade" id="grade">
                            <option value="6">Grade 6</option>
                            <option value="7">Grade 7</option>
                            <option value="8">Grade 8</option>
                            <option value="9">Grade 9</option>
                            <option value="10">Grade 10</option>
                            <option value="11">Grade 11</option>
                            <option value="12">Grade 12</option>
                        </select>

                    </div>
                    <br>

                    <div class="input-field">
                        <i class="fas fa-user"></i>
                        <input type="text" name="address" placeholder="Address"
                            required>
                    </div>

                    <div class="input-field">
                        <i class="fas fa-user"></i>
                        <input type="text" name="phone" placeholder="Phone"
                            required>
                    </div>

                    <div class="input-field">
                        <i class="fas fa-user"></i>
                        <input type="date" name="dob"
                            placeholder="Date of Birth"
                            required>
                    </div>

                    <div class="input-field">
                        <i class="fas fa-envelope"></i>
                        <input type="email" name="email" placeholder="Email"
                            required>
                    </div>
				        <div class="input-field">
					        <i class="fas fa-lock"></i>
					        <input id="password" type="password" name="password" placeholder="Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required>
					    </div>
					    <div class="input-field">
					        <i class="fas fa-lock"></i>
					        <input id="cpassword" type="password" name="cpassword" placeholder="Confirm Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required>
					    </div>
	                    <button type="submit" class="btn" onclick="validatePasswords()">Sign Up</button>
	                    <p class="ahan">Already have an account? <a
	                            href="Login.jsp">Login</a></p>
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
                <p>&copy; 2023 Online School Management System. All
                    rights
                    reserved.</p>
            </div>
        </footer>

    </body>
    <script>
        function validatePasswords() {
            var password = document.getElementById('password').value;
            var cpassword = document.getElementById('cpassword').value;

            if (password !== cpassword) {
                alert("Passwords do not match!");
                out.println("location='Signup.jsp'");
                return false;
            }
            return true;
        }
    </script>
</html>