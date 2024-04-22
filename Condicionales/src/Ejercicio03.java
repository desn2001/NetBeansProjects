
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author diego.sanchez
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        double n1;
        double n2;
        double n3;
        
        double r1;
        double r2;
        double r3;
        
        double notaFinal;
        
        System.out.print("Introduce la nota del primer examen: ");
        n1 = Double.parseDouble(teclado.nextLine());
        r1 = n1*0.3;
        System.out.print("Introduce la nota del segundo examen: ");
        n2 = Double.parseDouble(teclado.nextLine());
        r2 = n2*0.3;
        System.out.print("Introduce la nota del tercer examen: ");
        n3 = Double.parseDouble(teclado.nextLine());
        r3 = n3*0.4;
        
        notaFinal = (r1+r2+r3)/3;
        System.out.println(notaFinal);
    }
    
}
