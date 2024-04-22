
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Scanner teclado = new Scanner(System.in);
//        int num;
//        System.out.println("-----------BUCLES ANIDADOS-----------");
//        System.out.print("Introduce un número: ");
//        num = Integer.parseInt(teclado.nextLine());
//        for (int i = 1; i <= num; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.println(i+"*"+j+"="+i*j);
//            }
//        }
//        
//        System.out.println("-------------------------------------");

        System.out.println("---------------------RELOJ----------------------");
        //Contador de minutos
        for (int i = 0; i < 3; i++) {
            //Contador de segundos
            for (int j = 0; j <= 59; j++) {
                if (i==2 && j>0) {
                    break;
                }
                System.out.printf("%d:%d\n",i,j);
                
            }
        }
        System.out.println("------------------------------------------------");

    }

}
