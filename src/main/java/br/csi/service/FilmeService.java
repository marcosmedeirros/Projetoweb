package br.csi.service;

import br.csi.dao.Filmedao;
import br.csi.dao.Usuariodao;
import br.csi.model.Filme;

import java.util.List;

public class FilmeService {

    public boolean inserirFilmes(Filme filme) {

        return new Filmedao().inserirFilmes(filme);
    }

    public boolean excluirFilmes(Integer id) {
        return new Filmedao().excluirFilmes(id);
    }

    public List<Filme> listarFilmes() {
        return new Filmedao().getFilmes();
    }


}
