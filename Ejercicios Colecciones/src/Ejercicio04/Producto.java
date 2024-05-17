/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio04;

/**
 *
 * @author desn2
 */
public class Producto {
    private String descripcion;
    private double precio;
    private int unidades;

    public Producto(String descripcion, double precio, int unidades) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    public void añadirUnidades(int contador){
        this.unidades = this.unidades + contador;
    }
    
    public void restarUnidades(int contador){
        this.unidades = this.unidades - contador;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f€ %d unidades",descripcion,precio,unidades);
    }
    
    
    
}
