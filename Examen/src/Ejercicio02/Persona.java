/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author desn2
 */
public abstract class Persona {

    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String email;
    private static int contador = 1000;

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        contador++;
    }

    public abstract String generarEmail();

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public static int getContador() {
        return contador;
    }

    public abstract void fichaPersona();

}
