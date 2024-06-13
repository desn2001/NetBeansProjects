/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACADEMIAARCAS;

import ACADEMIAARCAS.Evaluacion;

/**
 *
 * @author joseantonio
 */
public class Nota {
    
    private Matricula matricula;
    private Evaluacion evaluacion;
    private double nota;

    public Nota(Matricula matricula, Evaluacion evaluacion, double nota) {
        this.matricula = matricula;
        this.evaluacion = evaluacion;
        this.nota = nota;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        String resultado = String.format("%10s --> %4.2f --> Evalucion: %s", this.matricula.getMateria().name(), this.nota, this.getEvaluacion());
        return resultado;
    }
    
    
    
    
    
    
    
    
    
}
