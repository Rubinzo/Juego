package org.example;

import java.util.Scanner;

public class Menus {
    private static final Scanner sc = new Scanner(System.in);
    private static final Personaje personaje = new Personaje();

    public void menuPersonaje(){
        System.out.println("Menu Personaje: "+ "\n2. Estadísticas");
        int menu = sc.nextInt();

        switch(menu){
            case 1:
                System.out.println("Estadísticas");
                break;
            case 2:
                personaje.mostrarEstadisticas();
                break;
        }
    }

}
