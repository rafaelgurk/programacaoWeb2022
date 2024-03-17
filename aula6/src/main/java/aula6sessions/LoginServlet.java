package aula6sessions;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// imports
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
						  HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		String user= request.getParameter("user");
		String pass = request.getParameter("password");
		
		if(pass.equals("admin123")) {
			out.println("Bem vindo(a) " + user);
			
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
		} 
		else {
			out.println("Nome ou senha inválidos!");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		
		out.close();
	}
}



