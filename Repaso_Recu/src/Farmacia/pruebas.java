/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Farmacia;

import java.time.LocalDate;

/**
 *
 * @author desn2
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Paciente paciente = new Paciente("Diego", "Sánchez", LocalDate.parse("2001-10-04"));
//        
//        paciente.mostrarFicha();
//        
//        System.out.println(paciente.toString());
//
        Medico medico = Central.getMedico(9001);
        Paciente paciente = Central.getPaciente(3025004);
        LocalDate fecha = LocalDate.parse("2001-01-01");
//        Central.altaReceta(medico, paciente, fecha, Medicamento.ANTIBIOTICO, 4, 100);
        Central.mostrarRecetas(paciente);
//        
//        System.out.println(medico.toString());
//        Central.imprimirCalendario(medico);
//
//        Central.añadirCita(medico, 0, 0, paciente);
//        Central.imprimirCalendario(medico);
//        Central.liberarCita(medico, 0, 0);
//        Central.imprimirCalendario(medico);
//            Central.cargarDriverBBDD();
//            Central.conectar();
//            Central.desconectar();
    }

}
