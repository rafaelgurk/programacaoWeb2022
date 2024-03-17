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
    <title>Media</title>
</head>

<body>
    <h2>Informe as notas e disciplina</h2>
    <form action="CalculaMediaServlet" method="post">
        <p>
            <label for="disciplina">disciplina: </label>
            <input type="text" name="disciplina" id="disciplina">
        </p>
        <p>
            <label for="nota1">Nota: </label>
            <input type="number" name="nota1" id="nota1" min="0" max="10" step="0.1" required>
        </p>
        <p>
            <label for="nota2">Nota: </label>
            <input type="number" name="nota2" id="nota2" min="0" max="10" step="0.1" required>
        </p>
        <p>
            <label for="nota3">Nota: </label>
            <input type="number" name="nota3" id="nota3" min="0" max="10" step="0.1" required>
        </p>

        <input type="submit" value="Calcular media">
        <input type="reset" value="Limpar">
    </form>
</body>

</html>