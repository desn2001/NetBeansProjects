/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego.sanchez
 */
public class Datos {

    public static void altaAlumnos(Alumno[] alumnos) {
        alumnos[0] = new Alumno("José", "jose@gmail.com", 17);
        alumnos[1] = new Alumno("Alicia", "alicia@gmail.com", 18);
        alumnos[2] = new Alumno("Jorge", "jorge@gmail.com", 16);
        alumnos[3] = new Alumno("María", "maria@gmail.com", 15);
        alumnos[4] = new Alumno("Manuel", "manuel@gmail.com", 16);
        alumnos[5] = new Alumno("Sofía", "sofia@gmail.com", 18);
        alumnos[6] = new Alumno("Luis", "luis@gmail.com", 15);
        alumnos[7] = new Alumno("Charo", "charo@gmail.com", 17);
        alumnos[8] = new Alumno("Paco", "paco@gmail.com", 18);
        alumnos[9] = new Alumno("Esther", "esther@gmail.com", 17);
    }

    public static void altaMaterias(String[] nombreMaterias, Materia[] materias, double[] preciosMaterias) {
        for (int i = 0; i < nombreMaterias.length; i++) {
            materias[i] = new Materia(nombreMaterias[i], preciosMaterias[i]);
        }
    }

    public static void matricularAlumnos(Materia[] materias, Alumno[] alumnos) {
        // Alumnos de Lengua
        materias[0].addAlumno(alumnos[1]);
        materias[0].addAlumno(alumnos[3]);
        materias[0].addAlumno(alumnos[5]);
        materias[0].addAlumno(alumnos[7]);
        // Alumnos de Inglés
        materias[1].addAlumno(alumnos[1]);
        materias[1].addAlumno(alumnos[3]);
        materias[1].addAlumno(alumnos[5]);
        materias[1].addAlumno(alumnos[7]);
        materias[1].addAlumno(alumnos[9]);
        // Alumnos de Matemáticas
        materias[2].addAlumno(alumnos[0]);
        materias[2].addAlumno(alumnos[1]);
        materias[2].addAlumno(alumnos[2]);
        materias[2].addAlumno(alumnos[3]);
        materias[2].addAlumno(alumnos[4]);
        // Alumnos de Física
        materias[3].addAlumno(alumnos[4]);
        materias[3].addAlumno(alumnos[8]);
        // Alumnos de Química
        materias[4].addAlumno(alumnos[0]);
        materias[4].addAlumno(alumnos[2]);
        materias[4].addAlumno(alumnos[4]);
        materias[4].addAlumno(alumnos[6]);
    }

    public static void calificar(Materia[] materias, Alumno[] alumnos) {
        // Alumnos de Lengua
        materias[0].calificar(alumnos[1], 6);
        materias[0].calificar(alumnos[3], 5);
        materias[0].calificar(alumnos[5], 7);
        materias[0].calificar(alumnos[7], 4);
        // Alumnos de Inglés
        materias[1].calificar(alumnos[1], 5);
        materias[1].calificar(alumnos[3], 8);
        materias[1].calificar(alumnos[5], 7);
        materias[1].calificar(alumnos[7], 5);
        materias[1].calificar(alumnos[9], 6);
        // Alumnos de Matemáticas
        materias[2].calificar(alumnos[0], 4);
        materias[2].calificar(alumnos[1], 6);
        materias[2].calificar(alumnos[2], 5);
        materias[2].calificar(alumnos[3], 7);
        materias[2].calificar(alumnos[4], 6);
        // Alumnos de Física
        materias[3].calificar(alumnos[4], 5);
        materias[3].calificar(alumnos[8], 4);
        // Alumnos de Química
        materias[4].calificar(alumnos[0], 4);
        materias[4].calificar(alumnos[2], 5);
        materias[4].calificar(alumnos[4], 6);
        materias[4].calificar(alumnos[6], 5);
    }
}
