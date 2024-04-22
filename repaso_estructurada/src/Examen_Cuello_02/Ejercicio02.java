/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen_Cuello_02;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;

        System.out.println("Ejercicio02 - Contraseñas");
        System.out.println("=========================");
        System.out.printf("Dime una frase:\n--> ");
        frase = teclado.nextLine();
        generarContraseña(frase);

    }

    private static void generarContraseña(String frase) {
        String palabras[];
        String simbolos[] = {"+", "$", "@", "!", "#"};
        palabras = frase.split(" ");

        System.out.println("");
        System.out.println("");
        System.out.print("Contraseña generada es: ");
        for (int i = 0; i < palabras.length; i++) {
            char palabrasSeparadas;
            if (i == 0) {
                String palabraMayus = palabras[i].toUpperCase();
                palabrasSeparadas = palabraMayus.charAt(i);
            } else {
                palabrasSeparadas = palabras[i].charAt(0);
            }
            System.out.print(palabrasSeparadas);
        }
        String simboloRamdom = "";

        for (String simbolo : simbolos) {
            int coordenada = (int) (Math.random() * simbolos.length);
            simboloRamdom = simbolos[coordenada];
        }
        int numeroRamdom = (int) (Math.random() * 10);
        System.out.println(simboloRamdom + numeroRamdom);
    }

}
