🔐 Authentication-Based Login & Registration System

This project is a Java Servlet + JSP-based application that demonstrates user registration, authentication, and login validation with full input validation.

🚀 Features

Registration Form with validation for:

✅ Username → must be alphabetic

✅ UserID → unique check in DB

✅ Email → regex-based validation

✅ Password & Confirm Password → must match

✅ Age → between 18 and 80

Login Form with validation against database records

Error Handling: session messages displayed on invalid inputs

DAO Layer for database communication (save, check existence, validate credentials)

Session Management with HttpSession

🛠 Tech Stack

Java (Servlets, JSP)

HTML, CSS, Bootstrap 5

JDBC (DAO + DBUtil)

MySQL

📂 Project Structure
index.jsp         → Registration Page
login.jsp         → Login Page
register.java     → Servlet handling register & login logic
UserDetails.java  → DAO for DB operations
UserData.java     → Entity class
style.css         → Custom styles

⚡ Flow

User registers → all fields validated → if valid, data saved in DB.

If UserID already exists or input invalid → error shown via session message.

After successful registration → redirected to Login page.

User logs in → validated against DB → if correct, redirected to Home page with “Welcome <UserID>”.

📸 Screenshots

(You can add registration & login screenshots here)

🔮 Future Improvements

Encrypt passwords using BCrypt/MD5

Add Forgot Password functionality

Improve UI with modern components
