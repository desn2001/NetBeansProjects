/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio06;

import java.time.LocalDate;

/**
 *
 * @author desn2
 */
public class Turismo extends Vehiculo{
    
    private double precioDia;

    public Turismo(String matricula, String marca_modelo, int km) {
        super(matricula, marca_modelo, km);
    }

    @Override
    public void alquilar(LocalDate fechaAlquiler) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void devolver(LocalDate fechaAlquiler, int km) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
