/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author desn2
 */
public class USU_Normal {
    Scanner teclado = new Scanner(System.in);
    private String nombre;
    private String password;
    private String email;

    public USU_Normal(String nombre, String password, String email) {
        this.nombre = nombre;
        this.password = password;
        this.email = email;
    }

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
    
    
    
    public void cambiarPassword(){
        String nueva_contraseña, contraseña;
        System.out.print("Introduce tu antigua contraseña: ");
        contraseña = teclado.nextLine();
        if (contraseña.equals(password)) {
            System.out.print("Introduce la nueva contraseña: ");
            nueva_contraseña = teclado.nextLine();
            contraseña = nueva_contraseña;
            System.out.println("CONTRASEÑA CAMBIADA CON EXITO");
        }else{
            System.out.println("ERROR. Contraseña antigua incorrecta");
        }
    }
    
    public void listarUsuarios(ArrayList<USU_Normal> bd){
        for (USU_Normal usuario : bd) {
            
        }
        
    }
    
    
    
}
