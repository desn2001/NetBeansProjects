/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio05;

/**
 *
 * @author desn2
 */
public class Casa {
    private String propietario;
    private int superficiep1;
    private int superficiep2;
    private double precioVenta;

    //Constructor
    public Casa(String propietario, int superficiep1, int superficiep2, double precioVenta) {
        this.propietario = propietario;
        this.superficiep1 = superficiep1;
        this.superficiep2 = superficiep2;
        this.precioVenta = precioVenta;
    }
    
    //Metodos getter y setter
    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getSuperficiep1() {
        return superficiep1;
    }

    public void setSuperficiep1(int superficiep1) {
        this.superficiep1 = superficiep1;
    }

    public int getSuperficiep2() {
        return superficiep2;
    }

    public void setSuperficiep2(int superficiep2) {
        this.superficiep2 = superficiep2;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    //Metodos propios
    public void imprimirDatos(){
        System.out.printf("--> %10s %10d m2 %15.0f€\n",this.propietario,this.calcularSuperficie(),this.precioVenta);
    }
    
    private int calcularSuperficie(){
        int superficieTotal;
        superficieTotal = this.superficiep1 + this.superficiep2;
        return superficieTotal;
    }
    
    
    
    
}
