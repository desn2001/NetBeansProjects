
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double km, millas, resultado;
        int opcion;
        do {
            System.out.println("CONVERSOR DE MEDIDAS");
            System.out.println("==================================");
            System.out.println("1. Millas a kilómetros");
            System.out.println("2. Kilómetros a millas");
            System.out.println("3. Salir");
            System.out.println("");
            System.out.print("Introduce una opción: ");
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántas millas?: ");
                    millas = Double.parseDouble(teclado.nextLine());
                    resultado = millas * 1.6093;
                    System.out.printf("---> %.2f millas son %.2f km\n", millas, resultado);
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("¿Cuántos kilómetros?: ");
                    km = Double.parseDouble(teclado.nextLine());
                    resultado = km / 1.6093;
                    System.out.printf("---> %.2f km son %.2f millas\n", km, resultado);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("\033[31mERROR opcion no valida");
                    System.out.println("");
            }
        } while (opcion != 3);
    }

}
