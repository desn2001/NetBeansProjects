/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioBancoCuentas;

/**
 *
 * @author diego.sanchez
 */
public class CuentaAhorro extends CuentaBancaria implements Interesable{
    
    private int interes;//2 significa 2% = 0.02

    public CuentaAhorro(Persona titular, double saldo) {
        super(titular, saldo);
        this.interes = 2;
    }
    

    @Override
    public void reintegro(double dinero) {
        if (super.getSaldo() - dinero >=0) {
            super.setSaldo(super.getSaldo() - dinero);
        } else {
            System.out.println("ERROR. Operacion denegada se supera el maximo al descubierto.");
        }
    }
    
//    public void calcularInteres(){
//        double intereses;
//        intereses = super.getSaldo() * 2/100;
//        System.out.printf("Interes: %.2f\n",intereses);
//    }

    @Override
    public void calcularInteres() {
        double intereses;
        intereses = super.getSaldo() * 2/100;
        System.out.printf("Interes: %.2f\n",intereses);
    }

    
    
}
