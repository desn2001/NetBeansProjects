
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String cadena;
        int contadorB = 0, contadorM = 0;
        System.out.println("-----COMPROBADOR DE NÚMEROS DE LA SUERTE-----");
        System.out.print("Introduce los números a comprobar: ");
        cadena = teclado.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == '2' || caracter == '5' || caracter == '8') {
                contadorB++;
            } else {
                contadorM++;
            }
        }
        System.out.println("--------------------SOLUCIÓN--------------------");
//        System.out.printf("Contador números de la buena suerte[2,5,8]---> %d\n", contadorB);
//        System.out.printf("Contador números de la mala suerte ---> %d\n", contadorM);
        if (contadorB > contadorM) {
            System.out.printf("El número %s es un número de la \033[32m BUENA SUERTE\n", cadena);
        } else {
            System.out.printf("El número %s es un número de la \033[31m MALA SUERTE\n", cadena);
        }

        System.out.println("------------------------------------------------");
    }

}
