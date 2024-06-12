package br.csi.model;

public class Filme {
    public Integer idfilme;
    public String nomefilme;
    public Float notamedia;


    public Filme(Integer idfilme, String nomefilme, float notamedia) {
        this.idfilme = idfilme;
        this.nomefilme = nomefilme;
        this.notamedia = notamedia;
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
}
