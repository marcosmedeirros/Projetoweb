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
    <link rel="stylesheet" href="../../style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container text-center">
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
                <td><a href="filmes?opcao=excluir&idfilme=${filme.idfilme}">Excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
