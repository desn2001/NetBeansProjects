/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio05V3;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class main {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        Casa listaCasas[] = new Casa[50];
        int contadorCasas = 0;

        do {
            System.out.println("================================");
            System.out.println("            MENÚ CASAS          ");
            System.out.println("================================");
            System.out.println("1. Añadir casa");
            System.out.println("2. Listar casas");
            System.out.println("3. Cambiar propietario");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.print("Elige opción: ");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    String propietario;
                    int p1,
                     p2;
                    double precioVenta;
                    System.out.println("====  ALTA DE NUEVA CASA  ====");
                    System.out.print("Nuevo propietario: ");
                    propietario = teclado.nextLine();
                    System.out.print("Superficie Planta1: ");
                    p1 = Integer.parseInt(teclado.nextLine());
                    System.out.print("Superficie Planta2: ");
                    p2 = Integer.parseInt(teclado.nextLine());
                    System.out.print("Precio venta: ");
                    precioVenta = Double.parseDouble(teclado.nextLine());
                    Casa nuevaCasa = new Casa(propietario, p1, p2, precioVenta);
                    listaCasas[contadorCasas] = nuevaCasa;
                    contadorCasas++;
                    break;
                case 2:
                    System.out.println("====  Litado de casas ====");
                    for (int i = 0; i < contadorCasas; i++) {
                        System.out.print("CASA " + (i + 1) + "-->");
                        listaCasas[i].imprimirDatos();
                    }
                    break;
                case 3:
                    System.out.println("====  Cambiar propietario ====");
                    for (int i = 0; i < contadorCasas; i++) {
                        System.out.print("CASA " + (i + 1) + "-->");
                        listaCasas[i].imprimirDatos();
                    }
                    System.out.print("Numero de casa a modificar:");
                    int numCasa = Integer.parseInt(teclado.nextLine());
                    System.out.print("Nuevo propietario:");
                    String nuevoPropietario = teclado.nextLine();
                    listaCasas[numCasa - 1].setPropietario(nuevoPropietario);
                    break;
                case 4:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("ERROR. Introduce una opción entre 1 y 4");
            }
        } while (opcion != 4);

    }

}
