/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class Ejercicio01 {

    static String[] archivos = new String[50];
    static int contadorArchivos = 0;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //Simulacion de un administrador de archivos por medio de su extension.
        archivos[contadorArchivos++] = "Logo.png";
        archivos[contadorArchivos++] = "Escudo.png";
        archivos[contadorArchivos++] = "Tema01.txt";
        archivos[contadorArchivos++] = "Tema02.txt";
        archivos[contadorArchivos++] = "Tema03.txt";
        int opcion = 0;
        do {
            System.out.println("");
            System.out.println("Ordenador de Archivos");
            System.out.println("===========================");
            System.out.println("1. Mostrar Archivos.");
            System.out.println("2. Mostrar solo archivos de una extensión.");
            System.out.println("3. Añadir un archivo.");
            System.out.println("4. Salir.");
            System.out.println("");
            try {
                System.out.print("Elige una opción: ");
                opcion = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ERROR Introduce un número.");
            }

            switch (opcion) {
                case 1:
                    mostrarArchivos();
                    break;
                case 2:
                    mostrarExtension();
                    break;
                case 3:
                    añadirArchivo();
                    break;
                case 4:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("ERROR Opción no valida.");
            }

        } while (opcion != 4);
        System.out.println("");
    }

    private static void mostrarArchivos() {
        System.out.println("");
        System.out.println("ARCHIVOS");
        System.out.println("==================================================================");
        for (String archivo : archivos) {
            if (archivo != null) {
                System.out.println(archivo+" ");
            }
        }
        System.out.printf("\n==================================================================\n");

    }

    private static void mostrarExtension() {
        String extension;
        int contador = 1;
        System.out.print("Introduce una extesión: ");
        extension = teclado.nextLine();
        System.out.println("");
        System.out.println("==== ARCHIVOS "+extension+" ====");
        for (String archivo : archivos) {
            if (archivo != null && archivo.endsWith(extension)) {
                System.out.println(contador + "-" + archivo + " ");
                contador++;
            }
        }
    }

    private static void añadirArchivo() {
        String a;
        System.out.print("Introduce el nombre del nuevo archivo: ");
        a = teclado.nextLine();
        archivos[contadorArchivos++] = a;
    }

}
