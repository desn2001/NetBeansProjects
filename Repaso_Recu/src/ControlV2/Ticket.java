/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlV2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;

/**
 *
 * @author desn2
 */
public abstract class Ticket {
    private String nombre;
    private LocalDate fecha;
    private LocalTime horaIn;
    private LocalTime horaOut;
    private Parada paradaIn;
    private Parada paradaOut;
    private String numero;
    private HashMap<Parada, Double> lineaBus = new HashMap<>();
    private static int contador = 1000;

    public Ticket(String nombre, LocalDate fecha, LocalTime horaIn, Parada paradaIn) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.horaIn = horaIn;
        this.paradaIn = paradaIn;
        this.horaOut = null;
        this.paradaOut = null;
        this.numero = String.format("%d%d%d%d",fecha.getYear(),fecha.getMonthValue(),fecha.getDayOfMonth(),contador );
        contador++;
    }
    
    public void finalizarViaje(Parada paradaOut, LocalTime horaOut){
        this.horaOut = horaOut;
        this.paradaOut = paradaOut;
    }
    
    abstract void imprimirTicket();
    
    private void cargarDistancias() {
        lineaBus.put(Parada.HOSPITAL, -5.04);
        lineaBus.put(Parada.CEMENTERIO, -3.52);
        lineaBus.put(Parada.VIÑA, -1.31);
        lineaBus.put(Parada.SANJOSE, -0.71);
        lineaBus.put(Parada.OVALO, 0.0);
        lineaBus.put(Parada.COLUMNAS, 0.35);
        lineaBus.put(Parada.ARCAS, 0.73);
        lineaBus.put(Parada.BASILIO, 1.26);
        lineaBus.put(Parada.ESTACION, 1.7);
        lineaBus.put(Parada.APOLONIA, 2.34);
    }
    
    
}
