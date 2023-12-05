package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Actividad 1. Servlets - Send</title></head>");
		out.println("<body>");
		out.println("<h1>Paso de parámetros entre Servlets</h1>");
		out.println("<p>Hay que crear un formulario sencillo en HTML, basta con que tenga un campo de texto y el botón de enviar.</p>");
		out.println("<form action=\"/myServlet2\">");
		out.println("<label for=\"fname\">Nombre:</label><br>");
		out.println("<input type=\"text\" id=\"fname\" name=\"fname\" value=\"Juan\"><br>");
		out.println("<label for=\"lname\">Apellidos:</label><br>");
		out.println("<input type=\"text\" id=\"lname\" name=\"lname\" value=\"Exposito\"><br><br>");
		out.println("<input type=\"radio\" id=\"male\" name=\"sex\" value=\"male\" checked>");
		out.println("<label for=\"male\">Hombre</label>");
		out.println("<input type=\"radio\" id=\"female\" name=\"sex\" value=\"female\">");
		out.println("<label for=\"female\">Mujer</label><br><br>");
		out.println("<input type=\"submit\" value=\"Enviar\">");
		out.println("<input type=\"reset\" value=\"Limpiar\">");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

}