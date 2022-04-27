package com.company;

public class Obra extends Fitxa{
    public String autor;
    public short nrePags;

    public Obra(String referencia, String titol, String autor, short nrePags) {
        super(referencia, titol);
        this.autor = autor;
        this.nrePags = nrePags;
    }

    public String getAutor() {
        return autor;
    }

    public Short getNrePags() {
        return nrePags;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNrePags(Short nrePags) {
        this.nrePags = nrePags;
    }

    @Override
    void visualizar() {
        System.out.println(autor);
        System.out.println(nrePags);
    }
}
