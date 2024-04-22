/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio01;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int opcion;
        
        System.out.println("        Menú Biblioteca         ");
        System.out.println("================================");
        System.out.println("1.Añadir autores.");
        System.out.println("2.Añadir libro.");
        System.out.println("3.Listar libros.");
        System.out.println("4.Prestar libro.");
        System.out.println("5.Devolver libro.");
        System.out.println("6.Salir.");
        System.out.print("Elige opción:");
        opcion = Integer.parseInt(teclado.nextLine());
        switch (opcion) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                System.out.println("SALIENDO...");
                break;
            default:
                System.out.println("ERROR. La opción esta fuera del rango");;
        }
    }
    
}
