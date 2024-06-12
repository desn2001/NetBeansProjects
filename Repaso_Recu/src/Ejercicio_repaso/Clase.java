/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_repaso;

import java.util.ArrayList;

/**
 *
 * @author desn2
 */
public class Clase {
    private String siglas;
    private int nivel;
    private String nombre;
    private ArrayList<Alumno> listaAlumnos;

    public Clase(String siglas, int nivel) {
        this.siglas = siglas;
        this.nivel = nivel;
        this.nombre = String.format("%s%d",this.siglas,this.nivel);
        this.listaAlumnos = new ArrayList<>();
    }
    
    public void addAlumno(Alumno alumno){
        alumno.setMatriculado(true);
        alumno.setClase(this);
        listaAlumnos.add(alumno);
    }
    
    public void listarAlumnosClase(){
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
    
    
    
    
    
}
