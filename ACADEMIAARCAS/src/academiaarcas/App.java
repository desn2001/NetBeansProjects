/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACADEMIAARCAS;

import java.util.Scanner;

/**
 *
 * @author juanfran.garcia
 */
public class App {

    static Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Cargar profesores 
        BBDD.addProfesor("Paco", Materia.MATES);
        BBDD.addProfesor("Antonio", Materia.INGLES);
        BBDD.addProfesor("Morientes", Materia.LENGUA);
        BBDD.addEstudiante("Perico");
        BBDD.addEstudiante("Mbappe");
        BBDD.addEstudiante("Ancelloti");
        BBDD.addMatricula(201, 5001);
        BBDD.addMatricula(201, 5002);
        BBDD.addMatricula(201, 5003);
        BBDD.addMatricula(202, 5001);
        BBDD.addMatricula(202, 5002);
        BBDD.addMatricula(202, 5003);
        BBDD.addMatricula(203, 5001);
        BBDD.addMatricula(203, 5002);
        BBDD.addMatricula(203, 5003);
        
        
        

        BBDD.listarProfesores();

        boolean continuar = true;
        do {
            System.out.println("");
            System.out.println("********************************");
            System.out.println("***  ACADEMIA ARCAS ***");
            System.out.println("********************************");
            System.out.println("1. Profesor");
            System.out.println("2. Alumno");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opcion: ");
            String opcion = teclado.nextLine();
            if (opcion.matches("[1-3]")) {
                int opcionNumerica = Integer.parseInt(opcion);
                switch (opcionNumerica) {
                    case 1:
                        menuProfesor();
                        break;
                    case 2:
                        menuEstudiante();
                        break;
                    case 3:
                        System.out.println("Saliendo del sistema...");
                        continuar = false;
                        break;

                }

            } else {
                System.out.println("Opcion no valida");
            }

        } while (continuar != false);

    }

    private static void menuProfesor() {
        System.out.print("Dime el ID del profesor: ");
        int numero = Integer.parseInt(teclado.nextLine());
        Profesor profesor = BBDD.getProfesor(numero);
        if (profesor == null) {
            System.out.println("La ID introducida no es valida");

        }
        boolean seguir = true;
        do {
            System.out.println("");
            System.out.println("*** Menu profesor ***");
            System.out.printf("Profesor %s\n", profesor.getNombre());
            System.out.println("************************");
            System.out.println("1: Ver mis alumnos");
            System.out.println("2. Calificar");
            System.out.println("3. Registrar notas");
            System.out.println("4. Volver");
            System.out.print("Elige una opcion: ");
            int opcion = Integer.parseInt(teclado.nextLine());
            System.out.println("");
            switch (opcion) {
                case 1:
                    BBDD.listarAlumnos(profesor);
                    break;
                case 2:
                    calificar(profesor);
                    break;
                case 3:
                    BBDD.addBBDD(profesor);
                    break;
                case 4:
                    System.out.println("Volviendo...");
                    seguir = false;
                    break;
            }

        } while (seguir != false);

    }

    private static void menuEstudiante() {
        System.out.print("Dime el NRE del estudiante: ");
        int nre = Integer.parseInt(teclado.nextLine());
        Estudiante estudiante = BBDD.getEstudiante(nre);
        if (estudiante != null) {
            boolean seguir = true;
            do {
                System.out.println("");
                System.out.println("** MENU ESTUDIANTE **");
                System.out.printf("ESTUDIANTE: %s\n", estudiante.getNombre());
                System.out.println("1. Ver mis notas");
                System.out.println("2. ver mis cursos");
                System.out.println("3. Ver mi boletin");
                System.out.println("4. Volver");
                System.out.print("Dime una opcion: ");
                String entrada = teclado.nextLine();
                if (entrada.matches("[1-3]")) {
                    int opcion = Integer.parseInt(entrada);
                    switch (opcion) {
                        case 1:
                            verMisNotas(estudiante);
                            break;
                        case 2:
                            verMisMaterias(estudiante);
                            break;
                        case 3:
                            verboletin(estudiante);
                            break;
                        case 4:
                            System.out.println("Volviendo...");
                            seguir = false;
                            break;
                    }
                }
            } while (seguir != false);
        }
    }

    private static void calificar(Profesor profe) {
        Evaluacion eva = null;
        BBDD.listarAlumnos(profe);
        System.out.print("Dime el NRE del estudiante a calificar: ");
        int nre = Integer.parseInt(teclado.nextLine());
        Estudiante estudiante = BBDD.getEstudiante(nre);
        System.out.println("");
        System.out.println("1. Evaluacion Ordinaria");
        System.out.println("2. Evaluacion extraordinaria");
        System.out.print("Selecciona una opcion: ");
        int opcion = Integer.parseInt(teclado.nextLine());
        switch (opcion) {
            case 1:
                eva = Evaluacion.O;
                break;
            case 2:
                eva = Evaluacion.E;
                break;
        }
        System.out.print("Dime la calificacion del alumno: ");
        try {
            double nota = Double.parseDouble(teclado.nextLine());
            if (nota >= 0 && nota <= 10) {
                BBDD.addNota(profe, estudiante, eva, nota);
                System.out.println("Nota añadida con exito");
                System.out.println("");

            }
        } catch (Exception e) {
            System.out.println("La nota introducida no es valida");
        }

    }

    private static void verMisNotas(Estudiante estudiante) {
        System.out.printf("Calificaciones del alumno/a %s\n", estudiante.getNombre());
        System.out.printf("%10s   %4s\n", "Materia", "Calificacion");
        BBDD.listarNotas(estudiante);
        System.out.println("");
    }

    private static void verMisMaterias(Estudiante estudiante) {
        System.out.printf("Materias del alumno/a: %s\n", estudiante.getNombre());
        BBDD.listarCursos(estudiante);
        System.out.println("");
    }

    private static void verboletin(Estudiante estudiante) {
        System.out.println("");
       Boletin boletin = new Boletin(estudiante);
       boletin.addNotas(boletin);
       boletin.imprimirBoletin(boletin.getEstudiante());
        System.out.println("");
    }

}
