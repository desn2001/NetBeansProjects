
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class Ejercicio7A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int resultado = (int) (Math.random() * 50) + 1;
        int num;
        System.out.println(resultado);
        System.out.println("------------ADIVINA EL NÚMERO------------");
        do {
            System.out.print("Introduce un número[1-50]: ");
            num = Integer.parseInt(teclado.nextLine());
            if (num>resultado) {
                System.out.println("MENOR");
            }else if (num == resultado) {
                System.out.println("\033[32m CORRECTO");
            }
            else{
                System.out.println("MAYOR");
            }
        } while (num != resultado);
        System.out.println("-----------------------------------------");

    }

}
