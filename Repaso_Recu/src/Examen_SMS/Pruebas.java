/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen_SMS;

import java.time.LocalDate;
import java.util.HashMap;

/**
 *
 * @author desn2
 */
public class Pruebas {

    private static HashMap<Integer, Medico> mapaMedicos = new HashMap();
    private static HashMap<Integer, Paciente> mapaPacientes = new HashMap();

    public static void main(String[] args) {
        Medico medico = new Medico("Alfonso", "López", LocalDate.parse("1980-02-20"));
        mapaMedicos.put(medico.getNumeroColegiado(), medico);
//        mapaCitas.put(medico, new Paciente[3][5]);
        medico = new Medico("Rocio", "Belmonte", LocalDate.parse("1985-10-02"));
        medico.setEspecialidad(Especialidad.ALERGIA);
        mapaMedicos.put(medico.getNumeroColegiado(), medico);
//        mapaCitas.put(medico, new Paciente[3][5]);

        //Añadir pacientes
        Paciente paciente = new Paciente("José", "Sánchez", LocalDate.parse("1998-05-05"));
        mapaPacientes.put(paciente.getNuss(), paciente);
        paciente = new Paciente("Mario", "Ponce", LocalDate.parse("2015-03-14"));
        mapaPacientes.put(paciente.getNuss(), paciente);

        Central.listarMedicos();
        System.out.println("");
        Central.listarPacientes();
        
        Receta receta = new Receta(medico, paciente, Medicamento.IBUPROFENO, LocalDate.parse("2001-10-04"), 5, 25);
        receta.mostrarFicha();
    }

}
