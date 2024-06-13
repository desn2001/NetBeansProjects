/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
//    private static int contador = 0;

    //CONSTRUCTOR
    public Contacto(int id, String nombre,String apellido, LocalDate fecha) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = generarEmail();
        this.fecha = fecha;
    }
    
    //GETTER/SETTER
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    //METODOS PROPIOS

    @Override
    public String toString() {
        String cadena = String.format("  %2d - %-10s %-10s %-20s %-18s",this.id,this.nombre,this.apellido,this.email,this.fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyy")));
        return cadena;
    }

    private String generarEmail() {
        this.email = String.format("%s@gmail.com",this.nombre.toLowerCase());
        return email;
    }
    
    
    
    
}
