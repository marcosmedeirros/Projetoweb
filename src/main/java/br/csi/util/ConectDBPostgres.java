package br.csi.util;


import java.sql.*;

public class ConectDBPostgres {
    public Connection getConecao() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projetoweb", "postgres", "1234");
            return conn;
        } catch (ClassNotFoundException e) {
            System.out.println("Problemas no " + e.getMessage());
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}

/*
CREATE TABLE usuario(
	id serial PRIMARY KEY,
	nome varchar(100) NOT NULL,
	email varchar(100) NOT NULL UNIQUE,
	senha varchar(50) NOT NULL,
    admin BOOLEAN DEFAULT false
);

CREATE TABLE filme(
	idfilme serial PRIMARY KEY,
	nomefilme varchar(100) NOT NULL,
	notamedia float,
	imagem varchar(1500)
);

CREATE TABLE avaliacao(
    idavaliacao serial PRIMARY KEY,
    idfilme INT REFERENCES filme(idfilme),
    nota FLOAT
);


INSERT INTO usuario (nome, email, senha)
VALUES ('João Silva', 'joao@yahoo.com', 'senha123');

INSERT INTO usuario (nome, email, senha)
VALUES ('Paulo Andrade', 'paulo@hotmail.com', '123446564');

INSERT INTO usuario (nome, email, senha)
VALUES ('Marcos', 'marcos@gmail.com', 'marcos');

INSERT INTO usuario (nome, email, senha)
VALUES ('Thiago Luz', 'luz@gmail.com', 'thiaguinho');

 */