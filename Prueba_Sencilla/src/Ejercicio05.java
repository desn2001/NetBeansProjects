
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author desn2
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String tamaño, topping;
        int precioTamaño = 0, precioTopping = 0, resultado;
        System.out.println("----------HELADERÍA----------");
        System.out.println("-Pequeno ---> 3€");
        System.out.println("-Grande ---> 4€");
        System.out.print("Introduce el tamaño del helado: ");
        tamaño = teclado.nextLine();
        tamaño = tamaño.toLowerCase();
        if (tamaño.equals("pequeno")) {
            System.out.println("Seleccionaste pequeño");
            precioTamaño = 3;
        } else if (tamaño.equals("grande")) {
            System.out.println("Seleccionaste grande");
            precioTamaño = 4;
        }
        System.out.println("");
        System.out.println("-Chocolate ---> 1€");
        System.out.println("-Fresas ---> 2€");
        System.out.println("-Cacahuetes ---> 3€");
        System.out.print("Introduce el topping: ");
        topping = teclado.nextLine();
        topping = topping.toLowerCase();
        if (topping.equals("chocolate")) {
            System.out.println("Seleccionaste Chocolate");
            precioTopping = 1;
        } else if (topping.equals("fresas")) {
            System.out.println("Seleccionaste Fresas");
            precioTopping = 2;
        } else if (topping.equals("cacahuetes")) {
            System.out.println("Seleccionaste Cacahuetes");
            precioTopping = 3;
        }
        resultado = precioTamaño+precioTopping;
        System.out.println("");
        System.out.printf("Tu pedido es -----> tamaño %s topping %s con un total de %d€\n",tamaño,topping,resultado);
        System.out.println("-----------------------------");
    }

}
