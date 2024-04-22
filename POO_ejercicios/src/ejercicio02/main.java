/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String nombre,dni;
        int edad;
        String sexo;
        double peso,altura;
        
        System.out.println("Introduce el nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Introduce tu edad: ");
        edad = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce sexo(H --> hombre | M --> mujer): ");
        sexo = teclado.nextLine();
        System.out.println("Introduce el peso: ");
        peso = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduce la altura: ");
        altura = Double.parseDouble(teclado.nextLine());
        
        
        Persona yo = new Persona(nombre,edad,sexo,peso,altura);
        
        
        System.out.println(yo.calcularImc());
        System.out.println("  Nombre     Edad      DNI      Sexo      Peso       Altura  ");
        System.out.println(yo.toString());
        
    }
    
}
