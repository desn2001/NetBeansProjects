/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class Agenda {

    static Scanner teclado = new Scanner(System.in);
    static HashMap<String, String> agenda = new HashMap<>();

    public static void main(String[] args) {
        agenda.put("Emergencias", "112");
        agenda.put("Violencia de Genero", "016");
        int opcion;
        do {
            System.out.println("** EJERCICIO 3 - AGENDA **");
            System.out.println("*********************************");
            imprimirContactos(agenda);
            System.out.println("*********************************");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Modificar contacto");
            System.out.println("4. Ver contacto");
            System.out.println("5. Salir");
            System.out.print("Elige una opción:");
            opcion = Integer.parseInt(teclado.nextLine());
            System.out.println("");
            switch (opcion) {
                case 1:
                    añadirContacto(agenda);
                    System.out.println("");
                    break;
                case 2:
                    eliminarContacto(agenda);
                    System.out.println("");
                    break;
                case 3:
                    modificarContacto(agenda);
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("SALIENDO...");
                    System.out.println("");
                    break;
                default:
                    System.out.println("ERROR Opción invalida");
            }
        } while (opcion != 5);

    }

    private static void añadirContacto(HashMap<String, String> agenda) {
        String nombre, telefono, confirmacion;
        do {
            System.out.println("********* AÑADIR CONTACTO *******");
            System.out.print("Nombre: ");
            nombre = teclado.nextLine();
            System.out.print("Teléfono: ");
            telefono = teclado.nextLine();
            agenda.put(nombre, telefono);
            System.out.println("CONTACTO AÑADIDO CON EXITO");
            System.out.print("Quieres añadir otro contacto[SI/NO]: ");
            confirmacion = teclado.nextLine();
            confirmacion = confirmacion.toUpperCase();
            System.out.println("*********************************");
        } while (confirmacion.equals("SI"));

    }

    private static void imprimirContactos(HashMap<String, String> agenda) {
        for (Map.Entry<String, String> contacto : agenda.entrySet()) { //Esta linea nos la da el 
            String nombre = contacto.getKey();
            String numero = contacto.getValue();
            System.out.printf(" %10s --> %-5s\n", nombre, numero);
        }
    }

    private static void eliminarContacto(HashMap<String, String> agenda) {
        String contactoBorrar;
        System.out.println("******* ELIMINAR CONTACTO *******");
        System.out.print("Introduce el nombre del contacto a borrar: ");
        contactoBorrar = teclado.nextLine();
        if (agenda.containsKey(contactoBorrar)) {
            agenda.remove(contactoBorrar);
            System.out.println("Contacto eliminado correctamente.");
            System.out.println("*********************************");
        } else {
            System.out.println("ERROR. Contacto no encontrado.");
            System.out.println("*********************************");
        }
    }

    private static void modificarContacto(HashMap<String, String> agenda) {
        String nombre, telefono;
        System.out.println("******* MODIFICAR CONTACTO ******");

        System.out.print("Nombre del contacto a modificar: ");
        nombre = teclado.nextLine();
        if (agenda.containsKey(nombre)) {
            System.out.print("Nuevo telefono: ");
            telefono = teclado.nextLine();
            agenda.put(nombre, telefono);
            System.out.println("*********************************");
        } else {
            System.out.println("Nombre no encontrado en la agenda");
            System.out.println("*********************************");
        }
    }
}
