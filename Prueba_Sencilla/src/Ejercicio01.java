
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
        double pi = Math.PI;
        double radio;
        double resultado;
        System.out.println("---------------AREA DEL CIRCULO---------------");
        System.out.print("Introduce el radio del circulo: ");
        radio = Double.parseDouble(teclado.nextLine());
        System.out.println("-----------------RESULTADO--------------------");
        resultado = pi * (radio * radio);
        System.out.printf("El área del ciruclo es ----> %.2f\n", resultado);
        System.out.println("----------------------------------------------");

    }

}
