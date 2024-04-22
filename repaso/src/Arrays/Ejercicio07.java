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
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String frase = "";
        String[] palabras = {};
        String fecha;
        int dia, mes, año;

        System.out.println("Introduce una fecha[dd/mm/aaaa]: ");
        fecha = teclado.nextLine();
        palabras = fecha.split("/");
        dia = Integer.parseInt(palabras[0]);
        mes = Integer.parseInt(palabras[1]);
        año = Integer.parseInt(palabras[2]);

        System.out.println("Dia ---> "+dia);
        System.out.println("Mes ---> "+mes);
        System.out.println("Año ---> "+año);

//        System.out.print("Introduce una frase: ");
//        frase = teclado.nextLine();
//        palabras = frase.split(" ");
//        
//        System.out.print("|");
//        for (int i = 0; i < palabras.length; i++) {
//            System.out.printf("%s|",palabras[i]);
//        }
//        System.out.println("");
//        System.out.printf("Nuestra frase tiene un total de %d palabras\n",palabras.length);
    }

}
