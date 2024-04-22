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
public class ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Array basico
        Scanner teclado = new Scanner(System.in);

        int lista[] = new int[10];

        //Añadimos los digitos que seran numeros entre 1 y 9 usando un bucle
        for (int i = 0; i < lista.length; i++) {
            int digito = (int) (Math.random() * 9 + 1);
            lista[i] = digito;
        }

        //Imprimimos el array de manera que nos pide el ejercicio
        System.out.println("Array números:");
        for (int i = 0; i < lista.length; i++) {
            System.out.print("|");
            System.out.print(lista[i]);
        }
        System.out.print("|");
        System.out.println("");

        //calculamos el min
        int min = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (min >= lista[i]) {
                min = lista[i];
            }
        }
        System.out.printf("Mínimo: %d\n", min);

        //Calculamos la suma de los numeros pares
        int suma = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                suma = suma + lista[i];
            }
        }
        System.out.printf("Suma pares: %d\n", suma);

        //Comprobamos si tiene el numero 5
        boolean tiene5 = false;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == 5) {
                tiene5 = true;
            }
        }

        if (tiene5 == true) {
            System.out.println("¿Aparece el 5? Si");
        } else {
            System.out.println("¿Aparece el 5? No");
        }

    }

}
