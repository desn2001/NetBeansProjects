/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

/**
 *
 * @author desn2
 */
public class Producto {
    private String ref;
    private String descripcion;
    private double precioUnitario;

    public Producto(String ref, String descripcion, double precioUnitario) {
        this.ref = ref;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Producto{" + "ref=" + ref + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario + '}';
    }
    
    public void mostrarProducto(){
        System.out.printf(" %s %-15s %.2f%n",this.ref,this.descripcion,this.precioUnitario);
    }
    
}
