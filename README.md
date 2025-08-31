<h1 align="center">🔐 Authentication-Based Login & Registration System</h1>

<p align="center">
A Java Servlet + JSP web application for secure user registration and authentication with full input validation and session handling.
</p>

---

## 🚀 Features

<details>
<summary><strong>📄 Registration Form</strong></summary>

- ✅ <strong>Username</strong> – Only alphabetic characters allowed  
- ✅ <strong>UserID</strong> – Must be unique in the database  
- ✅ <strong>Email</strong> – Validated using Regex  
- ✅ <strong>Password & Confirm Password</strong> – Must match  
- ✅ <strong>Age</strong> – Between 18 and 80  

</details>

<details>
<summary><strong>🔐 Login Form</strong></summary>

- 🔍 Credentials verified against database records  
- ❌ Errors shown for invalid input using session messages  

</details>

<details>
<summary><strong>🛠 Backend Features</strong></summary>

- 🗃️ DAO Layer for DB interaction  
- 🔐 Session management with `HttpSession`  
- 🚫 Input validation and duplicate checking  
- 📡 JDBC with MySQL  

</details>

---

## 🛠 Tech Stack

| Language / Tech | Purpose |
|-----------------|---------|
| **Java (Servlets & JSP)** | Backend logic |
| **HTML, CSS, Bootstrap 5** | Frontend UI |
| **JDBC** | Database connectivity |
| **MySQL** | Persistent storage |
| **Apache Tomcat** | Servlet container |

---

## 📁 Project Structure


index.jsp           → Registration Page  
login.jsp           → Login Page  
register.java       → Servlet to handle register/login logic  
UserDetails.java    → DAO for DB operations  
UserData.java       → POJO (Entity class)  
style.css           → Custom CSS styles  


⚡ Application Flow

👤 User registers with form input.

🛡️ Fields are validated (server-side).

🗃️ If valid → data saved in MySQL.

🚫 If UserID already exists → error via session message.

🔁 On success → redirected to Login page.

🔓 Login credentials are verified against DB.

✅ If valid → redirected to Home page with:


📸 Screenshots
![Image](https://github.com/user-attachments/assets/e8d39476-2c11-41c5-8c12-3c573fad3d21)






