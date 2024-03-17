package aula6sessions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//imports
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;



@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
						 HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		HttpSession session = request.getSession(false);
		
		if(session != null) {
			String user = (String) session.getAttribute("user");
			out.print("Bem vindo, " + user + ", este é o seu profile!");
		}
		else {
			out.print("Faça login primeiro.");
			
			request.getRequestDispatcher("login.html").include(request, response);
			
			out.close();
		}	
	}
}

