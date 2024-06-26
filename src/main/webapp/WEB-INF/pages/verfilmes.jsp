<%@ page import="br.csi.model.Filme" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<jsp:useBean id="dao" class="br.csi.dao.Filmedao"/>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ver Filmes</title>
    <link rel="stylesheet" href="./style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-custom">
    <div class="container-fluid">
        <img src="imgs/logo.png" alt="Logo" width="80" height="80" class="d-inline-block align-text-top">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link nav-texto-branco" style="color: white;" aria-current="page" href="filmes?page=dash">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" style="color: white;" href="filmes?page=cadastrar">Cadastrar Filmes</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link nav-texto-branco" style="color: white;" href="filmes?page=ver">Ver Filmes</a>
                </li>
            </ul>
        </div>
    </div>
</nav>


<div class="container">
    <h1 class="text-center mt-4">Lista de Filmes</h1>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Nome</th>
            <th>Ações</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="filme" items="${filmes}">
            <tr>
                <td>${filme.nomefilme}</td>
                <td>${filme.notamedia}</td>
                <td>
                    <a href="filmes?opcao=excluir&idfilme=${filme.idfilme}" class="btn btn-danger">Excluir</a>

                    <form action="avaliacao" method="post">
                        <div class="form-group">
                            <input hidden name="idfilme"  value ="${filme.idfilme}">
                            <label for="nota">Nota</label>
                            <input type="number" class="form-control" name="nota" max="5" step="0.1" id="nota" placeholder="Nota">
                        </div>
                        <button type="submit" class = "btn btn-primary">Avaliar</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>


</body>
</html>
