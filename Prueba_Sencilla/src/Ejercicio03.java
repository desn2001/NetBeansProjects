
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author desn2
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("-------------------COMPROBADOR DE NÚMEROS-------------------");
        do {
            System.out.print("Introduce un número[0 para salir]: ");
            num = Integer.parseInt(teclado.nextLine());
            if (num > 0) {
                System.out.printf("El número %d es positivo\n", num);
            } else if (num == 0) {
                System.out.printf("SALIENDO...\n");
            } else {
                System.out.printf("El número %d es negativo\n", num);
            }
        } while (num != 0);
        System.out.println("------------------------------------------------------------");
    }

}
