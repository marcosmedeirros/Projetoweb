package br.csi.dao;

import br.csi.model.Filme;
import br.csi.util.ConectDBPostgres;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Filmedao {
    public ArrayList<Filme> getFilmes() {
        ConectDBPostgres cdb = new ConectDBPostgres();
        ArrayList<Filme> filmes = new ArrayList<>();

        try {
            Statement stmt = cdb.getConecao().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM filme");
            while (rs.next()) {
                Filme f = new Filme(
                        rs.getInt("idfilme"),
                        rs.getString("nomefilme")
                );
                filmes.add(f);
            }
        } catch (SQLException e) {

        }
        return filmes;
    }


    public boolean inserirFilmes(Filme filme) {
        try {
            Connection cdb = new ConectDBPostgres().getConecao();
            Statement stmt = cdb.createStatement();
            String sql = "INSERT INTO filme (nomefilme) " +
                    "VALUES ('" + filme.getNomefilme() + "')";
            stmt.execute(sql);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean excluirFilmes(Integer idfilme) {
        try {
            Connection cdb = new ConectDBPostgres().getConecao();
            Statement stmt = cdb.createStatement();
            String sql = "DELETE FROM filme WHERE idfilme = " + idfilme;
            stmt.execute(sql);
            System.out.println("SQL: " + sql);
            System.out.println("Filme excluído com sucesso!");
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }
}
