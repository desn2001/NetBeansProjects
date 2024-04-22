/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Funciones;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class Ejercici08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int lista[] = new int[5];
        int opcion;

        do {
            System.out.println("Manejador de arrays");
            System.out.println("============================");
            System.out.print("Array ---> ");
            imprimirLista(lista);
            System.out.println("============================");
            System.out.println("1. Generar nuevo array");
            System.out.println("2. Obtener máximo y el mínimo");
            System.out.println("3. Obtener la suma");
            System.out.println("4. Salir");
            System.out.print("Introduce una opción: ");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    for (int i = 0; i < lista.length; i++) {
                        lista[i] = aleatorio(-10, 10);
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.printf("Número máxima ---> %d\n", obtener_max(lista));
                    System.out.printf("Número mínimo ---> %d\n", obtener_min(lista));
                    System.out.println("");
                    break;
                case 3:
                    System.out.printf("La suma de nuestro array es ---> %d\n",suma_lista(lista));
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("SALIENDO...");
                    System.out.println("");
                    break;
                default:
                    System.out.printf("\u001B[31m ERROR. Opción introducida invalida\n");
            }
        } while (opcion != 4);

    }

    public static void imprimirLista(int[] lista) {
        System.out.print("|");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + "|");
        }
        System.out.println("");
    }

    public static int aleatorio(int min, int max) {
        int num_aleatorio;

        num_aleatorio = (int) (Math.random() * (max - min + 1) + min);
        return num_aleatorio;
    }

    public static int obtener_max(int[] lista) {
        int max = 0;

        for (int i = 0; i < lista.length; i++) {
            if (max <= lista[i]) {
                max = lista[i];
            }
        }
        return max;
    }

    public static int obtener_min(int[] lista) {
        int min = lista[0];

        for (int i = 0; i < lista.length; i++) {
            if (min > lista[i]) {
                min = lista[i];
            }
        }
        return min;
    }

    public static int suma_lista(int[] lista) {
        int suma = 0;

        for (int i = 0; i < lista.length; i++) {
            suma = suma + lista[i];

        }
        return suma;
    }

}
