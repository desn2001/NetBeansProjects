/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        Cuenta miCuenta = new Cuenta("Diego");

        System.out.printf("Cuenta de %s Saldo de %.2f€\n", miCuenta.titular, miCuenta.cantidad);
        miCuenta.ingresar(100);
        System.out.println("Realizando un ingreso... ");
        System.out.printf("Cuenta de %s Saldo de %.2f€\n", miCuenta.titular, miCuenta.cantidad);
        miCuenta.ingresar(-100);
        System.out.println("Realizando un ingreso... ");
        System.out.printf("Cuenta de %s Saldo de %.2f€\n", miCuenta.titular, miCuenta.cantidad);
        miCuenta.ingresar(49.50);
        System.out.println("Realizando un ingreso... ");
        System.out.printf("Cuenta de %s Saldo de %.2f€\n", miCuenta.titular, miCuenta.cantidad);
        miCuenta.retirar(100);
        System.out.println("Realizando un retiro... ");
        System.out.printf("Cuenta de %s Saldo de %.2f€\n", miCuenta.titular, miCuenta.cantidad);
        miCuenta.retirar(100);
        System.out.println("Realizando un retiro... ");
        System.out.printf("Cuenta de %s Saldo de %.2f€\n", miCuenta.titular, miCuenta.cantidad);
    }

}
