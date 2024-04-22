/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author diego.sanchez
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int[] lista = new int[10];
        int min = 100;
        int pares = 0;
        boolean aparece5 = false;
        System.out.println("Array números:");
        System.out.print("|");
        for (int i = 0; i < lista.length; i++) {
            num = (int) (Math.random() * 9 + 1);
            lista[i] = num;

            if (lista[i] < min) {
                min = lista[i];
            } else if (lista[i] % 2 == 0) {
                pares = lista[i] + pares;
            }

            System.out.print(lista[i] + "|");

        }
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == 5) {
                aparece5 = true;
            }else{
                aparece5 = false;
            }
        }
        System.out.println("");
        System.out.println("Minimo: " + min);
        System.out.println("Suma pares: " + pares);
        if (aparece5 = true) {
            System.out.println("¿Aparece el 5?: SI");
        }
        else {
            System.out.println("¿Aparece el 5?: NO");
        }
    }

}
