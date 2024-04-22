/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen2º;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Ejercici01 - Números primos");
        System.out.println("==============================");
        System.out.print("Dime el primer número: ");
        num1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Dime el segundo número: ");
        num2 = Integer.parseInt(teclado.nextLine());
        
        imprimirPrimos(num1,num2);
        
    }
    
    public static boolean esPrimo(int num){
        boolean esPrimo = true;
        if (num%2 ==0) {
            esPrimo = false;
        }else{
            esPrimo = true;
        }
        return esPrimo;
    }
    
    public static void imprimirPrimos(int num1, int num2){
        if (num1 <0) {
            num1 = num1*(-1);
        }
        if (num2 <0) {
            num2 = num2 *(-1);
        }
        
        System.out.printf("Números primos entre %d y %d: ",num1,num2);
        for (int i = num1; i <= num2; i++) {
            if (esPrimo(i)) {
                System.out.printf("%d,",i);
            }
        }
        System.out.println("");
        
        
    }
    
    
    
}
