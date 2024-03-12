package Servlet2022;

// auto-import generate
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// imports
import java.io.PrintWriter;


@WebServlet({ "/helloWorld", "/hw" })
public class helloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, 
						HttpServletResponse response) throws ServletException, IOException {
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	
	PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE html>");
    out.println("<html lang=\"en\">");
    out.println("<head>");
    out.println("    <meta charset=\"UTF-8\">");
    out.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
    out.println("    <title>Document</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Hello World!!</h1>");
    out.println("</body>");
    out.println("</html>");
	}
}
