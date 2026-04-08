package org.example;

public class Main {

    private static Menus menus = new Menus();
    public static void main(String[] args) {
        Enemigos.crearEnemigos();
        menus.menuPersonaje();
    }

}
