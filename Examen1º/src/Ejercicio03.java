
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double base, exponente;
        double acumulador = 1;
        boolean negativo = false;

        System.out.println("Ejercicio03 - CALCULO DE POTENCIA");
        System.out.println("=================================");
        System.out.print("Dime la base: ");
        base = Double.parseDouble(teclado.nextLine());
        System.out.print("Dime el exponente: ");
        exponente = Double.parseDouble(teclado.nextLine());
        if (exponente < 0) {
            negativo = true;
            exponente = Math.abs(exponente);
        } else {
            negativo = false;
        }

        for (double i = 1; i <= exponente; i++) {
            if (negativo = false) {
                acumulador = acumulador / base;
            } else if (negativo = true) {
                acumulador = acumulador * base;

            }
        }

        if (negativo = false) {
            System.out.printf("%.0f elevado a -%.0f es %.4f\n", base, exponente, acumulador);

        } else {
            System.out.printf("%.0f elevado a %.0f es %.4f\n", base, exponente, acumulador);
        }

        System.out.println(
                "=================================");

    }

}
