/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlPOO;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;

/**
 *
 * @author desn2
 */
public class pruebas {

//    static HashMap<Parada, Double> lineaBus = new HashMap<>();
    public static void main(String[] args) {

//        //Prueba de calculo de Distancias.
//        lineaBus.put(Parada.HOSPITAL, -5.04);
//        lineaBus.put(Parada.CEMENTERIO, -3.52);
//        lineaBus.put(Parada.VIÑA, -1.31);
//        lineaBus.put(Parada.SANJOSE, -0.71);
//        lineaBus.put(Parada.OVALO, 0.0);
//        lineaBus.put(Parada.COLUMNAS, 0.35);
//        lineaBus.put(Parada.ARCAS, 0.73);
//        lineaBus.put(Parada.BASILIO, 1.26);
//        lineaBus.put(Parada.ESTACION, 1.7);
//        lineaBus.put(Parada.APOLONIA, 2.34);
//
//        Parada paradaIn = Parada.OVALO;
//        Parada paradaOut = Parada.ARCAS;
//        double distancia;
//        
//        if (paradaOut != null) {
//            distancia = Math.abs(lineaBus.get(paradaOut) - lineaBus.get(paradaIn));
//            System.out.printf("%.1f Km\n",distancia);
//        }else{
//            System.out.println("PASAJERO VIAJANDO");
//        }
//        int segundosTotales;
//        segundosTotales = nuevoTicket.calcularTiempo();
//        System.out.println("Segundos totales: " + segundosTotales);
//        int horas, min, seg;
//        horas = segundosTotales / 3600;
//        min = Math.abs((segundosTotales - (horas * 3600)) / 60);
//        seg = Math.abs((segundosTotales - (horas * 3600))-(min*60));
//        System.out.println("Horas: " + horas);
//        System.out.println("minutos: " + min);
//        System.out.println("segundos: " + seg);

        TicketNormal nuevoTicket = new TicketNormal("NORMAL", LocalDate.now(), Parada.OVALO, LocalTime.parse("10:00"));
        nuevoTicket.finalizarViaje(Parada.APOLONIA, LocalTime.parse("13:15:25"));
        nuevoTicket.imprimirTicket();
        System.out.println("");
        TicketEstudiante ticket1 = new TicketEstudiante("IES RAMÓN ARCAS", "ESTUDIANTE", LocalDate.now(), Parada.OVALO, LocalTime.parse("10:00"));
        ticket1.finalizarViaje(Parada.ARCAS, LocalTime.parse("11:20:35"));
        ticket1.imprimirTicket();

    }

}
