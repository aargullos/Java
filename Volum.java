package com.company;

public class Volum extends Obra{
    public short nro;

    public Volum(String referencia, String titol, String autor, short nrePags, short nro) {
        super(referencia, titol, autor, nrePags);
        this.nro = nro;
    }

    public short getNro() {
        return nro;
    }

    public void setNro(short nro) {
        this.nro = nro;
    }

    @Override
    void visualizar(){
        System.out.println(nro);
    }

}
