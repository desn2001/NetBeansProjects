/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_HashMapHerencia;

import java.util.HashMap;

/**
 *
 * @author desn2
 */
public class Estudiante extends Persona{

    private HashMap<String, Double> cursoNotas;

    public Estudiante(HashMap<String, Double> cursoNotas, String nombre, String identificacion) {
        super(nombre, identificacion);
        this.cursoNotas = new HashMap<>();
    }

    public HashMap<String, Double> getCursoNotas() {
        return cursoNotas;
    }

    public void setCursoNotas(HashMap<String, Double> cursoNotas) {
        this.cursoNotas = cursoNotas;
    }
    
    public void agregarCurso(String curso, Double nota){
        cursoNotas.put(curso, nota);
    }
    
    public double  obtenerNota(String curso){
        double nota;
        nota = cursoNotas.get(curso);
        return nota;
    }

    
    
    
    
    
}
