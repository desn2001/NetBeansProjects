
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
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número ---> ");
        num = Integer.parseInt(teclado.nextLine());
        int suma = 0;
        for (int i = 0; i <= num; i++) {
            suma = suma + i;
        }
        System.out.println("----------------------------------------------------------------");
        System.out.printf("La suma de los %d primeros números naturales es %d\n",num,suma );
        System.out.println("----------------------------------------------------------------");

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("----------------------------------------------------------------");
        System.out.printf("El factorial de %d es %d\n",num,factorial);
        System.out.println("----------------------------------------------------------------");

    }

}
