
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author desn2
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int base,altura,perimetro;
        System.out.print("Introduce la base: ");
        base=Integer.parseInt(teclado.nextLine());
        System.out.print("Introduce la altura: ");
        altura=Integer.parseInt(teclado.nextLine());
        perimetro=(2*base)+(2*altura);
        System.out.println("El perimetro del rectangulo de altura "+altura+" y de base "+base+" es ---> "+perimetro);
        
    }
    
}
