
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author diego.sanchez
 */
public class Ejercicio02SW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num = 1;
        System.out.print("Introduce un numero equivalente para un dia de la semana ---> ");
        num = Integer.parseInt(teclado.nextLine());
        switch (num) {
            case 1,2,3,4:
                System.out.println("Hoy tenemos clase de programación");
                break;
            case 5:
                System.out.println("Hoy no tenemos clase de programación");
                break;
            case 6,7:
                System.out.println("Es finde semana ");
            default:
                System.out.println("ERROR el numero introducido no es valido");
        }
    }
    
}
