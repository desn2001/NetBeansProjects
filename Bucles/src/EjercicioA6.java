
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class EjercicioA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num = 1;
        int suma = 0;
        int contador = 0;
//        System.out.print("Introduce un número: ");
//        num = Integer.parseInt(teclado.nextLine());
        while (num > 0) {
            System.out.print("Introduce un número[negativo para salir]: ");
            num = Integer.parseInt(teclado.nextLine());
            if (num < 0) {
                break;
            } else {
                suma = num + suma;
                contador++;
            }

        }
        System.out.printf("La suma de los números es %d\n", suma);
        System.out.printf("Total de números %d\n", contador);

    }

}
