
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int opcion;
        int num1, num2;
        int suma, resta, multiplicacion, division;
        String intro;
        do {

            System.out.println("------CALCULADORA------");
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            do {
                System.out.print("Introduce una opción: ");
                opcion = Integer.parseInt(teclado.nextLine());
                if (opcion < 1 || opcion > 5) {
                    System.out.println("ERROR La opción seleccionada no es valida ");
                    System.out.println("");
                }
            } while (opcion < 1 || opcion > 5);

            switch (opcion) {
                case 1:
                    System.out.println("--SUMA--");
                    System.out.print("Introduce el primer número: ");
                    num1 = Integer.parseInt(teclado.nextLine());
                    System.out.print("Introduce el segundo número: ");
                    num2 = Integer.parseInt(teclado.nextLine());
                    suma = num1 + num2;
                    System.out.printf("La suma de los números %d + %d = %d\n", num1, num2, suma);
                    break;
                case 2:
                    System.out.println("--RESTA--");
                    System.out.print("Introduce el primer número: ");
                    num1 = Integer.parseInt(teclado.nextLine());
                    System.out.print("Introduce el segundo número: ");
                    num2 = Integer.parseInt(teclado.nextLine());
                    resta = num1 - num2;
                    System.out.printf("La resta de los números %d - %d = %d\n", num1, num2, resta);
                    break;
                case 3:
                    System.out.println("--MULTIPLICACIÓN--");
                    System.out.print("Introduce el primer número: ");
                    num1 = Integer.parseInt(teclado.nextLine());
                    System.out.print("Introduce el segundo número: ");
                    num2 = Integer.parseInt(teclado.nextLine());
                    multiplicacion = num1 * num2;
                    System.out.printf("La multiplicación de los números %d * %d = %d\n", num1, num2, multiplicacion);
                    break;
                case 4:
                    System.out.println("--DIVISIÓN--");
                    System.out.print("Introduce el primer número: ");
                    num1 = Integer.parseInt(teclado.nextLine());
                    System.out.print("Introduce el segundo número: ");
                    num2 = Integer.parseInt(teclado.nextLine());
                    division = num1 / num2;
                    System.out.printf("La division de los números %d / %d = %d\n", num1, num2, division);
                    break;
                case 5:
                    System.out.println("\033[33m SALIENDO...");
                    break;
                default:
                    System.out.println("ERROR La opción seleccionada no es valida ");
            }
            if (opcion != 5) {
                System.out.print("Pulse INTRO para continuar:");
                intro = teclado.nextLine();
            }

            System.out.println("-----------------------");

        } while (opcion != 5);
    }

}
