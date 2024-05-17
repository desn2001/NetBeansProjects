/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioBancoCuentas;

/**
 *
 * @author diego.sanchez
 */
public class CuentaCorriente extends CuentaBancaria {

    private double maxDescubierto;

    public CuentaCorriente(Persona titular, double saldo) {
        super(titular, saldo);
        this.maxDescubierto = 1_000;
    }

    public CuentaCorriente(double maxDescubierto, Persona titular, double saldo) {
        super(titular, saldo);
        this.maxDescubierto = maxDescubierto;
    }

    public void transferencia(CuentaBancaria cc, double dinero) {
        if (super.getSaldo() - dinero >= -maxDescubierto) {
            super.restar(dinero);
            cc.ingreso(dinero);
        } else {
            System.out.println("ERROR. Operacion denegada se supera el maximo al descubierto.");
        }
    }

    @Override
    public void reintegro(double dinero) {
        if (super.getSaldo() - dinero >= -maxDescubierto) {
            super.setSaldo(super.getSaldo() - dinero);
        } else {
            System.out.println("ERROR. Operacion denegada se supera el maximo al descubierto.");
        }
    }

}
