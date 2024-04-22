/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen_Cuello_01;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class ejercicio02 {

    private static Scanner teclado = new Scanner(System.in);
    private static double millas, km;

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("Conversor de medidas");
            System.out.println("=================================");
            System.out.println("1. Millas a kilómetros");
            System.out.println("2. Kilómetros a millas");
            System.out.println("3. Salir");
            System.out.println("");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(teclado.nextLine());
            System.out.println("-------------------------------------");
            switch (opcion) {
                case 1:
                    millas_a_km();
                    System.out.println("");
                    break;
                case 2:
                    km_a_millas();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("SALIENDO...");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 3);
    }

    private static void millas_a_km() {
        System.out.print("¿Cuántas millas?: ");
        millas = Integer.parseInt(teclado.nextLine());

        double resultado = millas * 1.6093;
        System.out.printf(" --> %.0f millas son %.2f km\n", millas, resultado);
    }

    private static void km_a_millas() {
        System.out.print("¿Cuántos km?: ");
        km = Double.parseDouble(teclado.nextLine());

        double resultado = km / 1.6093;
        System.out.printf(" --> %.0f km son %.2f millas\n", km, resultado);
    }

}
