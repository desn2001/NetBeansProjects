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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []num={6,5,4,3,2};
        boolean esCreciente = true;
        boolean esDecreciente = true;
        boolean sonIguales = true;

        for (int i = 0; i < num.length - 1; i++) {

            if (num[i] != num[i + 1]) {
                sonIguales = false;
            }
            if (num[i] > num[i + 1]) {
                esCreciente = false;
            }
            if (num[i] < num[i + 1]) {
                esDecreciente = false;
            }

        }

        if (sonIguales) {
            System.out.println("Son todos IGUALES");
        } else if (esCreciente) {
            System.out.println("El array es CRECIENTE");
        } else if (esDecreciente) {
            System.out.println("El array es DECRECIENTE");
        } else {
            System.out.println("El array esta DESORDENADO");
        }

    }

}
