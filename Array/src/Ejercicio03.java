
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
        int notas[] = new int[5];
        int max = 0;
        int min = 0;
        int media;
        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.printf("Dime la %d nota[0-10]: ", i + 1);
                num = Integer.parseInt(teclado.nextLine());
            } while (num < 0 || num > 10);

            notas[i] = num;
        }
        min = notas[0];
        max = notas[0];
        System.out.print("NOTAS --->|");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + "|");

            if (notas[i] < min) {
                min = notas[i];
            } else if (notas[i] > max) {
                max = notas[i];
            }
        }
        System.out.println("");
        System.out.println("MIN ---> " + min);
        System.out.println("MAX ---> " + max);

    }

}
