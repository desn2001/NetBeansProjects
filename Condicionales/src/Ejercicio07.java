
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        int opcion = 0;

        System.out.print("Introduce el primer número ---> ");
        num1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Introduce el segundo número ---> ");
        num2 = Integer.parseInt(teclado.nextLine());

        System.out.println("------CALCULADORA------");
        System.out.println("1.Sumar");
        System.out.println("2.Dividir");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.print("Introduce una opción: ");
        opcion = Integer.parseInt(teclado.nextLine());
        System.out.println("-----------------------");
        switch (opcion) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
            case 5:
                System.out.println("SALIENDO...");
                break;            
            default:
                System.out.println("ERROR la opción introducida no es valida");
        }

    }

}
