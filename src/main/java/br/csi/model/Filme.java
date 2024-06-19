package br.csi.model;

public class Filme {
    public Integer idfilme;
    public String nomefilme;
    public Float notamedia;
    public String imagem;


    public Filme(String nomefilme, String imagem) {
        this.nomefilme = nomefilme;
        this.imagem = imagem;
    }

    public Filme(Integer idfilme, String nomefilme, float notamedia, String imagem) {
        this.idfilme = idfilme;
        this.nomefilme = nomefilme;
        this.notamedia = notamedia;
        this.imagem = imagem;
    }

    public Filme(String nomefilme) {
        this.nomefilme = nomefilme;
    }

    public Integer getIdfilme() {
        return idfilme;
    }

    public void setIdfilme(Integer idfilme) {
        this.idfilme = idfilme;
    }

    public String getNomefilme() {
        return nomefilme;
    }

    public void setNomefilme(String nomefilme) {
        this.nomefilme = nomefilme;
    }

    public Float getNotamedia() {
        return notamedia;
    }

    public void setNotamedia(Float notamedia) {
        this.notamedia = notamedia;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
