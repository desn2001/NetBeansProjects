/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TicketBus;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author desn2
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TicketEstudiante  ticket1 = new TicketEstudiante("Estudiante", LocalDate.now(), LocalTime.parse("10:00"), Parada.OVALO);
        ticket1.finalizarViaje(Parada.ARCAS, LocalTime.parse("11:20:35"));
        ticket1.imprimirTicket();
        System.out.println("");
        
        TicketNormal ticket2 = new TicketNormal("Normal", LocalDate.now(), LocalTime.parse("10:00"), Parada.OVALO);
        ticket2.finalizarViaje(Parada.APOLONIA, LocalTime.parse("13:15:25"));
        ticket2.imprimirTicket();
    }
    
}
