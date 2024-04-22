/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen_Cuello_02;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[][] datos = {{"Pepe", "Juan", "Marta", "Alicia", "Leo"}, {"30", "35", "35", "20", "18"}};
        System.out.println("Ejercicio03 - Mayores");
        System.out.println("=================================");
        int max;
        String edadPepe = datos[1][0];
        max = Integer.parseInt(edadPepe);
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos.length; j++) {
                if (max <= Integer.parseInt(datos[1][j])) {
                    max = Integer.parseInt(datos[1][j]);
                }
            }
        }
        int contador = 0;
        String nombres[] = new String[5];
        String nombre;
        for (int i = 0; i < datos[1].length; i++) {
            if (max == Integer.parseInt(datos[1][i])) {
                contador++;
                nombre = datos[0][i];
                if (contador < datos[0].length - 1) {
                    nombres[i] = nombre;
                }
            }
        }
        System.out.printf("Hay %d personas de %d años.\n", contador, max);
        for (int i = 0; i < nombres.length - 1; i++) {
            for (int j = 0; j < nombres.length - 1; j++) {
                if (nombres[j] != null) {
                    System.out.print(nombres[i] + " ,");
                }
            }
        }

    }

}
