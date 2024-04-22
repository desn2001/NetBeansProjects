
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
        Scanner teclado = new Scanner(System.in);
        int opcion;
        double millas, km;
        double resultado;
        do {

            System.out.println("CONVERSOR DE MEDIDAS");
            System.out.println("================================");
            System.out.println("1- Millas a kilómetros");
            System.out.println("2- Kilómetros a millas");
            System.out.println("3- Salir");
            System.out.println("");
            do {
                System.out.print("Introduce una opción: ");
                opcion = Integer.parseInt(teclado.nextLine());
            } while (opcion<0||opcion>4);
            System.out.println("=================================");

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántas millas?: ");
                    millas = Double.parseDouble(teclado.nextLine());
                    resultado = millas * 1.609;
                    System.out.printf("-->%.2f\n", resultado);
                    break;
                case 2:
                    System.out.print("¿Cuántos km?: ");
                    km = Double.parseDouble(teclado.nextLine());
                    resultado = km / 1.609;
                    System.out.printf("-->%.2f\n", resultado);
                    break;
                case 3:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("ERROR Opción introducida no valida");
                    System.out.println("");
            }
        } while (opcion != 3);
    }

}
