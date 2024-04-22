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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ejercicio01 - Números primos");
        System.out.println("============================");
        System.out.print("Dime el primer número: ");
        num1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Dime el segundo número: ");
        num2 = Integer.parseInt(teclado.nextLine());
        System.out.println("");
        imprimirPrimos(num1, num2);
    }

    public static boolean EsPrimo(int num) {
        boolean primo = true;
        if (num <= 1) {
            primo = false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        return primo;
    }

    public static void imprimirPrimos(int num1, int num2) {
        if (num1 < 0) {
            num1 = (num1 * -1);
        }
        if (num2 < 0) {
            num2 = (num2 * -1);
        }
        if (num1 > num2) {
            System.out.printf("Números primos entre %d y %d:\n", num2, num1);
            for (int i = num2; i <= num1; i++) {
                if (EsPrimo(i)) {
                    System.out.printf("     %-20d\n", i);
                }
            }
        } else {
            System.out.printf("Números primos entre %d y %d:\n", num1, num2);
            for (int i = num1; i <= num2; i++) {
                if (EsPrimo(i)) {
                    System.out.printf("     %-20d\n", i);
                }
            }
        }
    }
}
