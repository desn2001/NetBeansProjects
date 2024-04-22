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
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        double notas[] = new double[5];
        double nota = 0;
        double max;
        double min;
        double media=0;

        for (int i = 0; i < notas.length; i++) {

            do {
                System.out.print("Introduce una nota " + (i+1) + ": ");
                nota = Double.parseDouble(teclado.nextLine());
            } while (nota < 0 || nota > 10);

            notas[i] = nota;
        }
        max = notas[0];
        min = 100;
        
        for (int i = 0; i < notas.length; i++) {
            if (max < notas[i]) {
                max = notas[i];
            }
            if (min > notas[i]) {
                min = notas[i];
            }
            media = media +notas[i]/(notas.length);
        }
        System.out.println("");
        System.out.println("La nota máxima es "+max);
        System.out.println("La nota minima es "+min);
        System.out.println("La media de estas notas son "+media);

    }

}
