/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda;

import java.time.LocalDate;

/**
 *
 * @author desn2
 */
public class Contacto {

    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private LocalDate fecha;
    private static int contador = 1;

    public Contacto(String nombre, String apellido, LocalDate fecha) {
        this.id = contador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = generarEmail();
        this.fecha = fecha;
        contador++;
    }

    private String generarEmail() {
        return String.format("%s.%s@gmail.com", this.nombre, this.apellido);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Contacto.contador = contador;
    }

}
