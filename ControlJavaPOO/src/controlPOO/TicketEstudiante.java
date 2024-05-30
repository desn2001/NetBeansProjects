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
public class TicketEstudiante extends Ticket {

    private String centroEducativo;

    public TicketEstudiante(String centroEducativo, String nombre, LocalDate fecha, Parada paradaIn, LocalTime horaIn) {
        super(nombre, fecha, paradaIn, horaIn);
        this.centroEducativo = centroEducativo;
    }

    public String getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(String centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    @Override
    public void imprimirTicket() {
        super.imprimirTicket();
        System.out.println("Importe: Exento");
        System.out.println("---------------------------------------------------------------");
    }

}
