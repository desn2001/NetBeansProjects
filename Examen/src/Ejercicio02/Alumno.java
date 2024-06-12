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
public class Alumno extends Persona {

    private String curso;
    private String email;

    public Alumno(String curso, String nombre, String apellido, LocalDate fechaNacimiento) {
        super(nombre, apellido, fechaNacimiento);
        this.curso = curso;
        this.email = generarEmail();
    }

    @Override
    public String generarEmail() {
        String email;
        email = String.format("%s.%s_%d@alu.murciaeduca.es", getNombre(), getApellido(), getContador());
        return email;
    }

    @Override
    public void fichaPersona() {
        System.out.println("==================== ALUMNO ====================");
        System.out.println("NOMBRE: " + getNombre());
        System.out.println("APELLIDO: " + getApellido());
        System.out.println("FECHA NACIMIENTO: " + getFechaNacimiento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("EMAIL: " + email);
        System.out.println("================================================");
    }

}
