/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlPOO;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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

    public Ticket(String nombre, LocalDate fecha, Parada paradaIn, LocalTime horaIn) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.paradaIn = paradaIn;
        this.horaIn = horaIn;
        this.horaOut = null;
        this.paradaOut = null;
        cargarDistancias();
        this.numero = String.format("%d%d%d%d", fecha.getYear(), fecha.getMonthValue(), fecha.getDayOfMonth(), contador);
        contador++;
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

    public void finalizarViaje(Parada paradaOut, LocalTime horaOut) {
        this.paradaOut = paradaOut;
        this.horaOut = horaOut;
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

    @Override
    public int calcularTiempo() {
        if (horaOut != null) {
            return (int) ChronoUnit.SECONDS.between(horaIn, horaOut);
        }
        return 0;
    }

    @Override
    public double calcularDistancia() {
        if (paradaOut != null) {
            return Math.abs(lineaBus.get(paradaOut) - lineaBus.get(paradaIn));
        } else {
            return 0;
        }
    }

    public void imprimirTicket() {
        System.out.println("************************ TICKET ************************");
        System.out.println("*TICKET: " + nombre+"                                        *");
        System.out.println("*Nª: " + numero+"                                       *");
        if (this instanceof TicketEstudiante) {
            System.out.println("*Centro: " + ((TicketEstudiante) this).getCentroEducativo()+"                  *");
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("Fecha: " + fecha.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));
        System.out.println("Hora: " + horaIn);
        System.out.println("Parada: " + paradaIn);
        System.out.println("---------------------------------------------------------------");
        if (horaOut == null) {
            System.out.println("PASAJERO VIAJANDO...");
            System.out.println("---------------------------------------------------------------");
        } else {
            int segundosTotales, horas, min, seg;
            segundosTotales = calcularTiempo();
            horas = segundosTotales / 3600;
            min = Math.abs((segundosTotales - (horas * 3600)) / 60);
            seg = Math.abs((segundosTotales - (horas * 3600)) - (min * 60));
            System.out.println("Hora: " + horaOut);
            System.out.println("Parada: " + paradaOut);
            System.out.println("---------------------------------------------------------------");
            System.out.println("Tiempo: " + String.format("%d:%d:%d", horas, min, seg));
            System.out.printf("Distancia: %.1f km\n", calcularDistancia());
            System.out.println("---------------------------------------------------------------");
        }

    }

}
