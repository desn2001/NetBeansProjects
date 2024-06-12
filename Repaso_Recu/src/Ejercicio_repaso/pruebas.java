/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_repaso;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    static Instituto arcas = new Instituto("IES RAMON ARCAS");
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
//        Clase clase1 = new Clase("DAW", 1);
//        Clase clase2 = new Clase("DAW", 2);
//
//        Alumno alumno1 = new Alumno("Pedro", 20);
//        Alumno alumno2 = new Alumno("Alicia", 21);
//        Alumno alumno3 = new Alumno("Juan", 22);
//
//        arcas.addAlumno(alumno1);
//        arcas.addAlumno(alumno2);
//        arcas.addAlumno(alumno3);
//
//        arcas.listarAlumnos();
//        System.out.println("");
//        arcas.matricular(alumno3, clase2);
//        arcas.matricular(alumno1, clase1);
//        arcas.listarAlumnos();
        int opcion;
        do {
            mostrarMenu();
            opcion = Integer.parseInt(teclado.nextLine());
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
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("ERROR: OPCIÓN INTRODUCIDA FUERA DE RANGO");
            }
        } while (opcion != 5);

    }

    public static void mostrarMenu() {
        System.out.println("********************************");
        System.out.println("PROGRAMA MATRICULACIÓN");
        System.out.printf("     %s\n", arcas.getNombre());
        System.out.println("********************************");
        System.out.println("1. Listado total de alumno.");
        System.out.println("2. Listado de clases.");
        System.out.println("3. Matricular alumno.");
        System.out.println("4. Info detallada del sistema.");
        System.out.println("5. Salir del sitema.");
        System.out.println("Elige una opcion: ");

    }

}
