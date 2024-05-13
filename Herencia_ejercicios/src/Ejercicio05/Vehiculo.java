/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio05;

/**
 *
 * @author desn2
 */
public abstract class Vehiculo {
    private String matricula;
    private String marca_modelo;
    protected int km_motor;
    protected int km_aceite;
    protected int km_ruedas;

    public Vehiculo(String matricula, String marca_modelo) {
        this.matricula = matricula;
        this.marca_modelo = marca_modelo;
        this.km_motor = 0;
    }

    public Vehiculo(String matricula, String marca_modelo, int km_motor) {
        this.matricula = matricula;
        this.marca_modelo = marca_modelo;
        this.km_motor = km_motor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca_modelo() {
        return marca_modelo;
    }

    public void setMarca_modelo(String marca_modelo) {
        this.marca_modelo = marca_modelo;
    }

    public int getKm_motor() {
        return km_motor;
    }

    public void setKm_motor(int km_motor) {
        this.km_motor = km_motor;
    }

    public int getKm_aceite() {
        return km_aceite;
    }

    public void setKm_aceite(int km_aceite) {
        this.km_aceite = km_aceite;
    }

    public int getKm_ruedas() {
        return km_ruedas;
    }

    public void setKm_ruedas(int km_ruedas) {
        this.km_ruedas = km_ruedas;
    }
    
    
    
    public void avanzar(int km) {
        this.km_motor = km_motor + km;
        this.km_aceite = km_aceite + km;
        this.km_ruedas = km_ruedas + km;
        if(checkAceite())
            System.out.println(matricula + " ha cambiado de aceite [" + km_motor + " km]");
        if(checkRuedas())
            System.out.println(matricula + " ha cambiado de Ruedas [" + km_motor + " km]");        
    }

    @Override
    public String toString() {
        return marca_modelo +" - "+matricula+" - "+ km_motor;
    }
    
    public abstract boolean checkAceite();
    public abstract boolean checkRuedas();
    
    
    
    
}
