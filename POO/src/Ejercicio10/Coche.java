/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author desn2
 */
public class Coche {

    private String marca;
    private String modelo;
    private Motor motor;
    private Rueda ruedas[] = new Rueda[5];

    public Coche(String marca, String modelo, int potencia, TipoCombustible com, TipoCambio cam, int radio) {
        this.marca = marca;
        this.modelo = modelo;
        motor = new Motor(potencia, com, cam);
        ruedas[1] = new Rueda(radio);
        ruedas[2] = new Rueda(radio);
        ruedas[3] = new Rueda(radio);
        ruedas[4] = new Rueda(radio);
    }

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

    //Metodos propios
    public String getFichaSimplificada() {
        return String.format("%s %s - %d %s %s", this.marca, this.modelo, motor.getCaballos(), motor.getCombustible(), motor.getCambio());
    }

    public void imprimirFicha() {
        System.out.println("Ficha del coche");
        System.out.println("===================================================");
        System.out.printf("Marca/Modelo: %s %s\n",this.marca,this.modelo);
        System.out.printf("Motor(CV): %dCV\n",motor.getCaballos());
        System.out.printf("Combustible: %s\n",motor.combustible);
        System.out.printf("Cambio: %s\n",motor.cambio);
        System.out.printf("KM del motor: %d km\n",motor.getKilometros());
        System.out.printf("Tamaño ruedas: %d''\n",ruedas[1].getRadio());
        System.out.print("KM de las ruedas: ");
        for (int i = 1; i < ruedas.length; i++) {
            System.out.printf("[%d]",ruedas[i].getKilometros());
        }
        System.out.println("");
        System.out.println("===================================================");
    }
    
    public void cambiarRueda(int numRueda){
        for (int i = 1; i < ruedas.length; i++) {
            if (i == numRueda) {
                ruedas[i].setKilometros(0);
            }
        }
    }
    
    public void recorrer(int kmActuales){
        motor.setKilometros(motor.getKilometros()+kmActuales);
        
        for (int i = 1; i < ruedas.length; i++) {
            ruedas[i].setKilometros(ruedas[i].getKilometros()+kmActuales);
        }
    }
    
    
    

}
