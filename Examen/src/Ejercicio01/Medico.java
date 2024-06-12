/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01;

import java.time.LocalDate;

/**
 *
 * @author desn2
 */
public class Medico extends Persona{
    private int numeroColegiado;
    private Especialidad especialidad;
    private static int contadorMedico;

    public Medico(String nombre, String apellido, LocalDate fechaNacimiento) {
        super(nombre, apellido, fechaNacimiento);
        this.numeroColegiado = generarCodigo();
        especialidad = Especialidad.GENERAL;
    }
    
    
    public int generarCodigo(){
        return 0;
    }

    @Override
    public String generaEmail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(int numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public static int getContadorMedico() {
        return contadorMedico;
    }

    public static void setContadorMedico(int contadorMedico) {
        Medico.contadorMedico = contadorMedico;
    }

    @Override
    public String toString() {
        return "Medico{" + "numeroColegiado=" + numeroColegiado + ", especialidad=" + especialidad + '}';
    }
    
    
    
}
