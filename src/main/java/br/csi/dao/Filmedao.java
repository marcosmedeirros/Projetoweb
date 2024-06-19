package br.csi.dao;

import br.csi.model.Filme;
import br.csi.util.ConectDBPostgres;

import java.sql.*;
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
                        rs.getString("nomefilme"),
                        rs.getFloat("notamedia"),
                        rs.getString("imagem")
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
            String sql = "INSERT INTO filme (nomefilme, imagem) VALUES ('" + filme.getNomefilme() + "', '" + filme.getImagem() + "')";
            stmt.execute(sql);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean editarFilmes(int idfilme, String nomefilme, String imagem) {
        try {
            Connection cdb = new ConectDBPostgres().getConecao();
            Statement stmt = cdb.createStatement();
            String sql = "UPDATE filme SET nomefilme = '" + nomefilme + "', imagem = '" + imagem + "' WHERE idfilme = " + idfilme;
            stmt.execute(sql);
            System.out.println("SQL: " + sql);
            System.out.println("Filme editado com sucesso!");
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean excluirFilmes(int idfilme) {
        Connection cdb;
        try{

            cdb = new ConectDBPostgres().getConecao();
            String sqlDeleteAvaliacoes = "DELETE FROM avaliacao WHERE idfilme = ?";
            PreparedStatement stmtDeleteAvaliacoes = cdb.prepareStatement(sqlDeleteAvaliacoes);
            stmtDeleteAvaliacoes.setInt(1, idfilme);
            int rowsAffected = stmtDeleteAvaliacoes.executeUpdate();
            System.out.println(rowsAffected + " avaliações excluídas para o filme com id " + idfilme);

            String sqlDeleteFilme = "DELETE FROM filme WHERE idfilme = ?";
            PreparedStatement stmtDeleteFilme = cdb.prepareStatement(sqlDeleteFilme);
            stmtDeleteFilme.setInt(1, idfilme);
            rowsAffected = stmtDeleteFilme.executeUpdate();
            System.out.println("Filme excluído com sucesso!");
            return true;

        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }

    }

    public boolean notamediaFilmes(Integer idfilme) {
        try {
            Connection cdb = new ConectDBPostgres().getConecao();
            Statement stmt = cdb.createStatement();
            String sql = "SELECT AVG(nota) FROM avaliacao WHERE idfilme = " + idfilme;
            stmt.execute(sql);
            System.out.println("SQL: " + sql);
            System.out.println("Nota média calculada com sucesso!");
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean atualizandonotaFilmes(Integer idfilme, Float notamedia) {
        try {
            Connection cdb = new ConectDBPostgres().getConecao();
            Statement stmt = cdb.createStatement();
            String sql = "UPDATE filme f SET notamedia = (" +
                    "  SELECT AVG(a.nota) FROM avaliacao a WHERE a.idfilme = f.idfilme" +
                    ")";
            stmt.execute(sql);
            System.out.println("SQL: " + sql);
            System.out.println("Nota média atualizada com sucesso!");
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }
}
