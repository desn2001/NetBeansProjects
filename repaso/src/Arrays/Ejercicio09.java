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
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String[] nombres = new String[5];
        int[] edades = new int[5];
        String nombre;
        int edad;
        int edadMayor = 0;
        int edadMenor = 100;

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre del alumno [* para terminar]: ");
            nombre = teclado.nextLine();
            if (nombre.equals("*")) {
                edades[i]=-1;
                break;
            } else {
                System.out.print("edad del alumno: ");
                edad = Integer.parseInt(teclado.nextLine());
                System.out.println("");
                nombres[i] = nombre;
                edades[i] = edad;
            }
        }

        for (int i = 0; i < nombres.length; i++) {
            if (!nombres[i].equals("*")) {
                System.out.printf("%s-----%d\n", nombres[i], edades[i]);
            } else {
                break;
            }
        }
        
        for (int i = 0; i < nombres.length; i++) {
            if (edadMayor < edades[i]) {
                edadMayor = edades[i];
            }
        }
        System.out.println(edadMayor);

    }

}
