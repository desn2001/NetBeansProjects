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
public class Paciente extends Persona{
    private int nuss;

    public Paciente(String nombre, String apellido, LocalDate fechaNacimiento) {
        super(nombre, apellido, fechaNacimiento);
        this.nuss = generaNuss(super.getDni());
    }
    
    
    private int generaNuss(String dni){
        String dniSinLetra = dni.substring(0,dni.length()-1);
        String cadena = String.format("30%s", dniSinLetra);
        int nussInt = Integer.parseInt(cadena);
        return nussInt;
    }
    @Override
    public String generaEmail() {
        String nomSinAcentos =Utilidades.limpiarAcentos(super.getNombre().toLowerCase());
        String ApeSinAcentos =Utilidades.limpiarAcentos(super.getApellido().toLowerCase());
        String cadena = String.format("%s.%s@arcas.es",nomSinAcentos,ApeSinAcentos);
        return cadena;
    }

    @Override
    public String toString() {
        String cadena = String.format("(NUSS %d) %s %s [%s]",nuss,super.getNombre(),super.getApellido(),super.getDni());
        return cadena;
    }
    
    

    public int getNuss() {
        return nuss;
    }

    public void setNuss(int nuss) {
        this.nuss = nuss;
    }
    
    

    
    
    
    
}
