package org.example;

import java.io.*;
import java.util.Scanner;

public class Menus {
    private static final MyScanner sc = new MyScanner();
    private static final Personaje personaje = new Personaje();

    public void menuPersonaje(){
        boolean salir = false;
        while (salir == false){
            System.out.println("======Menu Personaje======"+ "\n1. Iniciar Personaje"  + "\n2. Estadísticas" + "\n3. Siguiente Nivel" + "\n4. Salir" + "\n===============");
            int menu = sc.pedirNumero();

            switch(menu){
                case 1:
                    personaje.guardarEstadisticas();
                    personaje.mostrarEstadisticas();
                    personaje.iniciarPersonaje("Rubin");
                    personaje.mostrarEstadisticas();
                    break;
                case 2:
                    personaje.mostrarEstadisticas();
                    break;
                case 3:
                    Personaje.siguienteNivel();
                    break;
                case 4:
                    salir = true;
                    break;
            }
        }

    }



}
