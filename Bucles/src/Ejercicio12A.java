
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author desn2
 */
public class Ejercicio12A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int precioTa = 0;
        int precioTo = 0;
        int precioFinal;
        boolean fin = false;
        String tamaño = "";
        String topping;

        System.out.printf("---------Heladeria---------\n");
        System.out.println("--TAMAÑOS--");
        System.out.println("Pequeno ---> 3€");
        System.out.println("Grande ---> 4€");
        System.out.println("");
        System.out.print("Introduce el tamaño[pequeno/grande]: ");
        tamaño = teclado.nextLine();
        tamaño = tamaño.toLowerCase();
        if (tamaño.equals("grande")) {
            precioTa = 4;
        } else if (tamaño.equals("pequeno")) {
            precioTa = 3;
        }
        System.out.println("");
        System.out.println("--Topping--");
        System.out.println("Chocolate ---> 1€");
        System.out.println("Cacahuetes ---> 1€");
        System.out.println("Fresas ---> 2€");
        System.out.println("Mango ---> 2€");
        System.out.println("");
        do {
            System.out.print("Introduce los toppings[FIN o intro para salir]: ");
            topping = teclado.nextLine();
            topping = topping.toLowerCase();
            switch (topping) {
                case "chocolate":
                    precioTo = 1 + precioTo;
                    break;
                case "cacahuetes":
                    precioTo = 1 + precioTo;
                    break;
                case "fresas":
                    precioTo = 2 + precioTo;
                    break;
                case "mango":
                    precioTo = 2 + precioTo;
                    break;
                case "FIN":
                    fin = true;
                    break;
                case "":
                    fin = true;
                    System.out.println("SALIENDO...");
                    break;
            }

        } while (fin == false);
        precioFinal = precioTa + precioTo;
//        System.out.println(precioTa);
//        System.out.println(precioTo);
        System.out.printf("precio Final es %d€\n", precioFinal);
        System.out.printf("---------------------------\n");

    }

}
