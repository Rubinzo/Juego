package org.example;

public class Colores {

    String red = "\u001B[31m";
    String blue = "\u001B[34m";
    String green = "\u001B[32m";
    String cyan = "\u001B[36m";
    String purple = "\u001B[35m";
    String grey = "\u001B[37m";
    String yellow = "\u001B[33m";
    String reset = "\u001B[0m";


    public Colores() {
        this.red = red;
        this.blue = blue;
        this.green = green;
        this.cyan = cyan;
        this.grey = grey;
        this.reset = reset;
        this.purple = purple;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public String getBlue() {
        return blue;
    }

    public void setBlue(String blue) {
        this.blue = blue;
    }

    public String getGreen() {
        return green;
    }

    public void setGreen(String green) {
        this.green = green;
    }

    public String getCyan() {
        return cyan;
    }

    public void setCyan(String cyan) {
        this.cyan = cyan;
    }

    public String getGrey() {
        return grey;
    }

    public void setGrey(String grey) {
        this.grey = grey;
    }

    public String getReset() {
        return reset;
    }

    public void setReset(String reset) {
        this.reset = reset;
    }
}
