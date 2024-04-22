
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num;
        int contador = 0;
        //Para saber que un número es divisible entre otro
        //su division tiene que ser exacta es decir resto 0
        //usaremos la operación modulo.

        System.out.println("    CALCULO DE DIVISORES    ");
        System.out.println("============================");
        do {
            System.out.print("Dime un número (0 para salir): ");
            num = Integer.parseInt(teclado.nextLine());
            contador = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.printf("El número %d es divisor de %d\n", i, num);
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.printf("El número %d es Primo\n", num);
            } else {
                System.out.printf("El número %d es no es Primo\n", num);
            }
            System.out.println("");

        } while (num != 0);
        System.out.println("SALIENDO...");
    }

}
