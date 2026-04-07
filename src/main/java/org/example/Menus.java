package org.example;

import java.util.Scanner;

public class Menus {
    private static final Scanner sc = new Scanner(System.in);

    public void menuPersonaje(){
        System.out.println("Menu Personaje: "+ "\n1. nada");
        int menu = sc.nextInt();

        switch(menu){
            case 1:
                System.out.println("literalmente nada");
                break;
        }
    }
}
