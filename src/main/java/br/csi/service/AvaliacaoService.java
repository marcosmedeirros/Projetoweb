package br.csi.service;

import br.csi.dao.Filmedao;
import br.csi.model.Avaliacao;
import br.csi.dao.Avaliacaodao;

public class AvaliacaoService {

    private Avaliacaodao avaliacaodao = new Avaliacaodao();
    private Filmedao filmedao = new Filmedao();

    public void cadastrarAvaliacao(Avaliacao avaliacao) {
        avaliacaodao.cadastrarAvaliacao(avaliacao);
        filmedao.atualizandonotaFilmes(avaliacao.getIdfilme(), avaliacao.getNota());
    }
}
