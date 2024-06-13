/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACADEMIAARCAS;

/**
 *
 * @author joseantonio
 */
public class Matricula {
    
    private Estudiante estudiante;
    private Profesor profesor;
    private Materia materia;

    public Matricula(Estudiante estudiante, Profesor profesor) {
        this.estudiante = estudiante;
        this.profesor = profesor;
        this.materia = profesor.getMateria();
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
        this.materia = profesor.getMateria();
    }

    public Materia getMateria() {
        return materia;
    }
    
    

    @Override
    public String toString() {
        String resultado = String.format("ID estudiante: %d --> ID profesor: %d --> Materia: %s", this.estudiante.getNRE(), this.profesor.getIdProf(), this.materia);
        return resultado;
    }
    
    
    
    
    
    
    
}
