/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01;

/**
 *
 * @author desn2
 */
public class Director extends Empleado{
    private int numDespacho;
    private double plusSalario;

    public Director(String dni, String nombre,int numDespacho) {
        super(dni, nombre);
        this.numDespacho = numDespacho;
        this.plusSalario = 400;
    }

    @Override
    public double CalcularSueldo() {
        return super.CalcularSueldo() + plusSalario; 
    }
    
    public void analizarDatos(){
        System.out.println("Estoy analizando muchos datos...");
    }
    
    
    
    
    
}
