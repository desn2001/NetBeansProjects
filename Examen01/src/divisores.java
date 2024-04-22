
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author desn2
 */
public class divisores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("CALCULO DE DIVISORES");
        System.out.println("===================================");
        do {
            System.out.print("Dime un número (0 para salir): ");
            num = Integer.parseInt(teclado.nextLine());
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.printf("El número %d es divisor de %d\n", i, num);
                }
            }
            if (num == 0) {
                System.out.println("SALIENDO...");
            }
            System.out.println("");
        } while (num != 0);
        System.out.println("===================================");

    }

}
