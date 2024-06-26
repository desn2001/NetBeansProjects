/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LigaBaloncesto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author desn2
 */
public class Jugador {

    private int id;
    private String nombre;
    private LocalDate fecha_nac;

    //CONSTRUCTOR
    public Jugador(int id, String nombre, LocalDate fecha_nac) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_nac = fecha_nac;
    }

    //METODOS GETTER/SETTER
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

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    @Override
    public String toString() {
        int edad = (int) ChronoUnit.YEARS.between(fecha_nac, LocalDate.now());
        return String.format("%s  %d años (%s)", nombre,edad,fecha_nac.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

}
