/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author desn2
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TicketNormal ticket1 = new TicketNormal("NORMAL", Parada.OVALO, LocalDate.parse("2020-02-02"), LocalTime.parse("10:00:00"));
        ticket1.finalizarViaje(Parada.APOLONIA, LocalTime.parse("13:15:25"));
        ticket1.imprimirTicket();
        System.out.println("");
        System.out.println("");
        TicketEstudiante ticket2 = new TicketEstudiante("IES RAMON ARCAS", "ESTUDIANTE", Parada.OVALO, LocalDate.parse("15/05/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy")), LocalTime.parse("10:00"));
        ticket2.finalizarViaje(Parada.ARCAS, LocalTime.parse("11:20:35"));
        ticket2.imprimirTicket();
    }

}
