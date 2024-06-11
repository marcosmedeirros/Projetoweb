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
    <div class="row">
        <c:forEach var="filme" items="${filmes}">
            <div class="col-md-4">
                <div class="card">
                    <div class="card-header">
                            ${filme.nomefilme}
                    </div>
                    <div class="card-body">
                        <p>${filme.descricao}</p>
                        <a href="filmes?opcao=excluir&idfilme=${filme.idfilme}" class="btn btn-danger">Excluir</a>
                        <form>

                            <div class="dropdown">
                                <button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                                    Dropdown button
                                </button>
                                <ul class="dropdown-menu">


                                    <li><input class="dropdown-item" name value = "1">1</input>></li>
                                    <li><a class="dropdown-item" >2</a></li>
                                    <li><a class="dropdown-item" >3</a></li>
                                </ul>
                            </div>

                        </form>
                        <a href="#" class="btn btn-danger">Avaliar</a>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

<footer class="footer">
    <div class="container">
        <img src="../../imgs/logo.png" alt="Logo">
        <div class="contact-info">
            <p>Contato: (55) 99432-5678<br>Email: traveling@gmail.com</p>
        </div>
        <div class="address-info">
            <p>Endereço: Rua Roraima, 33202<br>Santa Maria RS, 97105-900</p>
        </div>
    </div>
</footer>

</body>
</html>
