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
        Almacen mialmacen = new Almacen();
        mialmacen.añadirProducto(new Producto("Iphone 11", 900, 50));
        mialmacen.añadirProducto(new Producto("PS3", 100, 20));

        do {
            System.out.println("************************ ALMACEN DE DIEGO **********************************");
            System.out.println("1. Añadir Producto.");
            System.out.println("2. Modificar precio.");
            System.out.println("3. Añadir Unidades.");
            System.out.println("4. Vender Productos.");
            System.out.println("5. Listar Almacen.");
            System.out.println("6. Salir.");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    String nombre;
                    double precio;
                    int unidades;
                    System.out.println("Introduce el nombre: ");
                    nombre = teclado.nextLine();
                    System.out.println("Introduce el precio: ");
                    precio = Double.parseDouble(teclado.nextLine());
                    System.out.println("Introduce las unidades: ");
                    unidades = Integer.parseInt(teclado.nextLine());
                    mialmacen.añadirProducto(new Producto(nombre, precio, unidades));
                    break;
                case 2:
                    int codigo;
                    double nuevoPrecio;
                    mialmacen.listarModificar();
                    System.out.print("Introduce el codigo del producto a modificar: ");
                    codigo = Integer.parseInt(teclado.nextLine());
                    System.out.print("Introduce el nuevo precio del producto a modificar: ");
                    nuevoPrecio = Double.parseDouble(teclado.nextLine());
                    mialmacen.modificarPrecio(codigo, nuevoPrecio);
                    break;
                case 3:

                    break;
                case 4:
                    int codigoProducto;
                    int unidadesProducto;
                    mialmacen.listarVender();
                    System.out.print("Introduce el codigo del producto: ");
                    codigoProducto = Integer.parseInt(teclado.nextLine());
                    System.out.print("Introduce las unidades vendidas: ");
                    unidadesProducto = Integer.parseInt(teclado.nextLine());
                    mialmacen.venderProducto(codigoProducto, unidadesProducto);
                    break;
                case 5:
                    mialmacen.listarAlmacen();
                    break;
                case 6:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("ERROR!!! Opción invalida");
            }
            System.out.println("****************************************************************************");
        } while (opcion != 6);

    }

}
