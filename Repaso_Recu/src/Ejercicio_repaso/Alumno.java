/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_repaso;

/**
 *
 * @author desn2
 */
public class Alumno {
    private int id;
    private String nombre;
    private int edad;
    private boolean matriculado;
    private Clase clase;

    public Alumno(String nombre, int edad) {
        this.id = Util.generarId();
        this.nombre = nombre;
        this.edad = edad;
        this.matriculado = false;
        this.clase = null;
    }

    @Override
    public String toString() {
        String cadena = String.format("%d   %s   %d   ",this.id,this.nombre,this.edad);
        return cadena;
    }
    
    public String imprimirFicha(){
        if (matriculado) {
            String cadena = String.format("ID:%d - %s - %s\n", this.id, this.nombre, this.clase.getNombre());
            return cadena;
        }else{
            String cadena = String.format("ID:%d - %s - SIN MATRICULAR\n", this.id, this.nombre);
            return cadena;
        }
        
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }
    
    
    
    
    
    
    
    
}
