package Arrays;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author desn2
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int listaNumeros[] = new int[5];
        Scanner teclado = new Scanner(System.in);
        int num = 0;

        //Pedimos los numeros
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.printf("Introduce el número %d: ", i);
            num = Integer.parseInt(teclado.nextLine());
            listaNumeros[i] = num;
        }

        //Imprimimos nuestra lista
        System.out.println("ARRAY DE NUMEROS");
        System.out.println("---------------------------------------");
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.printf("numeros[%d] %10d\n", i, listaNumeros[i]);
        }
        System.out.println("");
        System.out.print("Array --- ");

        for (int i = 0; i < listaNumeros.length-1; i++) {
            System.out.print("["+listaNumeros[i]+"|");
        }
        System.out.print(listaNumeros[listaNumeros.length-1]+"]");
    }

}
