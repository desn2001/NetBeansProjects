/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen2º;

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
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String frase;
        String simbolos[] = {"+", "$", "!", "#"};

        System.out.println("Ejercicio02 - Contraseñas");
        System.out.println("===============================");
        System.out.println("Dime una frase:");
        frase = teclado.nextLine();

        System.out.print("Contraseña generada es: ");
        generarContraseña(frase, simbolos);

    }

    public static void generarContraseña(String frase, String[] simbolos) {
        String palabras[];
        palabras = frase.split(" ");
        char contraseña = ' ';

        //Con esto lo que hacemos es separar las frase en palabras por el metodo split cuando detecte un espacio en blanco 
        for (int i = 0; i < palabras.length; i++) {
            String palabrasMayusculas;
            if (i == 0) {
                palabrasMayusculas = palabras[i].toUpperCase();
            } else {
                palabrasMayusculas = palabras[i].toLowerCase();
            }

            char primeraLetra = palabrasMayusculas.charAt(0);
            contraseña = primeraLetra;
            System.out.print(contraseña);
        }

        for (int i = 0; i < 1; i++) {
            int aleatorio = (int)(Math.random()*simbolos.length+1);
            System.out.print(simbolos[aleatorio]);
        }
        int numAleatorio = (int) (Math.random() * 10);
        System.out.print(numAleatorio);
        System.out.println("");

    }

}
