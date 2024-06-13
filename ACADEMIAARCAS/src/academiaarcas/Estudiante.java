/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACADEMIAARCAS;

/**
 *
 * @author joseantonio
 */
public class Estudiante {
    
    private int NRE;
    private String nombre;
    private static int contador = 0;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.NRE = ++contador + 5000;
    }

    public int getNRE() {
        return NRE;
    }

    public void setNRE(int NRE) {
        this.NRE = NRE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String resultado = String.format("%d --> %s", this.getNRE(), this.getNombre());
        return resultado;
    }
    
      
     
    
}
