
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int year = 0;
        System.out.print("Introduce un año ---> ");
        year = Integer.parseInt(teclado.nextLine());
        int divisible4 = year % 4;
//        System.out.println(divisible4);
        int divisible100 = year % 100;
//        System.out.println(divisible100);
        int divisible400 = year % 400;
//        System.out.println(divisible400);
        
        if (divisible4 ==0 && divisible100 !=0 || divisible100 ==0 && divisible400 ==0) {
            System.out.println("El año "+year+" es bisiesto");
        }else{
            System.out.println("El año "+year+" no es bisiesto");
        }

    }

}
