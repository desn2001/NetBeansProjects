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
public class Profesor extends Persona {

    private Asignatura asignatura;
    private String email;

    public Profesor(Asignatura asignatura, String nombre, String apellido, LocalDate fechaNacimiento) {
        super(nombre, apellido, fechaNacimiento);
        this.asignatura = asignatura;
        this.email = generarEmail();
    }

    @Override
    public void fichaPersona() {
        System.out.println("==================== PROFESOR ====================");
        System.out.println("NOMBRE: " + getNombre());
        System.out.println("APELLIDO: " + getApellido());
        System.out.println("FECHA NACIMIENTO: " + getFechaNacimiento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("EMAIL: " + email);
        System.out.println("ASIGNATURA: "+ asignatura);
        System.out.println("==================================================");
    }

    @Override
    public String generarEmail() {
        return "";
    }

}
