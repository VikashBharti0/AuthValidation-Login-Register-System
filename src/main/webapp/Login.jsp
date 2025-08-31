<html>
<head>
<link rel="stylesheet" href="CSS/bootstrap-5.0.2-dist/bootstrap-5.0.2-dist/css/bootstrap.min.css">
<link rel="stylesheet" href="style.css">
</head>
<body style="background-color:#DFBED6;">

<%@ include file="header.jsp" %>

	
		<div class="card mt-5">
		<div class="card-header text-center" id="bgcrev">
			<h1 class="text-white">Login form</h1>
		</div>
		<div class="card-body "style="background-color:#DDF4E7;">
			<form action="register" method="get">		
					<img src="CSS/usericon.jpg" class="usericon">
					<input type="text" name="userid" class="form-control mt-2" placeholder="Enter the userid">
					<input type="password" name="password" class="form-control mt-2" placeholder="Enter the password">
				    <%
				    	String msgs = (String)session.getAttribute("msg");
				    	if(msgs!=null){ %>
				    	<p style="color:red"><%=msgs %></p>
				    	<% 
				    	session.removeAttribute("msg");
				    	}%>
				    <div>
				    	<input type="checkbox" id="rm"><label for="rm">Remember me</label>
				    	 <a href="" class="forget">forget password?</a>
				    </div>
				    <div class="text-center">
				    	<button type="submit" class="form-control btn btn-primary mt-3 ">Login</button>
				    </div>
			
			</form>
		</div>
	</div>
		

</body>
</html>
