
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class Ejercicio0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num;
        boolean esPar;
        int resultado;

        System.out.println("---Indicador de números pares e impares---");
        System.out.print("Introduce un número: ");
        num = Integer.parseInt(teclado.nextLine());
        resultado = num % 2;
        if (resultado == 0) {
            esPar = true;
            System.out.println("El número "+num+" es par");
        } else {
            esPar = false;
            System.out.println("El número "+num+" es impar");
        }

    }

}
