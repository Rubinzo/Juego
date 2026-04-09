package org.example;

import java.util.Arrays;
import java.util.ArrayList;

public class Enemigos {
    private String nombre;
    private double vida;
    private double proteccion;
    private double agilidad;
    private double daño;
    private static final ArrayList<Enemigos> listaEnemigos = Enemigos.crearEnemigos();

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

    public ArrayList<Enemigos> getListaEnemigos(){
        return this.listaEnemigos;
    }

    public static Enemigos getEnemigo(int nivel){
        return listaEnemigos.get(nivel);
    }

    public static ArrayList<Enemigos> crearEnemigos(){
        ArrayList<Enemigos> listaEnemigos = new ArrayList<>();
        listaEnemigos.add(new Enemigos("Esclavo", 5, 0, 1, 1));
        listaEnemigos.add(new Enemigos("Eloy", 5, 4, 1, 1));
        listaEnemigos.add(new Enemigos("Juanfran", 5, 4, 1, 1));
        listaEnemigos.add(new Enemigos("Esbirro", 5, 4, 1, 1));
        listaEnemigos.add(new Enemigos("Esbirro", 5, 4, 1, 1));
        return listaEnemigos;
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