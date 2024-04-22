/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class Ejercicio02 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String datosEstudiantes = "Juan,Perez,18;Maria,Gomez,20;Carlos,Rodriguez,19;Diego,Sanchez,22";
        String estudiantes[] = datosEstudiantes.split(";");
        String[] nombres = new String[estudiantes.length];
        String[] apellidos = new String[estudiantes.length];
        int[] edades = new int[estudiantes.length];

        for (int i = 0; i < estudiantes.length; i++) {
            String[] datos = estudiantes[i].split(",");
            nombres[i] = datos[0];
            apellidos[i] = datos[1];
            edades[i] = Integer.parseInt(datos[2]);
        }
        int opcion = 0;
        do {
            System.out.println("====== MENU DE ALUMNOS =====");
            System.out.println("1-Mostrar Alumnos.");
            System.out.println("2-Mostrar Alumno mayor.");
            System.out.println("3-Mostrar Alumno menor.");
            System.out.println("4-Mostrar Edad Media de los alumnos.");
            System.out.println("5-Mostrar Alumnos mayores de edad.");
            System.out.println("6-Mostrar Alumnos menores de edad.");
            System.out.println("7-Salir.");
            System.out.println("============================");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1 ->
                    imprimirAlumnos(nombres);
                case 2 ->
                    calcularAlumnoMayor(edades, nombres);
                case 3 ->
                    calcularAlumnoMenor(edades, nombres);
                case 4 ->
                    calcularEdadMediaAlumnos(edades);
                case 5 ->
                    mostrarAlumnosMayoresDeEdad(edades, nombres);
                case 6 ->
                    mostrarAlumnosMenoresDeEdad(edades, nombres);
                case 7 ->
                    System.out.println("SALIENDO...");
                default ->
                    System.out.println("ERROR Opción invalida.");
            }
        } while (opcion != 8);

    }

    private static void imprimirAlumnos(String[] nombres) {
        int contador = 1;
        System.out.println("====== NOMBRES ======");
        for (Object nombre : nombres) {
            System.out.println(contador + "-" + nombre);
            contador++;
        }
        System.out.println("=====================");
    }

    private static void calcularAlumnoMayor(int[] edades, String[] nombres) {
        int max = edades[0];
        String nombre = "";

        for (int i = 0; i < edades.length; i++) {
            if (max <= edades[i]) {
                max = edades[i];
                nombre = nombres[i];
            }
        }
        System.out.println("========== ALUMNO MAYOR ==========");
        System.out.printf("%s es el alumno mayor con una edad de %d años\n", nombre, max);
        System.out.println("==================================");
    }

    private static void calcularAlumnoMenor(int[] edades, String[] nombres) {
        int max = edades[0];
        String nombre = "";

        for (int i = 0; i < edades.length; i++) {
            if (max >= edades[i]) {
                max = edades[i];
                nombre = nombres[i];
            }
        }
        System.out.println("========== ALUMNO MENOR ==========");
        System.out.printf("%s es el alumno menor con una edad de %d años\n", nombre, max);
        System.out.println("==================================");
    }

    private static void calcularEdadMediaAlumnos(int[] edades) {
        int media = 0;
        for (int edad : edades) {
            media = (media + edad) / edades.length;
        }
        System.out.println("========== EDAD MEDIA ==========");
        System.out.printf("La edad media de los alumnos es de %d años\n", media);
        System.out.println("================================");
    }

    private static void mostrarAlumnosMayoresDeEdad(int[] edades, String[] nombres) {
        System.out.println("========== ALUMNOS MAYORES DE EDAD ==========");
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] >= 18) {
                System.out.printf("-%s\n", nombres[i]);
            }
        }
        System.out.println("=============================================");

    }

    private static void mostrarAlumnosMenoresDeEdad(int[] edades, String[] nombres) {
        System.out.println("========== ALUMNOS MENORES DE EDAD ==========");
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] < 18) {
                System.out.printf("-%s\n", nombres[i]);
            }
        }
        System.out.println("=============================================");
    }

}
