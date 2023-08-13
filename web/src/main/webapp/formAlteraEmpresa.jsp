<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url value="/alteraEmpresa" var="linkServletNovaEmpresa"/>

<!DOCTYPE html>
<html lang="pt-br">

	<head>
		<meta charset="utf-8">
	    <meta name="Autor" content="Lucas Félix">
	    <meta name="Avaliação Web">
	    <meta name="description" content="avaliação 2">
		<link rel="stylesheet" type="text/css" href="estilo/meuEstilo.css">
	</head>
	
<body>
	<header>
	<div class="homeCadastro">
      <a href="/web/index.jsp">home</a>
    </div>
		<h1 class="pages">ALTERAR DADOS</h1>
	</header>
	<main>
		<div class="container">
		    <form action="${linkServletNovaEmpresa}" method="post">
		      <div class="form-group"> 
		        <label for="nome">ALTERAR Nome:</label>
		        <input type="text" id="nome" name="nome" value="${car.nome}">
		      </div>
		      <div class="form-group">
		        <label for="marca">ALTERAR Marca:</label>
		        <input type="text" id="marca" name="marca" value="${car.marca}">
		      </div>
		      <div class="form-group">
		      	<input type="hidden" name="id" value="${car.id}"/>
		        <button type="submit">Alterar</button>
		      </div>
		      <div class="voltar">
      				<a href="/web/listaVeiculos">Lista de Veiculos</a>
      		  </div>	
		    </form>
		</div>
	</main>
</body>
</html>