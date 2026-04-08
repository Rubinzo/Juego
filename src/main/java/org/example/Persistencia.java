package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Persistencia {

    private final String RUTA = System.getProperty("user.home") + "/Desktop/Juego/";
    private final File estadisticasPersonaje = new File(RUTA + File.separator + "estadisticasPersonaje.txt");

    public void guardar() {
        if (comprobarDirectorio(RUTA)) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(estadisticasPersonaje))) {

                System.out.println("Biblioteca guardada exitosamente");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
    }



    private static boolean comprobarDirectorio(String ruta) {
        if (Utilidades.existDirectory(ruta)) {
            return true;
        } else {
            return Utilidades.crearDirectorio(ruta);
        }
    }
}
