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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int lado = 0;
        int sumaDiagonal = 0;

        System.out.println("Suma de diagonal cuadrado");
        System.out.println("===============================");
        System.out.print("Tamaño del lado: ");
        lado = Integer.parseInt(teclado.nextLine());
        int cuadrado[][] = new int[lado][lado];
        System.out.println("");
        System.out.println("Cuadrado generado");
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                int numAleatorio = (int) (Math.random() * 10);
                cuadrado[i][j] = numAleatorio;
                System.out.printf("%d  ",cuadrado[i][j]);
                if (i == j) {
                    sumaDiagonal = sumaDiagonal + cuadrado[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Suma de la diagonal: " + sumaDiagonal);
    }

}
