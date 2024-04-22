
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double clave;
        clave = (int) (Math.random() * 9000 + 1000);
        int intentos = 4;//Esto sera un contador 
        int num = 0;
        System.out.println("-----------------CAJA FUERTE-----------------");

        System.out.printf("La combinación de nuestra caja fuerte es %.0f \n", clave);
        do {
            if (num == clave) {
                System.out.println("");
                System.out.println("---------------------------");
                System.out.println("\33[32m LA CLAVE ES CORRECTA");
                System.out.println("---------------------------");
                break;

            } else if (intentos == 0) {
                System.out.println("--------------------------------------------");
                System.out.println("\33[31m LO SIENTO, SE LE AGOTARON LOS INTENTOS");
                System.out.println("--------------------------------------------");
                break;
            } else {
                System.out.printf("Introduce una clave de 4 cifras número de (intentos %d): ", intentos);
                num = Integer.parseInt(teclado.nextLine());
                intentos--;
            }

        } while (intentos >= 0);

    }
}
//        Scanner teclado = new Scanner(System.in);
//        double clave;
//        clave = 1234;
//        int intentos = 4;//Esto sera un contador 
//        int num = 0;
//        boolean acertado = false;
//        System.out.println("-----------------CAJA FUERTE-----------------");
//
//        System.out.printf("La combinación de nuestra caja fuerte es %.0f \n", clave);
//        do {
//            if (num == clave) {
//                System.out.println("");
//                System.out.println("---------------------------");
//                System.out.println("\33[32m LA CLAVE ES CORRECTA");
//                System.out.println("---------------------------");
//                acertado = true;
//
//            } else if (intentos == 0) {
//                System.out.println("--------------------------------------------");
//                System.out.println("\33[31m LO SIENTO, SE LE AGOTARON LOS INTENTOS");
//                System.out.println("--------------------------------------------");
//                acertado = true;
//
//            } else {
//                System.out.printf("Introduce una clave de 4 cifras número de (intentos %d): ", intentos);
//                num = Integer.parseInt(teclado.nextLine());
//                intentos--;
//            }
//
//        } while (intentos >= 0 && (!acertado));
//    }
//
//}
