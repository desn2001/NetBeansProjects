/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author desn2
 */
public class Cuenta {

    String titular;
    Double cantidad;

    public Cuenta(String titular, Double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
        if (this.cantidad == null) {
            this.cantidad = 0.0;
        }
    }

    //Metodos getter y setter
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    //Metodo ingresar
    public void ingresar(double cantidad) {
        if (cantidad <= 0) {
            this.cantidad = this.cantidad;
        } else {
            this.cantidad = this.cantidad + cantidad;
        }
    }

    //Metodo retirar
    public void retirar(double cantidad) {
        if (this.cantidad < cantidad) {
            this.cantidad = 0.00;
        } else {
            this.cantidad = this.cantidad - cantidad;
        }
    }

}
