package org.example;

import java.io.*;
import java.util.Scanner;

public class Menus {
    private static final MyScanner sc = new MyScanner();
    private static final Personaje personaje = new Personaje();

    public void menuPersonaje(){
        System.out.println("======Menu Personaje======"+ "\n1. Iniciar Personaje"  + "\n2. Estadísticas" + "\n===============");
        int menu = sc.pedirNumero();

        switch(menu){
            case 1:
                personaje.guardarEstadisticas();
                personaje.mostrarEstadisticas();
                personaje.iniciarPersonaje("asd");
                personaje.mostrarEstadisticas();
                break;
            case 2:
                personaje.mostrarEstadisticas();
                break;
            case 3:



        }
    }



}
