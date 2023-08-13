<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
		<h1 class="pages">CADASTRAR VEÍCULOS</h1>
	</header>
	<main>
		<div class="container">
		    <form action="/web/cadastraVeiculos" method="post">
		      <div class="form-group">
		        <label for="id">ID:</label>
		        <input type="text" id="id" name="id" placeholder="Digite o ID">
		      </div>
		      <div class="form-group">
		        <label for="nome">Nome:</label>
		        <input type="text" id="nome" name="nome" placeholder="Digite o nome">
		      </div>
		      <div class="form-group">
		        <label for="marca">Marca:</label>
		        <input type="text" id="marca" name="marca" placeholder="Digite a marca">
		      </div>
		      <div class="form-group">
		        <button type="submit">Cadastrar</button>
		      </div>
		      <div class="voltar">
      				<a href="/web/listaVeiculos">Lista de Veiculos</a>
      		  </div>	
		    </form>
		</div>
	</main>
</body>
</html>