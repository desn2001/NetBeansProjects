
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
        String nombre1;
        String nombre2;
        String apellido1;
        String apellido2;
        String s;

        System.out.print("Introduce tu primer nombre: ");
        nombre1 = teclado.nextLine();

        System.out.print("Tiene segundo nombre[si/no]: ");
        s = teclado.nextLine();
        s = s.toLowerCase();
        if (s.equals("si")) {
            System.out.print("Introduce tu segundo nombre: ");
            nombre2 = teclado.nextLine();

            System.out.print("Introduce tu primer apellido: ");
            apellido1 = teclado.nextLine();

            System.out.print("Introduce tu segundo apellido: ");
            apellido2 = teclado.nextLine();

            char inicial1;
            inicial1 = nombre1.charAt(0);
            inicial1 = Character.toUpperCase(inicial1);
            char inicial2;
            inicial2 = nombre2.charAt(0);
            inicial2 = Character.toUpperCase(inicial2);
            char inicial3;
            inicial3 = apellido1.charAt(0);
            inicial3 = Character.toUpperCase(inicial3);
            char inicial4;
            inicial4 = apellido2.charAt(0);
            inicial4 = Character.toUpperCase(inicial4);

            System.out.println("-----------------------------------------------");
            System.out.println("Las iniciales de tu nombres son -----> " + inicial1 + inicial2 + inicial3 + inicial4);
            System.out.println("-----------------------------------------------");
        } else {
            System.out.print("Introduce tu primer apellido: ");
            apellido1 = teclado.nextLine();
            System.out.print("Introduce tu segundo apellido: ");
            apellido2 = teclado.nextLine();

            char inicial1;
            inicial1 = nombre1.charAt(0);
            inicial1 = Character.toUpperCase(inicial1);
            char inicial3;
            inicial3 = apellido1.charAt(0);
            inicial3 = Character.toUpperCase(inicial3);
            char inicial4;
            inicial4 = apellido2.charAt(0);
            inicial4 = Character.toUpperCase(inicial4);
            System.out.println("-----------------------------------------------");
            System.out.println("Las iniciales de tu nombres son -----> " + inicial1 + inicial3 + inicial4);
            System.out.println("-----------------------------------------------");

        }

    }

}
