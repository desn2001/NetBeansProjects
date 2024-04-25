/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01;

/**
 *
 * @author desn2
 */
public class Contable extends Empleado{
    private double plusSalario;

    public Contable(String dni, String nombre) {
        super(dni, nombre);
        this.plusSalario = 200;
    }

    @Override
    public double CalcularSueldo() {
        return super.CalcularSueldo() + plusSalario;
    }
    
    
    
}
