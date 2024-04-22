package Examen1º;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author desn2
 */
public class Ejercicio04v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int lado;
        int cuadrado[][];
        int suma =0;
        
        System.out.println("Suma de diagonal cuadrado");
        System.out.println("===========================");
        System.out.print("Tamaño del lado: ");
        lado = Integer.parseInt(teclado.nextLine());
        cuadrado = new int[lado][lado];
        
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                cuadrado[i][j] = (int)(Math.random()*10);
                System.out.printf("%d   ",cuadrado[i][j]);
                if (j == i) {
                    suma = suma+cuadrado[i][j];
                }
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.printf("La suma de la diagonal es: %d\n",suma);
        
    }
    
}
