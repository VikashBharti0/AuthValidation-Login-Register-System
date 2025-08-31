<html>
<head>
<link rel="stylesheet" href="CSS/bootstrap-5.0.2-dist/bootstrap-5.0.2-dist/css/bootstrap.min.css">
<link rel="stylesheet" href="style.css">
</head>
<body style="background-color:#DFBED6;">

<%@ include file="header.jsp" %>

	
		<div class="card mt-5">
		<div class="card-header text-center" id="bgcrev">
			<h1 class="text-white">Registration form</h1>
		</div>
		<div class="card-body" id="cordbd" style="background-color:#DDF4E7;">
			<form action="register" method="post">
					<input type="text" name="name" class="form-control mt-2" placeholder="Enter the name" required>			
					<input type="number" name="age" class="form-control mt-2" placeholder="Enter the age" required>		
					<input type="text" name="userid" class="form-control mt-2" placeholder="Enter the userid" required>
					<input type="email" name="email" class="form-control mt-2" placeholder="Enter the email" required>
					<input type="password" name="password" class="form-control mt-2" placeholder="Enter the password" required>
					<input type="password" name="repassword" class="form-control mt-2" placeholder="Enter the password confirm" required>
				    <%
				    	String msgs = (String)session.getAttribute("msg");
				    	if(msgs!=null){ %>
				    	<p style="color:red"><%=msgs %></p>
				    	<% 
				    	session.removeAttribute("msg");
				    	}%>
				    <div class="text-center">
				    	<button type="submit" class="btn btn-primary mt-3 ">Register</button>
				    </div>
			
			</form>
		</div>
	</div>
		

</body>
</html>
