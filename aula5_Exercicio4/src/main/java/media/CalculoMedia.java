package media;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;


@WebServlet("/calculoMedia")
public class CalculoMedia extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, 
						  HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		
		// Recebe notas como String
		String nota1String = request.getParameter("nota1");
		String nota2String = request.getParameter("nota2");
		String nota3String = request.getParameter("nota3");
		
		// Define variáveis para notas type double
		double nota1 = Double.parseDouble(nota1String);
		double nota2 = Double.parseDouble(nota2String);
		double nota3 = Double.parseDouble(nota3String);
		
		// Cálculo de média convertido para String
		String media = String.valueOf((nota1 + nota2 + nota3) / 3);	
		String mediaFormatada = String.format("%.2f", Double.parseDouble(media));
		
		response.getWriter().append("<html>");
		response.getWriter().append("<head>");
		response.getWriter().append("	<title>Cálculo Média</title>");
		response.getWriter().append("</head>");
		response.getWriter().append("<body>");
		response.getWriter().append("	</p>Média das notas: ").append(mediaFormatada).append("</p>");
		response.getWriter().append("</body>");
		response.getWriter().append("</html>");
		
	}

}
