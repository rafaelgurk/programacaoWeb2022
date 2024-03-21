package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MediaServlet")
public class MediaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Recuperar session
        HttpSession session = request.getSession();

        // Recebe valores informados
        String materia = request.getParameter("materia"); // valor digitado pelo usuário

        // Verificar se já foi digitado antes
        List<String> materias = (List<String>) session.getAttribute("materias");
        if (materias == null) {
            materias = new ArrayList<>();
        }
        if(materias != null && materias.contains(materia)) {
            out.println("<html><head><title>Matéria já cadastrada</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; background-color: #f4f4f4; }");
            out.println("h1 { text-align: center; color: #333; }");
            out.println("a { display: block; text-align: center; margin-top: 20px; }");
            out.println("</style>");
            out.println("</head><body>");
            out.println("<h1>Matéria já cadastrada anteriormente</h1>");
            out.println("<a href=\"ResultadoServlet\">Ver resultados anteriores</a>");
            out.println("<br>");
            out.println("<a href=\"index.html\">Voltar</a>");
            out.println("</body></html>");
            return;
        }

        // Armazena notas informadas
        double nota1 = Double.parseDouble(request.getParameter("nota1"));
        double nota2 = Double.parseDouble(request.getParameter("nota2"));
        double nota3 = Double.parseDouble(request.getParameter("nota3"));

        // Salva os dados na sessão
        session.setAttribute("materias", materias);
        materias.add(materia);
        session.setAttribute("nota1_" + materia, nota1);
        session.setAttribute("nota2_" + materia, nota2);
        session.setAttribute("nota3_" + materia, nota3);

        // Calculo da media
        double media = (nota1 + nota2 + nota3) / 3;

        // Salva a média na sessão
        session.setAttribute("media_" + materia, media);

        out.println("<html><head><title>Cadastro realizado com sucesso</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background-color: #f4f4f4; }");
        out.println("h1 { text-align: center; color: #333; }");
        out.println("a { display: block; text-align: center; margin-top: 20px; }");
        out.println("</style>");
        out.println("</head><body>");
        out.println("<h1>Cadastro realizado com sucesso</h1>");
        out.println("<a href=\"ResultadoServlet\">Ver resultados</a>");
        out.println("<br>");
        out.println("<a href=\"index.html\">Voltar</a>");
        out.println("</body></html>");
    }
}
