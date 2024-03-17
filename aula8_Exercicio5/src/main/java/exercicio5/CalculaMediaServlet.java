package exercicio5;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// imports
import javax.servlet.http.HttpSession;


@WebServlet("/CalculaMedia")
public class CalculaMediaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// recebendo parametros do forms index
		String disciplina = request.getParameter("disciplina");
		double nota1 = Double.parseDouble(request.getParameter("nota1"));
		double nota2 = Double.parseDouble(request.getParameter("nota2"));
		double nota3 = Double.parseDouble(request.getParameter("nota3"));
		
		// calcular media
		double media = (nota1 + nota2 + nota3) / 3;
		
		// verificar se já foi calculada media para disciplina
		HttpSession session = request.getSession();
		Boolean isCalculated = (Boolean) session.getAttribute("isCalculated");
		
		if(isCalculated != null && isCalculated) {
			// Se ja foi calculado, armazenar apenas a mensagem e a media
			session.setAttribute("message", "Media ja foi calculada anteriormente.");
			session.setAttribute("media", media);			
		} else {
			// Se ainda nao foi calculado, armazena todas as informacoes
			session.setAttribute("isCalculated", true);
			session.setAttribute("disciplina", disciplina);
			session.setAttribute("nota1", nota1);
			session.setAttribute("nota2", nota2);
			session.setAttribute("nota3", nota3);
		}
		
		// redireciona para pagina result.jsp os valores armazenados
		response.sendRedirect("result.jsp");
		
	}
}
