/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio06;

import java.time.LocalDate;

/**
 *
 * @author desn2
 */
public class Alquiler {
    private Vehiculo vehiculo;
    private int km_inicio;
    private int km_fin;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private double importe;

    public Alquiler(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.km_inicio = vehiculo.km;
        this.km_fin = vehiculo.km;
        this.fecha_inicio = null;
        this.fecha_fin = null;
        this.importe = 0;        
    }
    
    
}
