
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("--------------TABLAS DE MULTIPLICAR--------------");
        System.out.print("Introduce un número ---> ");
        num = Integer.parseInt(teclado.nextLine());
        System.out.println("TABLA DEL " + num);
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + num * i);
        }
        System.out.println("-------------------------------------------------");

    }

}
