package com.company;

abstract class Fitxa {
    public String referencia;
    public String titol;

    public Fitxa (String referencia, String titol){
        this.setReferencia(referencia);
        this.setTitol(titol);
    }
    abstract void visualizar();

    public String getReferencia() {
        return referencia;
    }
    public String getTitol() {
        return titol;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public void setTitol(String titol) {
        this.titol = titol;
    }
}
