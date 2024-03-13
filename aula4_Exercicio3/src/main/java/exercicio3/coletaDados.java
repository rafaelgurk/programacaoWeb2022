package exercicio3;

// auto generated imports
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// imports
import java.io.PrintWriter;

//@WebServlet(name = "dadosPessoais", urlPatterns = { "/ficha", "/dados" })
@WebServlet({ "/ficha" })
public class coletaDados extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	protected void doGet(HttpServletRequest request, 
						HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html; charset=UTF-8");
		
	    out.println("<!DOCTYPE html>");
	    out.println("<html lang=\"pt-BR\">");
	    out.println("<head>");
	    out.println("    <meta charset=\"UTF-8\">");
	    out.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
	    out.println("    <title>Formulario de coleta de dados</title>");
	    out.println("    <style>");
	    out.println("        #buttonEnviar {");
	    out.println("            background-color: #5da720;");
	    out.println("            color: white;");
	    out.println("            font-weight: bolder;");
	    out.println("            padding: 10px 20px;");
	    out.println("            text-align: center;");
	    out.println("            text-decoration: none;");
	    out.println("            display: inline-block;");
	    out.println("            font-size: 16px;");
	    out.println("            cursor: grab;");
	    out.println("            border-radius: 10px;");
	    out.println("        }");
	    out.println("        #buttonEnviar:active {");
	    out.println("            background-color: #45a049;");
	    out.println("        }");
	    out.println("        #buttonEnviar:hover {");
	    out.println("            background-color: #0f169e;");
	    out.println("        }");
	    out.println("    </style>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("	<h1>Formulário</h1>");
	    out.println("    <form action=\"/aula4_Exercicio3/dados\" method=\"post\">");
	    out.println("        <label for=\"nome\">Nome: </label><br>");
	    out.println("        <input type=\"text\" id=\"nome\" name=\"nome\" required><br><br>");
	    
	    out.println("        <label for=\"endereco\">Endereço: </label><br>");
	    out.println("        <input type=\"text\" id=\"endereco\" name=\"endereco\" required><br><br>");
	    
	    out.println("        <label for=\"email\">E-mail: </label><br>");
	    out.println("        <input type=\"email\" id=\"email\" name=\"email\" required><br><br>");
	    
	    out.println("        <label for=\"telefone\">Telefone: </label><br>");
	    out.println("        <input type=\"tel\" name=\"telefone\" id=\"telefone\" required><br><br>");
	    
	    out.println("        <label for=\"dataNascimento\">Data Nascimento: </label>");
	    out.println("        <input type=\"date\" name=\"dataNascimento\" id=\"dataNascimento\" required><br><br>");
	    
	    out.println("        <label for=\"estadoCivil\">Estado Civil: </label>");
	    out.println("        <select name=\"estadoCivil\" id=\"estadoCivil\">");
	    out.println("            <option value=\"solteiro\">Solteiro</option>");
	    out.println("            <option value=\"casado\">Casado</option>");
	    out.println("            <option value=\"viuvo\">Viuvo</option>");
	    out.println("        </select>");
	    out.println("        <br><br><br>");
	    out.println("        <input type=\"submit\" value=\"Enviar\" id=\"buttonEnviar\">");
	    out.println("    </form>");
	    out.println("</body>");
	    out.println("</html>");
	    out.close();	
	}
}
