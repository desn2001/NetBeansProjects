
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diego.sanchez
 */
public class appAcademia {

    static Scanner teclado = new Scanner(System.in);

    static Alumno[] alumnos = new Alumno[10];
    static String[] nombreMaterias = {"Lengua", "Inglés", "Matemáticas", "Física", "Química"};
    static double[] precioMaterias = {15.0, 16.5, 15.5, 20.0, 18.5};
    static Materia[] materias = new Materia[nombreMaterias.length];

    public static void main(String[] args) {

        // Carga de datos
        Datos.altaAlumnos(alumnos);
        Datos.altaMaterias(nombreMaterias, materias, precioMaterias);
        Datos.matricularAlumnos(materias, alumnos);

        // Menu principal
        int opcion = 0;
        do {
            System.out.println("\n******************");
            System.out.println("   Academia Meca  ");
            System.out.println("******************");
            System.out.println("1. Alumnos");
            System.out.println("2. Materias");
            System.out.println("3. Salir");
            try {
                System.out.print("Opcion> ");
                opcion = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage() + " no es valido");
            }

            switch (opcion) {
                case 1:
                    menuAlumnos();
                    break;
                case 2:
                    menuMaterias();
                    break;
                case 3:
                    System.out.println("Aplicación cerrada.");
                    System.out.println("--------------------------------------------");
                    break;
                default:
                    System.out.println("Solo admiten los valores 1,2 o 3");
            }
        } while (opcion != 3);

    } //Fin Main

    private static void menuAlumnos() {
        int opcion = 0, id = -1;
        do {
            System.out.println("\n  ** Alumnos **");
            System.out.println("  1. Listado");
            System.out.println("  2. Materias matriculadas");
            System.out.println("  3. Estadísticas");
            System.out.println("  4. Facturación");
            System.out.println("  5. Volver");
            try {
                System.out.print("  Opción> ");
                opcion = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage() + " no es valido");
            }

            switch (opcion) {
                case 1:
                    System.out.println("******************************************************");
                    System.out.println("            ALUMNOS DE 2º BACHILLERATO                ");
                    System.out.println("******************************************************");
                    System.out.println("ID  NOMBRE           EMAIL           EDAD");
                    System.out.println("------------------------------------------------------");
                    mostrarAlumnos();
                    break;
                case 2:
                    System.out.println("Alumno -> Materias");
                    System.out.println("------------------------------------------------------");
                    getMateriasAlumno(0);
                    break;
                case 3:

                    System.out.printf("Edad minima: %d años\n", edadMin());
                    System.out.printf("Edad maxima: %d años\n", edadMax());
                    System.out.printf("Edad media: %.1f años\n", edadMedia());

                    break;
                case 4:
                    for (int i = 0; i < alumnos.length; i++) {
                        System.out.println(contarMaterias(i));

                    }

                    break;
                case 5:
                    System.out.println("VOLVIENDO AL MENU PRINCIPAL...");
                    break;
                default:
                    System.out.println("Solo admiten las opciones 1, 2, 3, 4, o 5");
            }

        } while (opcion != 5);

    } //Fin Alumnos

    private static void menuMaterias() {
        int opcion = 0, id = -1;
        do {
            System.out.println("\n  ** Materias **");
            System.out.println("  1. Listado");
            System.out.println("  2. Alumnos matriculados");
            System.out.println("  3. Estadísticas");
            System.out.println("  4. Facturación");
            System.out.println("  5. Volver");
            try {
                System.out.print("  Opción> ");
                opcion = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage() + " no es valido");
            }

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("VOLVIENDO AL MENU PRINCIPAL...");
                    break;
                default:
                    System.out.println("Solo admiten las opciones 1, 2, 3, 4, o 5");
            }

        } while (opcion != 5);
    } //Fin Materias

    private static void mostrarAlumnos() {
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i].mostrarDetalles();
        }
    }

    private static void mostrarMaterias() {

    }

    private static void getMateriasAlumno(int id) {
        id = 0;
        for (int i = 0; i < materias.length; i++) {

            if (id == i) {
                System.out.printf("%s -> %s \n", alumnos[i].getNombre(), materias[i].getNombre());
            }
            id++;
        }
    }

    private static int edadMin() {
        int min = 100;
        for (int i = 0; i < alumnos.length; i++) {
            if (min >= alumnos[i].getEdad()) {
                min = alumnos[i].getEdad();
            }
        }
        return min;
    }

    private static int edadMax() {
        int max = alumnos[0].getEdad();
        for (int i = 0; i < alumnos.length; i++) {
            if (max < alumnos[i].getEdad()) {
                max = alumnos[i].getEdad();
            }
        }
        return max;
    }

    private static double edadMedia() {
        double acumulador = 0;
        double media;
        for (int i = 0; i < alumnos.length; i++) {
            acumulador = acumulador + alumnos[i].getEdad();
        }
        media = acumulador / alumnos.length;
        return media;
    }

    private static int contarMaterias(int id) {
        int contador = 0;
        for (int i = 0; i < materias.length; i++) {
            if (id == alumnos[i].getId()) {
                contador++;
            }
        }
        return contador;
    }

    private static double getImporte(int id) {
        return 0.0;
    }

}
