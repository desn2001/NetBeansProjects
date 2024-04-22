
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author desn2
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double precioSinDescuento;
        double precioConDescuento;
        
        System.out.print("Introduce el precio de tu compra para calcular el decuento del 15% ---> ");
        precioSinDescuento=Double.parseDouble(teclado.nextLine());
        precioConDescuento = precioSinDescuento * 0.15;
        System.out.println(precioSinDescuento+"€ ------> precio descuentado de "+precioConDescuento+"€");
    }
    
}
