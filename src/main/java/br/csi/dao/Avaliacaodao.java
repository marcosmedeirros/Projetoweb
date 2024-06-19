package br.csi.dao;

import br.csi.model.Avaliacao;
import br.csi.util.ConectDBPostgres;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Avaliacaodao {

    public ArrayList<Avaliacao> getAvaliacoes() {
        ConectDBPostgres cdb = new ConectDBPostgres();
        ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

        try {
            PreparedStatement stmt = cdb.getConecao().prepareStatement("SELECT * FROM avaliacao");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Avaliacao a = new Avaliacao(
                        rs.getInt("idavaliacao"),
                        rs.getInt("idfilme"),
                        rs.getFloat("nota")
                );
                avaliacoes.add(a);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return avaliacoes;
    }


    public boolean cadastrarAvaliacao(Avaliacao avaliacao) {
        try {
            ConectDBPostgres cdb = new ConectDBPostgres();
            PreparedStatement stmt = cdb.getConecao().prepareStatement("INSERT INTO avaliacao (idfilme, nota) VALUES (?, ?)");
            stmt.setInt(1, avaliacao.getIdfilme());
            stmt.setFloat(2, avaliacao.getNota());
            stmt.execute();

            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
