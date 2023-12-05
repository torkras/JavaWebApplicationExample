<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
	<head><title>Actividad 2. Servlets y JSP - Send</title></head>
	<body>
	<h1>Paso de parametros entre Servlets</h1>
	<form action="/myServlet2.jsp">
		<label for="fname">Nombre:</label><br>
		<input type="text" id="fname" name="fname" value="Juan"><br>
		<label for="lname">Apellidos:</label><br>
		<input type="text" id="lname" name="lname" value="Exposito"><br><br>
		<input type="radio" id="male" name="sex" value="male" checked>
		<label for="male">Hombre</label>
		<input type="radio" id="female" name="sex" value="female">
		<label for="female">Mujer</label><br><br>
		<input type="submit" value="Enviar">
		<input type="reset" value="Limpiar">
	</form>
	</body>
</html>