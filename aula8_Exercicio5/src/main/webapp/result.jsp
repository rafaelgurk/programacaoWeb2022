<!-- Caso registro ocorra, direciona para esta tela -->
<%@ page
    language="java" 
    contentType="text/html; 
    charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Resultado</title>
</head>
<body>
    <h1>Resultado</h1>
    <%
        boolean isCalculated = (Boolean) request.getAttribute("isCalculated");
    	
    	if(isCalculated) {
    		String disciplina = (String) request.getAttribute("disciplina");
    		double nota1 = (Double) request.getAttribute("nota1");
    		double nota2 = (Double) request.getAttribute("nota2");
    		double nota3 = (Double) request.getAttribute("nota3");
    		double media = (Double) request.getAttribute("media");
    %> 
    		<p>
                Disciplina atual: <%= disciplina %> 
                <br>  
                media: <%= media %>
            </p>
            <p>Notas</p>
            <ul>
                <li>
                    <p><%= nota1%></p>
                </li>
                <li>
                    <p><%= nota2%></p>
                </li>
                <li>
                    <p><%= nota3%></p>
                </li>
            </ul>
    <%
    	} else {
    %>
            <p>A media ainda nao foi calculada, informe as notas antes!</p>
    <%
        }
    %>

    <p><a href="index.jsp">Voltar</a></p>
</body>
</html>