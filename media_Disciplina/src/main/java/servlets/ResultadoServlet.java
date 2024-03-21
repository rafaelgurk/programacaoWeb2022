package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.List;

@WebServlet("/ResultadoServlet")
public class ResultadoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Recupera a sessão
        HttpSession session = request.getSession();

        // Recupera as matérias da sessão
        List<String> materias = (List<String>) session.getAttribute("materias");

        if (materias != null && !materias.isEmpty()) {
            out.println("<html><head><title>Resultados das Matérias</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; background-color: #f4f4f4; }");
            out.println("h1 { text-align: center; color: #333; }");
            out.println("ul { list-style-type: none; padding: 0; }");
            out.println("li { background-color: #fff; padding: 20px; margin: 20px auto; max-width: 400px; border-radius: 8px; box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); }");
            out.println("a { display: block; text-align: center; margin-top: 20px; }");
            out.println("</style>");
            out.println("</head><body>");
            out.println("<h1>Resultados das Matérias</h1>");

            // Exibe os resultados para cada matéria
            for (String materia : materias) {
                double nota1 = (double) session.getAttribute("nota1_" + materia);
                double nota2 = (double) session.getAttribute("nota2_" + materia);
                double nota3 = (double) session.getAttribute("nota3_" + materia);
                double media = (double) session.getAttribute("media_" + materia);

                out.println("<ul>");
                out.println("<li>");
                out.println("<h2>Matéria: " + materia + "</h2>");
                out.println("<p>Nota 1: " + nota1 + "</p>");
                out.println("<p>Nota 2: " + nota2 + "</p>");
                out.println("<p>Nota 3: " + nota3 + "</p>");
                out.println("<p>Média: " + media + "</p>");
                out.println("</li>");
                out.println("</ul>");
            }

            out.println("<a href=\"index.html\">Voltar</a>");
            out.println("</body></html>");
        } else {
            // Caso não haja matérias na sessão, redireciona para a página inicial
            response.sendRedirect("index.html");
        }
    }
}
