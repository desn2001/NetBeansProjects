
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("---Comprobador de negativo, positivo o 0---");
        System.out.print("Introduce un número: ");
        num = Integer.parseInt(teclado.nextLine());
        //Usando 3 if
        if (num >= 1) {
            System.out.println("El número " + num + " es un entero positivo");
        }
        if (num <= -1) {
            System.out.println("El número " + num + " es un entero negativo");
        }
        if (num == 0) {
            System.out.println("El número es " + num);
        }
    }

}
