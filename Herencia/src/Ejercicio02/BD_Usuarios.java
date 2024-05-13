/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

import java.util.ArrayList;

/**
 *
 * @author desn2
 */
public class BD_Usuarios {
    private ArrayList<USU_Normal> bd = new ArrayList<>();
    
    public void añadirUsuario(USU_Normal usuario){
        bd.add(usuario);
    }
    
    public ArrayList<USU_Normal> obtenerBD() {
        return bd;
    }
    
    public USU_Normal obtenerUsusario(String nombre) {
        for(USU_Normal usuario: bd)
            if(usuario.getNombre().equals(nombre))
                return usuario;
        return null;                        
    }
    
    public boolean verificarLogin(String nombre, String password) {
        for(USU_Normal usuario: bd)
            if(usuario.getNombre().equals(nombre))
                if (usuario.getPassword().equals(password))
                    return true;
        return false;  
    }
    
}
