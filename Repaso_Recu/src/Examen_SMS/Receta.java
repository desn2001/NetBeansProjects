/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_SMS;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author desn2
 */
public class Receta {

    private Medico medico;
    private Paciente paciente;
    private Medicamento medicamento;
    private LocalDate fecha;
    private int duracion;
    private double dosis;
    private boolean caducado;

    public Receta(Medico medico, Paciente paciente, Medicamento medicamento, LocalDate fecha, int duracion, double dosis) {
        this.medico = medico;
        this.paciente = paciente;
        this.medicamento = medicamento;
        this.fecha = fecha;
        this.duracion = duracion;
        this.dosis = dosis;
    }

    public void mostrarFicha() {
        String fechaConformato = fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("====================================================");
        System.out.printf("| Doctor/a: %s               Nª Col.: %5d  |\n", medico.getApellido(), medico.getNumeroColegiado());
        System.out.println("----------------------------------------------------");
        System.out.printf("|%s, %s                      NUSS: %10d|\n", paciente.getApellido(), paciente.getNombre(), paciente.getNuss());
        System.out.println("----------------------------------------------------");
        System.out.printf("|%s      %34s|\n",medicamento,fechaConformato);
        System.out.printf("|Dosis: %3.1f mg/dia                                |\n",dosis);
        System.out.printf("|Duración: %4d días                               |\n",duracion);
        System.out.println("====================================================");
    }

}
