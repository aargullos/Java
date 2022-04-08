package com.company;

import java.util.Scanner;

public class Main {
    public static final String MSG_NAME = "Introdueix un nom: ";
    public static final String MSG_MARCA = "Introduce la marca del coche: ";
    public static final String MSG_MODELO = "Introduce el modelo del coche: ";
    public static final String MSG_PRECIO = "Introduce el precio del coche: ";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    Alumne alum = new Alumne();
        System.out.println(MSG_NAME);
        alum.setName(sc.next());
        System.out.println(alum.getName());

        coches coche = new coches();
        System.out.println(MSG_MARCA);
        coche.setmarca(sc.next());

        System.out.println(MSG_MODELO);
        coche.setmodelo(sc.next());

        System.out.println(MSG_PRECIO);
        coche.setprecio(sc.nextInt());

        System.out.println(coche.getmarca());
        System.out.println(coche.getmodelo());
        System.out.println(coche.getprecio());
    }
}
