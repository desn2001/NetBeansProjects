/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio05;

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
        Casa[] listaCasas = new Casa[50];
        int opcion;
        int totalCasas = 0;

        listaCasas[totalCasas] = new Casa("Juan", 30, 45, 120000);
        totalCasas++;

        listaCasas[totalCasas] = new Casa("Pedro", 120, 0, 100000);
        totalCasas++;

        listaCasas[totalCasas] = new Casa("Alicia", 70, 70, 150000);
        totalCasas++;

        do {
            System.out.println("==========================");
            System.out.println("        MENU CASAS        ");
            System.out.println("==========================");
            System.out.println("1. Añadir casa");
            System.out.println("2. Listar casas");
            System.out.println("3. Cambiar propietario");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.print("Elige opción: ");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("========  Alta de nueva casa  ========");
                    System.out.print("Nuevo propietario: ");
                    String propietario = teclado.nextLine();
                    System.out.print("Superficie PLANTA1: ");
                    int superficiep1 = Integer.parseInt(teclado.nextLine());
                    System.out.print("Superficie PLANTA2: ");
                    int superficiep2 = Integer.parseInt(teclado.nextLine());
                    System.out.print("Precio de Venta: ");
                    double precio = Double.parseDouble(teclado.nextLine());

                    listaCasas[totalCasas] = new Casa(propietario, superficiep1, superficiep2, precio);
                    totalCasas++;
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("========  Listado de casas  ========");
                    for (int i = 0; i < totalCasas; i++) {
                        System.out.print("CASA " + (i + 1));
                        listaCasas[i].imprimirDatos();
                    }

                    System.out.println("");
                    break;
                case 3:
                    System.out.println("========  Cambiar Propietario  ========");
                    

                    break;
                case 4:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("ERROR. Opción no valida");
            }

        } while (opcion != 4);
    }

}
