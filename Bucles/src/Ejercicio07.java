
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String palabra;
        char caracter;

        System.out.println("------DETECTOR DE VOCALES------");
        do {
            System.out.print("Introduce una letra [A-Z] [espacio para salir] : ");
            palabra = teclado.nextLine();
            palabra = palabra.toUpperCase();
            caracter = palabra.charAt(0);
            if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
                System.out.println("Vocal");
            } else if (caracter == ' ') {
                break;
            } else {
                System.out.println("No vocal");
            }

        } while (caracter != ' ');
        System.out.println("");
        System.out.println("SALIENDO...");
        System.out.println("-------------------------------");

    }

}
