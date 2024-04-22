/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int[][] numeros = new int[5][5];
        int sumF = 0;
        int sumC = 0;

        for (int filas = 0; filas < numeros.length; filas++) {
            for (int columnas = 0; columnas < numeros.length; columnas++) {
                numeros[filas][columnas] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println();
            for (int j = 0; j < numeros.length; j++) {
                System.out.print("|" + numeros[i][j]);
            }
            System.out.print("|");
        }
        System.out.println("");

        System.out.println("");

        //Calculamos la suma de las filas.
        for (int i = 0; i < numeros.length; i++) {
            sumF = 0;
            for (int j = 0; j < numeros.length; j++) {
                sumF = sumF + numeros[i][j];
            }
            System.out.printf("Suma de fila %d:%d\n", i + 1, sumF);
        }
        
        System.out.println("");
        //Calculamos la suma de las columnas.
        for (int i = 0; i < numeros.length; i++) {
            sumC = 0;
            for (int j = 0; j < numeros.length; j++) {
                sumC = sumC + numeros[j][i];
            }
            System.out.printf("Suma de columna %d:%d\n", i + 1, sumC);
        }
    }

}
