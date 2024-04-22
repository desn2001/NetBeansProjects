/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10v2;

/**
 *
 * @author desn2
 */
public class Coche {

    private String marca;
    private String modelo;
    private Motor motor;
    private Rueda ruedas[] = new Rueda[4];

    //CONSTRUCTOR
    public Coche(String marca, String modelo, int potencia, TipoCombustible com, TipoCambio cam, int radio) {
        this.marca = marca;
        this.modelo = modelo;
        motor = new Motor(potencia, com, cam);
        ruedas[0] = new Rueda(radio);
        ruedas[1] = new Rueda(radio);
        ruedas[2] = new Rueda(radio);
        ruedas[3] = new Rueda(radio);
    }

    //GETTER Y SETTER
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    //METODOS PROPIOS
    public void cambiarRueda(int num) {
        for (int i = 0; i < ruedas.length; i++) {
            if (i == num) {
                ruedas[i].setKilometros(0);
            }
        }
    }

    public void recorrer(int kmActuales) {
        motor.setKilometros(motor.getKilometros() + kmActuales);

        for (int i = 1; i < ruedas.length; i++) {
            ruedas[i].setKilometros(ruedas[i].getKilometros() + kmActuales);
        }
    }

    public void imprimirFicha() {
        System.out.println("=======  FICHA DEL COCHE  =======");
        System.out.println("MARCA/MODELO: " + this.marca + " " + this.modelo);
        System.out.println("Motor (CV): " + motor.getCaballos() + "CV");
        System.out.println("COMBUSTIBLE: " + motor.getCombustible());
        System.out.println("CAMBIO: " + motor.getCambio());
        System.out.println("KM DEL MOTOR: " + motor.getKilometros() + "Km");
        System.out.println("TAMAÑO DE LAS RUEDAS: " + ruedas[0].getRadio() + "''");
        System.out.print("KM DE LAS RUEDAS: ");
        for (int i = 0; i < ruedas.length; i++) {
            System.out.printf("[%d]", ruedas[i].getKilometros());
        }
        System.out.println("");
        System.out.println("=================================");
    }

    public void getFichaSimplificada() {
        System.out.println("=========  FICHA SIMPLIFICADA  =========");
        System.out.printf("%s %s - %dCV %s %s\n", this.marca, this.modelo, motor.getCaballos(), motor.getCombustible(), motor.getCambio());
        System.out.println("========================================");
    }

}
