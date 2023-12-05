package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String welcomeWord;

		if (request.getParameter("sex").equals("male")) {
			welcomeWord = "Bienvenido";
		} else if (request.getParameter("sex").equals("female")) {
			welcomeWord = "Bienvenida";
		} else {
			welcomeWord = "Bienvenid@";
		}



		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Actividad 1. Servlets - Receive</title></head>");
		out.println("<body>");
		out.println("<h1>" + welcomeWord +
				" " + request.getParameter("fname") + " " + request.getParameter("lname") +
				"!!" + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}