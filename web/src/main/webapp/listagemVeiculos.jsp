<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="utf-8">
	    <meta name="Autor" content="Lucas Félix">
	    <meta name="Avaliação Web">
	    <meta name="description" content="avaliação 2">
		<title>Inclusão de Veiculos</title>
		<!-- Bootstrap -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
		<link rel="stylesheet" type="text/css" href="estilo/meuEstilo.css">
	</head>
	
	<body>
	<main>
	<h1>Lista de Veículos</h1>
	<section>
	
	<table class="table">
	  <thead>
	    <tr>
	      <th scope="col">#</th>
	      <th scope="col">ID</th>
	      <th scope="col">NOME VEÍCULO</th>
	      <th scope="col">MARCA DO VEÍCULO</th>
	      <th scope="col">DATA CADASTRO</th>
	    </tr>
	  </thead>
	  <tbody>
	  <c:forEach items="${veiculo}" var="atributo">
		    <tr>
		      <th scope="row">></th>
		      <td>${atributo.id}</td>
		      <td>${atributo.nome}</td>
		      <td>${atributo.marca}</td>
		      <td><fmt:formatDate value="${atributo.dataAbertura}" pattern="dd.MM.yy"/></td>
		    </tr>
		</c:forEach>
	  </tbody>
	</table>
	</section>
	<div class="home">
      <a href="/web/index.jsp">home</a>
    </div>
    <div class="home">
      <a href="/web/formVeiculos.jsp">Cadastrar veiculo</a>
    </div>
	</main>
	</body>
</html>
