package org.example;

import java.util.Arrays;

public class Enemigos {
    private String nombre;
    private double vida;
    private double proteccion;
    private double agilidad;
    private double daño;

    public Enemigos(String nombre, double vida, double proteccion, double agilidad, double daño){
        this.nombre = nombre;
        this.vida = vida;
        this.proteccion = proteccion;
        this.agilidad = agilidad;
        this.daño = daño;
    }

    public double getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(double agilidad) {
        this.agilidad = agilidad;
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(double daño) {
        this.daño = daño;
    }

    public double getProteccion() {
        return proteccion;
    }

    public void setProteccion(double proteccion) {
        this.proteccion = proteccion;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Enemigos[] crearEnemigos(){
        int n = 10;
        Enemigos En0 = new Enemigos("Esclavo", 5, 0, 1, 1);
        Enemigos En1 = new Enemigos("Esbirro", 5, 4, 1, 1);
        Enemigos En2 = new Enemigos("Esbirro", 5, 4, 1, 1);
        Enemigos En3 = new Enemigos("Esbirro", 5, 4, 1, 1);
        Enemigos En4 = new Enemigos("Esbirro", 5, 4, 1, 1);
        Enemigos En5 = new Enemigos("Esbirro", 5, 4, 1, 1);
        Enemigos[] listaEnemigos = new Enemigos[n];
        listaEnemigos[0] = En0;
        listaEnemigos[1] = En1;
        listaEnemigos[2] = En2;
        listaEnemigos[3] = En3;
        listaEnemigos[4] = En4;
        listaEnemigos[5] = En5;
        return listaEnemigos;
    }

    //solo estoy utilizando siguienteNivel() para hacer pruebas por ahora
    public static void siguienteNivel(){
        Enemigos[] enemigosCreados = crearEnemigos();
        System.out.println(Arrays.toString(enemigosCreados));
    }

    @Override
    public String toString() {
        return "Enemigos{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", proteccion=" + proteccion +
                ", agilidad=" + agilidad +
                ", daño=" + daño +
                '}';
    }
}
/*
Enemigo En1 = new Enemigo(Esclavo, 5, 0, 1, 1);
Enemigo En2 = new Enemigo(Esbirro, 5, 0, 4, 1);
 */