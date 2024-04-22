/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola.mundo;

import java.util.Scanner;

/**
 *
 * @author diego.sanchez
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int dividendo;
        int divisor = 2;
        int resto;
        int cociente;

        System.out.print("Introduce un número decimal: ");
        dividendo = Integer.parseInt(teclado.nextLine());

        cociente = dividendo / divisor;
        System.out.println("El cociente de la división es ---> " + cociente);

        resto = dividendo % divisor;
        System.out.println("El resto de la división es ---> " + resto);

        if (cociente < dividendo) {
            resto = cociente % divisor;
            cociente = cociente / divisor;
            System.out.println("El cociente es ---> " + cociente);
            System.out.println("El resto es ---> " + resto);

        }

    }

}
