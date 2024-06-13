/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACADEMIAARCAS;

/**
 *
 * @author joseantonio
 */
public class Profesor {
    
    private int idProf;
    private String nombre;
    private Materia materia;
    private static int contador = 0;
    
    public Profesor(String nombre, Materia materia) {
        this.nombre = nombre;
        this.materia = materia;
        this.idProf = ++contador + 200;
    }

    public int getIdProf() {
        return idProf;
    }

    public void setIdProf(int idProf) {
        this.idProf = idProf;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    

    @Override
    public String toString() {
        String resultado = String.format("ID: %d  --> %s  --> Profesor/a de %s", this.getIdProf(), this.getNombre(), this.getMateria());
        return resultado;
    }     
    
    
}
