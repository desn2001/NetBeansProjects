/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Farmacia;

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
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaConFormato = fecha.format(dtf);
        System.out.println("---------------------------------");
        System.out.printf("%s                    %s\n", medicamento, fechaConFormato);
        System.out.printf("Dosis: %.1f mg/dia\n", dosis);
        System.out.printf("Duración: %d\n", duracion);
    }

    @Override
    public String toString() {
        String cadena = String.format("NUSS:%d NªCol:%d Medicamento:%s Fecha:%s Dias:%d Dosis:%.2f ",paciente.getNuss(),medico.getNumeroColegiado(),this.medicamento,this.fecha,this.duracion,this.dosis);
        return cadena;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getDosis() {
        return dosis;
    }

    public void setDosis(double dosis) {
        this.dosis = dosis;
    }

    public boolean isCaducado() {
        return caducado;
    }

    public void setCaducado(boolean caducado) {
        this.caducado = caducado;
    }
    
    
    
}
