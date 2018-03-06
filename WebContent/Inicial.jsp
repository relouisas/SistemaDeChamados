<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
	ul{
		list-style-type:none;
		margin:0;
		padding:0;
		overflow:hidden;
		background-color:#333;
	}
	li{
		float:left;
		border-right:1px solid #bbb;
	}
	li: last-child{
	border-right:none;
	}
	li a{
		display:block;
		color:white;
		text-align: center;
		padding:14px 16px;
		text-decoration:none;
	}
	li a:hover:not(.active){
		background-color:#111;
	}
	.active{
		background-color:#4CAF50;
	}
</style>
<body>
<ul>
	<li><a class="active" href="#home"> Home </a></li>
	<li><a href="/CadastroUsuario"> Cadastro </a></li>
	<li><a href="/Login"> Login </a></li>
	<li><a href="#transporte"> Transporte </a></li>
	<li><a href="#eletrica"> Elétrica </a></li>
	<li><a href="#pedreiro"> Pedreiro </a></li>
	<li style="float:right"><a href="#hidraulica"> Hidráulica </a></li>
</ul>
</body>
</html>