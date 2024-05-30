/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author desn2
 */
public class TicketNormal extends Ticket implements Facturable{

    public TicketNormal(String nombre, Parada paradaIn, LocalDate fecha, LocalTime horaIn) {
        super(nombre, paradaIn, fecha, horaIn);
    }

    @Override
    public void imprimirTicket() {
        System.out.println("************* TICKET NORMAL *************");
        System.out.println("Ticket: " + getNombre());
        System.out.println("Nª: " + getNumero());
        System.out.println("-----------------------------------------");
        System.out.println("Fecha: " + getFecha().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Hora: " + getHoraIn());
        System.out.println("Parada: " + getParadaIn());
        System.out.println("-----------------------------------------");
        if (getParadaOut() != null) {
            System.out.println("Hora: "+getHoraOut());
            System.out.println("Parada: "+getParadaOut());
            System.out.println("-----------------------------------------");
            int segundosTotales = calcularTiempo();
            int horas = segundosTotales / 3600;
            int minutos = Math.abs(horas * 3600 - segundosTotales) / 60;
            int segundos = Math.abs((segundosTotales - (horas * 3600)) - (minutos * 60));
            System.out.printf("Tiempo: %02d:%02d:%02d\n", horas, minutos, segundos);
            System.out.printf("Distancia: %.1f Km\n", calcularDistancia());
            System.out.println("-----------------------------------------");
            System.out.printf("IMPORTE: %.2f €\n",calcularImporte());
        } else {
            System.out.println("Pasajero Viajando...");
        }
        System.out.println("*****************************************");
    }

    @Override
    public double calcularImporte() {
        if (getParadaOut()!= null) {
            return (calcularTiempo()*0.0001 + calcularDistancia()*0.05);
        }
        return 0;
    }

}
