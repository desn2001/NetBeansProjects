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
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String[] alumnos = {"Francisco", "Marcos", "Laura", "Marta", "Pedro"};
        double[] primerTrimestre = {7, 10, 4, 5, 6};
        double[] segundoTrimestre = {4, 10, 10, 5, 5};
        double[] tercerTrimestre = {1, 10, 8, 2, 3};
        int posicion;

        System.out.println("Listado de alumnos");
        System.out.println("*************************");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.printf("%d. %s\n", (i + 1), alumnos[i]);
        }
        double mediaAlumno;
        double p1 = 0, p2 = 0, p3 = 0;

        System.out.println("");
        System.out.print("Dime la posición del alumno a buscar: ");
        posicion = Integer.parseInt(teclado.nextLine());
        for (int i = 0; i < alumnos.length; i++) {
            if (posicion == (i + 1)) {
                mediaAlumno = (primerTrimestre[i] + segundoTrimestre[i] + tercerTrimestre[i]) / 3;
                System.out.printf("La media de %s es %.2f\n", alumnos[i], mediaAlumno);
            }
        }
        System.out.println("---------- medias del grupo ----------");
        System.out.println("");
        for (int i = 0; i < primerTrimestre.length; i++) {
            p1 = (p1 + primerTrimestre[i]);
            p2 = (p2 + segundoTrimestre[i]);
            p3 = (p3 + tercerTrimestre[i]);

        }
        System.out.printf("La media del primer trimestre de todo el grupo es: %.1f\n", p1 / primerTrimestre.length);
        System.out.printf("La media del segundo trimestre de todo el grupo es: %.1f\n", p2 / primerTrimestre.length);
        System.out.printf("La media del tercer trimestre de todo el grupo es: %.1f\n", p3 / primerTrimestre.length);

    }

}
