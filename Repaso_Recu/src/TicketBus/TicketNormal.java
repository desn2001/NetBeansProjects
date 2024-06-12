/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicketBus;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author desn2
 */
public class TicketNormal extends Ticket implements Facturable{

    public TicketNormal(String nombre, LocalDate fecha, LocalTime horaIn, Parada paradaIn) {
        super(nombre, fecha, horaIn, paradaIn);
    }
    
    

    @Override
    public void imprimirTicket() {
        String fechaConFormato = getFecha().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("*********************************************");
        System.out.println("Ticket: Normal");
        System.out.println("Nª: " + getNumero());
        System.out.println("---------------------------------------------");
        System.out.printf("fecha: %s\n", fechaConFormato);
        System.out.printf("Hora: %s\n", getHoraIn());
        System.out.printf("Parada: %s\n", getParadaIn());
        System.out.println("---------------------------------------------");
        if (getParadaOut() != null) {
            System.out.printf("Hora: %s\n", getHoraOut());
            System.out.printf("Parada: %s\n", getParadaOut());
            System.out.println("---------------------------------------------");
            int segundosTotales = calcularTiempo();
            int horas = segundosTotales/3600;
            int minutos = Math.abs(((horas*3600) - segundosTotales)/60);
            int segundos = segundosTotales -(horas*3600)-(minutos*60);
            System.out.printf("Tiempo: %02d:%02d:%02d\n",horas,minutos,segundos);
            
            
            System.out.printf("Distancia: %.1f Km\n",calcularDistancia());
            System.out.println("---------------------------------------------");
            System.out.printf("IMPORTE: %.2f€\n",calcularImporte());
        } else {
            System.out.println("Pasajero viajando...");
        }
        System.out.println("*********************************************");
    }

    @Override
    public Double calcularImporte() {
        return calcularTiempo()*0.0001 + calcularDistancia()*0.05;
    }
    
}
