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
public class numeros_primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int[] listaNumeros = new int[5];
        int num;
        
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.print("Introduce un numero: ");
            num = Integer.parseInt(teclado.nextLine());
            listaNumeros[i]= num;
        }
        System.out.println("Lista Números:");
        System.out.print("|");
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.printf("%d|",listaNumeros[i]);
        }
        System.out.println("");
        
    }
    
}
