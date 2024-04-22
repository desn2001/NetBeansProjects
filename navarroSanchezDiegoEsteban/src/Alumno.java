/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego.sanchez
 */
public class Alumno {

    //Atributos
    private int id;
    private String nombre;
    private String email;
    private int edad;
    private static int contador = 0;

    //Constructor  
    public Alumno(String nombre, String email, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        id = contador;
        contador++;
    }

    //Métodos        
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }

    public static int getContador() {
        return contador;
    }

    public void mostrarDetalles() {
        System.out.printf("%-2d %2s %20s %15d \n", this.id, this.nombre, this.email, this.edad);

    }

}
