
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author desn2
 */
public class ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashMap<String, Integer> listaEmpleados = new HashMap();
        listaEmpleados.put("Diego", 1_200);
        listaEmpleados.put("Ana", 2_500);

        String nombre;
        int salario, opcion;
        do {
            System.out.println("========= MENU =========");
            System.out.println("1.Imprimir el HashMap");
            System.out.println("2.Añadir un nuevo empleado");
            System.out.println("3.Eliminar un empleado");
            System.out.println("4.Buscar empleados por nombre");
            System.out.println("5.Salir");
            System.out.println("");
            System.out.print("Introduce una opción: ");
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("===== Lista de Empleado =====");
                    for (Map.Entry<String, Integer> entry : listaEmpleados.entrySet()) {
                        System.out.printf("Nombre: %-10s Salario: %d€\n", entry.getKey(), entry.getValue());
                    }
                    System.out.println("=============================");
                    System.out.println("");
                    break;
                case 2:
                    do {
                        System.out.println("===== Añadiendo nuevo empleado =====");
                        System.out.print("Introduce el nuevo nombre: ");
                        nombre = teclado.nextLine();
                        if (nombre.equals("exit")) {
                            break;
                        }
                        System.out.print("Introduce el nuevo salario: ");
                        salario = Integer.parseInt(teclado.nextLine());
                        System.out.println("====================================");
                        System.out.println("");
                        listaEmpleados.put(nombre, salario);
                    } while (!nombre.equals("exit"));
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("===== Eliminando un empleado =====");
                    String nombreEliminado;
                    for (Map.Entry<String, Integer> entry : listaEmpleados.entrySet()) {
                        System.out.println("Nombre: " + entry.getKey());
                    }
                    System.out.print("Introduce el nombre del empleado que quieres eliminar: ");
                    nombreEliminado = teclado.nextLine();
                    listaEmpleados.remove(nombreEliminado);
                    System.out.println("Empleado " + nombreEliminado + " eliminado con exito");
                    System.out.println("==================================");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("===== Buscar empleado por nombre =====");
                    String nombreEmpleado;
                    System.out.print("Introduce el nombre: ");
                    nombreEmpleado = teclado.nextLine();
                    System.out.println("");
                    if (listaEmpleados.containsKey(nombreEmpleado)) {
                        System.out.println("Empleado encontrado: " + nombreEmpleado);
                        System.out.println("Salario: " + listaEmpleados.get(nombreEmpleado) + "€");
                    } else {
                        System.out.println("Empleado no encontrado.");
                    }
                    System.out.println("======================================");
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("SALIENDO...");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (opcion != 5);

    }

}
