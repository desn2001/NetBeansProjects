
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author desn2
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num;
        int acumulador = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un número: ");
            num = Integer.parseInt(teclado.nextLine());
            acumulador = acumulador + num;
        }
        System.out.println("La suma de los 5 números es " + acumulador);

    }

}
