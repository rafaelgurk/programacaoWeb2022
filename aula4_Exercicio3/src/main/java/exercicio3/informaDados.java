package exercicio3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

@WebServlet("/dados")
public class informaDados extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html; charset=UTF-8");
		
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		String dataNascimento = request.getParameter("dataNascimento");
		String estadoCivil = request.getParameter("estadoCivil");
		
	    out.println("<!DOCTYPE html>");
	    out.println("<html lang=\"pt-BR\">");
	    out.println("<head>");
	    out.println("    <meta charset=\"UTF-8\">");
	    out.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
	    out.println("    <title>Exibindo dados</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("    <h1>Dados Recebidos</h1>");
	    out.println("    <p>Nome: " + nome + "</p>");
	    out.println("    <p>Endereço: " + endereco + "</p>");
	    out.println("    <p>E-mail: " + email + "</p>");
	    out.println("    <p>Telefone: " + telefone + "</p>");
	    out.println("    <p>Data de Nascimento: " + dataNascimento + "</p>");
	    out.println("    <p>Estado Civil: " + estadoCivil + "</p>");
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	}
}
