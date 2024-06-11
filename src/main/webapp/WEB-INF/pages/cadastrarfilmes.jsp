<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<jsp:useBean id="dao" class="br.csi.dao.Filmedao"/>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastrar Filmes</title>
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
                    <a class="nav-link" href="filmes?page=cadastrar">Cadastrar Filmes</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link nav-texto-branco" style="color: white;" href="filmes?page=ver">Ver Filmes</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<h1 class="text-center mt-4">Cadastrar Filmes</h1>
<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <div class="card-body">
                    <form action="filmes" method="POST">
                        <div class="form-group">
                            <label for="nomefilme">Nome</label>
                            <input type="text" class="form-control" name="nomefilme" id="nomefilme" placeholder="Nome do Filme">
                        </div>
                        <div class="text-center">
                            <button type="submit" class="btn btn-primary">Cadastrar</button>
                        </div>
                        <c:if test="${not empty retornofilme}">
                            <div class="alert alert-dark text-center mt-4" role="alert">
                                <h3>${retornofilme}</h3>
                            </div>
                        </c:if>
                    </form>
                </div>
            </div>
        </div>
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
