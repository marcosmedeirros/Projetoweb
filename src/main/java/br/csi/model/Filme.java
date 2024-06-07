package br.csi.model;

public class Filme {
    public Integer idfilme;
    public String nomefilme;
    public Integer notamedia;


    public Filme(Integer idfilme, String nomefilme) {
        this.idfilme = idfilme;
        this.nomefilme = nomefilme;
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

    public Integer getNotamedia() {
        return notamedia;
    }

    public void setNotamedia(Integer notamedia) {
        this.notamedia = notamedia;
    }
}
