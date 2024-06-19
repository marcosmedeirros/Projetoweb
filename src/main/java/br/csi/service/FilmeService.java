package br.csi.service;

import br.csi.dao.Filmedao;
import br.csi.dao.Usuariodao;
import br.csi.model.Filme;

import java.util.List;

public class FilmeService {

    public boolean inserirFilmes(String nomefilme, String imagem) {

        return new Filmedao().inserirFilmes(new Filme(nomefilme, imagem));
    }

    public boolean excluirFilmes(int idfilme) {

        return new Filmedao().excluirFilmes(idfilme);
    }

    public List<Filme> listarFilmes() {
        return new Filmedao().getFilmes();
    }

    public boolean atualizandonotaFilmes(Integer id, Float nota) {
        return new Filmedao().atualizandonotaFilmes(id, nota);
    }

    public boolean editarFilmes(int idfilme, String nomefilme, String imagem) {
        return new Filmedao().editarFilmes(idfilme, nomefilme, imagem);
    }


}
