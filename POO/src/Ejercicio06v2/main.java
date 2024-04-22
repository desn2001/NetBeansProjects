/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio06v2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class main {

    static Scanner teclado = new Scanner(System.in);
    static Agenda mi_agenda = new Agenda();
    static ArrayList<Contacto> lista;

    public static void main(String[] args) {
        // TODO code application logic here
        mi_agenda.addContacto("Juan", "juan@gmail.com", "612345678");
        mi_agenda.addContacto("Alicia", "alicia@gmail.com", "123456789");
        mi_agenda.addContacto("Junajo", "juanjo@gmail.com", "123456789");
        mi_agenda.addContacto("Jaime", "jaime@gmail.com", "123456789");

        int opcion;
        opcion = 0;
        do {
            imprimirMenu();
            try {
                System.out.print("Introduce una opción: ");
                opcion = Integer.parseInt(teclado.nextLine());
                System.out.println("");
            } catch (NumberFormatException e) {
                System.out.println("ERROR. La opción introducida debe ser un número");
            }

            switch (opcion) {
                case 1:
                    añadirContacto();
                    System.out.println("");
                    break;
                case 2:
                    listarContactos();
                    System.out.println("");
                    break;
                case 3:

                    break;
                case 4:
                    buscarContactos();
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("");
                    System.out.println("ERROR. Opción fuera del rango");
            }
        } while (opcion != 5);

    }

    public static void imprimirMenu() {
        System.out.println("AGENDA DE CONTACTOS");
        System.out.println("=========================");
        System.out.println("1.Añadir");
        System.out.println("2.Lista Completa");
        System.out.println("3.Modificar");
        System.out.println("4.Buscar");
        System.out.println("5.Salir");
    }

    public static void añadirContacto() {
        String nombre, email, telefono;

        System.out.println("====  AÑADIR CONTACTO  ====");
        System.out.print("Dime el nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Dime el email: ");
        email = teclado.nextLine();
        System.out.print("Dime el telefono: ");
        telefono = teclado.nextLine();

        mi_agenda.addContacto(nombre, email, telefono);
    }

    public static void listarContactos() {
        System.out.println("====  LISTA DE CONTACTOS  ====");
        mi_agenda.listarAgenda();
    }

    public static void buscarContactos() {
        System.out.println("====  BUSCAR CONTACTOS  ====");
        String expresion;
        ArrayList<Contacto> lista;
        System.out.print("Introduce letras para buscar al contacto: ");
        expresion = teclado.nextLine();
        lista = mi_agenda.buscarContactos(expresion);
        System.out.println("  ----------------------------------------------------------------------");
        System.out.println("  Id   Nombre                email                        teléfono");
        System.out.println("  ----------------------------------------------------------------------");
        for (Contacto contacto : lista) {
            System.out.print("  ");
            System.out.println(contacto.aCadena());
        }
    }
}
