package br.csi.service;

import br.csi.dao.Usuariodao;
import br.csi.model.Usuario;

public class UsuarioService {

    public boolean inserir(Usuario usuario) {

        return new Usuariodao().inserir(usuario);
    }

    public boolean isUsuarioAdmin(Usuario usuario) {
        return usuario.admin();
    }

    public boolean excluir(Usuario usuario) {
        return new Usuariodao().excluir(usuario.getId());

    }


}
