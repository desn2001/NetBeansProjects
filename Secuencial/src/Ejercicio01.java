
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
        int num1, num2, num3, media;
        System.out.print("Introduce el primer número: ");
        num1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Introduce el segundo número: ");
        num2 = Integer.parseInt(teclado.nextLine());
        System.out.print("Introduce el tercer número: ");
        num3 = Integer.parseInt(teclado.nextLine());
        
        media = (num1+num2+num3)/3;
        System.out.println("La media de los números "+num1+" "+num2+" "+num3+" es "+media);

    }

}
