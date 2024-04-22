/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio06;

/**
 *
 * @author desn2
 */
public class Contactos {

    private int id;
    private String nombre;
    private String telefono;
    private String email;
    static int contadorId = 0;

    //Constructor
    public Contactos(String nombre, String email, String telefono) {
        contadorId++;
        this.id = contadorId;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    //Métodos Getter y Setter
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Contactos.contadorId = contadorId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    //Métodos propios
    public void imprimir() {
        System.out.printf("%-4d %10s %20s %10s\n", id, nombre, email, telefono);
    }

}
