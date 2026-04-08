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

    public Personaje() {
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

    public void mostrarEstadisticas(){
        String nombre = getNombre();
        double vida =  getVida();
        double proteccion = getProteccion();
        double agilidad = getAgilidad();
        double dinero = getDinero();
        double exp = getExp();
        double nivel = getNivel();
        double daño = getDaño();

        String estadisticas = "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", proteccion=" + proteccion +
                ", agilidad=" + agilidad +
                ", dinero=" + dinero +
                ", exp=" + exp +
                ", nivel=" + nivel +
                ", daño=" + daño +
                '}';
        System.out.println(estadisticas);
    }

    public void iniciarPersonaje(String nombre){
        setNombre(nombre);
        setVida(10);
        setDaño(1);
        setProteccion(0);
        setAgilidad(1);
        setDinero(0);
        setExp(0);
        setNivel(0);
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre = " + nombre + '\'' +
                ", vida = " + vida +
                ", proteccion = " + proteccion +
                ", agilidad = " + agilidad +
                ", dinero = " + dinero +
                ", exp = " + exp +
                ", nivel = " + nivel +
                ", daño = " + daño +
                '}';
    }
}
