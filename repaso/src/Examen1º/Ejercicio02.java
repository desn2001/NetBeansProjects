/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen1º;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double millas;
        double km;
        double r1, r2;
        int opcion;

        do {
            System.out.println("Conversor de medidas");
            System.out.println("====================");
            System.out.println("1. Millas a kilómetros");
            System.out.println("2. Kilómetros a millas");
            System.out.println("3. Salir");
            System.out.println("");
            do {
                System.out.print("Introduce una opción: ");
                opcion = Integer.parseInt(teclado.nextLine());
            } while (opcion < 1 || opcion > 3);
            System.out.println("-------------------------");
            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántas millas?: ");
                    millas = Double.parseDouble(teclado.nextLine());
                    r1 = millas * 1.6093;
                    System.out.printf("  --> %.2f millas son %.2f km\n", millas, r1);
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("¿Cuántas kilómetros?: ");
                    km = Double.parseDouble(teclado.nextLine());
                    r2 = km / 1.6093;
                    System.out.printf("  --> %.2f km son %.2f millas\n", km, r2);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("SALIENDO...");
                    System.out.println("");
                    break;
                default:
                    System.out.println("ERROR. Opción introducida invalida.");
            }
        } while (opcion != 3);

    }

}
