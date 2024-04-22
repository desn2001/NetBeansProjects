
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
        int cantidadNum = 0;
        int contadorPos = 0;
        int contadorNeg = 0;
        int contadorCero = 0;
        int num;
        System.out.print("Total de números ---> ");
        cantidadNum = Integer.parseInt(teclado.nextLine());

        for (int i = 0; i < cantidadNum; i++) {
            System.out.print("Introduce un numero ---> ");
            num = Integer.parseInt(teclado.nextLine());
            if (num < 0) {
                contadorNeg++;
            } else if (num == 0) {
                contadorCero++;
            } else if (num > 0) {
                contadorPos++;
            }
        }
        System.out.println("------------------------RESULTADO-------------------------");
        System.out.println("Contador de números positivos ---> " + contadorPos);
        System.out.println("Contador de números negativos ---> " + contadorNeg);
        System.out.println("Contador de ceros ---> " + contadorCero);
        System.out.println("----------------------------------------------------------");

    }

}
