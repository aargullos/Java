package com.company;

public class Perro {
    public String raza, nombre;
    public Integer edad;

    public Perro (String raza, String nombre, Integer edad){
        this.setRaza(raza);
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    public Integer getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
