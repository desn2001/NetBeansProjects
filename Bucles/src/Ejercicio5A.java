
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author desn2
 */
public class Ejercicio5A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int num;
        int unidades;
        int decenas;
        System.out.print("Introduce un numero[00-99]: ");
        num = Integer.parseInt(teclado.nextLine());

        unidades = num % 10;
        decenas = num / 10;
//        System.out.println(decenas);
//        System.out.println(unidades);
        if (num == 11) {
            System.out.print("Once");
        } else if (num == 12) {
            System.out.print("Doce");
        } else if (num == 13) {
            System.out.print("Trece");
        } else if (num == 14) {
            System.out.print("Catorce");
        } else if (num == 15) {
            System.out.print("Quince");
        } else if (decenas == 0) {
            switch (unidades) {
                case 0:

                    break;
                case 1:
                    System.out.print("Uno");
                    break;
                case 2:
                    System.out.print("Dos");
                    break;
                case 3:
                    System.out.print("Tres");
                    break;
                case 5:
                    System.out.print("Cinco");
                    break;
                case 6:
                    System.out.print("Seis");
                    break;
                case 7:
                    System.out.print("Siete");
                    break;
                case 8:
                    System.out.print("Ocho");
                    break;
                case 9:
                    System.out.print("Nueve");
                    break;
                default:
            }
        } else {
            switch (decenas) {
                case 0:

                    break;
                case 1:
                    System.out.print("Diez ");
                    break;
                case 2:
                    System.out.print("Veinte ");
                    break;
                case 3:
                    System.out.print("Treinta ");
                    break;
                case 5:
                    System.out.print("Cincuenta ");
                    break;
                case 6:
                    System.out.print("Sesenta ");
                    break;
                case 7:
                    System.out.print("Setenta ");
                    break;
                case 8:
                    System.out.print("Ochenta ");
                    break;
                case 9:
                    System.out.print("Noventa ");
                    break;
                default:
            }
            switch (unidades) {
                case 0:

                    break;
                case 1:
                    System.out.print("y Uno");
                    break;
                case 2:
                    System.out.print("y Dos");
                    break;
                case 3:
                    System.out.print("y Tres");
                    break;
                case 5:
                    System.out.print("y Cinco");
                    break;
                case 6:
                    System.out.print("y Seis");
                    break;
                case 7:
                    System.out.print("y Siete");
                    break;
                case 8:
                    System.out.print("y Ocho");
                    break;
                case 9:
                    System.out.print("y Nueve");
                    break;
                default:
            }
        }

        System.out.println("");

    }

}
