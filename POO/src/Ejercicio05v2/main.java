/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio05v2;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class main {

    static int totalCasas = 0;
    static Casa[] listaCasas = new Casa[50];
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        listaCasas[totalCasas] = new Casa("Juan", 30, 45, 120000);
        totalCasas++;
        listaCasas[totalCasas] = new Casa("Pedro", 120, 0, 100000);
        totalCasas++;
        listaCasas[totalCasas] = new Casa("Alicia", 70, 70, 150000);
        totalCasas++;

        do {
            mostrarMenu();
            System.out.print("Introduce una opción: ");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    altaCasa();
                    break;
                case 2:
                    listarContactos();
                    break;
                case 3:
                    cambiarPropietario();
                    break;
                case 4:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("ERROR. Introduce una opcion entre 1-4");
            }
        } while (opcion != 4);
        System.out.println("==================================================");

    }

    public static void mostrarMenu() {
        System.out.println("===================================================");
        System.out.println("                    MENU CASAS                     ");
        System.out.println("===================================================");
        System.out.println("1. Añadir casa");
        System.out.println("2. Listar casas");
        System.out.println("3. Cambiar propietario");
        System.out.println("4. Salir");
        System.out.println("");
    }

    public static void listarContactos() {
        System.out.println("====  Listado de casas  ====");
        for (int i = 0; i < totalCasas; i++) {
            System.out.print("CASA " + (i + 1));
            listaCasas[i].imprimirDatos();
        }
    }

    public static void altaCasa() {
        String propietario;
        int superficieP1;
        int superficieP2;
        double precioVenta;
        System.out.println("====  Alta de nueva casa  ====");
        System.out.print("Nuevo propietario: ");
        propietario = teclado.nextLine();
        System.out.print("Superficie Planta1: ");
        superficieP1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Superficie Planta2: ");
        superficieP2 = Integer.parseInt(teclado.nextLine());
        System.out.print("Precio de venta: ");
        precioVenta = Integer.parseInt(teclado.nextLine());

        listaCasas[totalCasas] = new Casa(propietario, superficieP1, superficieP2, precioVenta);
        totalCasas++;
    }

    public static void cambiarPropietario() {
        String nuevoPropietario;
        int numero;
        System.out.println("====  Cambiar propietario  ====");
        for (int i = 0; i < totalCasas; i++) {
            System.out.print((i + 1));
            System.out.println("." + listaCasas[i].getPropietario());
        }

        System.out.print("Introduce el número del propietario a cambiar: ");
        numero = Integer.parseInt(teclado.nextLine());
        System.out.print("Introduce el nuevo propietario: ");
        nuevoPropietario = teclado.nextLine();
        listaCasas[numero].setPropietario(nuevoPropietario);
    }

}
