/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio02;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class main {

    private static Scanner teclado = new Scanner(System.in);
    private static BD_producto mibd = new BD_producto();
    private static Factura factura1 = new Factura("B12345678", "2024-01", LocalDate.now());

    public static void main(String[] args) {
        //DATOS
        mibd.add("Leche Puleva", 1.2);
        mibd.add("Chocolate", 2);
        mibd.add("Pan", 0.75);
        mibd.add("Agua 1.5L", 1.5);
        mibd.add("Cerveza 1L", 1.2);
        mibd.add("Galletas Choc", 2.5);
        mibd.add("Tomates ", 2.75);
        mibd.add("Naranjas", 1.6);

        //MENU
        int opcion = 0;
        do {
            System.out.println("MENÚ FACTURA");
            System.out.println("============================");
            System.out.println("1. Añadir línea");
            System.out.println("2. Imprimir factura");
            System.out.println("3. Listar productos");
            System.out.println("4. Añadir producto");
            System.out.println("5. Salir");
            System.out.print("Opcion> ");
            try {
                opcion = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage() + "no es válido");
            }
            switch (opcion) {
                case 1:
                    añadirLinea();
                    break;
                case 2:
                    factura1.imprimirFactura();
                    break;
                case 3:
                    mibd.listarProductos();
                    break;
                case 4:
                    añadirProducto();
                    break;
                case 5:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("ERROR. Debe introducir un número entre 1 y 5");
            }

        } while (opcion != 5);
    }

    private static void añadirLinea() {
        mibd.listarProductos();
        System.out.println("");
        System.out.print("  Producto (REF): ");
        String ref = teclado.nextLine();
        System.out.print("  Cantidad: ");

        int cantidad = Integer.parseInt(teclado.nextLine());
        if (mibd.buscar(ref) != null) {
            factura1.añadirLinea(mibd.buscar(ref), cantidad);
        } else {
            System.out.println("  No se ha encontrado el producto");
        }
    }

    private static void añadirProducto() {
        System.out.println("  Añadir producto");
        System.out.println("  ----------------");
        System.out.print("  Descripción: ");
        String descripcion = teclado.nextLine();
        double precio = 0;
        boolean paso = false;
        do {
            System.out.print("  Precio: ");
            try {
                precio = Double.parseDouble(teclado.nextLine());
                paso = false;
            } catch (Exception e) {
                System.out.println("  " + e.getMessage() + " no es un precio válido.");
                paso = true;
            }
        } while (paso);
        mibd.add(descripcion, precio);
    }

}
