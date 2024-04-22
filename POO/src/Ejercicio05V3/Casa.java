/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio05V3;

/**
 *
 * @author desn2
 */
public class Casa {
    private String propietario;
    private int planta1;
    private int planta2;
    private double precioVenta;

    //CONSTRUCTOR
    public Casa(String propietario, int planta1, int planta2, double precioVenta) {
        this.propietario = propietario;
        this.planta1 = planta1;
        this.planta2 = planta2;
        this.precioVenta = precioVenta;
    }
    
    //GETTER Y SETTER
    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getPlanta1() {
        return planta1;
    }

    public void setPlanta1(int planta1) {
        this.planta1 = planta1;
    }

    public int getPlanta2() {
        return planta2;
    }

    public void setPlanta2(int planta2) {
        this.planta2 = planta2;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    //METODOS PROPIOS
    public void imprimirDatos(){
        System.out.printf("%10s %15dm2 %15.0f€\n",this.propietario,this.calcularSuperficie(),this.precioVenta);
    }
    
    private int calcularSuperficie(){
        int superficieTotal;
        superficieTotal = planta1 + planta2;
        return superficieTotal;
    }
    
    
    
    
}
