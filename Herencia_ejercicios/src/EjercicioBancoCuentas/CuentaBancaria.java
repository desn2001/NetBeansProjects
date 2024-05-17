/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioBancoCuentas;

/**
 *
 * @author diego.sanchez
 */
public abstract class CuentaBancaria implements Imprimible{

    private int numero;
    private Persona titular;
    private double saldo;
    private static int ultimaCuenta = 1001;

    public CuentaBancaria(Persona titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.numero = ++ultimaCuenta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getUltimaCuenta() {
        return ultimaCuenta;
    }

    public static void setUltimaCuenta(int ultimaCuenta) {
        CuentaBancaria.ultimaCuenta = ultimaCuenta;
    }

    public void ingreso(double dinero) {
        if (dinero >= 0) {
            saldo = saldo + dinero;
        }
    }

    public void restar(double dinero) {
        saldo = saldo - dinero;
    }

    public abstract void reintegro(double dinero);
    
    @Override
    public void imprimirDatos() {
        System.out.printf("{%s, %.2f}\n",titular.getNombre(),saldo);
    }
//        System.out.println("===================================================");
//        System.out.println("Cuenta de "+ titular.getNombre());
//        System.out.println("saldo ---> "+saldo+"€");
//        System.out.println("===================================================");

}
