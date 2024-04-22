
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num;
        boolean hayNegativos = false;
        System.out.println("------CONTADOR DE NÚMEROS------");
        do {
            System.out.print("Introduce un número[0 para salir]: ");
            num = Integer.parseInt(teclado.nextLine());
            if (num < 0) {
                hayNegativos = true;
            }

        } while (num != 0);
        if (hayNegativos) {
            System.out.println("Se introdujo uno o varios número negativo ");
        }else{
            System.out.println("No se introdujo ningun número negativo");
        }

        System.out.println("-------------------------------");

    }

}
