/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Agenda;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class Main {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        BD.cargarDriver();
        BD.conectar();
        int opcion;
        do {
            System.out.println("============================== LISTA DE CONTACTOS ==================");
            for (Contacto contacto : BD.listaCompleta()) {
                System.out.println(contacto);
            }
            System.out.println("====================================================================");
            mostrarMenu();
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    añadirContacto();
                    break;
                case 2:
                    eliminarContacto();
                    break;
                case 3:
                    mostrarListaCompleta();
                    break;
                case 4:
                    filtrarPorLetra();
                    break;
                case 5:
                    calcularEdad();
                    break;
                case 6:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("ERROR: OPCIÓN INTRODUCIDA INVALIDA");
            }

        } while (opcion != 6);
        BD.desconectar();

    }

    private static void mostrarMenu() {
        System.out.println("1. Insertar Contacto.");
        System.out.println("2. Borrar Contacto.");
        System.out.println("3. Lista Completa.");
        System.out.println("4. Filtrar por letra comienzo.");
        System.out.println("5. Calcular Edad de un Contacto.");
        System.out.println("6. Salir.");
        System.out.print("Escoge una opción > ");
    }

    private static void añadirContacto() {
        System.out.println("");
        System.out.println("================= AÑADIR CONTACTO =================");
        System.out.print("Introduce ID: ");
        int id = Integer.parseInt(teclado.nextLine());
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Apellido: ");
        String apellido = teclado.nextLine();
        System.out.print("Fecha [yyy-MM-dd]: ");
        String fecha = teclado.nextLine();
        Contacto c = new Contacto(id, nombre, apellido, LocalDate.parse(fecha));
        BD.insertar(c);
        System.out.println("===================================================");
    }

    private static void eliminarContacto() {
        System.out.println("");
        System.out.println("================= BORRAR CONTACTO =================");
        System.out.print("Introduce ID del contacto a borrar: ");
        int id = Integer.parseInt(teclado.nextLine());
        BD.eliminar(id);
        System.out.println("Contacto con id " + id + " Eliminado!!!");
        System.out.println("===================================================");
    }

    private static void filtrarPorLetra() {
        System.out.println("");
        System.out.print("Introduce la letra para filtrar: ");
        char letra = teclado.nextLine().charAt(0);
        System.out.printf("============================== LISTA FILTRADA (letra: %c) ===========\n", letra);
        for (Contacto contacto : BD.listaPorLetra(letra)) {
            System.out.println(contacto);
        }
        System.out.println("====================================================================");
    }

    private static void mostrarListaCompleta() {
        System.out.println("");
        System.out.println("============================== LISTA DE CONTACTOS ==================");
        for (Contacto contacto : BD.listaCompleta()) {
            System.out.println(contacto);
        }
        System.out.println("====================================================================");
    }

    private static void calcularEdad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
