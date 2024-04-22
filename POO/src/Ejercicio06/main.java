/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio06;

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

        int opcion;
        Contactos[] listaContactos = new Contactos[100];
        listaContactos[Contactos.getContadorId()] = new Contactos("Juan", "juan@gmail.com", "612345678");
        listaContactos[Contactos.getContadorId()] = new Contactos("Alicia", "alicia@gmail.com", "123456789");
        do {
            System.out.println("================================");
            System.out.println("            CONTACTOS           ");
            System.out.println("================================");
            System.out.println("1. Nuevo Contacto");
            System.out.println("2. Listar Contactos");
            System.out.println("3. Modificar Contacto");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("============== AÑADIENDO CONTACTO ==============");
                    String nombre,
                     email,
                     telefono;
                    System.out.print("Dime el nombre del contacto: ");
                    nombre = teclado.nextLine();
                    System.out.print("Dime el email del contacto: ");
                    email = teclado.nextLine();
                    System.out.print("Dime el telefono del contacto: ");
                    telefono = teclado.nextLine();
                    listaContactos[Contactos.getContadorId()] = new Contactos(nombre, email, telefono);
                    System.out.println("================================================");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("============== LISTA DE CONTACTOS ==============");
                    System.out.println("ID       NOMBRE       EMAIL            TELEFONO");
                    for (int i = 0; i < Contactos.contadorId; i++) {
                        listaContactos[i].imprimir();
                    }
                    System.out.println("================================================");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("============== MODIFICANDO CONTACTO ==============");
                    for (int i = 0; i < Contactos.contadorId; i++) {
                        System.out.printf("%d- %s\n",listaContactos[i].getId(),listaContactos[i].getNombre());
                    }
                    int num;
                    System.out.print("Elige el contacto que quieres modificar: ");
                    num = Integer.parseInt(teclado.nextLine());
                    for (int i = 0; i < Contactos.contadorId; i++) {
                        if (num == listaContactos[i].getId()) {
                            System.out.print("Introduce un nuevo nombre: ");
                            String nuevoNombre = teclado.nextLine();
                            listaContactos[i].setNombre(nuevoNombre);
                            System.out.print("Introduce un nuevo email: ");
                            String nuevoEmail = teclado.nextLine();
                            listaContactos[i].setEmail(nuevoEmail);
                            System.out.print("Introduce un nuevo telefono: ");
                            String nuevoTelefono = teclado.nextLine();
                            listaContactos[i].setTelefono(nuevoTelefono);
                        }
                    }
                    System.out.println("==================================================");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("ERROR. La opción elegida es invalida.");
            }
        } while (opcion != 4);
    }

}
