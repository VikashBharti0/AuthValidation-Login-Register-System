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


graph TD;
    A[User Accesses Registration Page]
    B[Input Validated on Server]
    C[Save to MySQL DB if Valid]
    D[Show Errors if Invalid or Duplicate UserID]
    E[Redirect to Login Page]
    F[Login Validation Against DB]
    G[Welcome User on Success]

    A --> B
    B -->|Valid| C
    B -->|Invalid| D
    C --> E
    D --> A
    E --> F
    F --> G



