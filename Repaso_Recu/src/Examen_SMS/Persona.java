/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_SMS;

import java.time.LocalDate;

/**
 *
 * @author desn2
 */
public abstract class Persona  {

    private String dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String email;
    private static int contadorDNI = 0;

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = generaDNI();
        this.email = generaEmail();
    }

    public String generaDNI() {
        contadorDNI++;
        int numero = 25000 + contadorDNI;
        String letra = Character.toString('A' + numero % 26);
        return numero + letra;
    }
    
    public abstract String generaEmail();

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getContadorDNI() {
        return contadorDNI;
    }

    public static void setContadorDNI(int contadorDNI) {
        Persona.contadorDNI = contadorDNI;
    }
    
    

}
