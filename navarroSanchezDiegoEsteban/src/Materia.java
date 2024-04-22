
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego.sanchez
 */
public class Materia {

    private String nombre;
    private double precio;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Integer> notas;
    private int contador = 0;

    public Materia(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.alumnos = new ArrayList<>();
        this.notas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    

    public void addAlumno(Alumno a) {
        alumnos.add(a);
        notas.add(0);
        contador++;
    }

    public void calificar(Alumno a, int nota) {
        int id = a.getId();
        notas.set(id, nota);
    }
}
