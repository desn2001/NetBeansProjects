/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01;

/**
 *
 * @author desn2
 */
public class Empleado {
    private String dni;
    private String nombre;
    private String email;
    private double salarioBase;
    private int horasExtras;
    private double precioHoraExtra;

    public Empleado(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.precioHoraExtra = 10;
        this.salarioBase = 1000;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getPrecioHoraExtra() {
        return precioHoraExtra;
    }

    public void setPrecioHoraExtra(double precioHoraExtra) {
        this.precioHoraExtra = precioHoraExtra;
    }
    
    
    
    public double CalcularSueldo(){
        return salarioBase + (precioHoraExtra*horasExtras);
    }

    @Override
    public String toString() {
        return nombre + " (DNI:" +dni+")";
    }    
    
    
    
    
}
