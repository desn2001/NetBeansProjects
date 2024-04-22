/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Funciones;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String cadena = "";
        int opcion;

        do {
            System.out.println("*********************************************");
            System.out.printf("     cadena: %s\n", cadena);
            System.out.println("*********************************************");
            System.out.println("1. Introducir nueva cadena");
            System.out.println("2. Capitalizar la cadena");
            System.out.println("3. Sustituir espacios en blanco por _");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.print("Introduce una opción: ");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    cadena = devolverCadena();
                    System.out.println("");
                    break;
                case 2:
                    break;
                case 3:
                    System.out.printf("%s\n",sustituirBlancos(cadena));
                    break;
                case 4:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.printf("\u001B[31m ERROR. Opción introducida invalida.");
            }
        } while (opcion != 4);
    }

    public static String devolverCadena() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una nueva Cadena: ");
        String cadena = teclado.nextLine();
        return cadena;
    }

    public static String sustituirBlancos(String cadena) {
        String sustituto = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                sustituto = sustituto + '_';
            } else {
                sustituto = sustituto + cadena.charAt(i);
            }
        }
        return sustituto;
    }

}
