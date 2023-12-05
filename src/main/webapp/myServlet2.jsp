<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
	<head><title>Actividad 2. Servlets y JSP - Receive</title></head>
	<body>
	<h1>
	<%
		String welcomeWord;

		if (request.getParameter("sex").equals("male")) {
			welcomeWord = "Bienvenido";
		} else if (request.getParameter("sex").equals("female")) {
			welcomeWord = "Bienvenida";
		} else {
			welcomeWord = "Bienvenid@";
		}
		out.print(welcomeWord + " " + request.getParameter("fname") + " " + request.getParameter("lname") + "!!");
	%>
	</h1>
	</body>
</html>