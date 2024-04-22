/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen1º;

/**
 *
 * @author desn2
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[10];
        int num;

        System.out.println("Array números:");
        for (int i = 0; i < array.length; i++) {
            num = (int) (Math.random() * 9);
            array[i] = num;
            System.out.print("|" + array[i]);
        }

        int min = array[0];
        int sumaPares = 0;
        boolean aparece5 = false;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (array[i] % 2 == 0) {
                sumaPares = sumaPares + array[i];
            }
            if (array[i] == 5) {
                aparece5 = true;
            }
        }

        System.out.print("|");
        System.out.println("");
        System.out.printf("Minimo: %d\n", min);
        System.out.printf("Suma de pares: %d\n", sumaPares);
        if (aparece5 == false) {
            System.out.println("¿Aparece el 5?: No");
        } else {
            System.out.println("¿Aparece el 5?: Sí" );

        }
    }

}
