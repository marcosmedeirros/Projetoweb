package br.csi.util;

import br.csi.dao.Usuariodao;
import br.csi.model.Usuario;

import java.util.ArrayList;

public class Testes {

    public static void main(String[] args){

        Usuariodao dao = new Usuariodao();
        ArrayList<Usuario> usuarios = dao.getUsuarios();
        for (Usuario u : usuarios){
            System.out.println("ID " + u.getId() + " Nome " + u.getNome());
        };

    }
}
