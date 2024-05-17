/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioBancoCuentas;

/**
 *
 * @author diego.sanchez
 */
public class Persona {

    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private static int contador = 10_000;

    public Persona(String nombre, String apellido) {
        this.dni = generarDni();
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = generarEmail();
    }

    private String generarEmail() {
        return nombre.toLowerCase() + "." + apellido.toLowerCase() + "@bancoArcas.es";
    }

    private String generarDni() {
        char letra = (char) (65 + Math.random() * 26);
        return Integer.toString(contador++) + letra;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }
    
    

}
