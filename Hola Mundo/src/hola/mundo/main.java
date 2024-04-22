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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int dividendo;
        int divisor = 2;
        int cociente;
        int resto;
        
        System.out.print("Introduce un número entero: ");
        dividendo = Integer.parseInt(teclado.nextLine());
        for (int i = 0; i < 100; i++) {
            cociente = dividendo/divisor;
            resto = dividendo % divisor;
            System.out.println(cociente);
            System.out.println(resto);
            if (cociente < dividendo) {
                cociente = cociente/divisor;
                resto = cociente%divisor;
                System.out.println(cociente);
                System.out.println(resto);
            }else{
                System.out.println("Fin");
            }
            
        }
        
    }
    
}
