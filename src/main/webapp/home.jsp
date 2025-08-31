<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Welcome Page</title>
  <link rel="stylesheet" href="style.css">
  <link rel="stylesheet" href="CSS/bootstrap-5.0.2-dist/bootstrap-5.0.2-dist/css/bootstrap.min.css">
  
  <style>
    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
    }

    html, body {
      height: 100%;
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background: linear-gradient(135deg, #667eea, #764ba2);
      display: flex;
      justify-content: center;
      align-items: center;
      color: #fff;
    }

    .welcome-container {
      text-align: center;
      animation: zoomIn 1s ease forwards;
      opacity: 0;
    }

    h1 {
      font-size: 3rem;
      animation: fadeIn 2s ease-in forwards;
      opacity: 0;
    }

    p {
      margin-top: 10px;
      font-size: 1.2rem;
      animation: slideIn 2s ease-out forwards;
      animation-delay: 0.5s;
      opacity: 0;
    }

    button {
      margin-top: 20px;
      padding: 10px 25px;
      font-size: 1rem;
      border: none;
      background-color: #fff;
      color: #764ba2;
      border-radius: 5px;
      cursor: pointer;
      transition: background 0.3s;
    }

    button:hover {
      background-color: #eee;
    }

    @keyframes fadeIn {
      to {
        opacity: 1;
      }
    }

    @keyframes slideIn {
      from {
        transform: translateY(20px);
        opacity: 0;
      }
      to {
        transform: translateY(0);
        opacity: 1;
      }
    }

    @keyframes zoomIn {
      from {
        transform: scale(0.9);
        opacity: 0;
      }
      to {
        transform: scale(1);
        opacity: 1;
      }
    }
  </style>
</head>
<body>
  <div class="welcome-container">
  	<% String str=(String)session.getAttribute("msg"); 
  		if(str!=null){ %>
    <h1><%=str %></h1>
    <% session.removeAttribute("msg");
  		};
    %>
    <p>We're glad you're here!</p>
    <button onclick="proceed()">Enter</button>
  </div>

  <script>
    function proceed() {
      // Replace this with the destination page
      window.location.href = "home.jsp"; // or home.html
    }
  </script>
</body>
</html>
