/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author desn2
 */
public class TicketEstudiante extends Ticket {

    private String centroEducativo;

    public TicketEstudiante(String centroEducativo, String nombre, LocalDate fecha, LocalTime horaIn, Parada paradaIn) {
        super(nombre, fecha, horaIn, paradaIn);
        this.centroEducativo = centroEducativo;
    }

    @Override
    public void ImprimirTicket() {
        System.out.println("****************************************************");
        System.out.println("Ticket: Estudiante");
        System.out.println("Nª: " + getNumero());
        System.out.println("Centro: " +centroEducativo);
        System.out.println("----------------------------------------------------");
        System.out.println("Fecha: " + getFecha().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Hora: " + getHoraIn());
        System.out.println("Parada: " + getParadaIn());
        System.out.println("----------------------------------------------------");
        if (getHoraOut() != null) {
            System.out.println("Hora: " + getHoraOut());
            System.out.println("Parada: " + getParadaOut());
            System.out.println("----------------------------------------------------");
            int horas, minutos, segundos;
            horas = calcularTiempo() / 3600;
            minutos = Math.abs((horas * 3600) - calcularTiempo()) / 60;
            segundos = (calcularTiempo() - horas * 3600) - minutos * 60;

            System.out.println("Tiempo: " + horas + ":" + minutos + ":" + segundos);

            System.out.printf("Distancia: %.1f km\n", calcularDistancia());
            System.out.println("----------------------------------------------------");
            System.out.println("Importe: Exento");
        } else {
            System.out.println("Pasajero viajando...");
        }
        System.out.println("****************************************************");

    }

}
