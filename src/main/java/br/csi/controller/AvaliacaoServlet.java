package br.csi.controller;

import br.csi.model.Avaliacao;
import br.csi.service.AvaliacaoService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("avaliacao")
public class AvaliacaoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            int idFilme = Integer.parseInt(request.getParameter("idfilme"));
            float nota = Float.parseFloat(request.getParameter("nota"));

        System.out.println("caraio" + idFilme + " " + nota);

            Avaliacao avaliacao = new Avaliacao(idFilme, nota);
            AvaliacaoService avaliacaoService = new AvaliacaoService();
            avaliacaoService.cadastrarAvaliacao(avaliacao);
            response.sendRedirect("filmes?page=ver");
        }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Chamou o GET DA AVALIACAO");
        String opcao = req.getParameter("opcao");

        if (opcao != null && opcao.equals("avaliar")) {
            Integer idfilme = Integer.parseInt(req.getParameter("idfilme"));
            Float nota = Float.parseFloat(req.getParameter("nota"));
            System.out.println("ID: " + idfilme + " Nota: " + nota);
            new AvaliacaoService().cadastrarAvaliacao(new Avaliacao(idfilme, nota));
            resp.sendRedirect("filmes?page=ver");
        }

    }
}

