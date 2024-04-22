/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio05v2;

/**
 *
 * @author desn2
 */
public class Casa {

    private String propietario;
    private int superficieP1;
    private int superficieP2;
    private double precioVenta;

    //CONSTRUCTOR
    public Casa(String propietario, int superficieP1, int superficieP2, double precioVenta) {
        this.propietario = propietario;
        this.superficieP1 = superficieP1;
        this.superficieP2 = superficieP2;
        this.precioVenta = precioVenta;
    }
    
    //METODOS GETTER Y SETTER
    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getSuperficieP1() {
        return superficieP1;
    }

    public void setSuperficieP1(int superficieP1) {
        this.superficieP1 = superficieP1;
    }

    public int getSuperficieP2() {
        return superficieP2;
    }

    public void setSuperficieP2(int superficieP2) {
        this.superficieP2 = superficieP2;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    //METODOS PROPIOS
    private int calcularSuperficieTotal(){
        int superficieTotal = this.superficieP1 +this.superficieP2;
        return  superficieTotal;
    }
    public void imprimirDatos(){
        System.out.printf("%10s %10dm2 %10.0f€\n",this.propietario,this.calcularSuperficieTotal(),this.precioVenta);
    }
    
    

}
