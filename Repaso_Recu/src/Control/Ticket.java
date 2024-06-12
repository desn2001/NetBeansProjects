/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;

/**
 *
 * @author desn2
 */
public abstract class Ticket implements Medible {

    private String numero;
    private String nombre;
    private LocalDate fecha;
    private LocalTime horaIn;
    private LocalTime horaOut;
    private Parada paradaIn;
    private Parada paradaOut;
    private HashMap<Parada, Double> lineaBus = new HashMap<>();
    private static int contador = 1000;

    public Ticket(String nombre, LocalDate fecha, LocalTime horaIn, Parada paradaIn) {
        cargarDistancias();
        this.nombre = nombre;
        this.fecha = fecha;
        this.horaIn = horaIn;
        this.paradaIn = paradaIn;
        this.horaOut = null;
        this.paradaOut = null;
        this.numero = String.format("%d%02d%02d%d", fecha.getYear(), fecha.getMonthValue(), fecha.getDayOfMonth(), contador);
        contador++;
    }

    public void finalizarViaje(Parada paradaOut, LocalTime horaOut) {
        this.horaOut = horaOut;
        this.paradaOut = paradaOut;
    }

    public void ImprimirTicket() {

    }

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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraIn() {
        return horaIn;
    }

    public void setHoraIn(LocalTime horaIn) {
        this.horaIn = horaIn;
    }

    public LocalTime getHoraOut() {
        return horaOut;
    }

    public void setHoraOut(LocalTime horaOut) {
        this.horaOut = horaOut;
    }

    public Parada getParadaIn() {
        return paradaIn;
    }

    public void setParadaIn(Parada paradaIn) {
        this.paradaIn = paradaIn;
    }

    public Parada getParadaOut() {
        return paradaOut;
    }

    public void setParadaOut(Parada paradaOut) {
        this.paradaOut = paradaOut;
    }

    public HashMap<Parada, Double> getLineaBus() {
        return lineaBus;
    }

    public void setLineaBus(HashMap<Parada, Double> lineaBus) {
        this.lineaBus = lineaBus;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Ticket.contador = contador;
    }

    @Override
    public int calcularTiempo() {
        if (paradaOut != null) {
            return (int) ChronoUnit.SECONDS.between(horaIn, horaOut);
        }
        return 0;
    }

    @Override
    public double calcularDistancia() {
        if (paradaOut != null) {
            return Math.abs(lineaBus.get(paradaIn) - lineaBus.get(paradaOut));
        } else {
            return 0;
        }
    }

}
