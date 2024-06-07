
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página Inicial</title>
    <link rel="stylesheet" href="./style.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body style="position: relative; min-height: 100vh; padding-bottom: 100px;">
<nav class="navbar navbar-expand-lg navbar-custom">
    <div class="container-fluid">
        <img src="../../imgs/logo.png" alt="Logo" width="80" height="80" class="d-inline-block align-text-top">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link" aria-current="page" href="./dashboard.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="filmes">Cadastrar Filmes</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="filmes">Ver Filmes</a>
                </li>
            </ul>
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" href="Usuario">
                        <img src="../../imgs/user.png" alt="Conta" width="30" height="24" class="d-inline-block align-text-top"> Conta
                    </a>
                </li>
            </ul>
        </div>
    </div>
</nav>



<div class="container mt-4 text-center">
    <h2 class="text-center">Cadastrar Usuario</h2>
    <a href="cadastrarusuario.jsp" class="btn btn-dark">Cadastrar Usuario</a>
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

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</body>
</html>

