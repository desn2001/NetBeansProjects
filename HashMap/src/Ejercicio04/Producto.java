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

    public void añadirUnidades(int uni) {
        this.unidades = this.unidades + uni;
    }

    public void restarUnidades(int uni) {
        this.unidades = this.unidades - uni;
    }

    @Override
    public String toString() {
        return String.format("%-10s   %10.2f€   %d unidades\n", descripcion, precio, unidades);

    }
}
