package br.csi.controller;

import br.csi.service.LoginService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("login")
public class LoginServelet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("email");
        String senha = req.getParameter("senha");
        System.out.println(nome + " " + senha);

        if(new LoginService().login(nome, senha)){
            resp.sendRedirect("filmes?page=dash");
        } else {
            RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
            req.setAttribute("erro", "Email ou senha inválidos");
            rd.forward(req, resp);

        }

    }

}
