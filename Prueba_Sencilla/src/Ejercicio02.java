
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author desn2
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int nota;
        System.out.println("------------------CALCULO DE NOTAS------------------");
        System.out.print("Introduce una nota: ");
        nota = Integer.parseInt(teclado.nextLine());
        if (nota==9 || nota==10) {
            System.out.println("ENHORABUENA SOBRESALIENTE!!!");
        }else if (nota==7 || nota ==8) {
            System.out.println("BUEN TRABAJO NOTABLE!!!");
        }else if (nota==6) {
            System.out.println("NADA MAL BIEN!!!");
        }else if (nota==5) {
            System.out.println("ESFUERZATE MÁS SUFICIENTE");
        }else if (nota>10 || nota<0) {
            System.out.println("ERROR LA NOTA NO ES VALIDA");
        }
        else{
            System.out.println("INSUFICIENTE");
        }
        System.out.println("----------------------------------------------------");
    }
    
}
