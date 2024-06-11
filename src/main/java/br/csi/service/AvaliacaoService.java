package br.csi.service;

import br.csi.model.Avaliacao;
import br.csi.dao.Avaliacaodao;

public class AvaliacaoService {

    private Avaliacaodao avaliacaodao = new Avaliacaodao();

    public void cadastrarAvaliacao(Avaliacao avaliacao) {
        avaliacaodao.cadastrarAvaliacao(avaliacao);
    }
}
