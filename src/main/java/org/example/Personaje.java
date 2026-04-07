package org.example;

public class Personaje {
    private String nombre;
    private double vida;
    private double proteccion;
    private double agilidad;
    private double dinero;
    private double exp;
    private double nivel;
    private double daño;

    public Personaje(String nombre, double vida, double proteccion, double agilidad, double dinero, double exp, double nivel, double daño) {
        this.nombre = nombre;
        this.vida = vida;
        this.proteccion = proteccion;
        this.agilidad = agilidad;
        this.dinero = dinero;
        this.exp = exp;
        this.nivel = nivel;
        this.daño = daño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getProteccion() {
        return proteccion;
    }

    public void setProteccion(double proteccion) {
        this.proteccion = proteccion;
    }

    public double getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(double agilidad) {
        this.agilidad = agilidad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public double getNivel() {
        return nivel;
    }

    public void setNivel(double nivel) {
        this.nivel = nivel;
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(double daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", proteccion=" + proteccion +
                ", agilidad=" + agilidad +
                ", dinero=" + dinero +
                ", exp=" + exp +
                ", nivel=" + nivel +
                ", daño=" + daño +
                '}';
    }
}
