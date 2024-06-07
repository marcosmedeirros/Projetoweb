<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<jsp:useBean id="dao" class="br.csi.dao.Filmedao"/>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastrar Filmes</title>
    <link rel="stylesheet" href="../../style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
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
</body>
</html>
