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
public class ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double base, exponente;
        double resultado = 1;

        System.out.println("Ejercicio03 - Calculo de potencia");
        System.out.println("=================================");
        System.out.print("Dime la base: ");
        base = Integer.parseInt(teclado.nextLine());
        System.out.print("Dime el exponente: ");
        exponente = Integer.parseInt(teclado.nextLine());

        if (exponente > 0) {
            for (int i = 1; i <= exponente; i++) {
                resultado = resultado * base;
            }
            System.out.println("");
            System.out.printf("%.0f elevado a %.0f es %.4f\n", base, exponente, resultado);
        } else if (exponente == 0) {
            resultado = 1;
            System.out.println("");
            System.out.printf("%.0f elevado a %.0f es %.4f\n", base, exponente, resultado);
        } else if (exponente < 0) {
            exponente = exponente * -1;
            for (int i = 1; i <= exponente; i++) {
                resultado = resultado * base;
            }
            resultado = 1 / resultado;
            System.out.println("");
            System.out.printf("%.0f elevado a -%.0f es %.4f\n", base, exponente, resultado);

        }
    }
}
