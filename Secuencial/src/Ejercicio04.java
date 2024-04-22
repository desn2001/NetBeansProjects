
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author desn2
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int f,c;
        System.out.print("Introduce los grados Fahrenheit: ");
        f= Integer.parseInt(teclado.nextLine());
        c=(f-32)*5/9;
        System.out.println("----RESULTADO----");
        System.out.println(f+"F son "+c+"ª");
    }
    
}
