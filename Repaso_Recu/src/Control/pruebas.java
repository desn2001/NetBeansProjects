/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Control;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author desn2
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        LocalDate fecha = LocalDate.parse("2024-05-17");
//        String numero;
//        numero = String.format("%d%02d%02d",fecha.getYear(),fecha.getMonthValue(),fecha.getDayOfMonth());
//        System.out.println(numero);

        TicketEstudiante nuevoTicket = new TicketEstudiante("IES Ramón Arcas", "Estudiante", LocalDate.parse("2024-05-15"), LocalTime.parse("10:00"), Parada.OVALO);
        nuevoTicket.finalizarViaje(Parada.ARCAS,LocalTime.parse("11:20:35") );
        nuevoTicket.ImprimirTicket();
        System.out.println("");
        System.out.println("");
        TicketNormal ticket1 = new TicketNormal("Normal", LocalDate.parse("2024-05-15"), LocalTime.parse("10:00"), Parada.OVALO);
        ticket1.finalizarViaje(Parada.APOLONIA, LocalTime.parse("13:15:25"));
        ticket1.ImprimirTicket();
        
        
    }
    
}
