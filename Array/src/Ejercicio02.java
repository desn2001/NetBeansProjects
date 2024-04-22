
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

        int[] lista = new int[5];
        int num;

        System.out.println("ARRAY DE NÚMEROS");
        System.out.println("-----------------------");
        for (int i = 0; i < lista.length; i++) {
            System.out.print("Introduce un número: ");
            num = Integer.parseInt(teclado.nextLine());
            lista[i] = num;
        }
        System.out.println("");
        for (int i = 0; i < lista.length; i++) {
            System.out.printf("números [%d] %10d\n", i, lista[i]);
        }
    }

}
