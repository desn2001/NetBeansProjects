/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio08;

/**
 *
 * @author desn2
 */
public class Empresa {
    private String cif;
    private String nombre;
    private String localidad;

    //CONSTRUCTOR
    public Empresa(String cif, String nombre, String localidad) {
        this.cif = cif;
        this.nombre = nombre;
        this.localidad = localidad;
    }
    
    //METODOS GETTER Y SETTER

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    //METODOS PROPIOS
    public void imprimir(){
        System.out.printf("CIF-->%s NOMBRE-->%s LOCALIDAD-->%s",this.cif,this.nombre,this.localidad); 
    }
    
    
    
}
