/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_repaso;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author desn2
 */
public class Instituto {

    private String nombre;
    private HashMap<String, Clase> listaClases;
    private ArrayList<Alumno> listaAlumno;

    public Instituto(String nombre) {
        this.nombre = nombre;
        this.listaClases = new HashMap<>();
        this.listaAlumno = new ArrayList<>();
    }
    
    public void addAlumno(Alumno alumno){
        listaAlumno.add(alumno);
    }

    public Alumno getAlumno(int id) {
        for (Alumno alumno : listaAlumno) {
            if (alumno.getId() == id) {
                return alumno;
            }
        }
        return null;
    }

    public void listarAlumnos() {
        System.out.println("====================================================");
        System.out.printf("[%s] LISTADO ALUMNO\n", this.nombre);
        System.out.println("====================================================");
        for (Alumno alumno : listaAlumno) {
            System.out.println(alumno.imprimirFicha());
        }

    }

    public void matricular(Alumno alumno, Clase clase) {
        for (Alumno alumno1 : listaAlumno) {
            if (alumno1.getId() == alumno.getId()) {
                clase.addAlumno(alumno);
            }
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<String, Clase> getListaClases() {
        return listaClases;
    }

    public void setListaClases(HashMap<String, Clase> listaClases) {
        this.listaClases = listaClases;
    }

    public ArrayList<Alumno> getListaAlumno() {
        return listaAlumno;
    }

    public void setListaAlumno(ArrayList<Alumno> listaAlumno) {
        this.listaAlumno = listaAlumno;
    }
    
    

}
