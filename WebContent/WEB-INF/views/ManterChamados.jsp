<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a:import url="../Inicial.jsp"></a:import>

  	<h1>Lista de Chamados</h1>
  
 	<table>
 	<table border="1">
  		<tr>
  			<th>ID</th>
  			<th>Nome</th>
  			<th>Email</th>
  			<th>Mensagem</th>
  		</tr>
 
  		<a:forEach var="usuario" items="${usuario}">
 
  			<tr>
  				<td>${usuario.id}</td>
  				<td>${usuario.nome }</td>
  				<td>${usuario.email }</td>
  				<td>${mensagem.mensagem }</td>
 
 				<td><a href="mvc?logica=RemoverUsuario&id=${usuario.id}">Remover</a></td>	
 				<td><a href="/SistemaDeChamados/usuario/remover?id=${usuario.id}">Remover</a></td>
 		
  		</a:forEach>
  
  	</table>
</body>
</html>