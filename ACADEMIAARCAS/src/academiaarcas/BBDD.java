/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACADEMIAARCAS;

import java.util.ArrayList;
import java.util.Scanner;
import java.sql.*;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juanfran.garcia
 */
public class BBDD {

    private static Scanner teclado = new Scanner(System.in);
    private static ArrayList<Profesor> listaProfesores = new ArrayList<>();
    private static ArrayList<Estudiante> listaAlumnos = new ArrayList<>();
    private static ArrayList<Matricula> listaMatriculas = new ArrayList<>();
    private static ArrayList<Nota> listaNotas = new ArrayList<>();
    private static ArrayList<Boletin> listaBoletines = new ArrayList<>();
    static String url = "jdbc:mariadb://127.0.0.1:3306/notas";
    static String user = "root";
    static String pass = "";
    static Connection conexion;
    static Statement st;
//"org.mariadb.jdbc.Driver"

    public static void addProfesor(String nombre, Materia materia) {
        Profesor profesor = new Profesor(nombre, materia);
        listaProfesores.add(profesor);

    }

    public static void listarProfesores() {
        System.out.println("** Lista de profesores **");
        System.out.println("*****************************");
        for (Profesor p : listaProfesores) {
            System.out.println(p);
        }
    }

    public static Profesor getProfesor(int id) {
        for (Profesor p : listaProfesores) {
            if (p.getIdProf() == id) {
                return p;

            }
        }
        return null;
    }

    public static void addEstudiante(String nombre) {
        Estudiante estudiante = new Estudiante(nombre);
        listaAlumnos.add(estudiante);
    }

    public static void listarAlumnos() {
        System.out.println("** Lista de alumnos **");
        System.out.println("**************************");
        for (Estudiante e : listaAlumnos) {
            System.out.println(e);
        }
    }

    public static void listarAlumnos(Profesor profesor) {
        System.out.printf("LISTA DE ALUMNOS DEL PROFESOR/A: %s\n", profesor.getNombre());
        for (Matricula m : listaMatriculas) {
            if (m.getProfesor().equals(profesor)) {
                System.out.println(m.getEstudiante());

            }
        }
    }

    public static void addNota(Profesor profesor, Estudiante estudiante, Evaluacion eva, double calificacion) {
        Matricula matricula = BBDD.getMatricula(estudiante, profesor);
        Nota nota = new Nota(matricula, eva, calificacion);
        listaNotas.add(nota);
    }
    
    public static void addBoletin(Estudiante estudiante){
        Boletin boletin = new Boletin(estudiante);
        listaBoletines.add(boletin);
    }

    public static void listarNotas(Estudiante estudiante) {
        for (Nota n : listaNotas) {
            if (n.getMatricula().getEstudiante().equals(estudiante)) {
                System.out.println(n);
            }
        }

    }

    public static Estudiante getEstudiante(int numero) {
        for (Estudiante e : listaAlumnos) {
            if (e.getNRE() == numero) {
                return e;
            }
        }

        return null;
    }

    public static void addMatricula(int idProfesor, int idAlumno) {
        Profesor profesor = BBDD.getProfesor(idProfesor);
        Estudiante estudiante = BBDD.getEstudiante(idAlumno);
        Matricula matricula = new Matricula(estudiante, profesor);

        listaMatriculas.add(matricula);
    }

    public static void listarMatriculas() {
        System.out.println("** Lista de matriculas **");
        System.out.println("****************************");
        for (Matricula m : listaMatriculas) {
            System.out.println(m);

        }
    }

    public static void listarCursos(Estudiante estudiante) {
        for (Matricula m : listaMatriculas) {
            if (m.getEstudiante().equals(estudiante)) {
                System.out.printf("- %s\n", m.getMateria());

            }
        }
    }

    public static Matricula getMatricula(Estudiante estudiante, Profesor profesor) {
        for (Matricula m : listaMatriculas) {
            if (m.getProfesor().equals(profesor) && m.getEstudiante().equals(estudiante)) {
                return m;

            }
        }
        return null;
    }

    public static void addBBDD(Profesor profesor) {
        conectarBBDD();
        try {
            st = conexion.createStatement();
            for (Nota n : listaNotas) {
                if (n.getMatricula().getProfesor().equals(profesor)) {
                    String sql = String.format(Locale.US, "INSERT INTO notas VALUES(null, %d, %d, '%s', '%s', %.2f)", n.getMatricula().getProfesor().getIdProf(), n.getMatricula().getEstudiante().getNRE(), n.getMatricula().getMateria(), n.getEvaluacion(), n.getNota());
                    st.executeUpdate(sql);
                }
            }
            st.close();

        } catch (SQLException ex) {
            System.out.println("Error al meter en BBDD");
        }

        desconectarBBDD();
    }
    
    
    

    public static void conectarBBDD() {

        try {
            //cargar drivers
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            
            conexion = DriverManager.getConnection(url, user, pass);
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println("Error al cargar drivers");
        } catch (SQLException ex) {
            System.out.println("Error al conectar BBDD");
        }

    }

    public static void desconectarBBDD() {
        try {
            conexion.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al desconectar");
        }
    }
}
