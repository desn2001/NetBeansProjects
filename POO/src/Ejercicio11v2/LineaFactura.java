/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11v2;

/**
 *
 * @author desn2
 */
public class LineaFactura {
    private String refProducto;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;
    private double importeLinea;

    //CONSTRUCTOR
    public LineaFactura(String refProducto, String descripcion, int cantidad, double precioUnitario) {
        this.refProducto = refProducto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.importeLinea = cantidad*precioUnitario;
    }
    
    //GETTER Y SETTER
    public String getRefProducto() {
        return refProducto;
    }

    public void setRefProducto(String refProducto) {
        this.refProducto = refProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getImporteLinea() {
        return importeLinea;
    }

    public void setImporteLinea(double importeLinea) {
        this.importeLinea = importeLinea;
    }
    
    //METODOS PROPIOS
    public void imprimirLinea(){
        System.out.printf("%3d   %-15s %-10.2f %5.2f\n",this.cantidad,this.descripcion,this.precioUnitario,this.importeLinea);
    }
    
    
    
}
