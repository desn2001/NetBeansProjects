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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int numeros[] = new int[10];
        int numero;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número[-1 para salir]: ");
            numero = Integer.parseInt(teclado.nextLine());
            if (numero >= 0) {
                numeros[i] = numero;
            } else {
                break;
            }
        }

        System.out.print("|");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                System.out.printf("%d|", numeros[i]);
            }else{
                break;
            }
        }
        System.out.println("");
    }

}
