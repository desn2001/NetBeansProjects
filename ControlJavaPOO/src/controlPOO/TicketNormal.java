/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlPOO;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author desn2
 */
public class TicketNormal extends Ticket implements Facturable {

    public TicketNormal(String nombre, LocalDate fecha, Parada paradaIn, LocalTime horaIn) {
        super(nombre, fecha, paradaIn, horaIn);
    }

    @Override
    public double calcularImporte() {
        double segundos, km;
        segundos = calcularTiempo() * 0.0001;
        km = calcularDistancia() * 0.05;
        return segundos + km;
    }

    @Override
    public void imprimirTicket() {
        super.imprimirTicket();
        System.out.printf("IMPORTE:  %.2f€\n",calcularImporte());
        System.out.println("---------------------------------------------------------------");

    }

}
