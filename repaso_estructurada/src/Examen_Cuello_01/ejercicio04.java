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
public class ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lado;
        int cuadrado[][];

        System.out.println("Suma de diagonal del cuadrado");
        System.out.println("=============================");
        System.out.print("Tamaño del lado: ");
        lado = Integer.parseInt(teclado.nextLine());
        cuadrado = new int[lado][lado];
        int sum = 0;
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado.length; j++) {
                int num = (int) (Math.random() * 10);
                cuadrado[i][j] = num;
            }
        }

        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado.length; j++) {
                System.out.printf(" %d ", cuadrado[i][j]);
            }
            System.out.println("");
        }

        System.out.println("");
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado.length; j++) {
                if (i == j) {
                    sum = sum + cuadrado[i][j];
                }
            }
        }
        System.out.printf("La suma de la diagonal es: %d\n",sum);
    }

}
