package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyScanner {
    private static Scanner sc;
    private static Colores color = new Colores();
    public MyScanner() {
        sc = new Scanner(System.in);
    }

    //Le he quitado el mensaje
    public int pedirNumero() {
        int n = -1;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println();
                n = sc.nextInt();
                sc.nextLine();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Eso no es número!");
                sc.nextLine();
            }
        }
        return n;
    }
    //Añadido por mi
    public int pedirNumeroConTexto(String mns) {
        int n = -1;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println(mns);
                n = sc.nextInt();
                sc.nextLine();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Eso no es número!");
                sc.nextLine();
            }
        }
        return n;
    }

    public String pedirSoloTexto(String texto) {
        String input;
        boolean valido;
        do {
            System.out.println(texto);
            input = sc.nextLine().trim();
            valido = input.matches("[a-zA-ZáéíóúüÁÉÍÓÚÜñÑ ]+");
            if (!valido) {
                System.out.println("ERROR: solo se permiten letras (sin números ni símbolos). Inténtalo de nuevo.");
            }
        }  while (!valido);
        return input;
    }

    public char pedirLetra(String texto) {
        String input;
        boolean valido;
        do {
            System.out.println(texto);
            input = sc.nextLine().trim();
            valido = input.matches("[a-zA-ZáéíóúüÁÉÍÓÚÜñÑ ]");
            if (!valido) {
                System.out.println("ERROR: solo se permite introducir una letra. Inténtalo de nuevo.");
            }
        }while (!valido);

        return input.charAt(0);
    }

    public String pideTexto(String mensaje) {
        String texto;
        do {
            System.out.println(mensaje);
            texto = sc.nextLine();
            if (texto.isEmpty()) {
                System.out.println("Error: el campo no puede estar vacio.");
            }
        } while (texto.isEmpty());
        return texto;
    }

    //Añadidos por mi
    public void tiempo(int tiempo) {
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    public void enter_continuar() {
        System.out.println(color.grey +"Pulse ENTER para volver al menu"+ color.reset);
        sc.nextLine();
    }
    public String enter_mensaje(String mensaje) {
        System.out.println(mensaje);
        sc.nextLine();
        return mensaje;
    }
//------------------------------------------------------------------------------------------------------
}
