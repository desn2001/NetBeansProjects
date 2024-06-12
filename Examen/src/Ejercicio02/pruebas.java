/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio02;

import java.time.LocalDate;

/**
 *
 * @author desn2
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("DAW", "Pedro", "Gonzalez", LocalDate.parse("2000-04-01"));
        alumno1.fichaPersona();
        System.out.println("");
        Profesor profesor1 = new Profesor(Asignatura.SISTEMAS, "Adolfo", "Martin", LocalDate.parse("1975-06-10"));
        profesor1.fichaPersona();
    }
    
}
