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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        String alumnos[] = {"Juan", "Celia", "Alfredo", "Maria", "Pedro"};
        double[][] notas = {{5, 6, 7, 0}, {4, 2, 7, 0}, {6, 8, 9, 0}, {10, 8, 9, 0}, {4, 2, 4, 0}};
        int[] suspensos = new int[3];

        System.out.println("        EVA1  EVA2  EVA3  MEDIA");
        System.out.println("--------------------------------");
        //Con este bucle imprimimos los nombres
//        for (int i = 0; i < alumnos.length; i++) {
//            System.out.printf("%-4s\n",alumnos[i]);
//        }

        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media = 0;
            for (int j = 0; j < notas[j].length; j++) {
                media = (notas[i][j] + media);
            }
            media = media / 3;
            notas[i][3] = media;

        }

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%-7s ", alumnos[i]);
            for (int j = 0; j < notas[j].length; j++) {
                System.out.printf("%5.1f", notas[i][j]);
            }
            System.out.println("");
        }
        System.out.println("--------------------------------");
        System.out.print("Suspen:");

        for (int i = 0; i < notas[i].length - 1; i++) {
            int contador = 0;
            for (int j = 0; j < notas.length; j++) {
                if (notas[j][i] < 5) {
                    contador++;
                    suspensos[i] = contador;
                }
            }
            System.out.printf("%5d", suspensos[i]);
        }
        System.out.println("");
        double acumulador=0;
        String nombre = "";
        for (int i = 0; i < notas[i].length; i++) {
            for (int j = 0; j < notas[j].length; j++) {
                media = notas[i][3];
                if (acumulador <= media) {
                    acumulador = media;
                    nombre = alumnos[i];
                }
            }
        }
        System.out.printf("El alumno de mayor media es %s con una media de: %.1f\n",nombre,acumulador);
    }

}
