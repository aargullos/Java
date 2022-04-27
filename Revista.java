package com.company;

public class Revista extends Fitxa{
    public short any;
    public short nro;

    public Revista(String referencia, String titol, short any, short nro) {
        super(referencia, titol);
        this.any = any;
        this.nro = nro;
    }

    public short getAny() {
        return any;
    }

    public short getNro() {
        return nro;
    }

    public void setAny(short any) {
        this.any = any;
    }

    public void setNro(short nro) {
        this.nro = nro;
    }

    @Override
    void visualizar(){
        System.out.println("Año : " + any);
        System.out.println(nro);
    }
}
