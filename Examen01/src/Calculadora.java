
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author desn2
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int opcion;
        int num1, num2;
        int suma, resta, multiplicacion, division;
        String seguir;
        do {

            System.out.println("-----------CALCULADORA-----------");
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");

            System.out.print("Introduce una opción: ");
            opcion = Integer.parseInt(teclado.nextLine());
            System.out.println("");
            switch (opcion) {
                case 1:
                    System.out.print("Introduce el primer número: ");
                    num1 = Integer.parseInt(teclado.nextLine());
                    System.out.print("Introduce el segundo número: ");
                    num2 = Integer.parseInt(teclado.nextLine());
                    suma = num1 + num2;
                    System.out.println("--RESULTADO--");
                    System.out.printf("%d + %d = %d\n", num1, num2, suma);
                    break;
                case 2:
                    System.out.print("Introduce el primer número: ");
                    num1 = Integer.parseInt(teclado.nextLine());
                    System.out.print("Introduce el segundo número: ");
                    num2 = Integer.parseInt(teclado.nextLine());
                    System.out.println("--RESULTADO--");
                    resta = num1 - num2;
                    System.out.printf("%d - %d = %d\n", num1, num2, resta);
                    break;
                case 3:
                    System.out.print("Introduce el primer número: ");
                    num1 = Integer.parseInt(teclado.nextLine());
                    System.out.print("Introduce el segundo número: ");
                    num2 = Integer.parseInt(teclado.nextLine());
                    System.out.println("--RESULTADO--");
                    multiplicacion = num1 * num2;
                    System.out.printf("%d * %d = %d\n", num1, num2, multiplicacion);
                    break;
                case 4:
                    System.out.print("Introduce el primer número: ");
                    num1 = Integer.parseInt(teclado.nextLine());
                    System.out.print("Introduce el segundo número: ");
                    num2 = Integer.parseInt(teclado.nextLine());
                    division = num1 / num2;
                    System.out.println("--RESULTADO--");
                    System.out.printf("%d / %d = %d\n", num1, num2, division);
                    break;
                case 5:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("\033[31m ERROR OPCIÓN NO VALIDA");

            }
            if (opcion != 5) {
                System.out.print("Pulse INTRO para continuar: ");
                seguir = teclado.nextLine();
            }

            System.out.println("---------------------------------");
        } while (opcion != 5);

    }

}
