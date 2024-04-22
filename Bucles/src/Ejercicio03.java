
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num;
        int contador = -1;
        int acumulador = 0;
        do {
            System.out.print("Introduce un número[0 para salir] ---> ");
            num = Integer.parseInt(teclado.nextLine());
            contador++;
            acumulador = acumulador + num;
        } while (num != 0);
        System.out.println("--------------------------RESULTADO-----------------------------");
        System.out.println("El total de números introducidos fue de ---> " + contador);
        System.out.println("La suma total de todos esos números es de ---> " + acumulador);
        System.out.println("----------------------------------------------------------------");
    }

}
