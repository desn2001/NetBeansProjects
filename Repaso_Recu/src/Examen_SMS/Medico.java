/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_SMS;

import java.time.LocalDate;

/**
 *
 * @author desn2
 */
public class Medico extends Persona{
    private int numeroColegiado;
    private Especialidad especialidad;
    private static int contadorMedico = 9001;

    public Medico(String nombre, String apellido, LocalDate fechaNacimiento) {
        super(nombre, apellido, fechaNacimiento);
        especialidad = Especialidad.GENERAL;
        this.numeroColegiado = contadorMedico;
        contadorMedico++;
        
    }
    
    

    @Override
    public String generaEmail() {
        String cadena = String.format("%d@sms.es",this.numeroColegiado );
        return cadena;
    }

    @Override
    public String toString() {
        String cadena = String.format("(col. Nª %d) %s Doctor %s [%s] ",this.numeroColegiado,this.especialidad,super.getApellido(),super.getDni());
        return cadena;
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
    
    
    
    
    
    
    
}
