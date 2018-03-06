<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro</title>
</head>
<body>
	<h1> Cadastro de usuário</h1>
	<form action = "/action_page.php">
		Digite seu nome:<br>
		<input type="text" name="Nome">
		<br>
		Digite seu e-mail:<br>
		<input type="text" name="email">
		<br>
		Vínculo:<br>
		<input type="radio" name="vinculo">Servidor<br>
		<input type="radio" name="vinculo">Docente<br>
		<input type="radio" name="vinculo">Responsável<br>
		Digite sua senha:<br>
		<input type="password" name="senha">
		<br>
		<input type="submit">
		
	</form>
</body>
</html>