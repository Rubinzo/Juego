package org.example;

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