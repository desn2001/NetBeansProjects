/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

/**
 *
 * @author desn2
 */
public class LineaFactura {
    private Producto producto;
    private int cantidad;
    private double importeLinea;

    public LineaFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.importeLinea = producto.getPrecioUnitario() * this.cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporteLinea() {
        return importeLinea;
    }

    public void setImporteLinea(double importeLinea) {
        this.importeLinea = importeLinea;
    }
    
    public void imprimirLinea(){
        System.out.printf("%6s %-15s  %2d  %5.2f %6.2f%n",producto.getRef(),producto.getDescripcion(),cantidad,producto.getPrecioUnitario(),this.importeLinea);
    } 
    
}
