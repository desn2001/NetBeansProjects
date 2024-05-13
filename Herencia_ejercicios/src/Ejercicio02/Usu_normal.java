/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class Usu_normal {
    protected String nombre;
    protected String password;
    protected String email;

    public Usu_normal(String nombre, String password, String email) {
        this.nombre = nombre;
        this.password = password;
        this.email = email;
    }
    
    //getter setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public void cambiar_contraseña(){
        Scanner teclado = new Scanner(System.in);
        String contraseñaA;
        System.out.print("Introduce la antigua contraseña: ");
        contraseñaA = teclado.nextLine();
        if (contraseñaA.equals(password)) {
            System.out.print("Introduce la nueva contraseña: ");
            String nuevaContraseña;
            nuevaContraseña = teclado.nextLine();
            password = nuevaContraseña;
            System.out.println("Contraseña cambiada con exito.");
        }else{
            System.out.println("ERROR. Contraseña introducida no valida.");
        }
    }
    
    
}
