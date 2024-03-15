package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

/**
 * Servlet implementation class MensagemServlet
 */
@WebServlet({ "/mensagem", "/msg" })
public class MensagemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		
		response.getWriter().append("<html>");
		response.getWriter().append("<head>");
		response.getWriter().append("	<title>Retorno GET</title>");
		response.getWriter().append("</head>");
		response.getWriter().append("<body>");
		response.getWriter().append("	<p>").append(nome).append("</p>");
		response.getWriter().append("	<p>Obrigado por cadastrar seu email (");		
		response.getWriter().append(email);
		response.getWriter().append(") conosco!</p>");
		response.getWriter().append("</body>");
		response.getWriter().append("</html>");
		
	
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
