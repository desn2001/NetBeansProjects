
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author desn2
 */
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num;
        int contador = 0;
        System.out.print("Introduce un número: ");
        num = Integer.parseInt(teclado.nextLine());
        contador = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.printf("El número %d es divisor de %d\n", i, num);
                contador++;
            }
        }
        if (contador == 2) {
            System.out.printf("El número %d es primo\n", num);
        } else if (contador != 2) {
            System.out.printf("El número %d NO es primo\n", num);
        }
        if (num % 2 == 0) {
            System.out.printf("El número %d Es par\n", num);
        } else {
            System.out.printf("El número %d NO es par\n", num);
        }

    }

}
