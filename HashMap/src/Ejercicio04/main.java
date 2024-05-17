/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio04;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class main {

    static Scanner teclado = new Scanner(System.in);
    static int opcion;

    public static void main(String[] args) {
        Almacen miAlmacen = new Almacen();
        miAlmacen.añadirProductos(new Producto("Iphone11", 900, 50));
        miAlmacen.añadirProductos(new Producto("galaxy12", 800, 30));
        miAlmacen.añadirProductos(new Producto("ps3", 400, 100));
        
        do {
            System.out.println("=============================================================================");
            System.out.println("                                MENÚ DE ALMACÉN                              ");
            System.out.println("=============================================================================");
            System.out.println("1.AÑADIR PRODUCTO");
            System.out.println("2.MODIFICAR PRECIO");
            System.out.println("3.AÑADIR UNIDADES");
            System.out.println("4.SALIR");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    añadirProducto(miAlmacen);
                    break;
                case 2:
                    modificarPrecio(miAlmacen);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("Error: Opción invalida");
            }

        } while (opcion != 4);

    }

    private static void añadirProducto(Almacen miAlmacen) {
        String nombre;
        double precio;
        int unidades;
        System.out.print("Introduce un nombre del producto: ");
        nombre = teclado.nextLine();
        System.out.print("Introduce el precio del producto: ");
        precio = Double.parseDouble(teclado.nextLine());
        System.out.print("Introduce las unidades del producto: ");
        unidades = Integer.parseInt(teclado.nextLine());
        miAlmacen.añadirProductos(new Producto(nombre, precio, unidades));

    }

    private static void modificarPrecio(Almacen miAlmacen) {
        int codigo;
        double nuevoPrecio;
        System.out.print("Introduce el codigo del producto: ");
        codigo = Integer.parseInt(teclado.nextLine());
        System.out.print("Introduce el nuevo precio: ");
        nuevoPrecio = Double.parseDouble(teclado.nextLine());
        miAlmacen.modificarPrecio(codigo, nuevoPrecio);
    }

}
