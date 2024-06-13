/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ACADEMIAARCAS;

/**
 *
 * @author joseantonio
 */
public enum Evaluacion {
    O("Ordinaria"),
    E("Extraordinatia");
    
    private String nombre;
    
    private Evaluacion(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
