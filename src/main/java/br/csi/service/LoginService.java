package br.csi.service;

import br.csi.dao.Usuariodao;

public class LoginService {
    public boolean login(String email, String senha) {
        Usuariodao userdao = new Usuariodao();
        return userdao.autenticarUsuario(email, senha);
    }
}
